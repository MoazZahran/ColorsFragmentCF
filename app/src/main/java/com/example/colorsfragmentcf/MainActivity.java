package com.example.colorsfragmentcf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();

        BlankFragment FstFragment = new BlankFragment(AndroidImageAssets.getHeads());
        fragmentManager.beginTransaction().add(R.id.head_fr, FstFragment).commit();

        BlankFragment sndFragment = new BlankFragment(AndroidImageAssets.getBodies());
        fragmentManager.beginTransaction().add(R.id.body_fr, sndFragment).commit();

        BlankFragment thirdFragment = new BlankFragment(AndroidImageAssets.getLegs());
        fragmentManager.beginTransaction().add(R.id.leg_fr, thirdFragment).commit();
    }
}