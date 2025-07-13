package com.example.admin.sec_nss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void doc (View v)
    {
        Intent i=new Intent();
        i.setClass(this,Main5Activity.class);
        startActivity(i);
    }
    public void photo(View v)
    {
        Intent i=new Intent();
        i.setClass(this,Main7Activity.class);
        startActivity(i);
    }
    public void tech(View v)
    {
        Intent i=new Intent();
        i.setClass(this,Main6Activity.class);
        startActivity(i);
    }
    public void parade(View v)
    {
        Intent i=new Intent();
        i.setClass(this,Main8Activity.class);
        startActivity(i);
    }
}
