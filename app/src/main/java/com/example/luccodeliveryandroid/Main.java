package com.example.luccodeliveryandroid;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Main#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Main extends Fragment implements RecyclerViewInterface  {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private ArrayList<Project> models;



    public Main() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment main.
     */
    // TODO: Rename and change types and number of parameters
    public  Main newInstance(String param1, String param2) {
        Main fragment = new Main();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_main, container, false);
        return  view;


    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<String> piattiMare= new ArrayList<>();
        piattiMare.add("pasta allo scoglio");
        ArrayList<String> pizza= new ArrayList<>();
        piattiMare.add("margherita");
        Project[] projects={
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),

        };



        recyclerView= view.findViewById(R.id.recycler);
        ProjectsAdapter projectsAdapter= new ProjectsAdapter(projects,this);
        recyclerView.setAdapter(projectsAdapter);



    }
    private void setUpProject(){

    }
    @Override
    public void OnItemClick(int position) {
        ArrayList<String> piattiMare= new ArrayList<>();
        piattiMare.add("pasta allo scoglio");
        piattiMare.add("pasta con tonno");
        ArrayList<String> pizza= new ArrayList<>();
        pizza.add("margherita");
        pizza.add("napoli");
        Project[] projects={
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),
                new Project("Mare in pasta",R.drawable.home,"ristorante di pesce",piattiMare),
                new Project("bella napoli",R.drawable.user,"pizzeria",pizza),

        };
        Intent intent = new Intent(getActivity(),Ristorante.class);
        intent.putExtra("ristorante",projects[position]);
        startActivity(intent);
    }



}