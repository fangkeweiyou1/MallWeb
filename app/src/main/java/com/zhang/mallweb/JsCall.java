package com.zhang.mallweb;

import android.webkit.JavascriptInterface;

import static java.lang.System.out;

/**
 * Created by zhangyuncai on 2018/11/27.
 */
public abstract class JsCall extends Object {

    //给html提供的有参函数，html调用我们这个方法 ： window.Android.HtmlcallJava2("IT-homer blog");
    @JavascriptInterface
    public void HtmlcallJava2(final String param) {
        out.println("---<<<>>>---param:"+param);
    }

    public abstract void callbackParam(String param);
}
