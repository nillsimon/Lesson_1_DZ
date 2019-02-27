package com.example.lesson_1_dz.moxy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.PresenterType;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.example.lesson_1_dz.R;

import static com.example.lesson_1_dz.moxy.ActionType.ONE;

public class MoxyMainActivity extends MvpAppCompatActivity
        implements MoxyExampleView, View.OnClickListener {

    @InjectPresenter(type = PresenterType.LOCAL)
    Presenter presenter;

    @ProvidePresenter(type = PresenterType.LOCAL)
    Presenter providePresenter(){
        return new Presenter(new Model());
    }

    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCounter1: {
                presenter.onAction(ActionType.ONE);
                btnCounter1.setBackgroundColor(Color.WHITE);
                break;
            }
            case R.id.btnCounter2: {
                presenter.onAction(ActionType.TWO);
                btnCounter2.setBackgroundColor(Color.YELLOW);
                break;

            }
            case R.id.btnCounter3: {
                presenter.onAction(ActionType.FREE);
                btnCounter3.setBackgroundColor(Color.BLUE);
                btnCounter3.setTextColor(Color.WHITE);
                break;
            }

        }
    }

    @Override
    public void setOneButtonText(String value) {
        btnCounter1.setText(value);
    }

    @Override
    public void setTwoButtonText(String value) {
        btnCounter2.setText(value);

    }

    @Override
    public void setFreeButtonText(String value) {
        btnCounter3.setText(value);

    }
}
