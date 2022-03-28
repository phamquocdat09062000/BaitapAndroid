package com.example.a60130115_bai19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater=null;//Thổi cái giao diện vào trong cái màn hình
    ArrayList<Tinh> tinh=new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Tinh> tinh) {//Vì ở dưới kia gọi rồi
        this.context = context;
        this.tinh = tinh;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return tinh.size();
    }

    @Override
    public Object getItem(int position) {
        return tinh.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView=inflater.inflate(R.layout.tinh, parent, false);
        }
        ImageView hinh=(ImageView) convertView.findViewById(R.id.img);
        TextView tvT=(TextView) convertView.findViewById(R.id.nd);
        //
        tvT.setText(tinh.get(position).name);
        hinh.setImageResource(tinh.get(position).avt);
        return convertView;
    }
}
