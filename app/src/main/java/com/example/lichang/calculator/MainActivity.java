package com.example.lichang.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * @author F4Group
 */
public  class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    //TODO 声明些控件
    Button btNub1 ;
    TextView showNumber;
    String number = " " ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showNumber = findViewById(R.id.textShow);
        btNub1 = findViewById(R.id.Nub1);
        btNub1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Nub1:
                number = number+"1";
                showNumber.setText(number);
                break;
        }
        Toast.makeText(MainActivity.this,"被点击",Toast.LENGTH_SHORT).show();

    }
}
