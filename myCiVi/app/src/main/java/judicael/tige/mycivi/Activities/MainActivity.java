package judicael.tige.mycivi.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.EnumMap;

import judicael.tige.mycivi.Fragments.CompetenceFragment;
import judicael.tige.mycivi.Fragments.ExperienceFragment;
import judicael.tige.mycivi.Fragments.FormationFragment;
import judicael.tige.mycivi.Fragments.InfosFragment;
import judicael.tige.mycivi.Fragments.LoisirsFragment;
import judicael.tige.mycivi.Fragments.PresFragment;
import judicael.tige.mycivi.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    //FOR DESIGN
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    //FOR FRAGMENTS
    private Fragment fragmentPres;
    private Fragment fragmentExp;
    private Fragment fragmentComp;
    private Fragment fragmentForm;
    private Fragment fragmentInfo;
    private Fragment fragmentLois;

    //FOR DATAS
    private static final int FRAGMENT_PRES = 0;
    private static final int FRAGMENT_EXP = 1;
    private static final int FRAGMENT_COMP = 2;
    private static final int FRAGMENT_FORM = 3;
    private static final int FRAGMENT_INFO = 4;
    private static final int FRAGMENT_LOIS = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configure all views
        this.configureToolBar();
        this.configureDrawerLayout();
        this.configureNavigationView();

        // Show First Fragment
        this.showFirstFragment();



    }

    private void showFirstFragment() {
        Fragment visibleFragment = getSupportFragmentManager().findFragmentById(R.id.activity_main_frame_layout);
        if (visibleFragment == null){
            // Show News Fragment
            this.showFragment(FRAGMENT_PRES);
            // Mark as selected the menu item corresponding to NewsFragment
            this.navigationView.getMenu().getItem(0).setChecked(true);
        }
    }

    private void showFragment(int fragmentId) {
        switch (fragmentId) {
            case FRAGMENT_PRES:
                this.showPresFragment();
                break;
            case FRAGMENT_EXP :
                this.showExpFragment();
                break;
            case FRAGMENT_COMP :
                this.showCompFragment();
                break;
            case FRAGMENT_FORM:
                this.showFormFragment();
                break;
            case FRAGMENT_INFO:
                this.showInfoFragment();
                break;
            case FRAGMENT_LOIS:
                this.showLoisFragment();
            default:
                break;
        }
    }



    private void startTransactionFragment(Fragment fragment) {
        if (!fragment.isVisible()){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();
        }
    }

    private void showPresFragment() {
        if (this.fragmentPres == null) this.fragmentPres = PresFragment.newInstance();
        this.startTransactionFragment(this.fragmentPres);
    }


    private void showCompFragment() {
        if (this.fragmentComp == null) this.fragmentComp = CompetenceFragment.newInstance();
        this.startTransactionFragment(this.fragmentComp);
    }

    private void showExpFragment() {
        if (this.fragmentExp == null) this.fragmentExp = ExperienceFragment.newInstance();
        this.startTransactionFragment(this.fragmentExp);
    }

    private void showFormFragment() {
        if (this.fragmentForm == null) this.fragmentForm = FormationFragment.newInstance();
        this.startTransactionFragment(this.fragmentForm);
    }

    private void showLoisFragment() {
        if (this.fragmentLois == null) this.fragmentLois = LoisirsFragment.newInstance();
        this.startTransactionFragment(this.fragmentLois);
    }

    private void showInfoFragment() {
        if (this.fragmentInfo == null) this.fragmentInfo = InfosFragment.newInstance();
        this.startTransactionFragment(this.fragmentInfo);
    }

    private void configureNavigationView() {
        this.navigationView = (NavigationView) findViewById(R.id.activity_main_nav_view);
        navigationView.setNavigationItemSelectedListener(this);
/*
        View headerView = navigationView.inflateHeaderView(R.layout.activity_main_nav_header);
        TextView mTextMail = (TextView) headerView.findViewById(R.id.poste);

//        System.out.println(mTextView.getText());
        mTextMail.setText(Html.fromHtml("<a href='mailto:caludije@gmail.com?subject=Test' target='_top'>caludije@gmail.com</a>"));
        mTextMail.setMovementMethod(LinkMovementMethod.getInstance());*/
    }

    private void configureDrawerLayout() {
        this.drawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void configureToolBar() {
        this.toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();
        switch (id){
            case R.id.activity_main_drawer_pres:
                this.showFragment(FRAGMENT_PRES);
                break;
            case R.id.activity_main_drawer_exp:
                this.showFragment(FRAGMENT_EXP);
                break;
            case R.id.activity_main_drawer_Comp:
                this.showFragment(FRAGMENT_COMP);
                break;
            case R.id.activity_main_drawer_Form:
                this.showFragment(FRAGMENT_FORM);
                break;
            case R.id.activity_main_drawer_infos:
                this.showInfoFragment();
                break;
            case R.id.activity_main_drawer_loisirs:
                this.showLoisFragment();
                break;
            default:
                break;
        }
        this.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        // Handle back click to close menu
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
