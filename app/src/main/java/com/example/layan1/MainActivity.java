package com.example.layan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.date);
        text2=findViewById(R.id.box);
        et1=findViewById(R.id.name);
        et2=findViewById(R.id.born1);
    }

    private void Agree1(View view) {
        String name,year;
        name=et1.getText().toString();
        year=et2.getText().toString();
        int y=Integer.parseInt(year);
        int Age=2024-y;
        text2.setText(y+"age is: "+Age);
    }
}