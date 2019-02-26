package com.example.lesson_1_dz.main.mvp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson_1_dz.R;

public class MvpMainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = (Button) findViewById(R.id.btnCounter1);
        btnCounter2 = (Button) findViewById(R.id.btnCounter2);
        btnCounter3 = (Button) findViewById(R.id.btnCounter3);
        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);
        mPresenter = new Presenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCounter1: {
                mPresenter.incSec();
                btnCounter1.setBackgroundColor(Color.GREEN);
                break;
            }
            case R.id.btnCounter2: {
                mPresenter.incMin();
                btnCounter2.setBackgroundColor(Color.YELLOW);
                break;
            }
            case R.id.btnCounter3:{
                mPresenter.incHours();
                btnCounter3.setBackgroundColor(Color.RED);
                break;
            }
        }
    }

    @Override
    public void setSeconds(int value) {
        btnCounter1.setText("Количество = " + value);
    }

    @Override
    public void setMinute(int value) {
        btnCounter2.setText("Количество = " + value);
    }

    @Override
    public void setHours(int value) {
        btnCounter3.setText("Количество = " + value);
    }
}

