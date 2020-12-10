package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        View sky = findViewById(R.id.sky);

        int sky1 = 0xFF1E7AC7;
        int sky2 = 0xFF817D67;
        int sky3 = 0xFFEB8001;
        int sky4 = 0xFF05192E;

        ObjectAnimator colorAnim = ObjectAnimator.ofInt(sky, "backgroundColor", sky1, sky2, sky3, sky4);
        colorAnim.setEvaluator(new ArgbEvaluator());

        ImageView sun = (ImageView) findViewById(R.id.sun);
        ObjectAnimator move_sun = ObjectAnimator.ofFloat(sun, "y", view.getHeight());

        colorAnim.setDuration(4500);
        move_sun.setDuration(3000);
        colorAnim.start();
        move_sun.start();
    }

    public void toHello(View view) {
        setContentView(R.layout.activity_hello);
    }
}