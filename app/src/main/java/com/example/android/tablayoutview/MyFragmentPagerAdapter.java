package com.example.android.tablayoutview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Francislainy on 08/02/2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{

    private String[] mTabTitles;

    public MyFragmentPagerAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles = mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Log.i("this", "0---------------------------------------");
                return new FragmentA();
            case 1:
                return new FragmentB();
            default:
                Log.i("this", "null-8888888888888888888888888888--");
                return null;
        }

    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}
