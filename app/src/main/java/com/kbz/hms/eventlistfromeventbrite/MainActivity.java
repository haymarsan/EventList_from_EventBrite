package com.kbz.hms.eventlistfromeventbrite;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.kbz.hms.eventlistfromeventbrite.adapters.EventListAdapter;
import com.kbz.hms.eventlistfromeventbrite.delegates.EventItemDelegate;

public class MainActivity extends AppCompatActivity implements EventItemDelegate {

    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvList = findViewById(R.id.rv_lists);
        rvList.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        EventListAdapter eventListAdapter = new EventListAdapter(this);
        rvList.setAdapter(eventListAdapter);


    }

    @Override
    public void onTapEventItem() {
        Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_SHORT ).show();

    }
}
