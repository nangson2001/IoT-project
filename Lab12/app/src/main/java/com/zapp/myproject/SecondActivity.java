package com.zapp.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txvThongTin;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initUI();

        String thongTin = getIntent().getExtras().getString("thong_tin");
        txvThongTin.setText(thongTin);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    void initUI() {
        txvThongTin = findViewById(R.id.txv_thong_tin);
        btnBack = findViewById(R.id.btn_back);
    }
}