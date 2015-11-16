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

public class GraphicsSeriesFragment extends Fragment {

    private ArrayList<GraphicsSeries> graphicsSeriesList = new ArrayList<>();


    public GraphicsSeriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graphics_series, container, false);

        graphicsSeriesList = new ArrayList<>();

        if ("nvidia".equals(getArguments().getString("brand")))
            getDataNVIDIA();
        else
            getDataAMD();

        ListView listView = (ListView) view.findViewById(R.id.listViewSeriesGraphics);
        GraphicsSeriesAdapter adapter = new GraphicsSeriesAdapter(getActivity(), graphicsSeriesList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GraphicsListingFragment fragment = new GraphicsListingFragment();
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutGraphics, fragment, "graphicsListingFragment")
                        .addToBackStack("graphicsListing").commit();
            }
        });

        return view;
    }

    private void getDataNVIDIA() {

        String names[] = {"GTX 900", "GTX700", "GTX 600", "GTX 500", "GTX 400"};
        String desc[] = {"awesome", "good", "OK", "meh!", "seriously?"};

        for (int i = 0; i < names.length; i++) {
            GraphicsSeries processorSeries = new GraphicsSeries();
            processorSeries.setName(names[i]);
            processorSeries.setDesc(desc[i]);
            graphicsSeriesList.add(processorSeries);
        }

    }

    private void getDataAMD() {

        String names[] = {"fx", "semprom", "opteron", "athlon", "phenom"};
        String desc[] = {"awesome", "good", "OK", "meh!", "seriously?"};

        for (int i = 0; i < names.length; i++) {
            GraphicsSeries processorSeries = new GraphicsSeries();
            processorSeries.setName(names[i]);
            processorSeries.setDesc(desc[i]);
            graphicsSeriesList.add(processorSeries);
        }

    }

}
