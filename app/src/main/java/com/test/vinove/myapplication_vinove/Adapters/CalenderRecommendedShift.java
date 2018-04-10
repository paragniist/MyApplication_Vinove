package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class CalenderRecommendedShift extends RecyclerView.Adapter<CalenderRecommendedShift.MyViewHolder2> {


    private String[] list1;
    private String[] list2;
    private Context context;

    public CalenderRecommendedShift(Context context, String[] list,String[] list2) {
        this.context = context;
        this.list1 = list;
        this.list2 = list2;
    }

    @NonNull
    @Override
    public CalenderRecommendedShift.MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calender_row_bottom, parent, false);

        return new MyViewHolder2(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CalenderRecommendedShift.MyViewHolder2 holder, int position) {

        holder.textView2.setText(list1[position]);
        holder.textView02.setText(list2[position]);
    }

    @Override
    public int getItemCount() {
        return list1.length;
    }


    class MyViewHolder2 extends RecyclerView.ViewHolder {

        TextView textView2,textView02;

        MyViewHolder2(View itemView) {
            super(itemView);
            textView2 = itemView.findViewById(R.id.textView_id2);
            textView02 = itemView.findViewById(R.id.textView_id02);

        }
    }

}
