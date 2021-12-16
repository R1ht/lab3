package com.example.shvyryaev_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class FrameActivity extends AppCompatActivity {

    private ImageView img1;
    private ImageView img2;
    Random rand = new Random();
    int rndInt;
    String imgName;
    int id;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        img1 = (ImageView)findViewById(R.id.imageView1);


    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
            case R.id.button6:
                rndInt = rand.nextInt(3)+1;
                imgName = "cute_cat" + rndInt;
                img1.setImageResource(id);
                id = getResources().getIdentifier(imgName, "drawable", getPackageName());
                break;


        }
    }
}