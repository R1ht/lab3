package com.example.shvyryaev_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity {

    private Bus bus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bus = new Bus();
        bus.register(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button7:
                bus.post(new Activator());
                break;
            case R.id.button3:
                bus.post(new Activator2());
                break;
        }
    }

    @Subscribe
    public void csActivityStarter(Activator event){
        Intent intent = new Intent(this, ConstraintActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Subscribe
    public void frActivityStarter(Activator2 event){
        Intent intent = new Intent(this, FrameActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}