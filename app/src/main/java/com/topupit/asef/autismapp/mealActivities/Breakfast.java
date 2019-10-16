package com.topupit.asef.autismapp.mealActivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.topupit.asef.autismapp.R;

/**
 * Created by Kishwar on 2/8/2018.
 */

public class Breakfast extends AppCompatActivity {
    RadioGroup r1, r2, r3;
    String s1, s2, s3;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast_layout);
        Intent intent = getIntent();
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        button = findViewById(R.id.saveBreakfast);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference main = database.getReference("mainBreakfast");
        final DatabaseReference addon = database.getReference("addonBreakfast");
        final DatabaseReference side = database.getReference("sideBreakfast");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (r1.getCheckedRadioButtonId()) {
                    case R.id.roti:
                        s1 = "Roti";
                        main.setValue(s1);
                        break;
                    case R.id.paratha:
                        s1 = "Paratha";
                        main.setValue(s1);
                        break;
                    case R.id.friedRice:
                        s1 = "Fried Rice";
                        main.setValue(s1);
                }
                switch (r2.getCheckedRadioButtonId()) {
                    case R.id.omelette:
                        s2 = "Omelette";
                        addon.setValue(s2);
                        break;
                    case R.id.chickenBreakfast:
                        s2 = "Chicken";
                        addon.setValue(s2);
                        break;
                    case R.id.beefBreakfast:
                        s2 = "Beef";
                        addon.setValue(s2);
                }
                switch (r3.getCheckedRadioButtonId()) {
                    case R.id.apBhaji:
                        s3 = "Alu-Potol Bhaji";
                        side.setValue(s3);
                        break;
                    case R.id.sweets:
                        s3 = "Paratha";
                        side.setValue(s3);
                }
            }
        });
    }
}
