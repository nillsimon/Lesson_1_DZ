package com.example.lesson_1_dz.main.mvp;

import android.support.annotation.NonNull;

import com.example.lesson_1_dz.main.mvc.Model;
import com.example.lesson_1_dz.mosby.MosbyExampleView;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;


public class Presenter implements MvpPresenter<MosbyExampleView> {

    private Model mModel;
    private MainView view;


    public Presenter() {
        this.mModel = new Model();
        this.view = view;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void incSec(){
        int newModelValue = calcNewModelValue(0);
        mModel.setElementValueAtIndex(0, newModelValue);
        view.setSeconds(newModelValue);
    }

    public void incMin(){
        int newModelValue = calcNewModelValue(1);
        mModel.setElementValueAtIndex(1, newModelValue);
        view.setMinute(newModelValue);
    }

    public void incHours(){
        int newModelValue = calcNewModelValue(2);
        mModel.setElementValueAtIndex(2, newModelValue);
        view.setHours(newModelValue);
    }

    @Override
    public void attachView(@NonNull MosbyExampleView view) {

    }

    @Override
    public void detachView(boolean retainInstance) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public void destroy() {

    }

}

