package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        String a = "1111";
        NumViewModel numViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(NumViewModel.class);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setVm(numViewModel);
        mainBinding.setLifecycleOwner(this);
        mainBinding.textView2.setText(a);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mainBinding.textView2.setText("y1y11y781y");
                mainBinding.edit.setText("这是后来的edittext");
            }
        }, 3000);
        mainBinding.edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                numViewModel.editLiveData.setValue(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}