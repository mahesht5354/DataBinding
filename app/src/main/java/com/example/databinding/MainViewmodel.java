package com.example.databinding;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

public class MainViewmodel extends ViewModel {


   /* private val _name = MutableLiveData("Ada")
    private val _lastName = MutableLiveData("Lovelace")
    private val _likes =  MutableLiveData(0)

    val name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    val likes: LiveData<Int> = _likes*/

    //int count;
    public MutableLiveData<Integer> count;
    public MutableLiveData<String> result;

    public MainViewmodel() {
        //count = 0;
        count = new MutableLiveData<>();
        result = new MutableLiveData<>();
        result.setValue("0");
        count.setValue(0);
        Log.i("Main", "MainViewModel is created");

        /*count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                result.setValue(String.valueOf(count.getValue()));
            }
        });*/

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("Main", "MainViewModel is destroyed");
    }



    public void increment()
    {

        count.setValue(count.getValue() + 1);
        result.setValue(String.valueOf(count.getValue()));
        //count++;
    }

    public void decrement()
    {

        count.setValue(count.getValue() - 1);
        result.setValue(String.valueOf(count.getValue()));
        //count--;
    }



}
