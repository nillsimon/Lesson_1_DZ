package com.example.lesson_1_dz.mosby;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson_1_dz.R;
import com.hannesdorfmann.mosby3.mvp.MvpActivity;


public class  MosbyMainActivity extends MvpActivity<MosbyExampleView, Presenter>
        implements MosbyExampleView, View.OnClickListener {

    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;
    //private Presenter mPresenter;

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

    }

    @NonNull
    @Override
    public Presenter createPresenter() {
        return new Presenter();
    }

    @Override
    public void onClick(View v) {
        presenter.buttonClick(v.getId());
    }

    @Override
    public void setButtonText(int btnIndex, int value) {
        switch (btnIndex) {
            case 1:
                btnCounter1.setText("Количество = " + value);
                btnCounter1.setBackgroundColor(Color.WHITE);

                break;
            case 2:
                btnCounter2.setText("Количество = " + value);
                btnCounter2.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                btnCounter3.setText("Количество = " + value);
                btnCounter3.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}
