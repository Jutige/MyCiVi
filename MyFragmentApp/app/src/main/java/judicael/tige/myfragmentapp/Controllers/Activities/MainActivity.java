package judicael.tige.myfragmentapp.Controllers.Activities;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


import judicael.tige.myfragmentapp.Controllers.Fragments.DetailFragment;
import judicael.tige.myfragmentapp.Controllers.Fragments.MainFragment;
import judicael.tige.myfragmentapp.R;

public class MainActivity extends AppCompatActivity implements MainFragment.OnButtonClickedListener {

    //Declare our two fragments
    private MainFragment mainFragment;
    private DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configure and show it
        this.configureAndShowMainFragment();
        this.configureAndShowDetailFragment();
    }

    // --------------
    // CallBack
    // --------------

    @Override
    public void onButtonClicked(View view) {
        //Retrieve button tag
        int buttonTag = Integer.parseInt(view.getTag().toString());

        //Check if DetailFragment is visible (Tablet)
        if (detailFragment != null && detailFragment.isVisible()) {
            if (detailFragment != null) {
                //TABLET : Update directly TextView
                detailFragment.updateTextView(buttonTag);
                startActivity(new Intent());
                } else {
                    //SMARTPHONE : Pass tag to the new intent that will show DetailActivity (and so DetailFragment)
                    Intent i = new Intent(this, DetailActivity.class);
                    i.putExtra(DetailActivity.EXTRA_BUTTON_TAG, buttonTag);
                    startActivity(i);
            }
        }
    }



    // --------------
    // FRAGMENTS
    // --------------

    private void configureAndShowMainFragment(){

        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.frame_layout_main);

        if (mainFragment == null) {
            mainFragment = new MainFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_layout_main, mainFragment)
                    .commit();
        }
    }

    private void configureAndShowDetailFragment(){
        detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.frame_layout_detail);

        if (detailFragment == null && findViewById(R.id.frame_layout_detail) != null) {
            detailFragment = new DetailFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_layout_detail, detailFragment)
                    .commit();
        }
    }
}
