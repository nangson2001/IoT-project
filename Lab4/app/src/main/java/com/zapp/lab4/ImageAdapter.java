package com.zapp.lab4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private final Context context;
    private final Integer[] images = new Integer[] {R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24,
            R.drawable.ic_baseline_airport_shuttle_24};

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(80, 80));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10, 10, 10, 10);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(images[position]);
        return imageView;
    }
}
