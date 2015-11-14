package com.buildo.application.build.gpu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.buildo.application.R;

import java.util.List;

public class GraphicsSeriesAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<GraphicsSeries> graphicsSeriesItems;

    public GraphicsSeriesAdapter(Activity activity, List<GraphicsSeries> graphicsSeriesItems) {
        this.activity = activity;
        this.graphicsSeriesItems = graphicsSeriesItems;
    }

    @Override
    public int getCount() {
        return graphicsSeriesItems.size();
    }

    @Override
    public Object getItem(int position) {
        return graphicsSeriesItems.get(position);
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
            convertView = inflater.inflate(R.layout.row_series_graphics, null);

        TextView name = (TextView) convertView.findViewById(R.id.textViewListGPUSeriesName);
        TextView desc = (TextView) convertView.findViewById(R.id.textViewListGPUSeriesDesc);

        GraphicsSeries g = graphicsSeriesItems.get(position);

        name.setText(g.getName());
        desc.setText(g.getDesc());

        return convertView;
    }
}
