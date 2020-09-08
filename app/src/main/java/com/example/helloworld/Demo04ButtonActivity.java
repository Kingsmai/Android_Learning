package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button; // 自动导包
import android.widget.TextView; // 自动导包
import android.widget.Toast; // 会自动导包

public class Demo04ButtonActivity extends AppCompatActivity {

    private Button mBtn6;
    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo04_button);

        // 找到该按钮控件
        mBtn6 = findViewById(R.id.btn_6);
        // 定义点击事件
        mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Demo04ButtonActivity.this, "btn_6被点击了", Toast.LENGTH_SHORT).show();
            }
        });

        // 找到文本控件
        mTv1 = findViewById(R.id.btn_tv_1);
        // 定义点击事件
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Demo04ButtonActivity.this, "文本也是可以设置点击事件", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view) {
        // 弹出提示框（文本为：Hello World!，时间为 1s）
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show(); // 一定要有show()方法
    }
}