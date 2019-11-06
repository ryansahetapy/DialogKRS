package com.example.projectprogmob;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Listview(View view) {
        Intent Intent = new Intent(MainActivity.this, ListActivity.class);
    }

    public  void

