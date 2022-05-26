package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Email,Name;
    Button btn,button1;
    SharedPreferences sharedPreferences;

    String email,name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email=findViewById(R.id.editTextTextEmailAddress);
        Name=findViewById(R.id.editTextTextEmailAddress2);
        if(Email!=null)
        {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
        btn=findViewById(R.id.button);
        button1=findViewById(R.id.button2);

        sharedPreferences=getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                email=Email.getText().toString();
                name=Name.getText().toString();

                SharedPreferences.Editor obj=sharedPreferences.edit();

                obj.putString("Email",email);
                obj.putString("Name",name);
                obj.commit();
                Toast.makeText(MainActivity.this, "Information Successfullly Saved", Toast.LENGTH_SHORT).show();
            }
        });
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
    });
    }


}