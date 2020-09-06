package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 需要显示的页面，页面文件夹在app/src/res/layout
//        setContentView(R.layout.demo01_linear_layout);
//        setContentView(R.layout.demo02_relative_layout);
        setContentView(R.layout.prac01_layout);
    }
}