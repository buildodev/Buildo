package com.buildo.application.processor;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buildo.application.R;
import com.buildo.application.SimpleDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ProcessorFamilyFragment extends android.support.v4.app.Fragment {


    public ProcessorFamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_processor_family, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewProcessorFamily);
        ProcessorFamilyAdapter adapter = new ProcessorFamilyAdapter(getActivity(), getData());
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity()));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    public List<ProcessorFamily> getData() {

        List<ProcessorFamily> data = new ArrayList<>();

        String[] names = {"i7", "i5", "i3"};

        for (String name : names) {
            ProcessorFamily current = new ProcessorFamily();
            current.name = name;
            data.add(current);
        }

        return data;
    }
}
