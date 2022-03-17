package com.prodigio.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.prodigio.recyclerview.R;
import com.prodigio.recyclerview.adapter.Adapter;
import com.prodigio.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme>listaFilmes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        //Listagem de filmes


        //Configurar com.prodigio.recyclerview.adapter
        Adapter adapter = new Adapter(listaFilmes);


        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){

        Filme filme = new Filme ("Homem Aranha - De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Mulher Maravilha","Aventura","2019");
        this.listaFilmes.add(filme);

        filme = new Filme ("Crepusculo","Drama","2014");
        this.listaFilmes.add(filme);

        filme = new Filme ("Harry Potter","Aventura","2008");
        this.listaFilmes.add(filme);

        filme = new Filme ("Doutor Estranho = No multiverso da Loucura","Aventura","2022");
        this.listaFilmes.add(filme);

        filme = new Filme ("Thor Ragnarok","Aventura","2016");
        this.listaFilmes.add(filme);

        filme = new Filme ("Guerra Civil","Aventura","2016");
        this.listaFilmes.add(filme);

        filme = new Filme ("Interestelar","Ficção","2016");
        this.listaFilmes.add(filme);

        filme = new Filme ("IT - A coisa","Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Prometheus","Ficção","2016");
        this.listaFilmes.add(filme);

        filme = new Filme ("X-men - Dias de um futuro esquecido","Ficção","2018");
        this.listaFilmes.add(filme);

        filme = new Filme ("Viuva Negra","Aventura","2021");
        this.listaFilmes.add(filme);

    }

}