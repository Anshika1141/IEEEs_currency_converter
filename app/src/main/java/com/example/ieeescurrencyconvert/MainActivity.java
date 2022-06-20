package com.example.ieeescurrencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button conbtn;
    EditText amt;
    Double amount_inr=0.0;
    Double amount_euro=0.0;
    Double amount_won=0.0;
    CheckBox ind;
    CheckBox eur;
    CheckBox kor;
    TextView answer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conbtn=findViewById(R.id.con);
        amt=findViewById(R.id.amtinusd);
        ind=findViewById(R.id.inr);
        eur=findViewById(R.id.euro);
        kor=findViewById(R.id.skw);
        answer=findViewById(R.id.ans);





        conbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_amt=amt.getText().toString();
                Double int_amt=Double.parseDouble(str_amt);

                if(ind.isChecked()){
                    amount_inr=77.94;
                    Double total_amt=int_amt*amount_inr;
                    String summary=String.valueOf(total_amt)+" rupees";
                    answer.setText(summary);
                }
                if(eur.isChecked()){
                    amount_euro=0.94;
                    Double total_amt=int_amt*amount_euro;
                    String summary=String.valueOf(total_amt)+" euro";
                    answer.setText(summary);
                }
                if(kor.isChecked()){
                    amount_won=1292.03;
                    Double total_amt=int_amt*amount_won;
                    String summary=String.valueOf(total_amt)+" won";
                    answer.setText(summary);
                }



            }
        });



    }
}