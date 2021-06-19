package com.example.activitylifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static android.content.ContentValues.TAG;

public class FragmentA extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FFF A onCreateView: ");
        return inflater.inflate(R.layout.fragment_a, container, false);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "FFF A onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "FFF A onCreate: ");
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "FFF A onActivityCreated: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "FFF A onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "FFF A onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "FFF A onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "FFF A onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "FFF A onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "FFF A onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "FFF A onDetach: ");
    }
}
