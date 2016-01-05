package com.artjomsporss.fragmentsapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginFragment extends Fragment {

    private static BlankActivity blankActivity;
    private View thisView;

    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(BlankActivity activity) {
        blankActivity = activity;
        LoginFragment fragment = new LoginFragment();
        return fragment;
    }

    public LoginFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        thisView = inflater.inflate(R.layout.fragment_login, container, false);
        addListenerToSubmitBtn();


        if(blankActivity.getName() != null) {
            ((EditText) (thisView.findViewById(R.id.name_field))).setHint(blankActivity.getName());
        }

        if(blankActivity.getPassword() != null) {
            ((EditText) (thisView.findViewById(R.id.password_field))).setHint(blankActivity.getPassword());
        }

        // Inflate the layout for this fragment
       return thisView;
    }

    private void addListenerToSubmitBtn() {

        ((Button)(thisView.findViewById(R.id.submit_button))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ((EditText)(thisView.findViewById(R.id.name_field))).getText().toString();
                String password = ((EditText)(thisView.findViewById(R.id.password_field))).getText().toString();

                blankActivity.setName(text);
                blankActivity.setPassword(password);
            }
        });

    }

}
