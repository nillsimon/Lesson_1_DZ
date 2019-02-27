package com.example.lesson_1_dz.moxy;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.lesson_1_dz.R;

@InjectViewState
public class Presenter extends MvpPresenter<MoxyExampleView> {
    private IModel mModel;

    Presenter(IModel model) {
        this.mModel = model;
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        Log.d("Dto", "first attach");
    }

    @Override
    public void attachView(MoxyExampleView view) {
        super.attachView(view);
        Log.d("Dto", "attach view");
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void onAction(ActionType type){
        int newModelValue;
        String viewValue = "Количество = ";
        switch (type) {
            case ONE:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                getViewState().setOneButtonText(viewValue + newModelValue);
                break;
            case TWO:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                getViewState().setTwoButtonText(viewValue + newModelValue);
                break;
            case FREE:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                getViewState().setFreeButtonText(viewValue + newModelValue);
                break;
    }
}
}
