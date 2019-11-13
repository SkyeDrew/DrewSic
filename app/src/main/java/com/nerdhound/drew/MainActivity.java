package com.nerdhound.drew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usr;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.usr = findViewById(R.id.number);
        this.pass = findViewById(R.id.number2);
    }

    public void openActivity (View v){
        Intent x = new Intent(MainActivity.this,DrewSic.class);
        startActivity(x);
    }

    public void onClickData (View v) {
        Log.e("Start","Process Has Started <=");
        String dta = this.usr.getText().toString();
        String pss = this.pass.getText().toString();
        Log.e("Coll","Username is " + dta + " and password is " + pss);
        Log.e("End","Process Has Ended =>");
        Intent s = new Intent(MainActivity.this, DrewSic.class);
        startActivity(s);
    }

}
