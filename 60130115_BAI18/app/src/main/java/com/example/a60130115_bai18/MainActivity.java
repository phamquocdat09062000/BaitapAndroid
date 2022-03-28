package com.example.a60130115_bai18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView selection;
    String arr[]={"Intel","SamSung",
            "Nokia","Simen","AMD",
            "KIC","ECD"};
    ArrayAdapter<String >adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Thiết lập Data Source cho Adapter
        adapter=new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        arr);
        //Gán Adapter vào ListView
        //Nhớ là phải đặt id cho ListView theo đúng quy tắc
        setListAdapter(adapter);

        selection=(TextView) findViewById(R.id.selection);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        String txt="postion = "+position +"; value ="+arr[position];
        selection.setText(txt);
    }
}