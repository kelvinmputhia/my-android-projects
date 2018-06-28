package com.kelvin.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mAnswer;
    EditText mfirstNUmber,SecondNumber;
    Button mAdd,mSubtract,mmultiply,mdivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAnswer =findViewById(R.id.tvAnswer);
        mfirstNUmber =findViewById(R.id.edtFnum);
        SecondNumber =findViewById(R.id.edtSnum);
        mAdd =findViewById(R.id.btnAdd);
        mSubtract = findViewById(R.id.btnSubtract);
        mdivide = findViewById(R.id.btndivide);
        mmultiply = findViewById(R.id.btnmutpl);
        mAdd.setOnClickListener(this);
        mSubtract.setOnClickListener(this);
        mdivide.setOnClickListener(this);
        mmultiply.setOnClickListener(this);

    }
    public void onClick(View View) {
        String fnum = mfirstNUmber.getText().toString();
        String snum = SecondNumber.getText().toString();
        if (fnum.isEmpty() || snum.isEmpty()) {
            Toast.makeText(this, "Fill all the inputs", Toast.LENGTH_SHORT).show();
        } else {
            switch (View.getId()) {
                case R.id.btnAdd:
                    double addition = Double.parseDouble(fnum) + Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(addition));
                    break;
                case R.id.btnSubtract:
                    double subtract = Double.parseDouble(fnum) - Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(subtract));
                case R.id.btnmutpl:
                    double multiplication = Double.parseDouble(fnum) * Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(multiplication));
                    break;
                case R.id.btndivide:
                    double divide = Double.parseDouble(fnum) / Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(divide));
                    break;

                default:
                    Toast.makeText(this, "Enter two Number before doing calculation", Toast.LENGTH_SHORT).show();

            }
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

