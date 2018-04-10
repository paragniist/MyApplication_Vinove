package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class GraphAdapter extends RecyclerView.Adapter<GraphAdapter.MyViewHolder> {
    private String[] list;
    private Context context;

    public GraphAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.graph_row, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.textView1.setText(list[position]);
        holder.textView2.setText(list[position]);
        holder.button.setText(""+list[position]);


    }

    @Override
    public int getItemCount() {

        return list.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {


        TextView textView1;
        TextView textView2;
        TextView button;

        MyViewHolder(View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.processing);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);

        }
    }
}
