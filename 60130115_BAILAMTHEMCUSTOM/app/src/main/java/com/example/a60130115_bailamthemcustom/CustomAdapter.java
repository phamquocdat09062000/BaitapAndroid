package com.example.a60130115_bailamthemcustom;

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
    ArrayList<Nhac> nhac=new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Nhac> nhac) {//Vì ở dưới kia gọi rồi
        this.context = context;
        this.nhac = nhac;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return nhac.size();
    }

    @Override
    public Object getItem(int position) {
        return nhac.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView=inflater.inflate(R.layout.nhac, parent, false);
        }
        ImageView hinh=(ImageView) convertView.findViewById(R.id.img);
        TextView tvT=(TextView) convertView.findViewById(R.id.nd);
        //
        tvT.setText(nhac.get(position).name);
        hinh.setImageResource(nhac.get(position).avt);
        return convertView;
    }
}