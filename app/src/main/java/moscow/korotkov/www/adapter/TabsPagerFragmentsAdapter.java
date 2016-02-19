package moscow.korotkov.www.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerFragmentsAdapter extends FragmentPagerAdapter {

    String[] tabs;

    public TabsPagerFragmentsAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "tab1",
                "tab2",
                "tab3"

        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
