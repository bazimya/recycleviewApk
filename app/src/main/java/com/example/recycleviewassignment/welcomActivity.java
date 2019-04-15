package com.example.recycleviewassignment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class welcomActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  fragmentpageadpter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        tabLayout= (TabLayout)findViewById(R.id.tablayout_id);
        viewPager =(ViewPager)findViewById(R.id.view_pager_id);
        adapter = new fragmentpageadpter(getSupportFragmentManager());

//        add fragment hera

        adapter.Addfragment(new fragamentmovie(),"MOVIES");
        adapter.Addfragment(new fragmentVideo(),"CINEMAS");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

//        set icons to tablayout
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);

    }
}
