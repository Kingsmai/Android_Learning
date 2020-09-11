package com.example.helloworld.demo10gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class Demo10GridViewActivity extends AppCompatActivity {

    private GridView mGv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo10_grid_view);

        mGv = findViewById(R.id.gv);

        /*
        GridView重要的方法：public void setAdapter(ListAdapter adapter)
        到 demo09gridview 包下创建一个新的 class。名字随意，如：MyListAdapter
         */
        mGv.setAdapter(new MyGridAdapter(Demo10GridViewActivity.this));

        // 点击事件
        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Demo10GridViewActivity.this, "Click pos: " + i, Toast.LENGTH_SHORT).show();
            }
        });

        mGv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Demo10GridViewActivity.this, "Long Click pos: " + i, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
