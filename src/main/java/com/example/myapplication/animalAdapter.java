package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.file.attribute.FileTime;
import java.util.List;

public class animalAdapter extends RecyclerView.Adapter<animalAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<animal> animalList;

    public  animalAdapter (Context context ,List<animal> animalList){
        this.inflater = LayoutInflater.from(context);
        this.animalList= animalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView imageView;
        final TextView textView7;

      ViewHolder(View itemView, ImageView imageView, TextView textView7, View view) {
            super(view);
            this.imageView = imageView;
            this.textView7 = textView7;

            imageView.findViewById(R.id.imageView2);
            textView7.findViewById(R.id.nameView);

        }
    }
}
