package com.gtcoding.jinubb_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream fileOutputStream = openFileOutput("file.txt", Context.MODE_PRIVATE);
                    String str = "Hello jinubb!";
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.close();
                    Toast.makeText(getApplicationContext(),"file.txt 생성",Toast.LENGTH_SHORT).show();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream fileOutputStream = openFileOutput("file.txt", Context.MODE_PRIVATE);
                }catch (IOException e){

                }
            }
        });

    }
}
