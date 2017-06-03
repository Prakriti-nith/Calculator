package gupta.p.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDot,btnDivide,btnEquals,btnMultiply,btnAdd,btnMinus,btnDel;
    TextView editTextCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCal = (TextView) findViewById(R.id.editTextCal);

        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0") || value.equals("∞"));
                else {
                    editTextCal.append("0");
                }
            }
        });

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("1");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("1");
                }
            }
        });
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("2");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("2");
                }
            }
        });

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("3");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("3");
                }
            }
        });
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("4");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("4");
                }
            }
        });
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("5");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("5");
                }
            }
        });
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("6");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("6");
                }
            }
        });
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("7");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("7");
                }
            }
        });
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("8");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("8");
                }
            }
        });
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("0")) {
                    editTextCal.setText("9");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("9");
                }
            }
        });
        btnDot = (Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("∞"));
                else {
                    editTextCal.append(".");
                }
            }
        });
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                    editTextCal.setText("/");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("/");
                }
            }
        });
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                    editTextCal.setText("*");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("*");
                }
            }
        });
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                    editTextCal.setText("-");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("-");
                }
            }
        });
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editTextCal.getText().toString();
                if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                    editTextCal.setText("+");
                }
                else if(value.equals("∞"));
                else {
                    editTextCal.append("+");
                }
            }
        });
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = editTextCal.getText().toString();
                PostFixConverter pc = new PostFixConverter(expression);
                PostFixCalculator calc = new PostFixCalculator(pc.getPostfixAsList());
                BigDecimal num=new BigDecimal("6876809.424");
                if (calc.result().compareTo(num)==0)
                    editTextCal.setText("∞");
                else {
                    String calculated=calc.result().toString();
                    int cnt=0,ptr=calculated.length()-1;
                    while(calculated.charAt(ptr)=='0') {
                        cnt++;
                        ptr--;
                    }
                    if(cnt==3)
                        cnt=4;
                    calculated=calculated.substring(0,calculated.length()-cnt);
                    editTextCal.setText(calculated);
                }
            }
        });
        btnDel = (Button) findViewById(R.id.btnDel);
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextCal.getText().toString();
                if (value.equals("")) ;
                else {
                    value = value.substring(0, value.length() - 1);
                    editTextCal.setText(value);
                }
            }
        });
        btnDel.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                editTextCal.setText("");
                return true;
            }
        });
    }
}

