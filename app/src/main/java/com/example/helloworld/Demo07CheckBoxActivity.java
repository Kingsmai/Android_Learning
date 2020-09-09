package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Demo07CheckBoxActivity extends AppCompatActivity {

//    private CheckBox mCb5, mCb6, mCb7, mCb8;
    private CheckBox[] hobbyCb = new CheckBox[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo07_check_box);

        hobbyCb[0] = findViewById(R.id.cb_5);
        hobbyCb[1] = findViewById(R.id.cb_6);
        hobbyCb[2] = findViewById(R.id.cb_7);
        hobbyCb[3] = findViewById(R.id.cb_8);

        for (CheckBox checkBox : hobbyCb) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    Toast.makeText(Demo07CheckBoxActivity.this, compoundButton.getText() + (b ? "选中" : "未选中"), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}