package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dd extends da {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2202(List<Object> list) {
        return ke.m3214((View) da.m2180(list, 0, View.class));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static WebView m2203(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) da.m2180(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) da.m2180(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) da.m2180(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) da.m2180(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) ke.m3215(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m2204(List<Object> list) {
        return (E) ke.m3216((View) da.m2180(list, 0, View.class), (Class) da.m2180(list, 1, Class.class), ((Boolean) da.m2180(list, 2, Boolean.class)).booleanValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m2205(List<Object> list) {
        return ke.m3208((Activity) da.m2180(list, 0, Activity.class));
    }
}
