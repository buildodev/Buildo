package com.buildo.application.processor;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildo.application.R;

public class ManufacturerFragment extends android.support.v4.app.Fragment {

    private FragmentTransaction transaction;
    private FragmentManager manager;

    public ManufacturerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_manufacturer, container, false);

        manager = getFragmentManager();

        view.findViewById(R.id.buttonProcessorAmd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProcessorFamilyFragment fragment = new ProcessorFamilyFragment();
                transaction = manager.beginTransaction();
                transaction.replace(R.id.relativeLayoutProcessor, fragment, "ProcessorFamilyFragment");
                transaction.addToBackStack("processorFamily");
                transaction.commit();
            }
        });

        view.findViewById(R.id.buttonProcessorIntel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProcessorFamilyFragment fragment = new ProcessorFamilyFragment();
                transaction = manager.beginTransaction();
                transaction.replace(R.id.relativeLayoutProcessor, fragment, "ProcessorFamilyFragment");
                transaction.addToBackStack("processorFamily");
                transaction.commit();
            }
        });

        return view;
    }


}
