package com.test.vinove.myapplication_vinove.Activities;


import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.test.vinove.myapplication_vinove.Adapters.BroadcastAdapter;
import com.test.vinove.myapplication_vinove.R;


public class MainActivity extends AppCompatActivity {
    // MyModel myModel;
    //ArrayList<MyModel> list;
    String[] listArr = {"Broadcast from Arjun", "Message from Tito", "Broadcast from Arjun", "Message from Tito", "Message from Tito"};
    String[] listArr1 = {"1 day ago", "2 mins ago", "1 day ago", "2 mins ago", "2 mins ago"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_id);
        AppCompatButton raisedBtn = findViewById(R.id.raisedBtn);

        LinearLayoutManager lManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(lManager);

        BroadcastAdapter myAdapter = new BroadcastAdapter(MainActivity.this, listArr, listArr1);
        recyclerView.setAdapter(myAdapter);

        raisedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setComponent(new ComponentName(getApplicationContext(),CalenderActivity.class));
                startActivity(i);
            }
        });

    }
}
