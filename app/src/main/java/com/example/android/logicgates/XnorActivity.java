package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class XnorActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xnor_layout);
    }
    //xnor live logic
    public void xnorLiveGate(View view){
        boolean xnorinputOne = ((CheckBox) findViewById(R.id.xnorinputOne)).isChecked();
        boolean xnorinputTwo = ((CheckBox) findViewById(R.id.xnorinputTwo)).isChecked();
        if (xnorinputOne == true) {
            xnordisplayInputOne("1");
        }
        if (xnorinputOne == false) {
            xnordisplayInputOne("0");
        }
        if (xnorinputTwo == true) {
            xnordisplayInputTwo("1");
        }
        if (xnorinputTwo == false) {
            xnordisplayInputTwo("0");
        }

        if (xnorinputOne == true && xnorinputTwo == true){
            xnorDisplayGateResult("1");
        }
        else if (xnorinputOne == true){
            xnorDisplayGateResult("0");
        }
        else if (xnorinputTwo == true){
            xnorDisplayGateResult("0");
        }
        if (xnorinputOne == false && xnorinputTwo == false){
            xnorDisplayGateResult("1");
        }

    }
    public void xnorDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.xnor_output);
        resultTextView.setText(result);
    }
    public void xnordisplayInputOne(String xnoroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.xnorinputOne);
        resultTextView.setText(xnoroneOrTwo);
    }
    public void xnordisplayInputTwo(String xnoroneOrTwo){
        TextView resultTextView = (TextView) findViewById(R.id.xnorinputTwo);
        resultTextView.setText(xnoroneOrTwo);
    }

}
