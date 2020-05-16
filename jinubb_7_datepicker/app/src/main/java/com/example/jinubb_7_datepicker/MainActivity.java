package com.example.jinubb_7_datepicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.io.Console;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    Chronometer chr1;
    RadioButton rb1, rb2;
    RadioGroup rg1;
    DatePicker date1;
    TimePicker time1;
    int sel_year;
    int sel_month;
    int sel_date;
    TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("시간 예약(수정)");
        setContentView(R.layout.activity_main);

        chr1 = (Chronometer)findViewById(R.id.chr1);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        date1 = (DatePicker) findViewById(R.id.date1);
        time1 = (TimePicker)findViewById(R.id.time1);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);

        chr1.setOnClickListener(new Chronometer.OnClickListener(){
            @Override
            public void onClick(View view) {
                //현재시간 초기화
                chr1.setBase(SystemClock.elapsedRealtime());
                //타이머 시작
                chr1.start();
                //타이머 색상 변경
                chr1.setTextColor(Color.BLUE);

                date1.setVisibility(View.VISIBLE);
                time1.setVisibility(View.GONE);
                rg1.setVisibility(View.VISIBLE);

                rb1.setChecked(true);
                rb2.setChecked(false);
            }
        });

        tv1.setOnLongClickListener(new TextView.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {
                //타이머 종료
                chr1.stop();
                chr1.setTextColor(Color.RED);

                sel_year = date1.getYear();
                sel_month = date1.getMonth()+1;
                sel_date = date1.getDayOfMonth();

                tv1.setText(String.valueOf(sel_year));
                tv2.setText(String.valueOf(sel_month));
                tv3.setText(String.valueOf(sel_date));

                tv4.setText(String.valueOf(time1.getCurrentHour()));
                tv5.setText(String.valueOf(time1.getCurrentMinute()));

                date1.setVisibility(View.GONE);
                time1.setVisibility(View.GONE);
                rg1.setVisibility(View.GONE);
                return false;
            }
        });


        // 라디오버튼 리스너
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb1) {
                    date1.setVisibility(View.VISIBLE);
                    time1.setVisibility(View.GONE);
                } else if (checkedId == R.id.rb2){
                    date1.setVisibility(View.GONE);
                    time1.setVisibility(View.VISIBLE);
                }
                else{
                    date1.setVisibility(View.GONE);
                    time1.setVisibility(View.GONE);
                }
            }
        });
    }
}
