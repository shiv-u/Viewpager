package com.androidexample.viewpager.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.androidexample.viewpager.R;
import com.squareup.picasso.Picasso;

public class FifthFragment extends Fragment {


    public FifthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView five = (ImageView)view.findViewById(R.id.fragmentFiveBackground);

        Picasso.get().load(R.drawable.kxip).fit().centerCrop().into(five);
        view.setBackgroundResource(R.drawable.kb);

    }
}