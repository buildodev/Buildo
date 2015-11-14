package com.buildo.application.build.gpu;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildo.application.R;

public class GraphicsFragment extends Fragment {


    public GraphicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graphics, container, false);

        Button button = (Button) view.findViewById(R.id.buttonGraphicsDescription);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphicsDescriptionFragment fragment = new GraphicsDescriptionFragment();
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutGraphics, fragment, "graphicsDescriptionFragment")
                        .addToBackStack("graphicsDescription").commit();
            }
        });


        return view;
    }


}
