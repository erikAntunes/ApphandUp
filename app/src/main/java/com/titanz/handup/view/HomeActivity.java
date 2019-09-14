package com.titanz.handup.view;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

    private RecyclerView quoteRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        changeStatusBarColor();

        List<Quote> quotesList = new ArrayList<>();

        // Quote Mock

        Quote quote1 = new Quote();
        quote1.setNome("PETROBRAS");
        quote1.setCod("PETR4");
        quote1.setOscilacao("-0,26");
        quote1.setValor("26,99");
        quotesList.add(quote1);

        Quote quote2 = new Quote();
        quote2.setNome("VALE");
        quote2.setCod("VALE3");
        quote2.setOscilacao("-0,89");
        quote2.setValor("50,12");
        quotesList.add(quote2);

        Quote quote3 = new Quote();
        quote3.setNome("BANCO DO BRASIL");
        quote3.setCod("BBAS3");
        quote3.setOscilacao("0,27");
        quote3.setValor("48,13");
        quotesList.add(quote3);

        Quote quote4 = new Quote();
        quote4.setNome("ITAU UNIBANCO");
        quote4.setCod("ITUB4");
        quote4.setOscilacao("2,37");
        quote4.setValor("36,24");
        quotesList.add(quote4);

        Quote quote5 = new Quote();
        quote5.setNome("CIELO");
        quote5.setCod("CIEL3");
        quote5.setOscilacao("-0,65");
        quote5.setValor("7,75");
        quotesList.add(quote5);

        Quote quote6 = new Quote();
        quote6.setNome("AMBEV S/A");
        quote6.setCod("ABEV3");
        quote6.setOscilacao("-0,21");
        quote6.setValor("19,33");
        quotesList.add(quote6);

        Quote quote7 = new Quote();
        quote7.setNome("SANTANDER");
        quote7.setCod("SAMB11");
        quote7.setOscilacao("0,79");
        quote7.setValor("44,99");
        quotesList.add(quote7);

        Quote quote8 = new Quote();
        quote8.setNome("LOJAS RENNER");
        quote8.setCod("LREN3");
        quote8.setOscilacao("-2,37");
        quote8.setValor("49,12");
        quotesList.add(quote8);

        Quote quote9 = new Quote();
        quote9.setNome("PÃO DE AÇUCAR");
        quote9.setCod("PCAR4");
        quote9.setOscilacao("-1,86");
        quote9.setValor("86,18");
        quotesList.add(quote9);

        Quote quote10 = new Quote();
        quote10.setNome("LOCALIZA");
        quote10.setCod("RENT3");
        quote10.setOscilacao("3,57");
        quote10.setValor("43,83");
        quotesList.add(quote10);

        quotesList.add(quote2);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote1);
        quotesList.add(quote9);
        quotesList.add(quote4);
        quotesList.add(quote3);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote10);
        quotesList.add(quote2);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote1);
        quotesList.add(quote9);
        quotesList.add(quote4);
        quotesList.add(quote3);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote10);
        quotesList.add(quote2);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote1);
        quotesList.add(quote9);
        quotesList.add(quote4);
        quotesList.add(quote3);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote10);
        quotesList.add(quote2);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote1);
        quotesList.add(quote9);
        quotesList.add(quote4);
        quotesList.add(quote3);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote10);
        quotesList.add(quote2);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote1);
        quotesList.add(quote9);
        quotesList.add(quote4);
        quotesList.add(quote3);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote10);
        quotesList.add(quote2);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote1);
        quotesList.add(quote9);
        quotesList.add(quote4);
        quotesList.add(quote3);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote2);
        quotesList.add(quote3);
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

           //     exibirDialogRegister();
            }
        });
    }

 //  private void exibirDialogRegister() {

 //      final Dialog dialog = new Dialog(getApplicationContext());
 //      dialog.setContentView(R.layout.novo_quote_dialog);
 //      dialog.show();

 //      Button registrarDialog = dialog.findViewById(R.id.registrar_button_id);

 //      registrarDialog.setOnClickListener(new View.OnClickListener() {
 //          @Override
 //          public void onClick(View view) {

 //              TextInputEditText nomeEditText = dialog.findViewById(R.id.registrar_nome_Edit_Text_id);

 //              TextInputEditText oscilacaoEditText = dialog.findViewById(R.id.registrar_oscilacao_Edit_Text_id);

 //              TextInputEditText valorEditText = dialog.findViewById(R.id.registrar_valor_Edit_Text_id);

 //          }
 //      });


 //  }


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
