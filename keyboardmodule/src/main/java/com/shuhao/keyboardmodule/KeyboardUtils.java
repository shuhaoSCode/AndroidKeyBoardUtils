package com.shuhao.keyboardmodule;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * KeyboardUtils
 * Created by bakumon on 2016/12/20 18:28.
 */
public class KeyboardUtils {
    /**
     * 动态隐藏软键盘
     *
     * @param activity activity
     */
    public static void hideSoftInput(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view == null) view = new View(activity);
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * 动态显示软键盘
     *
     * @param edit 输入框
     */
    public static void showSoftInput(final Activity activity, final EditText edit) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        edit.setFocusable(true);
                        edit.setFocusableInTouchMode(true);
                        edit.requestFocus();
                        InputMethodManager imm = (InputMethodManager) activity
                                .getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.showSoftInput(edit, 0);
                    }
                });
            }
        }.start();
    }
}
