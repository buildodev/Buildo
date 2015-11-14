package com.buildo.application.build.cpu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.buildo.application.R;

import java.util.List;

public class ProcessorListingAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<ProcessorListing> processorItems;

    public ProcessorListingAdapter(Activity activity, List<ProcessorListing> processorItems) {
        this.activity = activity;
        this.processorItems = processorItems;
    }

    @Override
    public int getCount() {
        return processorItems.size();
    }

    @Override
    public Object getItem(int position) {
        return processorItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.row_listing_processor, null);

        TextView txtName = (TextView) convertView.findViewById(R.id.textViewCPUListingName);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.textViewCPUListingDesc);

        ProcessorListing c = processorItems.get(position);
        txtName.setText(c.getName());
        txtDesc.setText(c.getDesc());

        return convertView;
    }
}
