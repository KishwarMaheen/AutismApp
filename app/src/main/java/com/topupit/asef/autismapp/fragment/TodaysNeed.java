package com.topupit.asef.autismapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.topupit.asef.autismapp.R;

/**
 * Created by Admin on 05-Feb-18.
 */

public class TodaysNeed extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        return inflater.inflate(R.layout.need_fragment_layout,null);
    }
}
