package com.test.vinove.myapplication_vinove.Activities;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.vinove.myapplication_vinove.Adapters.Badges_Adapter;
import com.test.vinove.myapplication_vinove.R;

public class BadgesActivity extends AppCompatActivity {

    String[] listArr = {"Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap"};

    int[] imageArr = {R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);
        RecyclerView recyclerView = findViewById(R.id.recyclerView_id);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(BadgesActivity.this, 2);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(gridLayoutManager);

        Badges_Adapter myAdapter = new Badges_Adapter(BadgesActivity.this, listArr, imageArr);
        recyclerView.setAdapter(myAdapter);

    }
}
