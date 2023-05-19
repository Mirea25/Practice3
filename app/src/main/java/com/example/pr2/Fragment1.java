package com.example.pr2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    String Tag = this.getClass().getSimpleName();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"onCreate",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onCreate");

    }

    @Override
    public void onStart() {
        Toast.makeText(getActivity(),"onStart",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Toast.makeText(getActivity(),"onResume",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Toast.makeText(getActivity(),"onPause",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Toast.makeText(getActivity(),"onStop",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getActivity(),"onDestroy",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onDestroy");
        super.onDestroy();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

}