package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Demo06RadioButtonActivity extends AppCompatActivity {

    private RadioGroup mRg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo06_radio_button);

        mRg1 = findViewById(R.id.rg_1);
        // 监听事件
        mRg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = radioGroup.findViewById(i);
                // 打印当前选中的radio文字
                Toast.makeText(Demo06RadioButtonActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}