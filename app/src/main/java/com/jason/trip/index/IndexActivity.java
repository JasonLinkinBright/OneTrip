package com.jason.trip.index;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jason.trip.R;
import com.jason.trip.custom.view.AddFloatingActionButton;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Version V1.0 <Trip客户端>
 * ClassName:IndexActivity
 * Description:主页入口
 * Created by Jason on 16/9/4.
 */
public class IndexActivity extends AppCompatActivity implements View.OnClickListener {

    @InjectView(R.id.iv_bottom_bar_home)
    ImageView ivBottomBarHome;
    @InjectView(R.id.tv_bottom_bar_home)
    TextView tvBottomBarHome;
    @InjectView(R.id.ll_bottom_bar_home)
    LinearLayout llBottomBarHome;
    @InjectView(R.id.iv_bottom_bar_explore)
    ImageView ivBottomBarExplore;
    @InjectView(R.id.tv_bottom_bar_explore)
    TextView tvBottomBarExplore;
    @InjectView(R.id.ll_bottom_bar_explore)
    LinearLayout llBottomBarExplore;
    @InjectView(R.id.iv_bottom_bar_snr)
    ImageView ivBottomBarSnr;
    @InjectView(R.id.tv_bottom_bar_snr)
    TextView tvBottomBarSnr;
    @InjectView(R.id.ll_bottom_bar_snr)
    LinearLayout llBottomBarSnr;
    @InjectView(R.id.iv_bottom_bar_me)
    ImageView ivBottomBarMe;
    @InjectView(R.id.tv_bottom_bar_me)
    TextView tvBottomBarMe;
    @InjectView(R.id.ll_bottom_bar_me)
    LinearLayout llBottomBarMe;
    @InjectView(R.id.bottom_bar_center_btn)
    AddFloatingActionButton bottomBarCenterBtn;
    @InjectView(R.id.btn_ck)
    FrameLayout btnCk;
    @InjectView(R.id.content)
    FrameLayout content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        ButterKnife.inject(this);
    }

    @Override
    public void onClick(View view) {

    }
}
