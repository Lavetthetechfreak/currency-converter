package com.lavetadhiambo.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void convert( View view){
        EditText shillingField = (EditText)findViewById(R.id.edshillingfield);
        Double shillingAmount = Double.parseDouble(shillingField.getText() .toString());
        Double dollarAmount = shillingAmount * 89.0;

        Toast.makeText(
                getApplicationContext(), " dollars", Toast.LENGTH_LONG).show();




    }
}
