package com.buildo.application.build.gpu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.buildo.application.R;

public class GraphicsDescriptionFragment extends Fragment {


    public GraphicsDescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graphics_description, container, false);

        TextView textView = (TextView) view.findViewById(R.id.textViewGraphicsDescription);

        return view;
    }


}
