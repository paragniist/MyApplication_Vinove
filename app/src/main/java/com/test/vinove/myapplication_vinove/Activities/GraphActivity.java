package com.test.vinove.myapplication_vinove.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.vinove.myapplication_vinove.Adapters.GraphAdapter;
import com.test.vinove.myapplication_vinove.Adapters.Graph_ViewPagerAdapter;
import com.test.vinove.myapplication_vinove.Fragments.Graph_MonthFragment;
import com.test.vinove.myapplication_vinove.Fragments.Graph_QuarterFragment;
import com.test.vinove.myapplication_vinove.Fragments.Graph_WeekFragment;
import com.test.vinove.myapplication_vinove.R;

public class GraphActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    Context mContext;
    String[] list = {"$2,230", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap"};
    private RecyclerView rview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        mContext = GraphActivity.this;

        viewPager = findViewById(R.id.viewPager_id);
        tabLayout = findViewById(R.id.tabLayout_id);
        rview = findViewById(R.id.recyclerView_id);


        tabLayout.setupWithViewPager(viewPager);
        Graph_ViewPagerAdapter adapter = new Graph_ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Graph_WeekFragment(), "Week");
        adapter.addFragment(new Graph_MonthFragment(), "Month ");
        adapter.addFragment(new Graph_QuarterFragment(), "Quarter");

        viewPager.setAdapter(adapter);


        LinearLayoutManager lManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        rview.setLayoutManager(lManager);

        rview.setAdapter(new GraphAdapter(mContext, list));


    }

}