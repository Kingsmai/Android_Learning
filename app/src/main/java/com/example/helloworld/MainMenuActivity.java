package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; // 下面跳转的时候ide自动导入的（没有的话手动导入在类名Alt + Enter就行）
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // 输入 public Button之后会自动导包
import android.widget.Toast;

import com.example.helloworld.demo09listview.Demo09ListViewActivity;
import com.example.helloworld.demo10gridview.Demo10GridViewActivity;

public class MainMenuActivity extends AppCompatActivity {

    // 声明用于页面跳转的Button控件
    // Button类是要导包的
    private Button mBtnTextView; // 声明一个Button类型的变量，名：mBtnTextView
    private Button mBtnButton; // 同上，用于保存跳转Button页面的按钮
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;

    public Button mBtnLoginPrac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 需要显示的页面，页面文件夹在app/src/res/layout
        setContentView(R.layout.main_menu); // 显示主界面 20200907

        /*
        找到Button控件
        如果报错的话（旧版本Android Studio不会隐含强转）
        深入解释：旧版本findViewById返回的是View类，所以需要转换成为Button类。
        纠正：搜了一下，新版本的Android Studio使用了泛型，所以不需要类型转换
        解决方法：mBtnTextView = (Button) findViewById(R.id.btn_textView); // 就是Java的强转
         */
        mBtnTextView = findViewById(R.id.btn_textView); // R.id 会保存所有被声明的id
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_editText);
        mBtnRadioButton = findViewById(R.id.btn_radioButton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_imageView);
        mBtnListView = findViewById(R.id.btn_listView);
        mBtnGridView = findViewById(R.id.btn_gridView);

        mBtnLoginPrac = findViewById(R.id.btn_prac02);
        setListeners();
    }

    // 设置监听器（初始化）
    private void setListeners() {
        OnClick onClick = new OnClick();
        // 给每个控件设置点击事件
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnLoginPrac.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
    }

    // 简化跳转页面按钮代码：
    private class OnClick implements View.OnClickListener {

        // 覆盖重写onClick函数
        @Override
        public void onClick(View view) {
            Intent intent = null;
            // 获取按钮ID，并对相应的按钮进行不同页面的跳转
            switch(view.getId()) {
                case R.id.btn_textView:
                    // 跳转到 TextView演示界面
                    intent = new Intent(MainMenuActivity.this, Demo03TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    // 跳转到 Button演示界面
                    intent = new Intent(MainMenuActivity.this, Demo04ButtonActivity.class);
                    break;
                case R.id.btn_editText:
                    // 跳转到 Edit Text 界面
                    intent = new Intent(MainMenuActivity.this, Demo05EditTextActivity.class);
                    break;
                case R.id.btn_radioButton:
                    // 跳转到 Radio Button 界面
                    intent = new Intent(MainMenuActivity.this, Demo06RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainMenuActivity.this, Demo07CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    intent = new Intent(MainMenuActivity.this, Demo08ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    intent = new Intent(MainMenuActivity.this, Demo09ListViewActivity.class);
                    break;
                case R.id.btn_gridView:
                    intent = new Intent(MainMenuActivity.this, Demo10GridViewActivity.class);
                    break;
                case R.id.btn_prac02:
                    // 跳转到 Practise02 Login 界面
                    intent = new Intent(MainMenuActivity.this, Prac02LoginActivity.class);
                    break;
                default:
                    // 默认报错
                    Toast.makeText(MainMenuActivity.this, "这颗按钮貌似出BUG了", Toast.LENGTH_SHORT);
                    break;
            }
            startActivity(intent); // 运行上面声明的intent
        }
    }
}