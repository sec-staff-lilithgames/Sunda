package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class dt {
    public static boolean jpo() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return i10 >= 32 && jpo(RequestConfiguration.MAX_AD_CONTENT_RATING_T, Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean jpo(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
