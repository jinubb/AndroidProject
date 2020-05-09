package com.example.jinubb_5_java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //weight 파라미터 생성
        LinearLayout.LayoutParams weight_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f);

        //전체 레이아웃
        LinearLayout MainLayout = new LinearLayout(this);
        MainLayout.setOrientation(LinearLayout.VERTICAL);

        //위쪽 레이아웃
        LinearLayout SubLayout_1 = new LinearLayout(this);
        SubLayout_1.setOrientation(LinearLayout.HORIZONTAL);

        //위쪽 절반의 왼쪽
        LinearLayout SubLayout_2 = new LinearLayout(this);
        SubLayout_2.setOrientation(LinearLayout.VERTICAL);

        //위쪽 절반의 오른쪽
        LinearLayout SubLayout_3 = new LinearLayout(this);
        SubLayout_3.setOrientation(LinearLayout.HORIZONTAL);

        //btn1 레이아웃
        LinearLayout SubLayout_4 = new LinearLayout(this);

        //btn2 레이아웃
        LinearLayout SubLayout_5 = new LinearLayout(this);

        //btn3 레이아웃
        LinearLayout SubLayout_6 = new LinearLayout(this);

        //btn4 레이아웃
        LinearLayout SubLayout_7 = new LinearLayout(this);

        //btn5 레이아웃
        LinearLayout SubLayout_8 = new LinearLayout(this);

        //아래쪽
        //btn6 레이아웃
        LinearLayout SubLayout_9 = new LinearLayout(this);

        //button 파라미터 생성
        LinearLayout.LayoutParams button_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, Gravity.CENTER);

        //btn1
        Button btn1 = new Button(this);
        btn1.setText("btn1");
        btn1.setBackgroundColor(Color.parseColor("#FAEB78"));
        SubLayout_4.addView(btn1, button_params);

        //btn2 , textcolor : 흰색
        Button btn2 = new Button(this);
        btn2.setText("btn2");
        btn2.setTextColor(Color.parseColor("#FFFFFF"));
        btn2.setBackgroundColor(Color.parseColor("#000000"));
        SubLayout_5.addView(btn2, button_params);

        //btn3
        Button btn3 = new Button(this);
        btn3.setText("btn3");
        btn3.setBackgroundColor(Color.parseColor("#0000FF"));
        SubLayout_6.addView(btn3, button_params);

        //btn4
        Button btn4 = new Button(this);
        btn4.setText("btn4");
        btn4.setBackgroundColor(Color.parseColor("#00FF00"));
        SubLayout_7.addView(btn4, button_params);

        //btn5
        Button btn5 = new Button(this);
        btn5.setText("btn5");
        btn5.setBackgroundColor(Color.parseColor("#FF0000"));
        SubLayout_8.addView(btn5, button_params);

        //btn6
        Button btn6 = new Button(this);
        btn6.setText("btn6");
        btn6.setBackgroundColor(Color.parseColor("#50C2FF"));
        SubLayout_9.addView(btn6, button_params);

        //위쪽
        MainLayout.addView(SubLayout_1, weight_params);

        //위쪽 절반의 왼쪽
        SubLayout_1.addView(SubLayout_2, weight_params);
        //위쪽 절반의 오른쪽
        SubLayout_1.addView(SubLayout_3, weight_params);

        SubLayout_2.addView(SubLayout_4, weight_params); // BTN1
        SubLayout_2.addView(SubLayout_5, weight_params); // BTN2

        SubLayout_3.addView(SubLayout_6, weight_params); // BTN3
        SubLayout_3.addView(SubLayout_7, weight_params); // BTN4
        SubLayout_3.addView(SubLayout_8, weight_params); // BTN5

        //아래쪽
        MainLayout.addView(SubLayout_9, weight_params); //BTN6

        setContentView(MainLayout, weight_params);
    }
}
