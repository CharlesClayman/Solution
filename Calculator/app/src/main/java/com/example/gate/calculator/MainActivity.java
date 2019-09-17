package com.example.gate.calculator;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigDecimal;
import java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {
    TextView output1,output2;
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,times,divide,dot,equalto,clear,CE;
    String s,action,value;
    BigDecimal result;
    Double res;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.onebtn);
        two=findViewById(R.id.twobtn);
        three=findViewById(R.id.threebtn);
        four=findViewById(R.id.fourbtn);
        five=findViewById(R.id.fivebtn);
        six=findViewById(R.id.sixbtn);
        seven=findViewById(R.id.sevenbtn);
        eight=findViewById(R.id.eightbtn);
        nine=findViewById(R.id.ninebtn);
        zero=findViewById(R.id.zerobtn);
        plus=findViewById(R.id.plusbtn);
        minus=findViewById(R.id.minusbtn);
        times=findViewById(R.id.mulbtn);
        divide=findViewById(R.id.divbtn);
        dot=findViewById(R.id.dotbtn);
        equalto=findViewById(R.id.equalsbtn);
        clear=findViewById(R.id.clearbtn);
        output1=findViewById(R.id.output1);
        output2=findViewById(R.id.output2);
        CE = findViewById(R.id.cebtn);


        CE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!output1.getText().toString().isEmpty()) {
                    s = output1.getText().toString();
                    s = s.substring( 0,s.length() - 1);
                    output1.setText(s);
                }
            }
        });

       CE.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               output1.setText("");
               return true;
           }
       });

       clear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               output1.setText("");
               output2.setText("");
               counter=0;
               dot.setEnabled(true);
           }
       });

       one.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(output1.length()>19){
                 Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
               }else
               output1.append("1");
           }
       });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digits(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.length()>19){
                    Toast.makeText(MainActivity.this,"Maximum number of digit(20) allowed",Toast.LENGTH_SHORT).show();
                }else
                    output1.append("0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (output1.length() > 19) {
                    Toast.makeText(MainActivity.this, "Maximum number of characters(20) allowed", Toast.LENGTH_SHORT).show();
                } else {
                    if (counter == 0) {
                        output1.append(".");
                        counter = counter + 1;
                        dot.setEnabled(false);
                    } else if (counter >= 1) {
                        dot.setEnabled(false);
                    }
                }
            }



        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output2.getText().toString().isEmpty() ) {
                    output2.setText(output1.getText().toString());
                    output1.setText("");
                    action = "+";
                    counter=0;
                    dot.setEnabled(true);
                }else{
                    output1.setText("");
                    action="+";
                    counter=0;
                    dot.setEnabled(true);
                }
                equalto.setEnabled(true);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.getText().toString().isEmpty()) {
                    output1.append("-");
                }
                else
                    if (output2.getText().toString().isEmpty()) {
                        output1.setText("");
                        action = "-";
                        counter=0;
                        dot.setEnabled(true);
                      return;
                    }
                    else {

                        output1.setText("");
                        action = "-";
                        counter=0;
                        dot.setEnabled(true);
                    }
                    equalto.setEnabled(true);

            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output2.getText().toString().isEmpty() ) {
                    output2.setText(output1.getText().toString());
                    output1.setText("");
                    action = "x";
                    counter=0;
                    dot.setEnabled(true);
                }else{
                    output1.setText("");
                    action="x";
                    counter=0;
                    dot.setEnabled(true);
                }
                equalto.setEnabled(true);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output2.getText().toString().isEmpty() ) {
                    output2.setText(output1.getText().toString());
                    output1.setText("");
                    action = "/";
                    counter=0;
                    dot.setEnabled(true);
                }else{
                    output1.setText("");
                    action="/";
                    counter=0;
                    dot.setEnabled(true);
                }
                equalto.setEnabled(true);
            }
        });

        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output1.getText().toString().isEmpty())
                {
                    return;
                }else{
                    if (action=="+") {
                        res = Double.parseDouble(output2.getText().toString()) + Double.parseDouble(output1.getText().toString());
                        res=Math.round(res*1000.0)/1000.0;
                        result=BigDecimal.valueOf(res);
                        output2.setText(result.toString());
                    }
                    else if(action=="-"){
                        res = Double.parseDouble(output2.getText().toString()) - Double.parseDouble(output1.getText().toString());
                        res=Math.round(res*1000.0)/1000.0;
                        result=BigDecimal.valueOf(res);
                        output2.setText(result.toString());
                        }
                    else if(action=="x"){
                        res = Double.parseDouble(output2.getText().toString()) * Double.parseDouble(output1.getText().toString());
                        res=Math.round(res*1000.0)/1000.0;
                        result=BigDecimal.valueOf(res);
                        output2.setText(result.toString());
                    }
                    else if(action=="/"){
                        res = Double.parseDouble(output2.getText().toString()) / Double.parseDouble(output1.getText().toString());
                        res=Math.round(res*1000.0)/1000.0;
                        result=BigDecimal.valueOf(res);
                            output2.setText(result.toString());
                    }
                    equalto.setEnabled(false);
                }
            }
        }); }

}
