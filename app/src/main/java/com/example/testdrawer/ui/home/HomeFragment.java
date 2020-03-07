package com.example.testdrawer.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.testdrawer.R;
import com.example.testdrawer.ui.addProduct;

public class HomeFragment extends Fragment {


    public static HomeFragment newInstance() {
        HomeFragment frg = new HomeFragment();
        return frg;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }



    public void AddProduct (View v) {
        Intent i = new Intent(getActivity(),addProduct.class);
        startActivity(i);
    }
}