package com.developer.abhi.vectorassetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageProgrammatically;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageProgrammatically=(ImageView)findViewById(R.id.imagePragmatically);
        imageProgrammatically.setImageResource(R.drawable.ic_svg);
    }
}
