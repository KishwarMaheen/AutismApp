package com.topupit.asef.autismapp.mealActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.topupit.asef.autismapp.R;

/**
 * Created by Kishwar on 2/8/2018.
 */

public class Snacks extends AppCompatActivity {
    RadioGroup r10, r11;
    Button button;
    String s10, s11;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snacks_layout);
        Intent intent = getIntent();
        r10 = findViewById(R.id.r10);
        r11 = findViewById(R.id.r11);
        button = findViewById(R.id.saveSnacks);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference eateries = database.getReference("Eateries");
        final DatabaseReference drinks = database.getReference("addonDinner");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (r10.getCheckedRadioButtonId()) {
                    case R.id.biscuits:
                        s10 = "Biscuits";
                        eateries.setValue(s10);
                        break;
                    case R.id.fries:
                        s10 = "Fries";
                        eateries.setValue(s10);
                        break;
                    case R.id.noodles:
                        s10 = "Noodles";
                        eateries.setValue(s10);
                }
                switch (r11.getCheckedRadioButtonId()) {
                    case R.id.tea:
                        s11 = "Tea";
                        drinks.setValue(s11);
                        break;
                    case R.id.coffee:
                        s11 = "Coffee";
                        drinks.setValue(s11);
                        break;
                    case R.id.saladLunch:
                        s11 = "Coke";
                        drinks.setValue(s11);
                        break;
                }
            }
        });
    }
}