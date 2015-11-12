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

public class CPUListingFragment extends Fragment {

    private List<CPU> cpuList = new ArrayList<>();

    public CPUListingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cpu_listing, container, false);

        ListView listView = (ListView) view.findViewById(R.id.listViewListingCPU);
        CPUListingAdapter adapter = new CPUListingAdapter(getActivity(), getData());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return view;
    }

    public List<CPU> getData() {

        String names[] = {"3700k", "4300", "5670", "6960k", "3450"};
        String desc[] = {"3.4 GHz", "2 GHz", "3 GHz", "3.4 GHz", "2.4 GHz"};

        for (int i = 0; i < names.length; i++) {
            CPU cpu = new CPU();
            cpu.setName(names[i]);
            cpu.setDesc(desc[i]);
            cpuList.add(cpu);
        }

        return cpuList;
    }
}