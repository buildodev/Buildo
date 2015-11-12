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

public class CPUListingAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<CPU> cpuItems;

    public CPUListingAdapter(Activity activity, List<CPU> cpuItems) {
        this.activity = activity;
        this.cpuItems = cpuItems;
    }

    @Override
    public int getCount() {
        return cpuItems.size();
    }

    @Override
    public Object getItem(int position) {
        return cpuItems.get(position);
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
            convertView = inflater.inflate(R.layout.row_listing_cpu, null);

        TextView txtName = (TextView) convertView.findViewById(R.id.textViewCPUListingName);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.textViewCPUListingDesc);

        CPU c = cpuItems.get(position);
        txtName.setText(c.getName());
        txtDesc.setText(c.getDesc());

        return convertView;
    }
}
