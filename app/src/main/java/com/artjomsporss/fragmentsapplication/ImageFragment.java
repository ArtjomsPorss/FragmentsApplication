package com.artjomsporss.fragmentsapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User1 on 09/11/2015.
 */
public class ImageFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_image,container,false);
    }

    public ImageFragment(){}

    public static ImageFragment newInstance(){
        ImageFragment fragment = new ImageFragment();
        return fragment;
    }
}
