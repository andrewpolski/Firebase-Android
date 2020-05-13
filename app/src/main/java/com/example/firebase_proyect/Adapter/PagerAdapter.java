package com.example.firebase_proyect.Adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.firebase_proyect.Fragment.Alumnos;
import com.example.firebase_proyect.Fragment.Asignaturas;
import com.example.firebase_proyect.Fragment.Grupos;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;


    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Alumnos();
            case 1:
                return new Asignaturas();
            case 2:
                return new Grupos();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}