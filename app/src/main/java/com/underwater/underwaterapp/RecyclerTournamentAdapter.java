package com.underwater.underwaterapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerTournamentAdapter extends RecyclerView.Adapter<RecyclerTournamentAdapter.ViewHolder> {
    private List<String> mData;

    public RecyclerTournamentAdapter(List<String> data) {
        mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tournament_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = mData.get(position);
        holder.nombreValorTextView.setText(item);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTextView;
        TextView nombreValorTextView;
        TextView modalidadTextView;
        TextView fechaTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.nombreTextView);
            nombreValorTextView = itemView.findViewById(R.id.nombreValorTextView);
            modalidadTextView = itemView.findViewById(R.id.modalidadTextView);
            fechaTextView = itemView.findViewById(R.id.fechaTextView);
        }
    }
}

