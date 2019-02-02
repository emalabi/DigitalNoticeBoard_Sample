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
public class ThirdTabFragment extends Fragment {


    public ThirdTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //=====================================================//
        // this create a view and inflates the xml to it      //
        //===================================================//

        View viewMain = inflater.inflate( R.layout.main_fragment_page, container,false );
        return viewMain;
    }

}
