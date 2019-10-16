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

public class Dinner extends AppCompatActivity {
    RadioGroup r4, r5, r6;
    String s4, s5, s6;
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinner_layout);
        Intent intent = getIntent();
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        button = findViewById(R.id.saveDinner);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference main = database.getReference("mainDinner");
        final DatabaseReference addon = database.getReference("addonDinner");
        final DatabaseReference side = database.getReference("sideDinner");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (r4.getCheckedRadioButtonId()) {
                    case R.id.riceDinner:
                        s4 = "Rice";
                        main.setValue(s4);
                        break;
                    case R.id.polau:
                        s4 = "Polau";
                        main.setValue(s4);
                }
                switch (r5.getCheckedRadioButtonId()) {
                    case R.id.fishDinner:
                        s5 = "Fish";
                        main.setValue(s5);
                        break;
                    case R.id.chickenDinner:
                        s5 = "Chicken";
                        main.setValue(s5);
                        break;
                    case R.id.beefDinner:
                        s5 = "Beef";
                        main.setValue(s5);
                }
                switch (r6.getCheckedRadioButtonId()) {
                    case R.id.vegetableDinner:
                        s6 = "Vegetables";
                        main.setValue(s6);
                        break;
                    case R.id.daalDinner:
                        s6 = "Daal";
                        main.setValue(s6);
                        break;
                    case R.id.saladDinner:
                        s6 = "Salad";
                        main.setValue(s6);
                        break;
                }
            }
        });
    }
}
