package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;


public class BroadcastAdapter extends RecyclerView.Adapter<BroadcastAdapter.MyViewHolder> {

    //private ArrayList<MyModel> list;
    private String[] list;
    private String[] listArr1;
    private Context context;

    public BroadcastAdapter(Context context, String[] list, String[] listArr1) {
        this.context = context;
        this.list = list;
        this.listArr1 = listArr1;
    }

    @Override
    public BroadcastAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.broadcast_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BroadcastAdapter.MyViewHolder holder, int position) {

        holder.textView1.setText(list[position]);
        holder.textView2.setText(listArr1[position]);
        //holder.textView3.setText(list.get(position).getTv3());
    }

    @Override
    public int getItemCount() {
        return list.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView1, textView2, textView3;

        MyViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1_id);
            textView2 = itemView.findViewById(R.id.textView2_id);
            textView3 = itemView.findViewById(R.id.textView3_id);
            imageView = itemView.findViewById(R.id.imageView_id);

        }
    }


}