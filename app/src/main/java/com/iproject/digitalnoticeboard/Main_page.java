package com.iproject.digitalnoticeboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_page extends AppCompatActivity {

    //================================================//
    // this are the field needed for the main page   //
    //==============================================//

    EditText firstPhone;
    Button  signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main_page );

        //================================================//
        // this part find the views by their IDs         //
        //==============================================//

        firstPhone = findViewById( R.id.sign_up_box );
        signUpButton = findViewById( R.id.sign_up_button );



        signUpButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //===================================================//
                // this part pass the main page to the registration //
                // using an intent                                 //
                //================================================//

                Intent intent = new Intent( Main_page.this, Registration_form.class );
                startActivity( intent );

            }
        } );
    }


}
