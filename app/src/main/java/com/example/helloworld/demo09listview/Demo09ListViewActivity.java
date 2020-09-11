package com.example.helloworld.demo09listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.helloworld.R;

public class Demo09ListViewActivity extends Activity {

    private ListView mLv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo09_list_view);

        mLv = findViewById(R.id.lv);
        /*
        ListView重要的方法：public void setAdapter(ListAdapter adapter)
        到 demo09listview 包下创建一个新的 class。名字随意，如：MyListAdapter
         */
        mLv.setAdapter(new MyListAdapter(Demo09ListViewActivity.this));

        // 设置监听事件（点击事件）
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Demo09ListViewActivity.this, "Click pos: " + i, Toast.LENGTH_SHORT).show();
            }
        });

        mLv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Demo09ListViewActivity.this, "Long Click pos: " + i, Toast.LENGTH_SHORT).show();
                return true; // 结束事件（不会冒泡）
            }
        });
    }
}
