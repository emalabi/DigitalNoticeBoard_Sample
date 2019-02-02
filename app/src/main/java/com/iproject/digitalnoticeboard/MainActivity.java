package com.iproject.digitalnoticeboard;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //=============================================//
    // this part gets the variables to use in pro.//
    //===========================================//

    TextView menuOne;
    TextView menuTwo;
    TextView menuThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //==========================================//
        // this part gets the views by their id's  //
        //========================================//

        menuOne = findViewById( R.id.menu1 );
        menuTwo = findViewById( R.id.menu2 );
        menuThree = findViewById( R.id.menu3 );

        //===============================================//
        // this part for the intent to the tabs Activity //
        //==============================================//

        menuOne.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, TabsActivity.class );
                startActivity( intent );
            }
        } );

        //===============================================//
        // this part for the intent to the tabs Activity //
        //==============================================//

        menuTwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, TabsActivity.class );
                startActivity( intent );
            }
        } );

        //===============================================//
        // this part for the intent to the tabs Activity //
        //==============================================//

        menuThree.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, TabsActivity.class );
                startActivity( intent );
            }
        } );
    }


}
