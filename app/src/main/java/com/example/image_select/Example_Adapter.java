package com.example.image_select;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;

public class Example_Adapter extends RecyclerView.Adapter<Example_Adapter.Example_View_Holder> {

    public ArrayList<Ex_item_java> ex_list;
    public static class Example_View_Holder extends RecyclerView.ViewHolder {

        public ImageView iv;

        public Example_View_Holder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);

        }
    }

    public Example_Adapter(ArrayList<Ex_item_java> ex_list)
    {
        this.ex_list=ex_list;
    }
    @NonNull
    @Override
    public Example_View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.ex_layout,parent,false);
        Example_View_Holder evh=new Example_View_Holder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull Example_View_Holder holder, int position) {
        Ex_item_java currentItem=ex_list.get(position);
        //Picasso.with(getContext()).load().into(i);
    }

    @Override
    public int getItemCount() {
        return ex_list.size();
    }


}


