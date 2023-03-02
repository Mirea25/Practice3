package com.example.pr2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        Bundle arguments = getIntent().getExtras();
        String txt = arguments.get("string").toString();
    }
    public void LogButton2(View view){
        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.editTextTextPassword2);
        intent.putExtra("pswd", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}