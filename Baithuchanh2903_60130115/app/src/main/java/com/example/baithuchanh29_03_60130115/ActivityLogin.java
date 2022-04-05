package com.example.baithuchanh29_03_60130115;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnQuiz = (Button) findViewById(R.id.btnQuiz);

        btnQuiz.setOnClickListener(XulichuyensangQuiz);
    }

    View.OnClickListener XulichuyensangQuiz = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText edtTK = (EditText) findViewById(R.id.edtUsername);
            EditText edtMK = (EditText) findViewById(R.id.edtUsername);
            EditText edtEmail = (EditText) findViewById(R.id.edtUsername);
            String taikhoan = "phamquocdat";
            String matkhau = "phamquocdat123";
            String email = "dat_oppa@gmail.com";
            if(edtTK.getText().toString().equals(taikhoan) && edtMK.getText().toString().equals(matkhau)){
                Intent iQuiz = new Intent(ActivityLogin.this, ActivityHome.class);
                iQuiz.putExtra("tennguoidung",taikhoan);
                iQuiz.putExtra("matkhau",matkhau);
                iQuiz.putExtra("emailnguoidung",email);
                startActivity(iQuiz);

            }
            else{
                Toast.makeText(getApplicationContext(), "Sai rồi bạn êiiii", Toast.LENGTH_SHORT).show();
            }
        }
    };

}