package com.example.pharmacy.Adaptor;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pharmacy.R;
import com.example.pharmacy.Activity.ViewItem;
import com.example.pharmacy.databinding.ItemBinding;
import com.example.pharmacy.model.Item;

import java.util.ArrayList;


public class ItemsAdapterDoctor extends RecyclerView.Adapter<ItemsAdapterDoctor.viewHolder> {

    Context context;
    ArrayList<Item> list;

    public ItemsAdapterDoctor(Context context, ArrayList<Item> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_doctor,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final Item model = list.get(position);
        holder.binding.itemTitle.setText(model.getTitle());
        Log.d(TAG,"----------->>>>>"+ model.getPic()+"<<<<<<--------------");

        Glide.with(holder.itemView.getContext())
                .load(model.getPic())
                .into(holder.binding.itemPic);
        holder.binding.desItem.setText(model.getDiscreption());
        holder.binding.costItem.setText(model.getPrice()+" شيكل");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewItem.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return  list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ItemBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemBinding.bind(itemView);
        }
    }
}
