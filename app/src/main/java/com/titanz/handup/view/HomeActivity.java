package com.titanz.handup.view;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.titanz.handup.R;
import com.titanz.handup.adapter.QuotesAdapter;
import com.titanz.handup.model.Quote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private QuotesAdapter quotesAdapter;
    private RecyclerView quoteRecyclerView;
    private ArrayList<Quote> quotesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        changeStatusBarColor();


        // Quote Mock

        Quote quote1 = new Quote();
        quote1.setNome("PETR4");
        quote1.setOscilacao(-1);
        quote1.setValor(27);
        quote1.setCod(0001);
        quotesList.add(quote1);

        Quote quote2 = new Quote();
        quote1.setNome("VALE3");
        quote1.setOscilacao(-2);
        quote1.setValor(50);
        quote1.setCod(0002);
        quotesList.add(quote2);

        Quote quote3 = new Quote();
        quote1.setNome("BBAS3");
        quote1.setOscilacao(-3);
        quote1.setValor(49);
        quote1.setCod(0003);
        quotesList.add(quote3);

        Quote quote4 = new Quote();
        quote1.setNome("ITUB4");
        quote1.setOscilacao(3);
        quote1.setValor(36);
        quote1.setCod(0004);
        quotesList.add(quote4);

        Quote quote5 = new Quote();
        quote1.setNome("CIEL3");
        quote1.setOscilacao(-1);
        quote1.setValor(7);
        quote1.setCod(0005);
        quotesList.add(quote5);

        Quote quote6 = new Quote();
        quote1.setNome("ABV3");
        quote1.setOscilacao(-2);
        quote1.setValor(19);
        quote1.setCod(0006);
        quotesList.add(quote1);

        Quote quote7 = new Quote();
        quote1.setNome("SANB11");
        quote1.setOscilacao(-4);
        quote1.setValor(45);
        quote1.setCod(0007);
        quotesList.add(quote1);

        Quote quote1 = new Quote();
        quote1.setNome("PETR4");
        quote1.setOscilacao(-1);
        quote1.setValor(27);
        quote1.setCod(0001);
        quotesList.add(quote1);

        Quote quote1 = new Quote();
        quote1.setNome("PETR4");
        quote1.setOscilacao(-1);
        quote1.setValor(27);
        quote1.setCod(0001);
        quotesList.add(quote1);

        Quote quote1 = new Quote();
        quote1.setNome("PETR4");
        quote1.setOscilacao(-1);
        quote1.setValor(27);
        quote1.setCod(0001);
        quotesList.add(quote1);





        quoteRecyclerView = findViewById(R.id.recycler_quote_view_id);


        quotesAdapter = new QuotesAdapter(quotesList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);

        quoteRecyclerView.setAdapter(quotesAdapter);
        quoteRecyclerView.setLayoutManager(layoutManager);




        FloatingActionButton fab = findViewById(R.id.fab_adicionar_card_id);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    private void changeStatusBarColor() {

        // DarkBlueColor
        String statusBarcolor = "#0081cb";

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(statusBarcolor));


        }
    }
}
