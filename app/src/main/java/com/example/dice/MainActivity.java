package com.example.dice;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();

    private ImageView imageView1;
    private ImageView imageView2;
    //private TextView test_txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView1 = findViewById(R.id.imageview1);
        imageView2 = findViewById(R.id.imageview2);
        //TextView test_txtView = findViewById(R.id.test_txtView);
    }


    public void changeDice(View view) {
        int count1 = random.nextInt(6);
        int count2 = random.nextInt(6);

        //test_txtView.setText(count1);

        switch(count1){
            case 1: imageView1.setImageResource(R.drawable.dice1);
                break;
            case 2: imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3: imageView1.setImageResource(R.drawable.dice3);
                break;
            case 4: imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5: imageView1.setImageResource(R.drawable.dice5);
                break;
            case 0: imageView1.setImageResource(R.drawable.dice6);
                break;
        }

        switch(count2){
            case 1: imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2: imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3: imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4: imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5: imageView2.setImageResource(R.drawable.dice5);
                break;
            case 0: imageView2.setImageResource(R.drawable.dice6);
                break;
        }

    }

}