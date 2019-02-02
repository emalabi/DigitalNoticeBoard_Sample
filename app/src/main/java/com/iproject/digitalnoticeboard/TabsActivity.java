package com.iproject.digitalnoticeboard;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabsActivity extends AppCompatActivity {

    android.support.design.widget.TabLayout tableLayout;
    ViewPager pager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tabs );

        //=============================================//
        // this find views by their id                //
        //===========================================//

        pager = findViewById( R.id.new_pager );
        tableLayout = findViewById( R.id.mytab );


        //==============================================//
        // this part configures the tabs               //
        //============================================//

        FragmentAdapter adapter = new FragmentAdapter( this,getSupportFragmentManager() );

        pager.setAdapter( adapter );
        tableLayout.setupWithViewPager( pager );

    }
}
