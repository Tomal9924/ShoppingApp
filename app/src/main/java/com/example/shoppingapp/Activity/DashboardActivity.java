package com.example.shoppingapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.shoppingapp.Fragment.BagsFragment;
import com.example.shoppingapp.Fragment.FoodFragment;
import com.example.shoppingapp.Fragment.Homepage;
import com.example.shoppingapp.Fragment.HomepageCart;
import com.example.shoppingapp.Fragment.HomepageFavouriteList;
import com.example.shoppingapp.Fragment.HomepageNotification;
import com.example.shoppingapp.Fragment.TreesFragment;
import com.example.shoppingapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.example.shoppingapp.Utils.Utils.CLASS_NAME_BAGS;
import static com.example.shoppingapp.Utils.Utils.CLASS_NAME_FOOD;
import static com.example.shoppingapp.Utils.Utils.CLASS_NAME_HOMEPAGE;
import static com.example.shoppingapp.Utils.Utils.CLASS_NAME_TREES;
import static com.example.shoppingapp.Utils.Utils.FRAGMENT_GOTO_HOMEPAGE;

public class DashboardActivity extends AppCompatActivity {


    BottomNavigationView mNavigator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


    }

    private void init() {

        mNavigator = findViewById(R.id.homepage_navigation_drawer);
        mNavigator.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                menuItem.setChecked(true);
                switch (menuItem.getItemId()) {
                    case R.id.homepage_home:
                        mNavigator.getMenu().getItem(0).setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new Homepage()).addToBackStack(null).commitAllowingStateLoss();
                        break;
                    case R.id.homepage_favourite:
                        mNavigator.getMenu().getItem(1).setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new HomepageFavouriteList()).addToBackStack(null).commitAllowingStateLoss();
                        break;
                    case R.id.homepage_cart:
                        mNavigator.getMenu().getItem(2).setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new HomepageCart()).addToBackStack(null).commitAllowingStateLoss();
                        break;
                    case R.id.homepage_notifications:
                        mNavigator.getMenu().getItem(3).setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new HomepageNotification()).addToBackStack(null).commitAllowingStateLoss();
                        break;
                    default:
                        getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new Homepage()).addToBackStack(null).commitAllowingStateLoss();
                        break;

                }
                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.homepage_bottom_menu, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();

        init();
        if (getIntent().getStringExtra(FRAGMENT_GOTO_HOMEPAGE) != null) {
            switch (getIntent().getStringExtra(FRAGMENT_GOTO_HOMEPAGE)) {
                case CLASS_NAME_HOMEPAGE:
                   break;
                case CLASS_NAME_FOOD:
                    mNavigator.getMenu().getItem(0).setChecked(true);
                    getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new FoodFragment()).addToBackStack(null).commitAllowingStateLoss();
                    break;

                case CLASS_NAME_TREES:
                    mNavigator.getMenu().getItem(0).setChecked(true);
                    getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new TreesFragment()).addToBackStack(null).commitAllowingStateLoss();
                    break;

                case CLASS_NAME_BAGS:
                    mNavigator.getMenu().getItem(0).setChecked(true);
                    getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new BagsFragment()).addToBackStack(null).commitAllowingStateLoss();
                    break;
                default:
                    mNavigator.getMenu().getItem(0).setChecked(true);
                    getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new Homepage()).addToBackStack(null).commitAllowingStateLoss();
            }
        } else {
            mNavigator.getMenu().getItem(0).setChecked(true);
            getSupportFragmentManager().beginTransaction().replace(R.id.homepage_fragment_container, new Homepage()).addToBackStack(null).commitAllowingStateLoss();
        }
    }

}
