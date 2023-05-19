package com.example.pr2;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "PR2";
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        if (savedInstanceState == null) {
            setfragment();
        }
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("string", "Шинькович Антон Олегович");
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "Button clicked");
                startActivityForResult(intent,1);
            }
        });
    }
    protected void onRestart(){
        super.onRestart();
        EditText editText = (EditText) findViewById(R.id.editTextTextPassword3);
        editText.setText(getString(R.string.ZXC3));
        ImageView image = findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.ic_launcher_foreground);
    }
    public void LogButton(View view){
        Log.i(TAG, "Button clicked");
        Intent intent = new Intent(this, Login.class);
        startActivityForResult(intent,1);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            password = data.getStringExtra("pswd");
            TextView text = (TextView) findViewById(R.id.textView4);
            text.setText(password);
        }
    }
    private void setfragment() {
        Fragment1 firstfrag = new Fragment1();
        FragmentTransaction frag = getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.frag1, firstfrag);
        frag.commit();
    }
    public void FragButton(View view){
        Fragment2 secondfrag = new Fragment2();
        FragmentTransaction frag = getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.frag1, secondfrag);
        frag.commit();
    }
    public void FragButton2(View view) {
        Fragment1 firstfrag = new Fragment1();
        FragmentTransaction frag = getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.frag1, firstfrag);
        frag.commit();
    }
}