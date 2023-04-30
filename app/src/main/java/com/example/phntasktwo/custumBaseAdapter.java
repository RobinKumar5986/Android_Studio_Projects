package com.example.phntasktwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class custumBaseAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    int[] image;

    public custumBaseAdapter(Context ctx,int[] image){
        this.context=ctx;
        this.image=image;
        inflater=LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.custumitem,null);
        ImageView imageView=(ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(image[position]);
        return convertView;
    }
}
