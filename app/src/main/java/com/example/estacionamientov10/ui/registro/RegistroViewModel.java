package com.example.estacionamientov10.ui.registro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegistroViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegistroViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("registro de parqueo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}