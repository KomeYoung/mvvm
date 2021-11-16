package com.example.mvvm;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Company    : 上海动博士企业发展有限公司
 *
 * @author : kome
 * E-mail     : 17629052324@163.com
 * Date       : 2021/11/16
 * Description:
 */
public class ImageAdapter {

    @BindingAdapter(value = {"imageUrl", "placeholder"}, requireAll = false)
    public static void loadUrl(ImageView imageView, String url, Drawable placeholder) {
        if (url != null) {
            GlideApp.with(imageView.getContext())
                    .load(url)
                    .placeholder(placeholder)
                    .error(R.mipmap.ic_launcher_round)
                    .fitCenter()
                    .into(imageView);
        } else {
            GlideApp.with(imageView.getContext())
                    .load(url)
                    .placeholder(placeholder)
                    .error(R.mipmap.ic_image_4_3)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(imageView);

        }
    }
}
