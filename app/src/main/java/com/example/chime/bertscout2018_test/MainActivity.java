package com.example.chime.bertscout2018_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static String[] teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teams = new String[80];
        for (int i = 0; i < 80; i++){
          teams[i] =  String.format("%d", i+1000);
        }

        List<String> teamList = new ArrayList<String>(Arrays.asList(teams));
        ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, teamList);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(gridViewArrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add_team) {
            this.setTitle("Add Team!");
            return true;
        }
        if (id == R.id.action_sync_data) {
            this.setTitle("Sync Data!");
            return true;
        }
        if (id == R.id.action_clear_data) {
            this.setTitle("Clear Data!");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
