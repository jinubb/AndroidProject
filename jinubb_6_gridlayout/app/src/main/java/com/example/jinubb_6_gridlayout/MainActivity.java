package com.example.jinubb_6_gridlayout;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_num1, edit_num2;
    Button btn_num0, btn_num1, btn_num2, btn_num3, btn_num4, btn_num5, btn_num6, btn_num7, btn_num8, btn_num9;
    Button btn_add, btn_sub, btn_mul, btn_div;
    TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("그리드 레이아웃 계산기");
        edit_num1 = (EditText)findViewById(R.id.edit_num1);
        edit_num2 = (EditText)findViewById(R.id.edit_num2);
        btn_num0 = (Button)findViewById(R.id.btn_num0);
        btn_num1 = (Button)findViewById(R.id.btn_num1);
        btn_num2 = (Button)findViewById(R.id.btn_num2);
        btn_num3 = (Button)findViewById(R.id.btn_num3);
        btn_num4 = (Button)findViewById(R.id.btn_num4);
        btn_num5 = (Button)findViewById(R.id.btn_num5);
        btn_num6 = (Button)findViewById(R.id.btn_num6);
        btn_num7 = (Button)findViewById(R.id.btn_num7);
        btn_num8 = (Button)findViewById(R.id.btn_num8);
        btn_num9 = (Button)findViewById(R.id.btn_num9);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_mul = (Button)findViewById(R.id.btn_mul);
        btn_div = (Button)findViewById(R.id.btn_div);
        text_result = (TextView)findViewById(R.id.text_result);

        //숫자입력버튼 리스너 생성
        View.OnClickListener Listener_num = new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                if(edit_num1.isFocused()){
                    edit_num1.setText(setText(edit_num1, view));
                }
                else if(edit_num2.isFocused()){
                    edit_num2.setText(setText(edit_num2, view));
                }
                else{
                    text_result.setText("입력 텍스트를 눌러주세요.");
                }
            }
            public String setText(EditText edit, View view){
                switch (view.getId()) {
                    case R.id.btn_num0:
                        return edit.getText()+"0";
                    case R.id.btn_num1:
                        return edit.getText()+"1";
                    case R.id.btn_num2:
                        return edit.getText()+"2";
                    case R.id.btn_num3:
                        return edit.getText()+"3";
                    case R.id.btn_num4:
                        return edit.getText()+"4";
                    case R.id.btn_num5:
                        return edit.getText()+"5";
                    case R.id.btn_num6:
                        return edit.getText()+"6";
                    case R.id.btn_num7:
                        return edit.getText()+"7";
                    case R.id.btn_num8:
                        return edit.getText()+"8";
                    case R.id.btn_num9:
                        return edit.getText()+"9";
                }
                return "Error : 숫자입력버튼 리스너 에러";
            }
        };

        //계산버튼 리스너 생성
        View.OnClickListener Listener_btn = new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                if(edit_num1.getText().toString() == null){
                    text_result.setText("숫자를 입력해 주세요.");
                }
                else {
                    String op1, op2;
                    int result_num;
                    op1 = edit_num1.getText().toString();
                    op2 = edit_num2.getText().toString();
                    switch (view.getId()) {
                        case R.id.btn_add:
                            result_num = Integer.parseInt(op1) + Integer.parseInt(op2);
                            text_result.setText("계산결과 : " + String.valueOf(result_num));
                            break;
                        case R.id.btn_sub:
                            result_num = Integer.parseInt(op1) - Integer.parseInt(op2);
                            text_result.setText("계산결과 : " + String.valueOf(result_num));
                            break;
                        case R.id.btn_mul:
                            result_num = Integer.parseInt(op1) * Integer.parseInt(op2);
                            text_result.setText("계산결과 : " + String.valueOf(result_num));
                            break;
                        case R.id.btn_div:
                            result_num = Integer.parseInt(op1) / Integer.parseInt(op2);
                            text_result.setText("계산결과 : " + String.valueOf(result_num));
                            break;
                    }
                }
            }
        };

        //리스너 적용
        btn_num0.setOnClickListener(Listener_num);
        btn_num1.setOnClickListener(Listener_num);
        btn_num2.setOnClickListener(Listener_num);
        btn_num3.setOnClickListener(Listener_num);
        btn_num4.setOnClickListener(Listener_num);
        btn_num5.setOnClickListener(Listener_num);
        btn_num6.setOnClickListener(Listener_num);
        btn_num7.setOnClickListener(Listener_num);
        btn_num8.setOnClickListener(Listener_num);
        btn_num9.setOnClickListener(Listener_num);

        btn_add.setOnClickListener(Listener_btn);
        btn_sub.setOnClickListener(Listener_btn);
        btn_mul.setOnClickListener(Listener_btn);
        btn_div.setOnClickListener(Listener_btn);
    }
}
