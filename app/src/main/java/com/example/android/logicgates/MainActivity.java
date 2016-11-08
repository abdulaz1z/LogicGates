package com.example.android.logicgates;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //connects all home button to different activity
    public void andGate(View view){
        startActivity(new Intent(getApplicationContext(), AndActivity.class));
    }
    public void nandGate(View view){
        startActivity(new Intent(getApplicationContext(), NandActivity.class));
    }
    public void orGate(View view){
        startActivity(new Intent(getApplicationContext(), OrActivity.class));
    }
    public void norGate(View view){
        startActivity(new Intent(getApplicationContext(), NorActivity.class));
    }
    public void xorGate(View view){
        startActivity(new Intent(getApplicationContext(), XorActivity.class));
    }
    public void xnorGate(View view){
        startActivity(new Intent(getApplicationContext(), XnorActivity.class));
    }
    public void notGate(View view){
        startActivity(new Intent(getApplicationContext(), NotActivity.class));
    }
    public void logicGates(View view){
        startActivity(new Intent(getApplicationContext(), LogicGatesActivity.class));
    }

    public void home(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
    public void quiz(View view){
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

}



