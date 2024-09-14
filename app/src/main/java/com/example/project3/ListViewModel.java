package com.example.project3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ListViewModel extends ViewModel {
    private final MutableLiveData<Integer> selectedItem = new MutableLiveData<Integer>();
    public void selectItem(Integer item) {
        selectedItem.setValue(item);
    }
    public LiveData<Integer> getSelectedItem() {
        return selectedItem;
    }
}
