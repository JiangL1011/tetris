package com.example.tetris.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.tetris.R;
import com.example.tetris.util.DensityUtil;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private int[][] coordinate;
    private int size;

    public GridViewAdapter(Context context, int[][] coordinate) {
        this.context = context;
        this.coordinate = coordinate;
        this.size = DensityUtil.dip2px(context, 24);
    }

    @Override
    public int getCount() {
        // 20行10列
        return 200;
    }

    @Override
    public Object getItem(int position) {
        int row = position / 10;
        int col = position % 10;
        return coordinate[row][col];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int cube = (int) getItem(position);
        if (cube != 0) {
            convertView.setBackgroundResource(cube);
        } else {
            convertView = new View(context);
        }
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(size, size);
        convertView.setLayoutParams(params);
        return convertView;
    }

}