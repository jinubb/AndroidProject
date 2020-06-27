package com.example.jinubb_8_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        tv1 = (TextView)findViewById(R.id.tv1);
        iv1 = (ImageView)findViewById(R.id.iv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_angle:
                if(et1.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"각도를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    iv1.setRotation(Integer.parseInt(et1.getText().toString()));
                }
                break;
            case R.id.item_yeon:
                iv1.setImageResource(R.drawable.yeon);
                item.setChecked(true);
                break;
            case R.id.item_kuang:
                iv1.setImageResource(R.drawable.kuang);
                item.setChecked(true);
                break;
            case R.id.item_cham:
                iv1.setImageResource(R.drawable.cham);
                item.setChecked(true);
                break;
        }
        return true;
    }
}
