package com.example.zealya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        //TabLayout name = ...
        //https://developer.android.com/reference/android/support/design/widget/TabLayout.html
        
        //ListFragment namedFragment = new ListFragment(...)
        //https://developer.android.com/guide/components/fragments.html
        // use the fragment manager to start your fragment 
    }
}
