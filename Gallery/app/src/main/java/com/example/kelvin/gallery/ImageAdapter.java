package com.example.kelvin.gallery;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{
    private Context context;
    public Integer[] images={
            R.drawable.pic1,

    };
    public ImageAdapter(Context c){
        context=c;
    }




    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int postion) {
        return images[postion];
    }

    @Override
    public long getItemId(int postion) {
        return 0;
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup  parent) {
        ImageView imageView =new ImageView(context);
        imageView.setImageResource(images[postion]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));

        return imageView;
    }
}