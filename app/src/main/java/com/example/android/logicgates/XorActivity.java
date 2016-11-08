package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class XorActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xor_layout);
    }
    //xor live logic
    public void xorLiveGate(View view){
        boolean xorinputOne = ((CheckBox) findViewById(R.id.xorinputOne)).isChecked();
        boolean xorinputTwo = ((CheckBox) findViewById(R.id.xorinputTwo)).isChecked();
        if (xorinputOne == true) {
            xordisplayInputOne("1");
        }
        if (xorinputOne == false) {
            xordisplayInputOne("0");
        }
        if (xorinputTwo == true) {
            xordisplayInputTwo("1");
        }
        if (xorinputTwo == false) {
            xordisplayInputTwo("0");
        }

        if (xorinputOne == true && xorinputTwo == true){
            xorDisplayGateResult("0");
        }

        else if (xorinputOne == true){
            xorDisplayGateResult("1");
        }
        else if (xorinputTwo == true){
            xorDisplayGateResult("1");
        }
        else if (xorinputOne == false && xorinputTwo == false){
            xorDisplayGateResult("0");
        }


    }
    public void xorDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.xor_output);
        resultTextView.setText(result);
    }
    public void xordisplayInputOne(String xoroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.xorinputOne);
        resultTextView.setText(xoroneOrTwo);
    }
    public void xordisplayInputTwo(String xoroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.xorinputTwo);
        resultTextView.setText(xoroneOrTwo);
    }

}
