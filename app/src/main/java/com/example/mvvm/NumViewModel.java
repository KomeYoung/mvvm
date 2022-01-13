package com.example.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Company    : 上海动博士企业发展有限公司
 *
 * @author : kome
 * E-mail     : 17629052324@163.com
 * Date       : 2021/11/16
 * Description:
 */
public class NumViewModel extends ViewModel {
    private int num = 0;
    public MutableLiveData<String> mutableLiveData;
    public MutableLiveData<String> editLiveData;
    public MutableLiveData<String> imageLiveData;


    public NumViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("123456");
        imageLiveData = new MutableLiveData<>();
//        imageLiveData.setValue("https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3248357717,1973320706&fm=26&gp=0.jpg");
        imageLiveData.setValue("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2F1113%2F033120123529%2F200331123529-4-1200.jpg&refer=http%3A%2F%2Fimg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639647580&t=ed5dc8a70c580071b35c6407fbc9c8ce");
        editLiveData = new MutableLiveData<>();
        editLiveData.setValue("jjjjj");
    }

    public void plusNum(){
        mutableLiveData.setValue(String.valueOf(num++));
//        imageLiveData.setValue("https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3248357717,1973320706&fm=26&gp=0.jpg");
        imageLiveData.setValue("111");
    }
}
