package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class CalenderAdapter extends RecyclerView.Adapter<CalenderAdapter.MyViewHolder> {


    private String[] list;
    private Context context;

    public CalenderAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CalenderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calender_row_top, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CalenderAdapter.MyViewHolder holder, int position) {

        holder.textView1.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;

        MyViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView_id);

        }
    }

}