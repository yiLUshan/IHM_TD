package com.example.yilu.td1_luyi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Yi LU on 2018/12/12.
 */

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    public NameViewHolder(@NonNull View itemView){
        super(itemView);
        textViewName = itemView.findViewById(R.id.item_name);
    }
    public void setContent(String name){
        textViewName.setText(name);
    }
}
