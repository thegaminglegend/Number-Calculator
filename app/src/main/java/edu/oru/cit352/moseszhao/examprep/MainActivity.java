package edu.oru.cit352.moseszhao.examprep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAddButton();
        initMultiButton();
        initSubButton();
    }


    private void initAddButton(){
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber2);
        TextView answer = findViewById(R.id.textViewAnswerNumber);
        Button add = findViewById(R.id.buttonAdd);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                String answerNumber = String.valueOf(number1 + number2);
                answer.setText(answerNumber);
            }
        });
    }

    private void initSubButton(){
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber2);
        TextView answer = findViewById(R.id.textViewAnswerNumber);
        Button sub = findViewById(R.id.buttonSubtract);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                String answerNumber = String.valueOf(number1 - number2);
                answer.setText(answerNumber);
            }
        });
    }

    private void initMultiButton(){
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber2);
        TextView answer = findViewById(R.id.textViewAnswerNumber);
        Button mul = findViewById(R.id.buttonMultiplication);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                String answerNumber = String.valueOf(number1 * number2);
                answer.setText(answerNumber);
            }
        });
    }

}