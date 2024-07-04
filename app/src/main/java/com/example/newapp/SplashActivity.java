package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent newintent = new Intent(SplashActivity.this, MainActivity.class);

        //this is the handler class which is used to do asynchronous programming/parallel threading, which means that while the splash screen is showing on the screen, the mainActivity screen is also rendering parallely, which makes it easy to load the app and also stops the app from lagging.
        //we can also make this handler class do any work in background that we want to make the app do
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newintent);
                finish(); //this finish function is used to remove the splashActivity screen from the starting as when the app is loaded, then the main screen will be mainActivity and not the splash screen, therefore this function pops this activity from the activity stack.
            }
        }, 2000);


    }
}