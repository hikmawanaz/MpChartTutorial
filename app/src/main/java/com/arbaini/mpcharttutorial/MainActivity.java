package com.arbaini.mpcharttutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart chart = (LineChart) findViewById(R.id.chart);


        ArrayList<Entry> entries = new ArrayList<>();

        for( int i = 0; i<10;i++){

            entries.add(new Entry(i, i*i));  // i value data x , i*i value data y



        }

        LineDataSet lineDataSet = new LineDataSet(entries,"Data kuadrat");

        LineData lineData = new LineData(lineDataSet);

        chart.setData(lineData);
        chart.invalidate();

    }
}
