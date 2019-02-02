package com.iproject.digitalnoticeboard;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstTabFragment extends Fragment {


    public FirstTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //================================================//
        // this creates a view and inflates the xml to it//
        //===============================================//

        View viewMain = inflater.inflate( R.layout.main_fragment_page,container,false );
        return viewMain;
    }

}
