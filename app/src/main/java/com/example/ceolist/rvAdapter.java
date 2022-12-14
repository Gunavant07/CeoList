package com.example.ceolist;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.ViewData> {
    Activity activity;
    List<Modeldata> l1 = new ArrayList<>();

    public rvAdapter(MainActivity mainActivity, List<Modeldata> l1) {
        activity=mainActivity;
        this.l1=l1;

    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list_item,parent,false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {
        holder.imgview.setImageResource(l1.get(position).getImage());
        holder.txtpname.setText(l1.get(position).getName());

        holder.imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(activity,ceoinfo.class);

                intent.putExtra("txtname",l1.get(position).getName());
                intent.putExtra("txtinfo",l1.get(position).getDetail());
                intent.putExtra("txtcompany",l1.get(position).getCompany());
                intent.putExtra("txtcountry",l1.get(position).getCountry());
                intent.putExtra("profile_image",l1.get(position).getImage());
                intent.putExtra("imglogo",l1.get(position).getImage1());
                activity.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    class ViewData extends RecyclerView.ViewHolder{


        TextView txtpname;
        ImageView imgview;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            txtpname=itemView.findViewById(R.id.txtpname);
            imgview=itemView.findViewById(R.id.imgview);

        }
    }

}
