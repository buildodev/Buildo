package com.buildo.application.processor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.buildo.application.R;

import java.util.Collections;
import java.util.List;

public class ProcessorFamilyAdapter extends RecyclerView.Adapter<ProcessorFamilyAdapter.MyViewHolder> {

    private LayoutInflater layoutInflater;
    private List<ProcessorFamily> data = Collections.emptyList();

    public ProcessorFamilyAdapter(Context context, List<ProcessorFamily> data) {
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(layoutInflater.inflate(R.layout.row_processor_family, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ProcessorFamily current = data.get(position);

        holder.name.setText(current.name);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.textViewProcessorFamilyName);

        }
    }
}
