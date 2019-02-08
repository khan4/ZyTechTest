package com.example.topway.zytechtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<DataModel> list;

    public RecyclerViewAdapter(Context context, ArrayList<DataModel> list){
        this.context=context;
        this.list=list;

        inflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=inflater.inflate(R.layout.item_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
    DataModel dataModel=list.get(i);

    holder.tvTemp.setText(dataModel.getTemp());
    holder.tvWeather.setText(dataModel.getTemp());
    holder.tvSunset.setText(dataModel.getSunSet());
    holder.tvTime.setText(dataModel.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTime,tvWeather,tvSunset,tvTemp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTime=itemView.findViewById(R.id.tvTime);
            tvSunset=itemView.findViewById(R.id.tvSunset);
            tvWeather=itemView.findViewById(R.id.tvWeather);
            tvTemp=itemView.findViewById(R.id.temperature);
        }
    }
}
