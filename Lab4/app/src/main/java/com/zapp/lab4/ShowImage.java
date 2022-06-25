package com.zapp.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ShowImage extends AppCompatActivity implements View.OnTouchListener {

    ViewFlipper viewFlipper;
    float downX = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        Intent intent = getIntent();
        viewFlipper = findViewById(R.id.view_flipper);
        for (int i = 0; i < MainActivity.images.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageDrawable(getResources().getDrawable(MainActivity.images[i]));
            viewFlipper.addView(imageView);
        }
        viewFlipper.setDisplayedChild(intent.getExtras().getInt("Position", 0));
        viewFlipper.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
       switch (event.getAction()) {
           case MotionEvent.ACTION_DOWN:
               downX = event.getX();
               break;
           case MotionEvent.ACTION_UP:
               float upX = event.getX();
               if (upX < downX) {
                   viewFlipper.showNext();
               } else if (upX > downX) {
                   viewFlipper.showPrevious();
               }
               break;
       }
       return  true;
    }
}