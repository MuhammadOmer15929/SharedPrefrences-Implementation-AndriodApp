package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1=findViewById(R.id.textView);
        txt2=findViewById(R.id.textView2);

        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String Email=sharedPreferences.getString("Email","");


        String Name=sharedPreferences.getString("Name","");


        txt1.setText(Email);
        txt2.setText(Name);

    }
}