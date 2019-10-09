package com.example.pedro.dogage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    ImageView mIVdog;
    TextView mTvquestion, mTVresult;
    EditText mEtAGE;
    Button mBtn;
    int mult = 5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIVdog = findViewById(R.id.ivDog);
        mTvquestion = findViewById(R.id.questionTv);
        mTVresult = findViewById(R.id.TVresult);
        mEtAGE = findViewById(R.id.ageEt);
        mBtn = findViewById(R.id.btn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = mEtAGE.getText().toString();

                if (result.isEmpty()) {
                  //  Toast toast = new Toast(MainActivity.this);
                    Toast.makeText(MainActivity.this , "Insert Number" , Toast.LENGTH_SHORT).show();


                } else {

                    int resultNumber = Integer.parseInt(result);

                    int resultFinal = resultNumber * mult;
                    mTVresult.setText("The dod age in Human years is : " + resultFinal);
                }


            }
        });
    }
}
