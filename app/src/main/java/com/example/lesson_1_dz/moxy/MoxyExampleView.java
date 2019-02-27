package com.example.lesson_1_dz.moxy;

import com.arellomobile.mvp.MvpView;

public interface MoxyExampleView  extends MvpView {
    void setOneButtonText(String value);
    void setTwoButtonText(String value);
    void setFreeButtonText(String value);
}
