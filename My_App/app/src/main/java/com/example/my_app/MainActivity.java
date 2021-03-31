package com.example.my_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText display ;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display= findViewById(R.id.enter_value);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.display).equals(display.getText().toString()))
                {
                    display.setText("");
                }
            }
        });

    }

    private void updateText(String toAdd){
        String old_str=display.getText().toString();
        int cursor_pos=display.getSelectionStart();
        String left_string=old_str.substring(0,cursor_pos);
        String right_string=old_str.substring(cursor_pos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(toAdd);

        }
        else{
            display.setText(String.format("%s%s%s",left_string,toAdd,right_string));

        }
        display.setSelection(cursor_pos+1);
    }

    public void zeroBTN(View view){
        updateText("0");

    }

    public void oneBTN(View view){
        updateText("1");

    }
    public void twoBTN(View view){
        updateText("2");

    }
    public void threeBTN(View view){
        updateText("3");

    }
    public void fourBTN(View view){
        updateText("4");

    }
    public void fiveBTN(View view){
        updateText("5");

    }
    public void sixBTN(View view){
        updateText("6");

    }
    public void sevenBTN(View view){
        updateText("7");

    }
    public void eightBTN(View view){
        updateText("8");

    }
    public void nineBTN(View view){
        updateText("9");

    }
    public void addBTN(View view){
        updateText("+");

    }
    public void subBTN(View view){
        updateText("-");

    }
    public void mulBTN(View view){
        updateText("*");

    }
    public void divBTN(View view){
        updateText("/");

    }
    public void equBTN(View view){
        String old_str=display.getText().toString();
        int operator_pos=old_str.indexOf('+');
        String n1=old_str.substring(0,operator_pos);
        String n2=old_str.substring(operator_pos+1,old_str.length());

        int a1=Integer.parseInt(n1);
        int a2=Integer.parseInt(n2);

        int res=a1+a2;

        String ans=""+res;
        display.setText(ans);


    }
    public void clrBTN(View view){
        display.setText("");

    }

}