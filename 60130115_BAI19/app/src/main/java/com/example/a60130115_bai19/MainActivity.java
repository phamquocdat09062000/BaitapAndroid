    package com.example.a60130115_bai19;

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
    ArrayList<Tinh> tinh=new ArrayList<>();
        Tinh[] tinhs={
            new Tinh(R.drawable.traidat, "Hà Nội"),
            new Tinh(R.drawable.sao, "huế"),
            new Tinh(R.drawable.sao, "spa"),
            new Tinh(R.drawable.traidat, "côn sơn"),
            new Tinh(R.drawable.traidat, "vũng tàu"),
            new Tinh(R.drawable.traidat, "đà nẵng"),
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
        Collections.addAll(tinh, tinhs);
        CustomAdapter adapter=new CustomAdapter(MainActivity.this, tinh);
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