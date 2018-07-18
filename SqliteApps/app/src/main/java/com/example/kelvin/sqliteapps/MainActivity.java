package com.example.kelvin.sqliteapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper mydb;
    EditText editname,editsurname,editmarks;
    Button btnadd,btnview,btnupdte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb= new DatabaseHelper(this);
        editname = findViewById(R.id.editname);
        editsurname = findViewById(R.id.editsurname);
        editmarks = findViewById(R.id.editmarks);
        btnadd =findViewById(R.id.button);
        btnview=findViewById(R.id.btnview);
        add();
        view();


    }
    public  void ADD(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               boolean isInserted= mydb.insertdata(editname.getText().toString(),
                       editsurname.getText().toString(),
                       editmarks.getText().toString());
               if (isInserted =true)
                   Toast.makeText(MainActivity.this, "Data Inserted,", Toast.LENGTH_SHORT).show();
               else
                   Toast.makeText(MainActivity.this, "Data not Instered", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
