package com.buildo.application.build.cpu;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.buildo.application.R;

public class ProcessorDescriptionFragment extends Fragment {


    public ProcessorDescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_processor_description, container, false);

        TextView textView = (TextView) view.findViewById(R.id.textViewProcessorDescription);

        return view;
    }


}
