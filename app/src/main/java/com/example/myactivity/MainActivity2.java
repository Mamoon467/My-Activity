package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast toast =Toast.makeText(this,"SecondStart",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER ,0,0);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(this, "SecondonStart", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(this, "SecondonResume", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(this, "SecondonPause", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(this, "SecondonStop", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(this, "SecondonRestart", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(this, "SecondonStart", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    }