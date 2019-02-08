package com.example.topway.zytechtest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentHourly extends Fragment {

    public static FragmentHourly getInstance(){
        FragmentHourly fragmentHourly=new FragmentHourly();
        return fragmentHourly;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hourly,container,false);
        return view;
    }
}
