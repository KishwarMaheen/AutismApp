package com.topupit.asef.autismapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.topupit.asef.autismapp.R;
import com.topupit.asef.autismapp.model.SupperTimings;

import java.util.ArrayList;

/**
 * Created by Kishwar on 2/7/2018.
 */

public class GridAdapter extends BaseAdapter {

    ArrayList<SupperTimings> arrayList;
    Context context;

    public GridAdapter(ArrayList<SupperTimings> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflater.inflate(R.layout.meal_fragment_options_layout, null);

        ImageView imageView = customView.findViewById(R.id.imageView);
        TextView textView = customView.findViewById(R.id.textView);

        imageView.setImageResource(arrayList.get(i).getImage());
        textView.setText(arrayList.get(i).getTitle());

        return customView;
    }
}
