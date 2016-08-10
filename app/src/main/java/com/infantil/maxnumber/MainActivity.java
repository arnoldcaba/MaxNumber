package com.infantil.maxnumber;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.Toast;
import android.widget.ListView;
import java.lang.reflect.Array;
import java.util.Random;

import static android.widget.AdapterView.*;


public class MainActivity extends Activity {


    int i;
    int j;
    Random rand= new Random();
    public String[] array = new String[100];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(i=0;i<100;i++)
        {
            array[i]= String.valueOf((char)rand.nextInt((100-1)+1)+1);

        }

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);



        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);


        gridView.setOnClickListener(new AdapterView.OnItemClickListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
