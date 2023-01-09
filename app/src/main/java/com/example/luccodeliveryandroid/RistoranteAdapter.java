package com.example.luccodeliveryandroid;

import static android.content.ContentValues.TAG;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RistoranteAdapter extends RecyclerView.Adapter<RistoranteAdapter.ProjectViewHolder>{
    private final String[] piatti;



    public RistoranteAdapter(String[] piatti){
        this.piatti=piatti;

    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mio_layout2,parent,false);

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {

            String item= piatti[position];
            holder.bind(item);





    }

    @Override
    public int getItemCount(){
        return piatti.length;
    }


     class ProjectViewHolder extends RecyclerView.ViewHolder {
        private final TextView nome;


        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.text_card);


        }

        public void bind(String item) {

                nome.setText(item);





        }
    }
}
