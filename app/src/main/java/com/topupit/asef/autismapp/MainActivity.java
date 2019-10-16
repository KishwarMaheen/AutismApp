package com.topupit.asef.autismapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.topupit.asef.autismapp.adapter.ViewPagerAdapter;
import com.topupit.asef.autismapp.fragment.TodaysActivity;
import com.topupit.asef.autismapp.fragment.TodaysMeal;
import com.topupit.asef.autismapp.fragment.TodaysNeed;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        setDataToViewPager();
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();
    }

    private void setTabIcons(){
        TabLayout.Tab setIcon = tabLayout.getTabAt(0).setIcon(R.drawable.food);
        tabLayout.getTabAt(1).setIcon(R.drawable.activity);
        tabLayout.getTabAt(2).setIcon(R.drawable.shopping_cart);
    }

    private void setDataToViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TodaysMeal(), "কি খাবে" );
        adapter.addFragment(new TodaysActivity(), "কি কি করবে??" );
        adapter.addFragment(new TodaysNeed(), "কি কি লাগবে??" );
        viewPager.setAdapter(adapter);

    }
}
