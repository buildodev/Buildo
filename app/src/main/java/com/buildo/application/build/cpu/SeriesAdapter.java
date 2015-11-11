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

public class SeriesAdapter extends BaseAdapter{

    private Activity activity;
    private LayoutInflater inflater;
    private List<Series> seriesItems;

    public SeriesAdapter(Activity activity, List<Series> seriesItems) {
        this.activity = activity;
        this.seriesItems = seriesItems;
    }

    @Override
    public int getCount() {
        return seriesItems.size();
    }

    @Override
    public Object getItem(int position) {
        return seriesItems.get(position);
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
            convertView = inflater.inflate(R.layout.row_series_cpu, null);

        TextView name = (TextView) convertView.findViewById(R.id.textViewListSeriesName);
        TextView desc = (TextView) convertView.findViewById(R.id.textViewListSeriesDesc);

        Series s = seriesItems.get(position);

        name.setText(s.getName());
        desc.setText(s.getDesc());

        return convertView;
    }
}
