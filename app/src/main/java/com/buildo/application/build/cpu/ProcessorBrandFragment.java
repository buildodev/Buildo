package com.buildo.application.build.cpu;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildo.application.R;

public class ProcessorBrandFragment extends Fragment {


    public ProcessorBrandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_processor_brand, container, false);

        Button buttonIntel = (Button) view.findViewById(R.id.buttonProcessorBrandIntel);
        Button buttonAMD = (Button) view.findViewById(R.id.buttonProcessorBrandAmd);

        buttonIntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProcessorSeriesFragment fragment = new ProcessorSeriesFragment();
                Bundle bundle = new Bundle();
                bundle.putString("brand","intel");
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutProcessor, fragment, "seriesFragment")
                        .addToBackStack("series").commit();
            }
        });

        buttonAMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProcessorSeriesFragment fragment = new ProcessorSeriesFragment();
                Bundle bundle = new Bundle();
                bundle.putString("brand","amd");
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutProcessor, fragment, "seriesFragment")
                        .addToBackStack("series").commit();
            }
        });

        return view;
    }


}
