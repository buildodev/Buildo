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

public class GraphicsListingAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<GraphicsListing> graphicsItems;

    public GraphicsListingAdapter(Activity activity, List<GraphicsListing> graphicsItems) {
        this.activity = activity;
        this.graphicsItems = graphicsItems;
    }

    @Override
    public int getCount() {
        return graphicsItems.size();
    }

    @Override
    public Object getItem(int position) {
        return graphicsItems.get(position);
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
            convertView = inflater.inflate(R.layout.row_listing_graphics, null);

        TextView txtName = (TextView) convertView.findViewById(R.id.textViewGPUListingName);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.textViewGPUListingDesc);

        GraphicsListing c = graphicsItems.get(position);
        txtName.setText(c.getName());
        txtDesc.setText(c.getDesc());

        return convertView;
    }
}
