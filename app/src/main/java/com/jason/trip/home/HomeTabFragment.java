package com.jason.trip.home;

import android.os.Bundle;

import com.jason.trip.base.framwork.BaseTabFragment;

/**
 * Version V1.0 <Trip客户端>
 * ClassName:HomeTabFragment
 * Description:
 * Created by Jason on 16/9/13.
 */
public class HomeTabFragment extends BaseTabFragment {
    public static final String TAG = "HomeTabFragment";

    public static HomeTabFragment newInstance() {

        Bundle args = new Bundle();

        HomeTabFragment fragment = new HomeTabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public HomeTabFragment() {
    }
}
