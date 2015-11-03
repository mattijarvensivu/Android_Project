package com.example.maza.studentwallet;

import java.util.Locale;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;


public class MainActivity extends FragmentActivity {
    // Fragment TabHost as mTabHost
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (FragmentTabHost)findViewById(R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(getString(R.string.navbar_etusivu) ,null),
                MainFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(getString(R.string.navbar_purchase),null),
                PurchaseFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator(getString(R.string._navbar_history),null),
                HistoryFragment.class, null);
    }
}
