package com.test.vinove.myapplication_vinove.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.test.vinove.myapplication_vinove.Adapters.Profile_ViewPagerAdapter;
import com.test.vinove.myapplication_vinove.Fragments.AccountsFragment;
import com.test.vinove.myapplication_vinove.Fragments.MyStatsFragment;
import com.test.vinove.myapplication_vinove.R;

public class ProfileActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        viewPager = findViewById(R.id.viewPager_id);

        Profile_ViewPagerAdapter adapter = new Profile_ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new AccountsFragment(), "Account");
        adapter.addFragment(new MyStatsFragment(), "My Stats ");

        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);
    }
}
