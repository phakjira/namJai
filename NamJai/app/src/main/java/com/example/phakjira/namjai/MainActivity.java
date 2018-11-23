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
    private ImageView logo;
    private ImageView slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = (ImageView) findViewById(R.id.logo);
        slogan = (ImageView) findViewById(R.id.slogan);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        logo.startAnimation(myanim);
        slogan.startAnimation(myanim);
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
