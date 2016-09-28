package com.example.w0285037.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    private int number = 1; //which number is being used (1,2)
    private double n1 = 0;
    private double n2 = 0;
    private double result;
    private double lastNum;
    private boolean firstNum = true;
    private boolean mult = false;
    private boolean div = false;
    private boolean add = false;
    private boolean sub = false;
    private boolean canDecimal = true;
    private boolean shouldDecimal = false;
    private boolean addZero = false;
    int zeroCount;

    NumberFormat df = DecimalFormat.getInstance();

    Math math = new Math();

    //Create properties
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDec, btnClear, btnPosNeg,
            btnDivision, btnMultiplication, btnAddition, btnSubtraction, btnEquals, btnRmvDigit;
    EditText edtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link properties to controls
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnDec = (Button)findViewById(R.id.btnDec);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnPosNeg = (Button)findViewById(R.id.btnPosNeg);
        btnDivision = (Button)findViewById(R.id.btnDivision);
        btnMultiplication = (Button)findViewById(R.id.btnMultiplication);
        btnAddition = (Button)findViewById(R.id.btnAddition);
        btnSubtraction = (Button)findViewById(R.id.btnSubtraction);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnRmvDigit = (Button)findViewById(R.id.btnRmvDigit);
        edtDisplay = (EditText)findViewById(R.id.edtDisplay);

        //Link handlers to controls
        btn0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = true;
                setNumber(0);
            }
        });

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(1);
                zeroCount = 0;
            }
        });

        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(2);
                zeroCount = 0;
            }
        });

        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(3);
                zeroCount = 0;
            }
        });

        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(4);
                zeroCount = 0;
            }
        });

        btn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(5);
                zeroCount = 0;
            }
        });

        btn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(6);
                zeroCount = 0;
            }
        });

        btn7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(7);
                zeroCount = 0;
            }
        });

        btn8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(8);
                zeroCount = 0;
            }
        });

        btn9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                addZero = false;
                setNumber(9);
                zeroCount = 0;
            }
        });

        btnDec.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNum && canDecimal) {
                    shouldDecimal = true;
                    addText("0.");
                    canDecimal = false;
                }
                else if(canDecimal){
                    shouldDecimal = true;
                    addText(".");
                    canDecimal = false;
                }
            }
        });

        btnClear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                number = 1;
                n1 = 0;
                n2 = 0;
                result = 0;
                lastNum = 0;
                firstNum = true;
                mult = false;
                div = false;
                add = false;
                sub = false;
                canDecimal = true;
                edtDisplay.setText("0");
            }
        });

        btnPosNeg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double nPosNeg = math.makePosNeg(getText());
                String temp = DecimalFormat.getInstance().format(nPosNeg);
                edtDisplay.setText(temp);
            }
        });

        btnDivision.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                div = true;
                mult = false;
                add = false;
                sub = false;
                if(number == 1) {
                    n1 = getText();
                    lastNum = n1;
                    number = 2;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
                else if(number == 2){
                    n2 = getText();
                    lastNum = n2;
                    number = 1;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
            }
        });

        btnMultiplication.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                div = false;
                mult = true;
                add = false;
                sub = false;
                if(number == 1) {
                    n1 = getText();
                    lastNum = n1;
                    number = 2;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
                else if(number == 2){
                    n2 = getText();
                    lastNum = n2;
                    number = 1;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
            }
        });

        btnAddition.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                div = false;
                mult = false;
                add = true;
                sub = false;
                if(number == 1) {
                    n1 = getText();
                    lastNum = n1;
                    number = 2;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
                else if(number == 2){
                    n2 = getText();
                    lastNum = n2;
                    number = 1;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
            }
        });

        btnSubtraction.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                div = false;
                mult = false;
                add = false;
                sub = true;
                if(number == 1) {
                    n1 = getText();
                    lastNum = n1;
                    number = 2;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
                else if(number == 2){
                    n2 = getText();
                    lastNum = n2;
                    number = 1;
                    firstNum = true;
                    canDecimal = true;
                    zeroCount = 0;
                }
            }
        });

        btnEquals.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number == 1) {
                    number = 2;
                    n1 = getText();
                    canDecimal = true;
                    zeroCount = 0;
                }
                else {
                    number = 1;
                    n2 = getText();
                    canDecimal = true;
                    zeroCount = 0;
                }
                try {
                    if (mult) {
                        result = math.multiplication(n1, n2);
                        lastNum = result;

                        String temp = DecimalFormat.getInstance().format(result);

                        edtDisplay.setText(temp);
                    }
                    else if (div) {
                        result = math.division(n1, n2);
                        lastNum = result;

                        String temp = DecimalFormat.getInstance().format(result);

                        edtDisplay.setText(temp);
                    }
                    else if(add) {
                        result = math.addition(n1, n2);
                        lastNum = result;

                        String temp = DecimalFormat.getInstance().format(result);

                        edtDisplay.setText(temp);
                    }
                    else if (sub) {
                        result = math.subtraction(n1, n2);
                        lastNum = result;

                        String temp = DecimalFormat.getInstance().format(result);

                        edtDisplay.setText(temp);
                    }
                }
                catch(IllegalArgumentException e){
                    edtDisplay.setText("Cannot divide by zero");

                }
            }
        });

        btnRmvDigit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = removeChar(edtDisplay.getText().toString());
                edtDisplay.setText(temp);
            }
        });

    }//end onCreate

    protected void setNumber(int n){
        if(number == 1){
            String temp = DecimalFormat.getInstance().format(n);
            addText(temp);
        }else if(number == 2){
            String temp = DecimalFormat.getInstance().format(n);
            addText(temp);
        }
    }//end setNumber

    protected void addText(String s){
        if (edtDisplay.getText().toString().equals("Cannot divide by zero")) {
            String temp = "" + s;
            edtDisplay.setText(temp);
            firstNum = true;
        }
        if (firstNum && getText() == lastNum) {
            firstNum = false;
            String temp = "" + s;
            edtDisplay.setText(temp);
        }
        else{
            String t;
            String temp = "";
            double tmp = getText();
            if (!addZero && zeroCount == 0) {
                if (tmp == (long) tmp) {
                    t = String.format("%d", (long) tmp);
                    temp = t + s;
                } else {
                    t = String.format("%s", tmp);
                    temp = t + s;
                }
                if (shouldDecimal) {
                    temp = t + s;
                    shouldDecimal = false;
                }
            }
            if (zeroCount > 0){
                temp = Double.toString(tmp) + s;
            }
            if (addZero){
                if (zeroCount > 0) {
                    temp = tmp + "0";
                }
                else{
                    temp = Double.toString(tmp);
                    zeroCount += 1;
                }
            }
            edtDisplay.setText(temp);
        }
    }//end addText

    public String removeChar(String str) {//code acquired from http://stackoverflow.com/questions/7438612/how-to-remove-the-last-character-from-a-string
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length()-1);
        }
        if (str.equals(""))
            str = "0";
        return str;
    }//end removeChar

    public Double getText(){
        double text = 0;
        try{
            text = df.parse(edtDisplay.getText().toString()).doubleValue();
        }catch(ParseException e){
            e.printStackTrace();
        }
        return text;
    }

}//end main
