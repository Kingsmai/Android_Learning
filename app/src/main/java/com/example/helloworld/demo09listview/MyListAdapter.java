package com.example.helloworld.demo09listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

/*
Adapter是一个适配器，将UI和代码中的数据进行连接并传值给list view
Holder其实只是一个存东西的
 */
public class MyListAdapter extends BaseAdapter { // 继承BaseAdapter

    private Context mContext; // Context用法：https://blog.csdn.net/friendlychen/article/details/73472419
    private LayoutInflater mLayoutInflater; // https://www.jianshu.com/p/2a70861fd0fa
    // LayoutInflater 抽象类, 将布局XML文件实例化为其对应的View对象

    // 构造方法
    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    /*
    BaseAdapter是一个抽象类，所以要覆盖重写他的抽象方法
    写完 extends BaseAdapter 之后，会出现红线报错，鼠标悬浮在上面，然后点Implement methods
     */
    @Override
    public int getCount() {
        // 这里设置要显示多少个列表（通常是一个算式）
        // 这里直接挂上10，意思就是显示10个列表
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // 内部类，这里定义ViewHolder用于减少程序内存
    // 如果每一张图片都去new一个ImageView的话，相当于把1000张图片写入内存
    // 这个object（ViewHolder）就包含了视图所有的信息，使用的时候直接getTag()既可
    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle, tvDate, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            // 将我写好的布局：layout_list_item.xml，作为列表中每一个小部分的布局，将写好的布局存到缓存中
            view = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            // 找到layout_list_item布局里的控件
            holder.imageView = view.findViewById(R.id.iv);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            holder.tvDate = view.findViewById(R.id.tv_date);
            holder.tvContent = view.findViewById(R.id.tv_content);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag(); // 强转为 ViewHolder（上面定义的静态类）
        }

        // 给控件赋值
        holder.tvTitle.setText("这是标题，可以换成变量");
        holder.tvDate.setText("2000-05-16");
        holder.tvContent.setText("正文内容，一大堆巴拉巴拉");
        Glide.with(mContext).load("https://cdn.vox-cdn.com/thumbor/kL-Z76ZSmU6AUOBanezRDqSQ7us=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19086219/Android_logo_stacked__RGB_.jpg").into(holder.imageView);
        return view;
    }
}
