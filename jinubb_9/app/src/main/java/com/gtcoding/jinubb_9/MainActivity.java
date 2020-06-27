package com.gtcoding.jinubb_9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout main;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = (LinearLayout)findViewById(R.id.main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        if(v == btn1){
            menu.setHeaderTitle("배경색 선택");
            menuInflater.inflate(R.menu.menu1, menu);
        }
        else if(v == btn2){
            menuInflater.inflate(R.menu.menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_red: {
                main.setBackgroundColor(Color.RED);
                Toast.makeText(this, "배경색 변경(RED)", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.item_green:{
                main.setBackgroundColor(Color.GREEN);
                return true;
            }
            case R.id.item_blue:{
                main.setBackgroundColor(Color.BLUE);
                return true;
            }


        }
        return false;
    }
}
