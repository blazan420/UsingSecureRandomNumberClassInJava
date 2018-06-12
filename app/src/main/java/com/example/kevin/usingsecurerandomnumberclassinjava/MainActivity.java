package com.example.kevin.usingsecurerandomnumberclassinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtDiceNumber1 = (TextView)findViewById(R.id.txtDiceNumber1);
        TextView txtDiceNumber2 = (TextView)findViewById(R.id.txtDiceNumber2);
        TextView txtDiceNumber3 = (TextView)findViewById(R.id.txtDiceNumber3);
        TextView txtDiceNumber4 = (TextView)findViewById(R.id.txtDiceNumber4);
        TextView txtDiceNumber5 = (TextView)findViewById(R.id.txtDiceNumber5);
        TextView txtDiceNumber6 = (TextView)findViewById(R.id.txtDiceNumber6);

        Button btnRollTheDice = (Button)findViewById(R.id.btnRollTheDice);

        final SecureRandom secureRandomNumbers = new SecureRandom();
        final int[] occurance = new int[7];

        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                for (int times = 0; times < 5000000; times++) {

                    int randNum = 1 + secureRandomNumbers.nextInt(6);
                    ++occurance[randNum];


                }

                for (int faceNum = 1; faceNum < occurance.length; faceNum++) {

                    if (faceNum == 1) {
                        txtDiceNumber1.setText(occurance[faceNum] + "");
                    }

                }
            }
        });






    }
}
