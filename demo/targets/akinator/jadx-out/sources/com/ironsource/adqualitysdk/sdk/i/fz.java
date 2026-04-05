package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.amazon.device.ads.DTBAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fz extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2303 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2304 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2305 = 971099048499108340L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2304 + 29;
        f2303 = i10 % 128;
        return m2532("妕泼㍟說谏卣\u19cbⱇ\uf2af", i10 % 2 != 0 ? 23932 << TextUtils.indexOf((CharSequence) "", (char) 5, 1, 0) : TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13670).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2304 + 27;
        f2303 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 43 / 0;
        }
        return DTBAdRequest.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bi biVar = new bi(mo2524());
        f2303 = (f2304 + 25) % 128;
        return biVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2303 + 89;
        f2304 = i10 % 128;
        return m2532("妗畀/\udf4b\ueaf9맞咷恳㽃쨩饔듹䏕ẝ⩧壟鐡ꍑ绳ෑ\ud89b\uf42d荢帍派㣖\ud7ae\ue2bf빥䵊ᠫ㜔싧醻", i10 % 2 == 0 ? 28551 - ((byte) KeyEvent.getModifierMetaStateMask()) : ((byte) KeyEvent.getModifierMetaStateMask()) + 11484).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2532(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2305);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
