package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide; // 自动导入Gilde包

public class Demo08ImageViewActivity extends AppCompatActivity {

    /*
    这里使用Glide库：https://github.com/bumptech/glide
     */

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo08_image_view);

        mIv4 = findViewById(R.id.iv_4);

        // 使用Glide（第三方库访问网络图片）
        Glide.with(this).load("https://www.baidu.com/img/dong_8e531e8c4c040acdb0c085da1a79179e.gif").into(mIv4);
        // 这是网络请求，所以要在AndroidManifest.xml里去声明权限
    }
}