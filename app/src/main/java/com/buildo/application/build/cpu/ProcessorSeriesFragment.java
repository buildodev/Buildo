package com.buildo.application.build.cpu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.buildo.application.R;

import java.util.ArrayList;

public class ProcessorSeriesFragment extends Fragment {

    private ArrayList<ProcessorSeries> processorSeriesList = new ArrayList<>();

    public ProcessorSeriesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_series, container, false);

        if ("intel".equals(getArguments().getString("brand")))
            getDataIntel();
        else
            getDataAMD();


        ListView listView = (ListView) view.findViewById(R.id.listViewSeriesProcessor);
        ProcessorSeriesAdapter adapter = new ProcessorSeriesAdapter(getActivity(), processorSeriesList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProcessorListingFragment fragment = new ProcessorListingFragment();
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutProcessor, fragment, "processorListingFragment")
                        .addToBackStack("processorListing").commit();
            }
        });

        return view;
    }

    private void getDataIntel() {

        String names[] = {"i7", "i5", "i3", "pentium 4", "pentium 3"};
        String desc[] = {"awesome", "good", "OK", "meh!", "seriously?"};

        for (int i = 0; i < names.length; i++) {
            ProcessorSeries processorSeries = new ProcessorSeries();
            processorSeries.setName(names[i]);
            processorSeries.setDesc(desc[i]);
            processorSeriesList.add(processorSeries);
        }

    }

    private void getDataAMD() {

        String names[] = {"fx", "semprom", "opteron", "athlon", "phenom"};
        String desc[] = {"awesome", "good", "OK", "meh!", "seriously?"};

        for (int i = 0; i < names.length; i++) {
            ProcessorSeries processorSeries = new ProcessorSeries();
            processorSeries.setName(names[i]);
            processorSeries.setDesc(desc[i]);
            processorSeriesList.add(processorSeries);
        }

    }

}
