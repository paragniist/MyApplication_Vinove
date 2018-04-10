package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class Badges_Adapter extends RecyclerView.Adapter<Badges_Adapter.MyViewHolder> {
    private String[] list;
    private Context context;
    private int[] imageArr;

    public Badges_Adapter(Context context, String[] list, int[] imageArr) {
        this.context = context;
        this.list = list;
        this.imageArr = imageArr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.badges_row, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.textView1.setText(list[position]);
        holder.imageView.setImageResource(imageArr[position]);

    }

    @Override
    public int getItemCount() {

        return list.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView1;

        MyViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView_id);
            imageView = itemView.findViewById(R.id.imageView_id);

        }
    }
}
