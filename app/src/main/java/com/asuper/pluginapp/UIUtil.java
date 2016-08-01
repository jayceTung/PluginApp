package com.asuper.pluginapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Joker on 2016/8/1.
 */
public class UIUtil {

    public static View getLayout(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.activity_main, null);
    }

    public static String getTextString(Context ctx){
        return ctx.getResources().getString(R.string.app_name);
    }

    public static Drawable getImageDrawable(Context ctx){
        return ctx.getResources().getDrawable(R.mipmap.icon);
    }
}
