package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.activitylifecycle.databinding.ActivityMainBinding;

import static android.content.ContentValues.TAG;

public class SecondActivity extends Activity {

    Button btnTwwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnTwwo = (Button) findViewById(R.id.btn_two);

        btnTwwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivities(new Intent[]{intent});
            }
        });
        Log.d(TAG, "AAA onCreate Second: ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "AAA onStart Second: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "AAA onRestart Second: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "AAA onResume Second: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "AAA onPause Second: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "AAA onStop Second: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "AAA onDestroy Second: ");
    }
}