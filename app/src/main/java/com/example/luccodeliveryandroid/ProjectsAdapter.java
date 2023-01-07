package com.example.luccodeliveryandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {
    private final Project[] projects;
    public  ProjectsAdapter(Project[] projects){
        this.projects=projects;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mio_layout,parent,false);

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
    holder.bind(projects[position]);
    }

    @Override
    public int getItemCount(){
        return projects.length;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        private final TextView nome;
        private final ImageView icon;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.text_card);
            icon = itemView.findViewById(R.id.image_icon_card);
        }

        public void bind(Project project) {
            nome.setText(project.name);
            icon.setImageResource(project.image);
        }
    }
}
