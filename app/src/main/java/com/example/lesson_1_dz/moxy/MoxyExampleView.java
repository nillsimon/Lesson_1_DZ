package com.example.lesson_1_dz.moxy;

import com.arellomobile.mvp.MvpView;

public interface MoxyExampleView extends MvpView {
    void setButtonText(int btnIndex, int value);
}