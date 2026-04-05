package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.tapjoy.Tapjoy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gs extends gk {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2396 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2397 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2398 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2399 = -306554342;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2400 = 73033602;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2401 = {-35, -26, 45, -32, -34, 9, 118, -35, -26, 45, -32, 62, -87, 34, 49, -33, 35, 42, -13, 32, 2, 0, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2402 = 109;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2397 = (f2396 + 17) % 128;
        String strIntern = m2555((-103) - (ViewConfiguration.getScrollBarSize() >> 8), (short) (113 - TextUtils.getOffsetBefore("", 0)), TextUtils.getOffsetAfter("", 0) + 306554358, (byte) (65486 - AndroidCharacter.getMirror('0')), (-73033486) - View.MeasureSpec.getMode(0)).intern();
        int i10 = f2397 + 105;
        f2396 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = (f2397 + 45) % 128;
        f2396 = i10;
        int i11 = i10 + 47;
        f2397 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 37 / 0;
        }
        return Tapjoy.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        ce ceVar = new ce(mo2524());
        int i10 = f2396 + 29;
        f2397 = i10 % 128;
        if (i10 % 2 == 0) {
            return ceVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2397 = (f2396 + 43) % 128;
        String strIntern = m2555((-92) - View.getDefaultSize(0, 0), (short) (TextUtils.indexOf("", "", 0, 0) - 10), 306554341 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((-38) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) - 73033503).intern();
        f2397 = (f2396 + 33) % 128;
        return strIntern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2555(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2402;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2401;
                    i14 = bArr != null ? (byte) (bArr[f2399 + i11] + i13) : (short) (f2398[f2399 + i11] + i13);
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f2399 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f2400);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f2401;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f2398;
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
}
