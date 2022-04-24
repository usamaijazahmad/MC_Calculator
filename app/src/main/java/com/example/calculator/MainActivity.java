package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button divbtn;
    Button mulbtn;
    Button plusbtn;
    Button minbtn;
    Button perc;
    Button acbtn;
    Button eqbtn;
    Button delbtn;
    Button zerobtn;
    Button point;
    Button ansbtn;
    TextView tv;
    TextView tv2;

    private float result;
    private char op;
    private float ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        zerobtn=findViewById(R.id.zerobtn);
        minbtn=findViewById(R.id.minbtn);
        plusbtn=findViewById(R.id.plusbtn);
        divbtn=findViewById(R.id.divbtn);
        mulbtn=findViewById(R.id.mulbtn);
        eqbtn=findViewById(R.id.eqbtn);
        point=findViewById(R.id.point);
        perc=findViewById(R.id.perc);
        delbtn=findViewById(R.id.delbtn);
        acbtn=findViewById(R.id.acbtn);
        ansbtn=findViewById(R.id.ansbtn);
        tv=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView2);

        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '0');
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '1');
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '2');
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '3');
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '4');
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '5');
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '6');
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '7');
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '8');
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '9');
            }
        });

        acbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
                tv2.setText("");

            }
        });

        delbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence name = tv.getText().toString();
                tv.setText(name.subSequence(0, name.length()-1));
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString() + '.');
            }
        });

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='+';
                result = Float.parseFloat(tv.getText().toString());
                tv2.setText(String.valueOf(result)+'+');
                tv.setText("");
            }
        });

        minbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='-';
                result = Float.parseFloat(tv.getText().toString());
                tv2.setText(String.valueOf(result)+'-');
                tv.setText("");
            }
        });

        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='*';
                result = Float.parseFloat(tv.getText().toString());
                tv2.setText(String.valueOf(result)+'x');
                tv.setText("");
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='/';
                result = Float.parseFloat(tv.getText().toString());
                tv2.setText(String.valueOf(result)+'÷');
                tv.setText("");
            }
        });

        perc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value = Float.parseFloat(tv.getText().toString());
                float res = value/100;
                ans=res;
                tv.setText(String.valueOf(res));
            }
        });

        ansbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(String.valueOf(ans));
            }
        });

        eqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op=='+')
                {
                    ans=result + Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(result + Float.parseFloat(tv.getText().toString())));
                }
                if (op == '-')
                {
                    ans=result - Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(result - Float.parseFloat(tv.getText().toString())));
                }
                if (op == '*')
                {
                    ans=result * Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(result * Float.parseFloat(tv.getText().toString())));
                }
                if (op == '/')
                {
                    ans=result / Float.parseFloat(tv.getText().toString());
                    tv.setText(String.valueOf(result / Float.parseFloat(tv.getText().toString())));
                }
                tv2.setText("");
            }
        });

    }

}

