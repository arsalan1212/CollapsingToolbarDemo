package com.example.arsalankhan.collapsingtoolbardemo;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class CollapseToolbarActivity extends AppCompatActivity {

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapse_toolbar);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Collapsing Toolbar");

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)
                                                           findViewById(R.id.collapsingToolbar);

        collapsingToolbarLayout.setTitle("Collapse Toolbar");
    }
}
