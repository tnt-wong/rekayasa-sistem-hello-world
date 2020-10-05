package com.example.mycrud23sept2020.ui.pegawai;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PegawaiViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PegawaiViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is pegawai fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
