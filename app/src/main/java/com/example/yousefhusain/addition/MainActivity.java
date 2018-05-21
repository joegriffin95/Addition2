package com.example.yousefhusain.addition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbtn = (Button) findViewById(R.id.add_btn); // find button
        addbtn.setOnClickListener(new View.OnClickListener() // on click
        {
            @Override
            public void onClick(View v)
            {
                EditText num1_txt = (EditText) findViewById(R.id.num1_edit_txt); // find num1
                EditText num2_txt = (EditText) findViewById(R.id.num2_edit_txt);// find num2
                TextView result_txt = (TextView) findViewById(R.id.result_txtv);// find result

                int num1 = Integer.parseInt(num1_txt.getText().toString()); // convert to int
                int num2 = Integer.parseInt(num2_txt.getText().toString());// convert to int
                int result = num1 + num2; // add
                result_txt.setText(result + ""); // print result

            }
        });
    }
}
