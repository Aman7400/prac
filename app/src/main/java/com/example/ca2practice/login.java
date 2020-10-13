package com.example.ca2practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    public static final String MSG ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        String display_msg = intent.getStringExtra(MainActivity.MSG);

        TextView tv1 = findViewById(R.id.login_Name);
        tv1.setText("" + display_msg);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.login_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item1:

                Intent intent = new Intent(this,bug.class);


                intent.putExtra(MSG,"How may I help u");
                startActivity(intent);


                return  true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }
}