package com.acadgild.fujitsu.fragment62;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button:

                Layout1 fragment = new Layout1();
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction().add(R.id.framlayout, fragment).addToBackStack("Layout1").commit();
                break;
            case R.id.button2:

                Layout2 fragment1 = new Layout2();
                FragmentManager manager1 = getSupportFragmentManager();
                manager1.beginTransaction().add(R.id.framlayout, fragment1).addToBackStack("Layout2").commit();
                break;
            case R.id.button3:

                Layout2 fragment2 = new Layout2();
                FragmentManager manager2 = getSupportFragmentManager();
                manager2.beginTransaction().add(R.id.framlayout, fragment2).addToBackStack("Layout2").commit();
                break;

        }
    }
}