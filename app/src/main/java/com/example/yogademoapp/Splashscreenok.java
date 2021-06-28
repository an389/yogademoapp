package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Splashscreenok extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenok2);


    }

    public void imageup(View view){
        ImageView image= (ImageView)findViewById(R.id.appsplash);
        Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        image.startAnimation(animation1);

    }





}