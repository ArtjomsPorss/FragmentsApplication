package com.artjomsporss.fragmentsapplication;

import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class BlankActivity extends AppCompatActivity {
    private final String IMAGE = "Image";
    private final String TEXT = "Text";
    private final String LOGIN = "Login";

    private String name;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        ((Button)findViewById(R.id.image_button)).setText(IMAGE);
        ((Button)findViewById(R.id.login_button)).setText(LOGIN);
        ((Button)findViewById(R.id.text_button)).setText(TEXT);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_blank, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void hideKeyboard(View view){
       // view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        ((InputMethodManager)(getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(view.getWindowToken(),0);
    }

    public void onClick(View view){
        if(!(view instanceof Button)){return;}
        String name = ((Button)view).getText().toString();

        switch(name){
            case(IMAGE) : {
                ImageFragment imageFragment = ImageFragment.newInstance();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, imageFragment).commit();

                break;
            }
            case(TEXT) : {
                TextFragment textFragment = TextFragment.newInstance();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, textFragment).addToBackStack(TEXT).commit();
                break;
            }
            case(LOGIN) : {
                LoginFragment loginFragment = LoginFragment.newInstance(this);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, loginFragment).addToBackStack(TEXT).commit();
                break;
            }
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
