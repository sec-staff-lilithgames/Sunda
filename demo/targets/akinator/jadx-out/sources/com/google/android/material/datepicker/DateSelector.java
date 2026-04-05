package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface DateSelector<S> extends Parcelable {
    static boolean isTouchExplorationEnabled(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    static void showKeyboardWithAutoHideBehavior(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        c cVar = new c(editTextArr, 0);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(cVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new d(editText2, 0), 100L);
    }
}
