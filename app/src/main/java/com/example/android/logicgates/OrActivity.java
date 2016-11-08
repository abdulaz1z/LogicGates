package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class OrActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.or_layout);
    }
    //or live logic
    public void orLiveGate(View view) {
        boolean orinputOne = ((CheckBox) findViewById(R.id.orinputOne)).isChecked();
        boolean orinputTwo = ((CheckBox) findViewById(R.id.orinputTwo)).isChecked();
        if (orinputOne == true) {
            ordisplayInputOne("1");
        }
        if (orinputOne == false) {
            ordisplayInputOne("0");
        }
        if (orinputTwo == true) {
            ordisplayInputTwo("1");
        }
        if (orinputTwo == false) {
            ordisplayInputTwo("0");
        }

        if (orinputOne == false && orinputTwo == false) {
            orDisplayGateResult("0");
        } else if (orinputOne == true) {
            orDisplayGateResult("1");
        } else if (orinputTwo == true) {
            orDisplayGateResult("1");
        }

    }
    public void orDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.or_output);
        resultTextView.setText(result);
    }
    public void ordisplayInputOne(String oroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.orinputOne);
        resultTextView.setText(oroneOrTwo);
    }
    public void ordisplayInputTwo(String oroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.orinputTwo);
        resultTextView.setText(oroneOrTwo);
    }

}
