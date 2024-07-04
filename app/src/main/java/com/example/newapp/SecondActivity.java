package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromMain = getIntent();
        String getTitle = fromMain.getStringExtra("title");
        String getName = fromMain.getStringExtra("StudentName");
        String edittext = fromMain.getStringExtra("editText");
        int rollNo = fromMain.getIntExtra("rollNumber", 0);

        TextView info;
        info = findViewById(R.id.info);
        info.setText("Roll Number: "+rollNo+" Name: "+getName+" EditTEXT: "+edittext);
        getSupportActionBar().setTitle(getTitle);
    }
}