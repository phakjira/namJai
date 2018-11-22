package com.example.phakjira.namjai;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    private TextView NamJai;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NamJai = (TextView) findViewById(R.id.nam);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        NamJai.startAnimation(myanim);
        iv.startAnimation(myanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent welcomeIntent = new Intent(MainActivity.this, WelcomePage.class);
                startActivity(welcomeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
