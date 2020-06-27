package com.example.jinubb_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String[] item = { "LOL-베인", "LOL-아트록스", "LOL-리신", "TFT-이렐리아", "TFT-자야", "TFT-케일"};
    AutoCompleteTextView atv1;
    MultiAutoCompleteTextView matv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atv1 = (AutoCompleteTextView)findViewById(R.id.atv1);
        matv1 = (MultiAutoCompleteTextView)findViewById(R.id.matv1);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,item);
        atv1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,item);
        MultiAutoCompleteTextView.CommaTokenizer comma = new MultiAutoCompleteTextView.CommaTokenizer();
        matv1.setTokenizer(comma);
        matv1.setAdapter(adapter2);

    }
}
