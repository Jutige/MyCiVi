package judicael.tige.myviewpager.Controllers.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import judicael.tige.myviewpager.Adapters.PageAdapter;
import judicael.tige.myviewpager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("début de main activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("avant config de viewpager");
        //Configure ViewPager
        this.configureViewPagerAndTabs();
    }

    private void configureViewPagerAndTabs(){
        //Get ViewPager from layout
        ViewPager pager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        //Set Adapter PageAdapter and glue it together
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()));

        //Get TabLayout from layout
        TabLayout tabs= (TabLayout)findViewById(R.id.activity_main_tabs);
        //Glue TabLayout and ViewPager together
        tabs.setupWithViewPager(pager);
        //Design purpose. Tabs have the same width
        tabs.setTabMode(TabLayout.MODE_FIXED);
    }
}
