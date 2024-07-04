package com.example.newapp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        TextView helloanim;
        Button btn1, btn2,btn3,btn4;
        helloanim = findViewById(R.id.helloanim);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        Animation move = AnimationUtils.loadAnimation(this, R.anim.move);
        Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        Animation scale = AnimationUtils.loadAnimation(this,R.anim.scale);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloanim.startAnimation(move);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloanim.startAnimation(alpha);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloanim.startAnimation(rotation);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloanim.startAnimation(scale);
            }
        });

    }
}