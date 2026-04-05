package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.aq;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class av extends aq.AnonymousClass1 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f634 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f635 = 5536355435612675339L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f636 = 1;

    public av(ax axVar) {
        m850(axVar);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m923() {
        f636 = (f634 + 95) % 128;
        boolean zOptBoolean = m849().optBoolean(m922("맠♭릇컊㬑\uf4bfญ奏", 1 - TextUtils.getCapsMode("", 0, 0)).intern(), true);
        f634 = (f636 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        return zOptBoolean;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m924() {
        f636 = (f634 + 27) % 128;
        int iM1017 = m848().m1017();
        int i10 = f634 + 115;
        f636 = i10 % 128;
        if (i10 % 2 != 0) {
            return iM1017;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m925() {
        f636 = (f634 + 31) % 128;
        List<String> listM1019 = m848().m1019();
        f636 = (f634 + 107) % 128;
        return listM1019;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m926() {
        JSONObject jSONObjectM849;
        int iIndexOf;
        int i10 = f636 + 43;
        f634 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM849 = m849();
            iIndexOf = TextUtils.indexOf((CharSequence) "", 'Z', 1, 1);
        } else {
            jSONObjectM849 = m849();
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        }
        return jSONObjectM849.optBoolean(m922("\u1b4dꖨᬪ鄬룔ꭌ\ue4c3뎁", -iIndexOf).intern(), true);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m927() {
        int i10 = f636 + 79;
        f634 = i10 % 128;
        if (i10 % 2 != 0) {
            m848().m1020();
            throw null;
        }
        List<String> listM1020 = m848().m1020();
        f634 = (f636 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return listM1020;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m928() {
        f636 = (f634 + 47) % 128;
        int iM1021 = m848().m1021();
        int i10 = f634 + 39;
        f636 = i10 % 128;
        if (i10 % 2 != 0) {
            return iM1021;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m922(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f635, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f635));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
