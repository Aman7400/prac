package com.example.ca2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static  final  String MSG = "Login_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public   void login(View view){

        Intent intent = new Intent(this,login.class);

      Button login = findViewById(R.id.button6);
      EditText username = findViewById(R.id.editTextTextPersonName);



      intent.putExtra(MSG,"Hello "+username.getText().toString());
      startActivity(intent);

    }
}