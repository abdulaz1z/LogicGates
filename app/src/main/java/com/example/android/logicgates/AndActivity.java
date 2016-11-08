package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class AndActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.and_layout);
    }
    //and live logic
    public void andLiveGate(View view){
        boolean andinputOne = ((CheckBox) findViewById(R.id.andinputOne)).isChecked();
        boolean andinputTwo = ((CheckBox) findViewById(R.id.andinputTwo)).isChecked();
        if(andinputOne == true){
            andDisplayInputOne("1");
        }
        if(andinputOne == false){
            andDisplayInputOne("0");
        }
        if(andinputTwo == true){
            andDisplayInputTwo("1");
        }
        if(andinputTwo == false){
            andDisplayInputTwo("0");
        }

        if(andinputOne == true && andinputTwo == true){
            andDisplayGateResult("1");
        }
        else{
            andDisplayGateResult("0");
        }
    }
    public void andDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.and_output);
        resultTextView.setText(result);
    }
    public void andDisplayInputOne(String andOneOrTwo){
        CheckBox check = (CheckBox) findViewById(R.id.andinputOne);
        check.setText(andOneOrTwo);
    }
    public void andDisplayInputTwo(String andOneOrTwo){
        CheckBox check = (CheckBox) findViewById(R.id.andinputTwo);
        check.setText(andOneOrTwo);
    }


}
