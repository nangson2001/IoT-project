package com.zapp.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTaiKhoan, edtMatKhau;
    Button btnDangNhap;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Khời tạo các phần tử giao diện
        initUI();

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taiKhoan, matKhau;
                taiKhoan = edtTaiKhoan.getText().toString();
                matKhau = edtMatKhau.getText().toString();
                if (taiKhoan.equals("1234") && matKhau.equals("5678")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("thong_tin", "Tài khoản: " + taiKhoan + "; Mật khẩu: " + matKhau);
                    startActivity(intent);
                } else {
                    Toast.makeText(context, "Đăng nhập thất bại!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    void initUI() {
        edtTaiKhoan = findViewById(R.id.edt_tai_khoan);
        edtMatKhau = findViewById(R.id.edt_mat_khau);
        btnDangNhap = findViewById(R.id.btn_dang_nhap);
    }
}