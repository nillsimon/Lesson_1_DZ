package com.example.lesson_1_dz.mosby;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface MosbyExampleView extends MvpView {
    void setButtonText(int btnIndex, int value);
}
