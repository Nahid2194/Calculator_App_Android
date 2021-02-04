package com.example.calculator_original;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview,secondview;
    String secondvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstview = findViewById(R.id.firstTextView);
        secondview = findViewById(R.id.secondTextView);
    }

    public void digitFunction(View view) {
        secondvalue = secondview.getText().toString();
        secondview.setText("0");
        if(view.getId()==R.id.zeroButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("0");
            }else{
                secondview.setText(secondvalue+"");
            }
        }
        else if(view.getId()==R.id.oneButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("1");
            }else {
                secondview.setText(secondvalue+"1");
            }
        }
        else if(view.getId()==R.id.twoButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("2");
            }else {
                secondview.setText(secondvalue+"3");
            }
        }
        else if(view.getId()==R.id.threeButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("3");
            }else {
                secondview.setText(secondvalue+"3");
            }
        }
        else if(view.getId()==R.id.fourButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("4");
            }else {
                secondview.setText(secondvalue+"4");
            }
        }
        else if(view.getId()==R.id.fiveButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("5");
            }else {
                secondview.setText(secondvalue+"5");
            }
        }
        else if(view.getId()==R.id.sixButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("6");
            }else {
                secondview.setText(secondvalue+"6");
            }
        }
        else if(view.getId()==R.id.sevenButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("7");
            }else {
                secondview.setText(secondvalue+"7");
            }
        }
        else if(view.getId()==R.id.eightButtonID){
            if(secondvalue.equals("0")) {
                secondview.setText("8");
            } else {
                secondview.setText(secondvalue+"8");
            }
        }
        else{
            if(secondvalue.equals("0")){
                secondview.setText("9");
            }else {
                secondview.setText(secondvalue+"9");
            }
        }
    }

    public void operatorFunction(View view) {
    }

    public void pointFunction(View view) {
        secondvalue = secondview.getText().toString();
        secondview.setText(secondvalue+".");
    }

    public void clearFunction(View view) {
        firstview.setText("");
        secondview.setText("");
    }

    public void ceFunction(View view) {
        secondview.setText("");
    }
}