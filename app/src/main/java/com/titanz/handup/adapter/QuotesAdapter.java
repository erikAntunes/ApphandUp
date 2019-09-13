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
import java.util.List;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.ViewHolder> {

    private List<Quote> quoteList = new ArrayList<>();

    public QuotesAdapter(List<Quote> quoteList){
        this.quoteList = quoteList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quote_celula,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

      Quote quote = quoteList.get(position);
      viewHolder.setupQuote(quote);

    }

    @Override
    public int getItemCount() {

        return quoteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeTextView;
        private TextView oscilacaoTextView;
        private TextView valorTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeTextView = itemView.findViewById(R.id.quote_nome_celula_id);
            oscilacaoTextView = itemView.findViewById(R.id.quote_oscilacao_celula_id);
            valorTextView = itemView.findViewById(R.id.quote_valor_celula_id);

        }
        public void setupQuote (Quote quote){

            nomeTextView.setText(quote.getNome());
            oscilacaoTextView.setText(quote.getOscilacao());
            valorTextView.setText(quote.getValor());
        }
    }
}
