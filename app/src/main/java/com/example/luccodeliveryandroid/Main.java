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
        piattiMare.add("pasta con tonno");
        ArrayList<String> poke= new ArrayList<>();
        poke.add("SALMON JOY  6€");
        poke.add("HAPPY TUNA   5€");
        poke.add("POLPOKE   7€");
        poke.add("FIT CHICK   8€");
        poke.add("GREEN POKE   4€");
        poke.add("KETO POKE   9€");
        poke.add("VEGAN POWE   7€");
        ArrayList<String> mcdonald= new ArrayList<>();
        mcdonald.add("Big Mac menu  9€");
        mcdonald.add("Mc Chicken menu   7,50€");
        mcdonald.add("Gran Crispy Mc bacon menu   9,80€");
        mcdonald.add("My selection Chicken Avocado & Bacon menu   10€");
        mcdonald.add("My selection BBQ   5€");
        mcdonald.add("Double Chicken BBQ   4€");
        ArrayList<String> sushi= new ArrayList<>();
        sushi.add("Ravioli di gamberi e carne   4€");
        sushi.add("Involtini primavera   2€");
        sushi.add("Sashimi Salmone   8€");
        sushi.add("Tiger Roll   5€");
        sushi.add("Hosso fritto Philadelphia   9€");
        sushi.add("Temaki Ebi Ten   5€");
        ArrayList<String> pizza= new ArrayList<>();
        pizza.add("Marinara   4€");
        pizza.add("Margherita    5€");
        pizza.add("Peperoni e salame piccante   6€");
        pizza.add("Salsiccia e patatine   7€");
        pizza.add("Calzone fritto   9€");
        pizza.add("Quattro formaggi   8€");
        ArrayList<String> mare= new ArrayList<>();
        mare.add("Risotto ai frutti di mare   15€");
        mare.add("Tagliatella al salmone   12€");
        mare.add("Linguine all’astice    20€");
        mare.add("Grigliata mista   25€");
        mare.add("Pesce spada alla griglia   20€");
        mare.add("Frittura di calamari e gamberi   20€");
        ArrayList<String> calavera= new ArrayList<>();
        calavera.add("Burritos   10€");
        calavera.add("Tacos   8€");
        calavera.add("Empanadas   2€");
        calavera.add("Chorrizo   2€");
        calavera.add("Sandwich   8€");
        calavera.add("Fajitas   12€");
        ArrayList<String> king= new ArrayList<>();
        king.add("Chicken Royale   8€");
        king.add("Crispy Chicken   9€");
        king.add("Big King   10€");
        king.add("Whoopper   7€");
        king.add("Steakhouse   8,50€");
        king.add("Doble Cheese bacon XXL   10,50€");
        ArrayList<String> golocius= new ArrayList<>();
        golocius.add("Golocheese   9€");
        golocius.add("Crispy Golocius   12€");
        golocius.add("Nerano Burger   10€");
        golocius.add("The lord of pistacchio   14€");
        golocius.add("Carbonara Burger   9€");
        golocius.add("Dabbol Cis   8€");

        Project[] projects={
                new Project("Mare in pasta",R.drawable.mare,"ristorante di pesce specializzato in primi piatti\npesce sempre fresco",mare),
                new Project("Bella Napoli",R.drawable.pizza,"pizzeria partenopea con forno a legna ",pizza),
                new Project("Poke House",R.drawable.poke,"Le migliori Poke Bowl le trovi solo da noi",poke),
                new Project("MC Donald's",R.drawable.mc,"Fastfood ",mcdonald),
                new Project("Burger King",R.drawable.bk,"Fastfood",king),
                new Project("Calavera Restaurant",R.drawable.cala,"Cucina messicana e sud-americana\n tutto molto spicy",calavera),
                new Project("Golocius",R.drawable.golocious,"Un nuovo concept di fast food",golocius),
                new Project("hayashi",R.drawable.sushi,"Sushi Restaurant",sushi),

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
        ArrayList<String> poke= new ArrayList<>();
        poke.add("SALMON JOY  6€");
        poke.add("HAPPY TUNA   5€");
        poke.add("POLPOKE   7€");
        poke.add("FIT CHICK   8€");
        poke.add("GREEN POKE   4€");
        poke.add("KETO POKE   9€");
        poke.add("VEGAN POWE   7€");
        ArrayList<String> mcdonald= new ArrayList<>();
        mcdonald.add("Big Mac menu  9€");
        mcdonald.add("Mc Chicken menu   7,50€");
        mcdonald.add("Gran Crispy Mc bacon menu   9,80€");
        mcdonald.add("My selection Chicken Avocado & Bacon menu   10€");
        mcdonald.add("My selection BBQ   5€");
        mcdonald.add("Double Chicken BBQ   4€");
        ArrayList<String> sushi= new ArrayList<>();
        sushi.add("Ravioli di gamberi e carne   4€");
        sushi.add("Involtini primavera   2€");
        sushi.add("Sashimi Salmone   8€");
        sushi.add("Tiger Roll   5€");
        sushi.add("Hosso fritto Philadelphia   9€");
        sushi.add("Temaki Ebi Ten   5€");
        ArrayList<String> pizza= new ArrayList<>();
        pizza.add("Marinara   4€");
        pizza.add("Margherita    5€");
        pizza.add("Peperoni e salame piccante   6€");
        pizza.add("Salsiccia e patatine   7€");
        pizza.add("Calzone fritto   9€");
        pizza.add("Quattro formaggi   8€");
        ArrayList<String> mare= new ArrayList<>();
        mare.add("Risotto ai frutti di mare   15€");
        mare.add("Tagliatella al salmone   12€");
        mare.add("Linguine all’astice    20€");
        mare.add("Grigliata mista   25€");
        mare.add("Pesce spada alla griglia   20€");
        mare.add("Frittura di calamari e gamberi   20€");
        ArrayList<String> calavera= new ArrayList<>();
        calavera.add("Burritos   10€");
        calavera.add("Tacos   8€");
        calavera.add("Empanadas   2€");
        calavera.add("Chorrizo   2€");
        calavera.add("Sandwich   8€");
        calavera.add("Fajitas   12€");
        ArrayList<String> king= new ArrayList<>();
        king.add("Chicken Royale   8€");
        king.add("Crispy Chicken   9€");
        king.add("Big King   10€");
        king.add("Whoopper   7€");
        king.add("Steakhouse   8,50€");
        king.add("Doble Cheese bacon XXL   10,50€");
        ArrayList<String> golocius= new ArrayList<>();
        golocius.add("Golocheese   9€");
        golocius.add("Crispy Golocius   12€");
        golocius.add("Nerano Burger   10€");
        golocius.add("The lord of pistacchio   14€");
        golocius.add("Carbonara Burger   9€");
        golocius.add("Dabbol Cis   8€");

        Project[] projects={
                new Project("Mare in pasta",R.drawable.mare,"ristorante di pesce specializzato in primi piatti\npesce sempre fresco",mare),
                new Project("Bella Napoli",R.drawable.pizza,"pizzeria partenopea con forno a legna ",pizza),
                new Project("Poke House",R.drawable.poke,"Le migliori Poke Bowl le trovi solo da noi",poke),
                new Project("MC Donald's",R.drawable.mc,"Fastfood ",mcdonald),
                new Project("Burger King",R.drawable.bk,"Fastfood",king),
                new Project("Calavera Restaurant",R.drawable.cala,"Cucina messicana e sud-americana\n tutto molto spicy",calavera),
                new Project("Golocius",R.drawable.golocious,"Un nuovo concept di fast food",golocius),
                new Project("hayashi",R.drawable.sushi,"Sushi Restaurant",sushi),

        };
        Intent intent = new Intent(getActivity(),Ristorante.class);
        intent.putExtra("ristorante",projects[position]);
        startActivity(intent);
    }



}