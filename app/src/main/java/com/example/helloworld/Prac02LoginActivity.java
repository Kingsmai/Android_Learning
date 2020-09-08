package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Prac02LoginActivity extends AppCompatActivity {

    public Button mBtnLogin;
    public EditText mEtUsername;
    public EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac02_login);

        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 当然，这是个假的登录（无论你有没有输入用户密码都会显示登录成功）
                Toast.makeText(Prac02LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            }
        });

        mEtUsername = findViewById(R.id.prac02_username);
        mEtPassword = findViewById(R.id.prac02_password);

        // 设置输入框的监听事件
        mEtUsername.addTextChangedListener(new TextWatcher() {
            // 文字改变前
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // 文字改变中（常用）
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // 打印到控制台（4.0版本在IDE左下部分的Run可以看见实时输入的内容）
                // 控制台右键 Clear All 可以清空内容
                Log.d("EditText", charSequence.toString());
            }

            // 文字改变后
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}