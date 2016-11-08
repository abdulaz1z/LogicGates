package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class NotActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.not_layout);
    }
    //not live logic
    public void notLiveGate(View view){
        boolean notinput = ((CheckBox) findViewById(R.id.notinput)).isChecked();
        if (notinput == true) {
            notdisplayInputOne("1");
        }
        if (notinput == false) {
            notdisplayInputOne("0");
        }
        if (notinput == true){
            notDisplayGateResult("0");
        }
        else{
            notDisplayGateResult("1");
        }

    }
    public void notDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.not_output);
        resultTextView.setText(result);
    }
    public void notdisplayInputOne(String notoneOrTwo) {
        TextView resultTextView = (TextView) findViewById(R.id.notinput);
        resultTextView.setText(notoneOrTwo);
    }

}
