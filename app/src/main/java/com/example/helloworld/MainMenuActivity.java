package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; // 下面跳转的时候ide自动导入的（没有的话手动导入在类名Alt + Enter就行）
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // 输入 public Button之后会自动导包

public class MainMenuActivity extends AppCompatActivity {

    // 声明用于页面跳转的Button控件
    // Button类是要导包的
    public Button mBtnTextView; // 声明一个Button类型的变量，名：mBtnTextView
    public Button mBtnButton; // 同上，用于保存跳转Button页面的按钮
    public Button mBtnEditText;

    public Button mBtnLoginPrac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 需要显示的页面，页面文件夹在app/src/res/layout
        setContentView(R.layout.main_menu); // 显示主界面 20200907
//        setContentView(R.layout.demo01_linear_layout);
//        setContentView(R.layout.demo02_relative_layout);
//        setContentView(R.layout.demo03_text_view);
//        setContentView(R.layout.prac01_layout);

        /*
        找到Button控件
        如果报错的话（旧版本Android Studio不会隐含强转）
        深入解释：旧版本findViewById返回的是View类，所以需要转换成为Button类。
        解决方法：mBtnTextView = (Button) findViewById(R.id.btn_textView); // 就是Java的强转
         */
        mBtnTextView = findViewById(R.id.btn_textView); // R.id 会保存所有被声明的id
        // 给该组件设置点击事件
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override // 覆盖重写View类的onclick事件
            public void onClick(View view) {
                // 跳转到TextView演示界面
                Intent intent = new Intent(MainMenuActivity.this, Demo03TextViewActivity.class); // 暂时不理解
                startActivity(intent); // 运行上面声明的intent
            }
        });

        // 找到对应Button控件
        mBtnButton = findViewById(R.id.btn_button);
        // 给该组件设置点击事件
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转到Button演示界面
                Intent intent = new Intent(MainMenuActivity.this, Demo04ButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnEditText = findViewById(R.id.btn_editText);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, Demo05EditTextActivity.class);
                startActivity(intent);
            }
        });

        mBtnLoginPrac = findViewById(R.id.btn_prac02);
        mBtnLoginPrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, Prac02LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}