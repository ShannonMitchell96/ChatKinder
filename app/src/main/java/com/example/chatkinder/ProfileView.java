package com.example.chatkinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);
    }
    public void TwoOnClick(View v){
        Intent myIntent = new Intent(getBaseContext(), BasicChat.class);
        startActivity(myIntent);
    }
    public void ThreeOnClick(View v){
        Intent myIntent = new Intent(getBaseContext(), BasicChat.class);
        startActivity(myIntent);
    }
}
