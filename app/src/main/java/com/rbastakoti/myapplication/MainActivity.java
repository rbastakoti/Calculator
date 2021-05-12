package com.rbastakoti.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rbastakoti.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private final Calculator calculator;
    private TextView display;

    public MainActivity(){
        super();
        calculator = new Calculator();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = this.findViewById(R.id.display);

        this.findViewById(R.id.buttonZero).setOnClickListener(view -> {
            handleInput(0);
        });

        this.findViewById(R.id.buttonOne).setOnClickListener(view -> {
            handleInput(1);
        });

        this.findViewById(R.id.buttonTwo).setOnClickListener(view -> {
            handleInput(2);
        });

        this.findViewById(R.id.buttonThree).setOnClickListener(view -> {
            handleInput(3);
        });

        this.findViewById(R.id.buttonFour).setOnClickListener(view -> {
            handleInput(4);
        });

        this.findViewById(R.id.buttonFive).setOnClickListener(view -> {
            handleInput(5);
        });

        this.findViewById(R.id.buttonSix).setOnClickListener(view -> {
            handleInput(6);
        });

        this.findViewById(R.id.buttonSeven).setOnClickListener(view -> {
            handleInput(7);
        });

        this.findViewById(R.id.buttonEight).setOnClickListener(view -> {
            handleInput(8);
        });

        this.findViewById(R.id.buttonNine).setOnClickListener(view -> {
            handleInput(9);
        });

        this.findViewById(R.id.buttonPlus).setOnClickListener(view -> {
            handleOperator(Operator.ADD);
        });

        this.findViewById(R.id.buttonMinus).setOnClickListener(view -> {
            handleOperator(Operator.SUBTRACT);
        });

        this.findViewById(R.id.buttonMultiply).setOnClickListener(view -> {
            handleOperator(Operator.MULTIPLY);
        });

        this.findViewById(R.id.buttonDivide).setOnClickListener(view -> {
            handleOperator(Operator.DIVIDE);
        });

        this.findViewById(R.id.buttonEqual).setOnClickListener(view -> {
            calculator.equals();
            display.setText(calculator.getInput());

        });

        this.findViewById(R.id.buttonClear).setOnClickListener(view -> {
           calculator.clearInput();
           display.setText("0");
        });

        this.findViewById(R.id.buttonDot).setOnClickListener(view -> {
            calculator.dot();
            display.setText(calculator.getInput());
        });

        this.findViewById(R.id.buttonPercent).setOnClickListener(view -> {
            calculator.percent();
            display.setText(calculator.getInput());
        });

        this.findViewById(R.id.buttonSign).setOnClickListener(view -> {
            calculator.plusMinus();
            display.setText(calculator.getInput());
        });



    }

    private void handleInput(Integer number) {
        calculator.inputNumber(number);
        display.setText(calculator.getInput());
    }
    private void handleOperator(Operator operator){
        calculator.inputOperator(operator);
        display.setText(calculator.getInput());
    }


}
