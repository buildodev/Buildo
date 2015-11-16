package com.buildo.application.build.gpu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildo.application.R;

public class GraphicsBrandFragment extends Fragment {

    public GraphicsBrandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_graphics_brand, container, false);

        Button btnAMD = (Button) view.findViewById(R.id.buttonGraphicsBrandAMD);
        Button btnNVIDIA = (Button) view.findViewById(R.id.buttonGraphicsBrandNVIDIA);

        btnAMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphicsSeriesFragment fragment = new GraphicsSeriesFragment();
                Bundle bundle = new Bundle();
                bundle.putString("brand","amd");
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutGraphics, fragment, "seriesFragment")
                        .addToBackStack("series").commit();
            }
        });

        btnNVIDIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphicsSeriesFragment fragment = new GraphicsSeriesFragment();
                Bundle bundle = new Bundle();
                bundle.putString("brand","nvidia");
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.relativeLayoutGraphics, fragment, "seriesFragment")
                        .addToBackStack("series").commit();
            }
        });

        return view;
    }


}
