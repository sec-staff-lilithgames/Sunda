package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.BidMachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gg extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2346 = 140;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2347 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2348 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int iIndexOf;
        int iNormalizeMetaState;
        int i10;
        int i11 = f2347 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2348 = i11 % 128;
        if (i11 % 2 == 0) {
            iIndexOf = 16000 - TextUtils.indexOf((CharSequence) "", 'A');
            iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            i10 = 4 >> (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1));
        } else {
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 243;
            iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
            i10 = 4 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        }
        return m2541(iIndexOf, iNormalizeMetaState, "\ufffe\u0003￼\uffff\b\u0003\u0002�\ufffb\u0007", i10, true).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2347 + 63;
        f2348 = i10 % 128;
        if (i10 % 2 != 0) {
            return BidMachine.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bl blVar = new bl(mo2524());
        int i10 = f2347 + 111;
        f2348 = i10 % 128;
        if (i10 % 2 != 0) {
            return blVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2348 + 23;
        f2347 = i10 % 128;
        return (i10 % 2 != 0 ? m2541(23697 % (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 47 / TextUtils.indexOf("", "", 1), "\u0005\n\u0003ￏ\u0010\n\u0006\u000f\n\t\u0004\u0002￮\u0005\n￣ￏ\u0006\u000f\n\t\u0004\u0002\u000e", 4 << (ViewConfiguration.getTouchSlop() << 77), false) : m2541((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 234, 24 - TextUtils.indexOf("", "", 0), "\u0005\n\u0003ￏ\u0010\n\u0006\u000f\n\t\u0004\u0002￮\u0005\n￣ￏ\u0006\u000f\n\t\u0004\u0002\u000e", 6 - (ViewConfiguration.getTouchSlop() >> 8), true)).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2541(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2346);
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
