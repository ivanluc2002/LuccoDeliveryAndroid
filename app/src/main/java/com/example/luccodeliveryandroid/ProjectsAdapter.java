package com.example.luccodeliveryandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> implements RecyclerViewInterface{
    private final Project[] projects;
    private final RecyclerViewInterface recyclerViewInterface;

    public  ProjectsAdapter(Project[] projects, RecyclerViewInterface recyclerViewInterface){
        this.projects=projects;
        this.recyclerViewInterface=recyclerViewInterface;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mio_layout,parent,false);

        return new ProjectViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
    holder.bind(projects[position]);



    }

    @Override
    public int getItemCount(){
        return projects.length;
    }


    @Override
    public void OnItemClick(int position) {

    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        private final TextView nome;
        private final ImageView icon;
        private final TextView desc;

        public ProjectViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            nome = itemView.findViewById(R.id.text_card);
            icon = itemView.findViewById(R.id.image_icon_card);
            desc= itemView.findViewById(R.id.text_desc);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recyclerViewInterface !=null) {
                        int pos= getAdapterPosition();
                        if(pos !=RecyclerView.NO_POSITION){
                           recyclerViewInterface.OnItemClick(pos);
                        }
                    }
                }
            });
        }

        public void bind(Project project) {
            nome.setText(project.name);
            icon.setImageResource(project.image);
            desc.setText(project.descrizione);
        }
    }
}
