package com.example.at_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView LoginUserImg;
    private Drawable drawable;
    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginUserImg = (ImageView) findViewById(R.id.imageView);
        LoginUserImg.setImageResource(R.drawable.login_profile);
    }
}