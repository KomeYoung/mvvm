package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        NumViewModel numViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(NumViewModel.class);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setVm(numViewModel);
        mainBinding.setLifecycleOwner(this);


    }
}