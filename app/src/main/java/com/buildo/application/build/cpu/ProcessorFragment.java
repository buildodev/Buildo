package com.buildo.application.build.cpu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildo.application.R;

public class ProcessorFragment extends Fragment {


    public ProcessorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_processor, container, false);

        Button button = (Button) view.findViewById(R.id.buttonProcessorDescription);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProcessorDescriptionFragment fragment = new ProcessorDescriptionFragment();
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutProcessor, fragment, "processorDescriptionFragment")
                        .addToBackStack("processorDescription").commit();
            }
        });


        return view;
    }


}
