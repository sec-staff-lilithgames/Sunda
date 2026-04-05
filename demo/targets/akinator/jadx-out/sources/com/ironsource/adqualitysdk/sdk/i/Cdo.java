package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cdo {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f1987 = {0};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f1988 = null;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1989 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1990 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1991 = 1205804016;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1992 = 110;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1993 = 1014574257;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1994;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int f1995;

    private Cdo(String str, int i10) {
        this.f1994 = str;
        this.f1995 = i10;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2350(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1992;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1987;
                    i14 = bArr != null ? (byte) (bArr[f1991 + i11] + i13) : (short) (f1988[f1991 + i11] + i13);
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f1991 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f1993);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f1987;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f1988;
                            int i17 = n.f3165;
                            n.f3165 = i17 - 1;
                            n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                        }
                        sb2.append(n.f3162);
                        n.f3161 = n.f3162;
                        n.f3164++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Cdo m2351(String str, int i10) {
        f1990 = (f1989 + 51) % 128;
        if (!q.m3297().m3316()) {
            return null;
        }
        Cdo cdo = new Cdo(str, i10);
        f1990 = (f1989 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        return cdo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1994);
        sb2.append(m2350((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 110, (short) View.resolveSize(0, 0), View.combineMeasuredStates(0, 0) - 1205804016, (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (-1014574199) - Color.green(0)).intern());
        sb2.append(this.f1995);
        String string = sb2.toString();
        f1990 = (f1989 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return string;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m2352() {
        int i10 = f1990 + 47;
        f1989 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1995;
        }
        throw null;
    }
}
