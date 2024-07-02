package com.example.newapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;
        btn = findViewById(R.id.next);
        Intent next; //new intent has been made to switch the screen
        next = new Intent(MainActivity.this, SecondActivity.class); //telling the intent that it have to go from the MainActivity to the SecondActivity


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(next);
            }
        });
    }
}
