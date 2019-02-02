package com.iproject.digitalnoticeboard;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    //========================================//
    // this part declares a Context for the  //
    // constructor                          //
    //=====================================//

    private Context contexts;

    //=====================================================//
    // this part for the default constructor for the frag.//
    //===================================================//

    public FragmentAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);

        contexts = context;
    }

    //=================================================//
    // this parts checks the positions of the fragment//
    //================================================//

    @Override
    public Fragment getItem(int i) {

        if(i == 0){
            return new FirstTabFragment();
        }else if(i == 1){
            return new SecondTabFragment();
        }else if(i == 2){
            return new ThirdTabFragment();
        }else {
            return new FourthTabFragment();
        }
    }

    //===========================================//
    // this part gets the number of tabs for the//
    // fragments                               //
    //========================================//

    @Override
    public int getCount() {
        return 4;
    }

    //=========================================//
    // this part gets the titles for the tabs //
    //=======================================//


    @Nullable
    @Override
    public CharSequence getPageTitle(int tabTitle) {

        switch (tabTitle){
            case 0:
                return contexts.getString( R.string.tab1 );
            case 1:
                return contexts.getString( R.string.tab2 );
            case 2:
                return contexts.getString( R.string.tab3 );
            case 3:
                return contexts.getString( R.string.tab4 );
                default:
                    return null;
        }

    }
}
