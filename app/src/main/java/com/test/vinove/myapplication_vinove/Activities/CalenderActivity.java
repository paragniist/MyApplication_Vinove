package com.test.vinove.myapplication_vinove.Activities;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test.vinove.myapplication_vinove.Adapters.CalenderRecommendedShift;
import com.test.vinove.myapplication_vinove.Adapters.CalenderAdapter;
import com.test.vinove.myapplication_vinove.R;

public class CalenderActivity extends AppCompatActivity {

    AppCompatButton setPrefBtn;

    String[] listArr = {"January 7-13", "January 14-20", "January 21-27", "January 21-27", "January 21-27"};
    String[] listArr1 = {"Tomorrow", "Wednesday", "Thursday"};
    String[] listArr2 = {"3pm - 6pm", "11am - 5pm", "1pm - 5pm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_id);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerView_id1);
        setPrefBtn = findViewById(R.id.flatBtn);




        LinearLayoutManager lManager = new LinearLayoutManager(CalenderActivity.this,
                LinearLayoutManager.HORIZONTAL, false);

        recyclerView1.setLayoutManager(lManager);

        CalenderAdapter myAdapter = new CalenderAdapter(CalenderActivity.this, listArr);
        recyclerView1.setAdapter(myAdapter);


        LinearLayoutManager lManager1 = new LinearLayoutManager(CalenderActivity.this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(lManager1);

        CalenderRecommendedShift myAdapter2 = new CalenderRecommendedShift(CalenderActivity.this, listArr1,listArr2);
        recyclerView.setAdapter(myAdapter2);


        setPrefBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setComponent(new ComponentName(CalenderActivity.this,DialogActivity.class));
                startActivity(i);
            }
        });



    }

}
