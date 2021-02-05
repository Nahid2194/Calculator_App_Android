package com.example.calculator_original;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview,secondview;
    String secondvalue,operator;
    double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstview = findViewById(R.id.firstTextView);
        secondview = findViewById(R.id.secondTextView);

    }

    public void digitFunction(View view) {
        secondvalue = secondview.getText().toString();
        if(view.getId()==R.id.zeroButtonID){
            if(secondvalue.equals("0")){
                secondview.setText("0");
            }else{
                secondview.setText(secondvalue+"0");
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
        secondvalue = secondview.getText().toString();
        num1 = Double.parseDouble(secondvalue);
        if(view.getId()== R.id.addButtonID){
            operator = "+";

        }else if(view.getId()==R.id.subButtonID){
            operator = "-";
        }else if(view.getId()==R.id.multiButtonID){
            operator = "*";
        }else if(view.getId()==R.id.percentButtonId){
            operator = "%";
        } else {
            operator = "/";
        }
        firstview.setText(secondvalue+""+operator);
        secondview.setText("0");
    }

    public void pointFunction(View view) {
//        secondvalue = secondview.getText().toString();
//        int value = secondvalue.length()-1;
//        if(secondvalue.substring(0,value).equals(".")){
//        secondview.setText(secondvalue+"");
//        }else{
//        secondview.setText(secondvalue+".");
//        }

        String s = secondview.getText().toString();
        boolean check = s.contains(".");
        if (check){
            secondview.setText(s+"");
        }else{
            secondview.setText(s+".");

        }

    }

    public void clearFunction(View view) {
        secondview.setText("0");
        firstview.setText("");
        num1=0;
        num2=0;

    }

    public void ceFunction(View view) {

        secondview.setText("0");
    }

    public void resultFunction(View view) {
        num2 = Double.parseDouble(secondview.getText().toString());
        if(operator.equals("+")){
            result=num1+num2;
        }else if(operator.equals("-")){
            result=num1-num2;
        }else if (operator.equals("*")){
            result=num1*num2;
        }else if (operator.equals("/")){
            result=num1/num2;
        }
        firstview.setText(num1+" "+operator+" "+num2+" = "+" "+result);
        secondview.setText(""+result);

    }

    public void deleteFunction(View view) {
        String s = secondview.getText().toString();
        String end = s.substring(0, s.length() - 1);
        secondview.setText(""+end);

    }
}