package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public static ArrayList a(Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        HashSet hashSet = new HashSet();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        try {
            enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        } catch (Throwable unused) {
            enabledInputMethodList = null;
        }
        if (enabledInputMethodList != null) {
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if (inputMethodSubtype.getMode().equals("keyboard") && i10 < 10) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            try {
                                String strReplace = locale.replace("_", "-");
                                hashSet.add(strReplace);
                                IAlog.a("Available input language: %s", strReplace);
                                i10++;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
        }
        return new ArrayList(hashSet);
    }
}
