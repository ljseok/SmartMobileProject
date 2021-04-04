package com.example.smartmobileproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mButton , mButton2;
    TextView mTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=findViewById(R.id.button);
        mButton2=findViewById(R.id.button2);
        mTextView2=findViewById(R.id.textView2);

        mButton.setOnClickListener(this);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button : mTextView2.setText("취소되었습니다.");
                break;
            case R.id.button2 : mTextView2.setText("완료되었습니다.");
                break;
            default:
                break;
        }
    }
}