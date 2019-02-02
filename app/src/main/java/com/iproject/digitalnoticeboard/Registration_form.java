package com.iproject.digitalnoticeboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration_form extends AppCompatActivity {

    //=================================================//
    // this part defines the fields that we will be   //
    // use in the registration of a user             //
    //==============================================//

    EditText userName;
    EditText emailAdress;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.registration_form );

        //===============================================//
        // this part find the views by id from the      //
        // registration xml file                       //
        //============================================//

        userName = findViewById( R.id.username_id );
        emailAdress = findViewById( R.id.email_id );
        submitButton = findViewById( R.id.submit_id );


        submitButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Registration_form.this, MainActivity.class );
                startActivity( intent );
            }
        } );
    }
}
