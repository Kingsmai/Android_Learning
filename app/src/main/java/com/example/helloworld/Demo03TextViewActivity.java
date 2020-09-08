package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class Demo03TextViewActivity extends AppCompatActivity {

    private TextView mTv4, mTv5;
//    private TextView mtv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo03_text_view);

        /*
        找到TextView控件（需要设置中划线的那个）
        如果报错的话（旧版本Android Studio不会隐含强转）
        深入解释：旧版本findViewById返回的是View类，所以需要转换成为TextView类。
        解决方法：mTv4 = (TextView) findViewById(R.id.tv_4); // 就是Java的强转
         */
        mTv4 = findViewById(R.id.tv_4);
        // 为字体设置中划线
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        // 为字体设置抗锯齿
        mTv4.getPaint().setAntiAlias(true); // 抗锯齿

        // 找到TextView控件（需要设置下划线的那个）
        mTv5 = findViewById(R.id.tv_5);
        // 为字体设置下划线
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}