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
import java.util.List;

public class ProcessorListingFragment extends Fragment {

    private List<ProcessorListing> processorList = new ArrayList<>();

    public ProcessorListingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_processor_listing, container, false);

        processorList = new ArrayList<>();

        ListView listView = (ListView) view.findViewById(R.id.listViewListingProcessor);
        ProcessorListingAdapter adapter = new ProcessorListingAdapter(getActivity(), getData());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProcessorFragment fragment = new ProcessorFragment();
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutProcessor, fragment, "processorFragment")
                        .addToBackStack("processor").commit();
            }
        });

        return view;
    }

    public List<ProcessorListing> getData() {

        String names[] = {"3700k", "4300", "5670", "6960k", "3450"};
        String desc[] = {"3.4 GHz", "2 GHz", "3 GHz", "3.4 GHz", "2.4 GHz"};

        for (int i = 0; i < names.length; i++) {
            ProcessorListing processorListing = new ProcessorListing();
            processorListing.setName(names[i]);
            processorListing.setDesc(desc[i]);
            processorList.add(processorListing);
        }

        return processorList;
    }
}
