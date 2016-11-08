package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class NandActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nand_layout);
    }
    //nand live logic
    public void nandLiveGate(View view){
        boolean nandinputOne = ((CheckBox) findViewById(R.id.nandinputOne)).isChecked();
        boolean nandinputTwo = ((CheckBox) findViewById(R.id.nandinputTwo)).isChecked();
        if(nandinputOne == true){
            nanddisplayInputOne("1");
        }
        if(nandinputOne == false){
            nanddisplayInputOne("0");
        }
        if(nandinputTwo == true){
            nanddisplayInputTwo("1");
        }
        if(nandinputTwo == false){
            nanddisplayInputTwo("0");
        }
        if(nandinputOne == false && nandinputTwo == false){
            nandDisplayGateResult("1");
        }
        if(nandinputOne == true && nandinputTwo == true){
            nandDisplayGateResult("0");
        }
        else if (nandinputOne == true){
            nandDisplayGateResult("1");
        }
        else if (nandinputTwo == true){
            nandDisplayGateResult("1");
        }
    }
    public void nandDisplayGateResult(String result){
        TextView resultTextView = (TextView) findViewById(R.id.nand_output);
        resultTextView.setText(result);
    }
    public void nanddisplayInputOne(String nandoneOrTwo){
        CheckBox check = (CheckBox) findViewById(R.id.nandinputOne);
        check.setText(nandoneOrTwo);
    }
    public void nanddisplayInputTwo(String nandoneOrTwo){
        CheckBox check = (CheckBox) findViewById(R.id.nandinputTwo);
        check.setText(nandoneOrTwo);
    }

}
