package com.example.arsalankhan.collapsingtoolbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Main Activity");
    }

    public void AppbarLayout(View view){

        startActivity(new Intent(this,AppbarLayoutActivity.class));
    }

    public void CollapseToolbar(View view){

        startActivity(new Intent(this,CollapseToolbarActivity.class));
    }
}
