package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText1,editText2;
    private Button addButton,subButton,mulButton,divButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1Id);
        editText2=findViewById(R.id.editText2Id);
        addButton=findViewById(R.id.addButtonId);
        subButton=findViewById(R.id.subButtonId);
        mulButton=findViewById(R.id.mulButtonId);
        divButton=findViewById(R.id.divButtonId);
        resultTextView=findViewById(R.id.resultTextViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        try{
            String number1=editText1.getText().toString();
            String number2=editText2.getText().toString();

            //converting into double
            double num1=Double.parseDouble(number1);
            double num2=Double.parseDouble(number2);

            if(view.getId()==R.id.addButtonId){
                double sum=num1+num2;
                resultTextView.setText("Result : "+sum);
            }
            else if (view.getId()==R.id.subButtonId){
                double sub=num1-num2;
                resultTextView.setText("Result : "+sub);
            }
            else if (view.getId()==R.id.mulButtonId) {
                double mul=num1*num2;
                resultTextView.setText("Result : "+mul);
            }
            else if (view.getId()==R.id.divButtonId) {
                double div=num1/num2;
                resultTextView.setText("Result : "+div);
            }

        }catch(Exception e){

            Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();

        }


    }
}