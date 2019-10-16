package com.topupit.asef.autismapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.topupit.asef.autismapp.MainActivity;
import com.topupit.asef.autismapp.R;
import com.topupit.asef.autismapp.adapter.GridAdapter;
import com.topupit.asef.autismapp.mealActivities.Breakfast;
import com.topupit.asef.autismapp.mealActivities.Dinner;
import com.topupit.asef.autismapp.mealActivities.Lunch;
import com.topupit.asef.autismapp.mealActivities.Snacks;
import com.topupit.asef.autismapp.model.SupperTimings;

import java.util.ArrayList;

/**
 * Created by Admin on 05-Feb-18.
 */

public class TodaysMeal extends Fragment {

    GridView gridView;
    GridAdapter gridAdapter;
    ArrayList<SupperTimings> arrayList;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        View view = inflater.inflate(R.layout.meal_fragment_layout,null);
        gridView = view.findViewById(R.id.mealOptions);
        arrayList = new ArrayList<>();
        setData();
        gridAdapter = new GridAdapter(arrayList, getContext());
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch(i)
                {
                    case 0:
                        intent = new Intent(getActivity(), Breakfast.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getActivity(), Lunch.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getActivity(), Snacks.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getActivity(), Dinner.class);
                        startActivity(intent);
                }
            }
        });
        return view;
    }

    private void setData() {
        SupperTimings breakfast = new SupperTimings(R.drawable.breakfast, "Breakfast");
        SupperTimings lunch = new SupperTimings(R.drawable.lunch, "Lunch");
        SupperTimings snacks = new SupperTimings(R.drawable.snacks, "Snacks");
        SupperTimings dinner = new SupperTimings(R.drawable.dinner, "Dinner");
        arrayList.add(breakfast);
        arrayList.add(lunch);
        arrayList.add(snacks);
        arrayList.add(dinner);
    }
}
