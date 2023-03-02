package com.example.pr2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }
    protected void onRestart(){
        super.onRestart();
        EditText editText = (EditText) findViewById(R.id.editTextTextPassword3);
        editText.setText(getString(R.string.ZXC3));
        ImageView image = findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.ic_launcher_foreground);
    }
}