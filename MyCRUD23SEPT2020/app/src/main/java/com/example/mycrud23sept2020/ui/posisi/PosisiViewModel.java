package com.example.mycrud23sept2020.ui.posisi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PosisiViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PosisiViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is posisi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
