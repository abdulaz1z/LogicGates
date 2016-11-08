package com.example.android.logicgates;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_layout);
    }
    //submit quiz answer
    public void submit(View view){
        boolean qs1_1 = ((RadioButton) findViewById(R.id.qs1_1)).isChecked();
        boolean qs1_2 = ((RadioButton) findViewById(R.id.qs1_2)).isChecked();
        boolean qs2_1 = ((RadioButton) findViewById(R.id.qs2_1)).isChecked();
        boolean qs2_2 = ((RadioButton) findViewById(R.id.qs2_2)).isChecked();
        boolean qs3_1 = ((RadioButton) findViewById(R.id.qs3_1)).isChecked();
        boolean qs3_2 = ((RadioButton) findViewById(R.id.qs3_2)).isChecked();
        boolean qs4_1 = ((RadioButton) findViewById(R.id.qs4_1)).isChecked();
        boolean qs4_2 = ((RadioButton) findViewById(R.id.qs4_2)).isChecked();
        boolean qs5_1 = ((RadioButton) findViewById(R.id.qs5_1)).isChecked();
        boolean qs5_2 = ((RadioButton) findViewById(R.id.qs5_2)).isChecked();
        boolean qs6_1 = ((RadioButton) findViewById(R.id.qs6_1)).isChecked();
        boolean qs6_2 = ((RadioButton) findViewById(R.id.qs6_2)).isChecked();
        boolean qs7_1 = ((RadioButton) findViewById(R.id.qs7_1)).isChecked();
        boolean qs7_2 = ((RadioButton) findViewById(R.id.qs7_2)).isChecked();
        boolean qs8_1 = ((RadioButton) findViewById(R.id.qs8_1)).isChecked();
        boolean qs8_2 = ((RadioButton) findViewById(R.id.qs8_2)).isChecked();
        boolean qs9_1 = ((RadioButton) findViewById(R.id.qs9_1)).isChecked();
        boolean qs9_2 = ((RadioButton) findViewById(R.id.qs9_2)).isChecked();
        boolean qs10_1 = ((RadioButton) findViewById(R.id.qs10_1)).isChecked();
        boolean qs10_2 = ((RadioButton) findViewById(R.id.qs10_2)).isChecked();

        int correctCounter = 0;
        int wrongCounter = 0;

        if(qs1_1 ==false && qs1_2 ==false && qs2_1 ==false && qs2_2 ==false && qs3_1 ==false && qs3_2 ==false && qs4_1 ==false && qs4_2 ==false && qs5_1 ==false && qs5_2 ==false
                && qs6_1 ==false && qs6_2 ==false && qs7_1 ==false && qs7_2 ==false && qs8_1 ==false && qs8_2 ==false && qs9_1 ==false && qs9_2 ==false && qs10_1 ==false && qs10_2 ==false){

            Toast.makeText(QuizActivity.this, "Answer the questions first.",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        if (qs1_1 == true){
            correctCounter++;
            ifWrong1("");
        }
        if (qs1_2 == true){
            wrongCounter++;
            ifWrong1("x");
        }

        if (qs2_1 == true){
            wrongCounter++;
            ifWrong2("x");
        }
        if (qs2_2 == true){
            correctCounter++;
            ifWrong2("");
        }

        if (qs3_1 == true){
            wrongCounter++;
            ifWrong3("x");
        }
        if (qs3_2 == true){
            correctCounter++;
            ifWrong3("");
        }

        if (qs4_1 == true){
            correctCounter++;
            ifWrong4("");
        }
        if (qs4_2 == true){
            wrongCounter++;
            ifWrong4("x");
        }

        if (qs5_1 == true){
            wrongCounter++;
            ifWrong5("x");
        }
        if (qs5_2 == true){
            correctCounter++;
            ifWrong5("");
        }

        if (qs6_1 == true){
            wrongCounter++;
            ifWrong6("x");
        }
        if (qs6_2 == true){
            correctCounter++;
            ifWrong6("");
        }

        if (qs7_1 == true){
            wrongCounter++;
            ifWrong7("x");
        }
        if (qs7_2 == true){
            correctCounter++;
            ifWrong7("");
        }
        if (qs8_1 == true){
            wrongCounter++;
            ifWrong8("x");
        }
        if (qs8_2 == true){
            correctCounter++;
            ifWrong8("");
        }

        if (qs9_1 == true){
            correctCounter++;
            ifWrong9("");
        }
        if (qs9_2 == true){
            wrongCounter++;
            ifWrong9("x");
        }

        if (qs10_1 == true){
            correctCounter++;
            ifWrong10("");
        }
        if (qs10_2 == true){
            wrongCounter++;
            ifWrong10("x");
        }

        resultDisplay(correctCounter,wrongCounter);
    }

    //all the function for if wrong answer print big x
    public void ifWrong1(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs1);
        resultTextView.setText(wrong);
    }
    public void ifWrong2(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs2);
        resultTextView.setText(wrong);
    }
    public void ifWrong3(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs3);
        resultTextView.setText(wrong);
    }
    public void ifWrong4(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs4);
        resultTextView.setText(wrong);
    }
    public void ifWrong5(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs5);
        resultTextView.setText(wrong);
    }
    public void ifWrong6(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs6);
        resultTextView.setText(wrong);
    }
    public void ifWrong7(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs7);
        resultTextView.setText(wrong);
    }
    public void ifWrong8(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs8);
        resultTextView.setText(wrong);
    }
    public void ifWrong9(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs9);
        resultTextView.setText(wrong);
    }
    public void ifWrong10(String wrong) {
        TextView resultTextView = (TextView) findViewById(R.id.if_wrong_qs10);
        resultTextView.setText(wrong);
    }

    //prints the results
    public void resultDisplay(int correct, int wrong) {
        int totalAnswered = correct + wrong;
        int totalScore = correct * 10;
        double percentage = (correct / (double)totalAnswered) * 100;
        String totalString = Integer.toString(correct);
        TextView resultTextView = (TextView) findViewById(R.id.result);
        String totalOutput = "Question answered: " + totalAnswered
                + "\nCorrect answers: " + correct
                + "\nYou scored: " + totalScore
                +"\nPercentage:  " + String.format("%.1f", percentage) + "%";
        resultTextView.setText(totalOutput);
    }

}
