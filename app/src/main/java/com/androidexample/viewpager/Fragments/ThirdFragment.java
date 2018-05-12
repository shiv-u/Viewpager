package com.androidexample.viewpager.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.androidexample.viewpager.R;
import com.squareup.picasso.Picasso;

import static com.androidexample.viewpager.R.drawable.dd;

public class ThirdFragment extends Fragment {

    private ViewPager  viewPagerBackground;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPagerBackground=view.findViewById(R.id.viewPager);

        final ImageView three = (ImageView) view.findViewById(R.id.fragmentThreeBackground);

        Picasso.get().load(R.drawable.ddt).fit().centerCrop().into(three);
        view.setBackgroundResource(R.drawable.bluebb);
//        three.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//
////                Intent intent = new Intent(three.getContext(),explain.class);
////                three.getContext().startActivity(intent);
//                Intent intent =new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://google.com/search?q=yakshagana"));
//                startActivity(intent);
//
//            }
//
//
//        });
    }
}