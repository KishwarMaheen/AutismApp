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

public class Lunch extends AppCompatActivity {
    RadioGroup r7, r8, r9;
    Button button;
    String s7, s8, s9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunch_layout);
        Intent intent = getIntent();
        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        r9 = findViewById(R.id.r9);
        button = findViewById(R.id.saveLunch);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference main = database.getReference("mainLunch");
        final DatabaseReference addon = database.getReference("addonLunch");
        final DatabaseReference side = database.getReference("sideLunch");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (r7.getCheckedRadioButtonId()) {
                    case R.id.riceLunch:
                        s7 = "Rice";
                        main.setValue(s7);
                        break;
                    case R.id.khichuri:
                        s7 = "Khichuri";
                        main.setValue(s7);

                }
                switch (r8.getCheckedRadioButtonId()) {
                    case R.id.fishLunch:
                        s8 = "Fish";
                        addon.setValue(s8);
                        break;
                    case R.id.chickenLunch:
                        s8 = "Chicken";
                        addon.setValue(s8);
                        break;
                    case R.id.beefLunch:
                        s8 = "Beef";
                        addon.setValue(s8);
                }
                switch (r9.getCheckedRadioButtonId()) {
                    case R.id.vegetableLunch:
                        s9 = "Vegetables";
                        side.setValue(s9);
                        break;
                    case R.id.daalLunch:
                        s9 = "Daal";
                        side.setValue(s9);
                        break;
                    case R.id.saladLunch:
                        s9 = "Salad";
                        side.setValue(s9);
                        break;
                }
            }
        });
    }
}
