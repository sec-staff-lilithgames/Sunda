package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.aq;
import io.ktor.util.date.GMTDateParser;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ao extends aq.AnonymousClass1 {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f541 = 160;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f542 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f543;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m806(String str) {
        f542 = (f543 + 19) % 128;
        JSONObject jSONObjectM807 = m807();
        if (jSONObjectM807 == null) {
            int i10 = f543 + 69;
            f542 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 36 / 0;
            }
            return null;
        }
        Object objOpt = jSONObjectM807.opt(str);
        int i12 = f543 + 99;
        f542 = i12 % 128;
        if (i12 % 2 != 0) {
            return objOpt;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m807() {
        f543 = (f542 + 9) % 128;
        JSONObject jSONObjectOptJSONObject = m849().optJSONObject(m805((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 270, 6 - View.MeasureSpec.getSize(0), "\u0006\ufffb\ufff3\u0004\u0006\u0005", 4 - ImageFormat.getBitsPerPixel(0), true).intern());
        f543 = (f542 + 47) % 128;
        return jSONObjectOptJSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m808() {
        JSONObject jSONObjectM849;
        String strM805;
        int i10 = f543 + 109;
        f542 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM849 = m849();
            strM805 = m805(2650 >>> TextUtils.indexOf("", ""), 5 >> TextUtils.lastIndexOf("", GMTDateParser.DAY_OF_MONTH, 1, 1), "\ufff6\u0005\u0005", 4 >> ((byte) KeyEvent.getModifierMetaStateMask()), true);
        } else {
            jSONObjectM849 = m849();
            strM805 = m805(TextUtils.indexOf("", "") + 271, 2 - TextUtils.lastIndexOf("", '0', 0, 0), "\ufff6\u0005\u0005", ((byte) KeyEvent.getModifierMetaStateMask()) + 4, false);
        }
        return jSONObjectM849.optString(strM805.intern());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m805(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f541);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
