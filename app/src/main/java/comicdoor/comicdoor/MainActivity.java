package comicdoor.comicdoor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;

import br.liveo.interfaces.OnItemClickListener;
import br.liveo.model.HelpLiveo;
import br.liveo.navigationliveo.NavigationActionBarLiveo;
import comicdoor.comicdoor.fragment.FragmentChangeHelper;

public class MainActivity extends NavigationActionBarLiveo implements OnItemClickListener {
    private HelpLiveo mHelpLiveo;
    private ActionBar toolbar;

    @Override
    public void onInt(Bundle savedInstanceState) {

        //App Infomation
        this.userName.setText(R.string.app_name);
        this.userEmail.setText(R.string.app_d);

        //Create Navigation
        mHelpLiveo = new HelpLiveo();
        mHelpLiveo.add(getString(R.string.navi_hot));
        mHelpLiveo.add(getString(R.string.navi_search));
        mHelpLiveo.add(getString(R.string.navi_download));
        mHelpLiveo.add(getString(R.string.navi_plugin));
        mHelpLiveo.add(getString(R.string.navi_setting));

        with(this)
                .startingPosition(0)
                .addAllHelpItem(mHelpLiveo.getHelp())
                .build();
        toolbar=getSupportActionBar();
        toolbar.setTitle(getString(R.string.app_name));

    }

    @Override
    public void onItemClick(int position) {
        FragmentManager mFragmentManager = getSupportFragmentManager();
        Fragment mFragment = FragmentChangeHelper.newInstence(position);
        if (mFragment != null){
            mFragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();

        }

    }
}
