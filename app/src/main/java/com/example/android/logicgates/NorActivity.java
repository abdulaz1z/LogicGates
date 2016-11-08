package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class NorActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nor_layout);
    }
    //nor live logic
    public void norLiveGate(View view){
        boolean norinputOne = ((CheckBox) findViewById(R.id.norinputOne)).isChecked();
        boolean norinputTwo = ((CheckBox) findViewById(R.id.norinputTwo)).isChecked();
        if (norinputOne == true) {
            nordisplayInputOne("1");
        }
        if (norinputOne == false) {
            nordisplayInputOne("0");
        }
        if (norinputTwo == true) {
            nordisplayInputTwo("1");
        }
        if (norinputTwo == false) {
            nordisplayInputTwo("0");
        }

        if(norinputOne == false && norinputTwo == false){
            norDisplayGateResult("1");
        }
        else if (norinputOne == true){
            norDisplayGateResult("0");
        }
        else if (norinputTwo == true){
            norDisplayGateResult("0");
        }

    }
    public void norDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.nor_output);
        resultTextView.setText(result);
    }
    public void nordisplayInputOne(String noroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.norinputOne);
        resultTextView.setText(noroneOrTwo);
    }
    public void nordisplayInputTwo(String oroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.norinputTwo);
        resultTextView.setText(oroneOrTwo);
    }

}
