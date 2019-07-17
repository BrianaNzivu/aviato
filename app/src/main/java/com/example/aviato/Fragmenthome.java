package com.example.aviato;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmenthome extends Fragment {


    public Fragmenthome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmenthome, container, false);
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((Home) getActivity())
                .setActionBarTitle("Slideshow");

    }
}