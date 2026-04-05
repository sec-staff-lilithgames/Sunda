package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static boolean f600 = true;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f601 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f602 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f603 = true;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f604 = {176, 177, 182, 193, 181, 167};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f605 = 98;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f608;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f611 = "";

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f610 = m896(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f612 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f609 = "";

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f613 = false;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, String> f606 = new HashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean f607 = false;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m897() {
        int i10 = f602;
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f608;
        int i11 = i10 + 113;
        f601 = i11 % 128;
        if (i11 % 2 != 0) {
            return iSAdQualityDeviceIdType;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Map<String, String> m898() {
        int i10 = f601 + 3;
        f602 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f606;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final void m899() {
        int i10 = f602 + 7;
        int i11 = i10 % 128;
        f601 = i11;
        this.f607 = i10 % 2 != 0;
        f602 = (i11 + 25) % 128;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m900() {
        int i10 = f602;
        boolean z10 = this.f607;
        int i11 = i10 + 115;
        f601 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 95 / 0;
        }
        return z10;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m902(boolean z10) {
        int i10 = f601;
        this.f612 = z10;
        int i11 = i10 + 57;
        f602 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m905(String str) {
        int i10 = (f602 + 113) % 128;
        f601 = i10;
        this.f611 = str;
        f602 = (i10 + 47) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m906() {
        int i10 = f602 + 85;
        f601 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f609;
        }
        int i11 = 93 / 0;
        return this.f609;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m908() {
        int i10 = f601;
        String str = this.f611;
        f602 = (i10 + 51) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m911(String str) {
        try {
            int i10 = f601 + 95;
            int i11 = i10 % 128;
            f602 = i11;
            if (i10 % 2 != 0) {
                this.f610 = str;
                throw null;
            }
            this.f610 = str;
            int i12 = i11 + 21;
            f601 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m901(String str) {
        int i10 = (f602 + 15) % 128;
        f601 = i10;
        this.f609 = str;
        int i11 = i10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f602 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized String m904() {
        String str;
        int i10 = f602 + 33;
        int i11 = i10 % 128;
        f601 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        str = this.f610;
        int i12 = i11 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f602 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m907(boolean z10) {
        int i10 = f602;
        int i11 = i10 + 13;
        f601 = i11 % 128;
        int i12 = i11 % 2;
        this.f613 = z10;
        if (i12 == 0) {
            int i13 = 46 / 0;
        }
        f601 = (i10 + 53) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m909(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i10 = (f601 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        f602 = i10;
        this.f608 = iSAdQualityDeviceIdType;
        f601 = (i10 + 81) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m912() {
        int i10 = (f601 + 5) % 128;
        f602 = i10;
        boolean z10 = this.f612;
        f601 = (i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return z10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m896(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f604;
                int i11 = f605;
                if (f603) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f600) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m903() {
        int i10 = (f602 + 23) % 128;
        f601 = i10;
        boolean z10 = this.f613;
        int i11 = i10 + 1;
        f602 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m910(Map<String, String> map) {
        int i10 = f601;
        int i11 = i10 + 33;
        f602 = i11 % 128;
        int i12 = i11 % 2;
        this.f606 = map;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i10 + 31;
        f602 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 57 / 0;
        }
    }
}
