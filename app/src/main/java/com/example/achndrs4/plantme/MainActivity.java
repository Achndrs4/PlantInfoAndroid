package com.example.achndrs4.plantme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHandler db = new DBHandler(this);
        db.addPlant(new Plant("Abies amabilis","Pacific Silver Fur","AK,OR,WA","Perennial","Slow","Moderate",3,6,34,80,"Tolerant","yes"));
        Plant examplePlant = db.getPlant("Abies amabilis");


        //get the spinner from the xml.
         spinner = (Spinner)findViewById(R.id.spinner2);
        String[] items = new String[]{"Common Name", "States Found", "Duration", "Growth", "Min Soil", "Max Soil", "Min Inches", "Max Inches", "Shade"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        TextView t = (TextView)findViewById(R.id.textView);

        switch (position) {
            case 0:

            case 1:

                break;
            case 2:

                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
