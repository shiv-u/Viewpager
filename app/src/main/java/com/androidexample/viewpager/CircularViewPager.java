package com.androidexample.viewpager;

import android.os.Bundle;
import android.os.Handler;
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


public class CircularViewPager extends AppCompatActivity {

    Handler handler = new Handler();

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_view_pager);
        
        viewPager = findViewById(R.id.viewPager);

        addFragment();
    }


    private void addFragment() {

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());

        FirstFragment f1 = new FirstFragment();
        FirstFragment f2 = new FirstFragment();
        SecondFragment second = new SecondFragment();
        ThirdFragment third = new ThirdFragment();
        FourthFragment fourth = new FourthFragment();
        FifthFragment fifth = new FifthFragment();
        SixthFragment sixth = new SixthFragment();
        SeventhFragment seventh = new SeventhFragment();
        EighthFragment eight = new EighthFragment();



        adapter.addFragments(f1);
        adapter.addFragments(second);
        adapter.addFragments(third);
        adapter.addFragments(fourth);
        adapter.addFragments(fifth);
        adapter.addFragments(sixth);
        adapter.addFragments(seventh);
        adapter.addFragments(eight);

        adapter.addFragments(f2);

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);

        viewPager.addOnPageChangeListener(new MyPageListener());


    }


    private class MyPageListener implements ViewPager.OnPageChangeListener {


        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            if (position == 0) {

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        viewPager.setCurrentItem(8, false);
                    }
                }, 500);

            } else if (position == 9) {

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        viewPager.setCurrentItem(1, false);
                    }
                }, 500);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

}