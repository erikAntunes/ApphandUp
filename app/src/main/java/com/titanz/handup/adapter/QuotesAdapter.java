package com.titanz.handup.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.titanz.handup.R;
import com.titanz.handup.model.Quote;

import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.ViewHolder> {

    private ArrayList<Quote> quoteList = new ArrayList<>();

    public QuotesAdapter(ArrayList<Quote> quotes){ this.quoteList = quotes;}


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quote_celula,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.nome.setText(quoteList.get(position).getNome());

        viewHolder.oscilacao.setText(quoteList.get(position).getOscilacao());

        viewHolder.valor.setText(quoteList.get(position).getValor());

    }

    @Override
    public int getItemCount() {

        return quoteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        TextView oscilacao;
        TextView valor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.quote_nome_celula_id);
            oscilacao = itemView.findViewById(R.id.quote_oscilacao_celula_id);
            valor = itemView.findViewById(R.id.quote_valor_celula_id);


        }
    }
}
