package com.example.testdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.testdrawer.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main2 extends AppCompatActivity {
    private FrameLayout mFrameLayout;
    private Fragment mSelected;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNav = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            return showFragment(menuItem.getItemId());
        }
    };

    private boolean showFragment(int itemId) {
        switch (itemId){
            case R.id.action_home:
                mFrameLayout.setVisibility(View.VISIBLE);
                mSelected = HomeFragment.newInstance();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,mSelected).commit();
                return true;
            case R.id.action_history:
                mFrameLayout.setVisibility(View.VISIBLE);
                mSelected = history.newInstance();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,mSelected).commit();
                return true;
            case R.id.action_notif:
                mFrameLayout.setVisibility(View.VISIBLE);
                mSelected = notif.newInstance();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,mSelected).commit();
                return true;
            case R.id.action_account:
                mFrameLayout.setVisibility(View.VISIBLE);
                mSelected = account.newInstance();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,mSelected).commit();
                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mFrameLayout = findViewById(R.id.frame_container);

        //listener Frame Layout
        BottomNavigationView bottomNav = findViewById(R.id.btm_nav);
        bottomNav.setOnNavigationItemSelectedListener(mOnNav);

        showFragment(R.id.action_home);
    }
}
