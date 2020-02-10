package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {
    Button getStarted;
    ViewPager viewPager;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_first, container, false);


       //Initializing ViewPager from MainActivity
       getStarted = view.findViewById(R.id.onboarding_get_started_button1);
       viewPager = getActivity().findViewById(R.id.slideViewPager);


       getStarted.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               viewPager.setCurrentItem(1);
           }
       });

       return view;
    }

}
