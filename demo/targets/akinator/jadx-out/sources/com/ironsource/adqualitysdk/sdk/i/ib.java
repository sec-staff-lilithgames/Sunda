package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.ie;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ib {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ii f2625;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f2626;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ie f2627;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Context f2628;

    public ib(Context context, String str, String str2) {
        this.f2628 = context.getApplicationContext();
        this.f2626 = str2;
        this.f2625 = new ii(this.f2628, str);
        this.f2627 = new ie(Cif.f2648, this.f2628.getPackageName(), ih.m2806(this.f2628), this.f2626);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m2782(String str) {
        try {
            this.f2625.m2816(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m2783(String str) {
        try {
            return this.f2625.m2817(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2786(String str) {
        try {
            String strM2813 = this.f2625.m2813(str);
            if (strM2813 == null || TextUtils.isEmpty(strM2813)) {
                return strM2813;
            }
            try {
                return this.f2627.m2801(strM2813);
            } catch (ie.a unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m2784(String str, int i10) {
        try {
            HashMap<String, String> mapM2814 = this.f2625.m2814(str, i10);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM2814.keySet()) {
                String str3 = mapM2814.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2627.m2801(str3));
                    } catch (ie.a unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2785(String str, String str2) {
        try {
            this.f2625.m2815(str, this.f2627.m2802(str2));
        } catch (Throwable unused) {
        }
    }
}
