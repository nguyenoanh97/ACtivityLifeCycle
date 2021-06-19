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

public class FragmentB extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FFF B onCreateView: ");
        return inflater.inflate(R.layout.fragment_b, container, false);

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "FFF B onActivityCreated: ");
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "FFF B onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "FFF B onCreate: ");
    }



    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "FFF B onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "FFF B onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "FFF B onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "FFF B onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "FFF B onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "FFF B onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "FFF B onDetach: ");
    }
}
