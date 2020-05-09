package com.example.jinu_cal;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Button btn1, btn2;
    RadioButton rb1, rb2, rb3;
    RadioGroup rg1;
    ImageView im1;
    Switch sw1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진보기");

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        im1 = (ImageView) findViewById(R.id.im1);
        sw1 = (Switch)findViewById(R.id.sw1);

        //스위치 리스너
        sw1.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){ //시작함
                    if(rb1.isChecked() == false && rb2.isChecked() == false && rb3.isChecked() == false){ // 세가지다 체크되어있지않은경우
                        im1.setVisibility(View.GONE);
                    }
                    else{
                        im1.setVisibility(View.VISIBLE);
                    }
                    text2.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                }
                else{  //꺼짐
                    im1.setVisibility(View.GONE);
                    text2.setVisibility(View.GONE);
                    rg1.setVisibility(View.GONE);
                }
            }
        });

        // 라디오버튼 리스너
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                im1.setVisibility(View.VISIBLE);
                if (checkedId == R.id.rb1) {
                    im1.setImageResource(R.drawable.and_1);
                } else if (checkedId == R.id.rb2) {
                    im1.setImageResource(R.drawable.and_2);
                } else{
                    im1.setImageResource(R.drawable.and_3);
                }
            }
        });

        //종료버튼 리스너
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //초기화버튼 리스너
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                im1.setVisibility(View.GONE);
                sw1.setChecked(false);
            }
        });
    }
}