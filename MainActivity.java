package com.izza.jte;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCar=findViewById(R.id.button2);


        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                loadFragment(new carFragment());
            }
        });
    }

            private void loadFragment (Fragment fragment) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fm = fragmentManager.beginTransaction();
                fm.replace(R.id.frame, fragment);
                fm.addToBackStack(null);
                fm.commit();
            }
}
