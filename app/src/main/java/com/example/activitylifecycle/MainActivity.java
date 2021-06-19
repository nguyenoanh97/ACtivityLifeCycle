package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.activitylifecycle.databinding.ActivityMainBinding;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {
    private ActivityMainBinding binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//
//
//
//        binding.btnA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentA fragmentA = new FragmentA();
//                fragmentTransaction.add(R.id.framelayout, fragmentA);
//                fragmentTransaction.commit();
//
//            }
//        });
//
//        binding.btnB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                FragmentB fragmentB = new FragmentB();
//                fragmentTransaction.add(R.id.framelayout, fragmentB);
//                fragmentTransaction.commit();
//            }
//        });




        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivities(new Intent[]{intent});
            }
        });

        Log.d(TAG, "AAA onCreate Main: ");


    }

    public void AddFragment(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;
        switch (view.getId()){
            case R.id.btnA:
                fragment = new FragmentA();

                break;
            case R.id.btnB:
                fragment = new FragmentB();
                break;
        }
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "AAA onStart Main: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "AAA onRestart Main: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "AAA onResume Main: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "AAA onPause Main: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "AAA onStop Main: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "AAA onDestroy Main: ");
    }

}