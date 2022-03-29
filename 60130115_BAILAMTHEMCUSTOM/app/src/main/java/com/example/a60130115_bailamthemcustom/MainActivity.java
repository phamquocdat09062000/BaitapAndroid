package com.example.a60130115_bailamthemcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView DanhSach;
    TextView textView;
    ArrayList<Nhac> nhac=new ArrayList<>();
    Nhac[] nhacs={
            new Nhac(R.drawable.casi, "Nô lệ tình yêu"),
            new Nhac(R.drawable.casi, "Người quan trọng nhất"),
            new Nhac(R.drawable.casi, "Nhói lòng"),
            new Nhac(R.drawable.casi, "Em băng qua"),
            new Nhac(R.drawable.casi, "Kẹo bong gòn"),
            new Nhac(R.drawable.casi, "lỜI THỀ"),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init() {
        DanhSach=(ListView) findViewById(R.id.lvDanhSach);
        textView = (TextView) findViewById(R.id.textview);
        Collections.addAll(nhac, nhacs);
        CustomAdapter adapter=new CustomAdapter(MainActivity.this, nhac);
        DanhSach.setAdapter(adapter);

        //
        DanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("name");
            }
        });

    }

}