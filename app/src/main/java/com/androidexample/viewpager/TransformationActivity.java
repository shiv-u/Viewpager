package com.androidexample.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.androidexample.viewpager.Fragments.EighthFragment;
import com.androidexample.viewpager.Fragments.FifthFragment;
import com.androidexample.viewpager.Fragments.FirstFragment;
import com.androidexample.viewpager.Fragments.FourthFragment;
import com.androidexample.viewpager.Fragments.SecondFragment;
import com.androidexample.viewpager.Fragments.SeventhFragment;
import com.androidexample.viewpager.Fragments.SixthFragment;
import com.androidexample.viewpager.Fragments.ThirdFragment;
import com.androidexample.viewpager.Transformations.ZoomOutTransformation;


public class TransformationActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter pagerAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformation);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        addingFragmentsTOpagerAdapter();
        viewPager.setAdapter(pagerAdapter);

        ZoomOutTransformation zoomOutTransformation = new ZoomOutTransformation();



        intent = getIntent();
        String transformation = intent.getStringExtra(Constant.TRANSFORMATION);


        switch (transformation) {

            case Constant.ZOOM_OUT_TRANSFORMATION:
                viewPager.setPageTransformer(true, zoomOutTransformation);
                break;
        }
    }


    private void addingFragmentsTOpagerAdapter() {
        pagerAdapter.addFragments(new FirstFragment());
        pagerAdapter.addFragments(new SecondFragment());
        pagerAdapter.addFragments(new ThirdFragment());
        pagerAdapter.addFragments(new FourthFragment());
        pagerAdapter.addFragments(new FifthFragment());
        pagerAdapter.addFragments(new SixthFragment());
        pagerAdapter.addFragments(new SeventhFragment());
        pagerAdapter.addFragments(new EighthFragment());

    }

}