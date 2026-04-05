package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dl {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1963 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1964 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1965 = -6404422537017804246L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1966;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1967;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1968;

    public dl(JSONObject jSONObject) {
        this.f1966 = jSONObject.optBoolean(m2333("鹽鸐ض㱽뗢쇟䐧\uea37皁⒌\ue96c퍤佌ന", (Process.getThreadPriority(0) + 20) >> 6).intern());
        this.f1967 = jSONObject.optBoolean(m2333("䣷䢖ꁰ騼֟熿Ⰺ舑ꀭ苯夂뭅駉", (-1) - TextUtils.lastIndexOf("", '0', 0)).intern());
        this.f1968 = dy.m2458(jSONObject.optString(m2333("ꡨꠅﹻ쐴嗓⇳琥\uda33䂯\udccd", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern()));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2334() {
        int i10 = f1964;
        boolean z10 = this.f1967;
        int i11 = i10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1963 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2335() {
        int i10 = f1964;
        String str = this.f1968;
        f1963 = (i10 + 51) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2336() {
        int i10 = f1963;
        int i11 = i10 + 65;
        f1964 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        boolean z10 = this.f1966;
        int i12 = i10 + 103;
        f1964 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 93 / 0;
        }
        return z10;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2333(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1965, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1965));
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
