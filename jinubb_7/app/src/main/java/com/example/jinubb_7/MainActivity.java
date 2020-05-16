package com.example.jinubb_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    Chronometer ch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (Chronometer)findViewById(R.id.chr1);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        //현재시간 초기화
        ch1.setBase(SystemClock.elapsedRealtime());

        //시작버튼 리스너
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                //타이머 시작
                ch1.start();
                //타이머 색상 변경
                ch1.setTextColor(Color.RED);
            }
        });

        //종료버튼 리스너
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                //타이머 종료
                ch1.stop();
                ch1.setTextColor(Color.BLACK);
            }
        });

        //초기화버튼 리스너
        btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                //타이머 초기화
                //현재시간 저장
                ch1.setBase(SystemClock.elapsedRealtime());
                //타이머 종료
                ch1.stop();
                ch1.setTextColor(Color.BLACK);
            }
        });

    }
}
