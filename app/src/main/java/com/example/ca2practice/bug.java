package com.example.ca2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class bug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);


        Intent intent = getIntent();
        String display_msg = intent.getStringExtra(login.MSG);

        TextView tv1 = findViewById(R.id.help);
        tv1.setText("" + display_msg);
    }
}