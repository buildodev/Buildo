package com.buildo.application.build.gpu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.buildo.application.R;

import java.util.ArrayList;
import java.util.List;

public class GraphicsListingFragment extends Fragment {

    private List<GraphicsListing> graphicsList = new ArrayList<>();

    public GraphicsListingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graphics_listing, container, false);

        graphicsList = new ArrayList<>();

        ListView listView = (ListView) view.findViewById(R.id.listViewListingGraphics);
        GraphicsListingAdapter adapter = new GraphicsListingAdapter(getActivity(), getData());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GraphicsFragment fragment = new GraphicsFragment();
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutGraphics, fragment, "graphicsFragment")
                        .addToBackStack("graphics").commit();
            }
        });

        return view;
    }


    public List<GraphicsListing> getData() {

        String names[] = {"GTX 560Ti", "GTX TITAN X", "GTX 670", "GTX 980", "GTX 460"};
        String desc[] = {"3.4 GHz", "2 GHz", "3 GHz", "3.4 GHz", "2.4 GHz"};

        for (int i = 0; i < names.length; i++) {
            GraphicsListing graphicsListing = new GraphicsListing();
            graphicsListing.setName(names[i]);
            graphicsListing.setDesc(desc[i]);
            graphicsList.add(graphicsListing);
        }

        return graphicsList;
    }
}
