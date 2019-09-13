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
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private QuotesAdapter quotesAdapter;
    private RecyclerView quoteRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        changeStatusBarColor();

        List<Quote> quotesList = new ArrayList<>();

        // Quote Mock

        Quote quote1 = new Quote();
        quote1.setNome("PETR4");
        quote1.setOscilacao("-1");
        quote1.setValor("27");
        quote1.setCod("1");
        quotesList.add(quote1);

        Quote quote2 = new Quote();
        quote2.setNome("VALE3");
        quote2.setOscilacao("-2");
        quote2.setValor("50");
        quote2.setCod("2");
        quotesList.add(quote2);

        Quote quote3 = new Quote();
        quote3.setNome("BBAS3");
        quote3.setOscilacao("-3");
        quote3.setValor("49");
        quote3.setCod("3");
        quotesList.add(quote3);

        Quote quote4 = new Quote();
        quote4.setNome("ITUB4");
        quote4.setOscilacao("3");
        quote4.setValor("36");
        quote4.setCod("4");
        quotesList.add(quote4);

        Quote quote5 = new Quote();
        quote5.setNome("CIEL3");
        quote5.setOscilacao("-1");
        quote5.setValor("7");
        quote5.setCod("5");
        quotesList.add(quote5);

        Quote quote6 = new Quote();
        quote6.setNome("ABV3");
        quote6.setOscilacao("-2");
        quote6.setValor("19");
        quote6.setCod("6");
        quotesList.add(quote1);

        Quote quote7 = new Quote();
        quote7.setNome("SANB11");
        quote7.setOscilacao("-4");
        quote7.setValor("45");
        quote7.setCod("7");
        quotesList.add(quote7);

        Quote quote8 = new Quote();
        quote8.setNome("LREN3");
        quote8.setOscilacao("-2");
        quote8.setValor("53");
        quote8.setCod("8");
        quotesList.add(quote8);

        Quote quote9 = new Quote();
        quote9.setNome("PCAR4");
        quote9.setOscilacao("-3");
        quote9.setValor("87");
        quote9.setCod("9");
        quotesList.add(quote9);

        Quote quote10 = new Quote();
        quote10.setNome("RENT3");
        quote10.setOscilacao("-6");
        quote10.setValor("43");
        quote10.setCod("10");
        quotesList.add(quote10);

        // Setup RecyclerView


        QuotesAdapter quotesAdapter = new QuotesAdapter(quotesList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        quoteRecyclerView = findViewById(R.id.recycler_quote_view_id);
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
