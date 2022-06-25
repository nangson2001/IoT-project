package com.zapp.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ImageAdapter adapter;
    public static final Integer[] images = new Integer[] {R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_car_crash_24,
            R.drawable.ic_baseline_local_car_wash_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_car_crash_24,
            R.drawable.ic_baseline_local_car_wash_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_car_crash_24,
            R.drawable.ic_baseline_local_car_wash_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_car_crash_24,
            R.drawable.ic_baseline_local_car_wash_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_car_crash_24,
            R.drawable.ic_baseline_local_car_wash_24,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        adapter = new ImageAdapter(this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ShowImage.class);
                intent.putExtra("Position", position);
                startActivity(intent);
            }
        });
    }
}