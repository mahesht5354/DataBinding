package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    MainViewmodel mainViewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewmodel = new ViewModelProvider(this).get(MainViewmodel.class);
        binding.setViewmodel(mainViewmodel);
        //binding.getViewmodel()(this);




        //binding.result.setText(String.valueOf(mainViewmodel.count));

        //binding.result.setText(String.valueOf(mainViewmodel.count.getValue()));

//        binding.plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mainViewmodel.increment();
//                //binding.result.setText((String.valueOf(mainViewmodel.count)));
//            }
//        });

        /*binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewmodel.decrement();
                //binding.result.setText(String.valueOf(mainViewmodel.count));
            }
        });*/

        mainViewmodel.count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.result.setText(String.valueOf(mainViewmodel.count.getValue()));
            }
        });

    }
}