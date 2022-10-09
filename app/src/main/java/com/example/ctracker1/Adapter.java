package com.example.ctracker1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.viewHolder >{

    int m1;
    Context context;
    List<ModelClass> countryList;

    public Adapter(Context context, List<ModelClass> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.layout_item,null,false);


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
        ModelClass modelclass=countryList.get(position);
        if(m1==1)
        {
            holder.cases.setText(NumberFormat.getInstance().format(Integer.parseInt(modelclass.getCases())));
        }
        else if(m1==2)
        {
            holder.cases.setText(NumberFormat.getInstance().format(Integer.parseInt(modelclass.getRecovered())));
        }

        else if(m1==3)
        {
            holder.cases.setText(NumberFormat.getInstance().format(Integer.parseInt(modelclass.getDeaths())));
        }

        else
        {
            holder.cases.setText(NumberFormat.getInstance().format(Integer.parseInt(modelclass.getActive())));
        }

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView cases,country;


        public viewHolder(@NonNull View itemView) {

            super(itemView);
            cases= itemView.findViewById(R.id.countrycase1);
            country= itemView.findViewById(R.id.countryname);

        }
    }
}
