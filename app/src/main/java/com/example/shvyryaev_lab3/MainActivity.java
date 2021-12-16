package com.example.shvyryaev_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater myInflater = LayoutInflater.from(this);
        View view = myInflater.inflate(R.layout.activity_main, null);
    }

    public void onClick(View view) {

        switch (view.getId()) {

        }

    }
}