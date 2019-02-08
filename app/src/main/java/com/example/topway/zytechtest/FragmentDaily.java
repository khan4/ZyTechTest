package com.example.topway.zytechtest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentDaily extends Fragment {

    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;

    public static FragmentDaily getInstance(){
        FragmentDaily fragmentDaily=new FragmentDaily();
        return fragmentDaily;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_daily,container,false);
        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new RecyclerViewAdapter(getContext(),dummyData());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private ArrayList<DataModel> dummyData(){

        ArrayList<DataModel> modelArrayList=new ArrayList<>();

        DataModel dataModel1=new DataModel("5:4","cloudy","7:00","5");
        DataModel dataModel2=new DataModel("5:9","cloudy","8:00","-9");
        DataModel dataModel3=new DataModel("8:18","cloudy","9:00","-7");
        DataModel dataModel4=new DataModel("9:29","cloudy","6:00","-2");
        DataModel dataModel5=new DataModel("10:56","cloudy","5:00","-7");
        DataModel dataModel6=new DataModel("12:42","cloudy","5:30","9");
        DataModel dataModel7=new DataModel("8:49","cloudy","6:30","8");
        DataModel dataModel8=new DataModel("7:45","cloudy","7:00","8");

        modelArrayList.add(dataModel1);
        modelArrayList.add(dataModel2);
        modelArrayList.add(dataModel3);
        modelArrayList.add(dataModel4);
        modelArrayList.add(dataModel5);
        modelArrayList.add(dataModel6);
        modelArrayList.add(dataModel7);
        modelArrayList.add(dataModel8);
        modelArrayList.add(dataModel6);
        modelArrayList.add(dataModel7);
        modelArrayList.add(dataModel8);

        return modelArrayList;
    }
}
