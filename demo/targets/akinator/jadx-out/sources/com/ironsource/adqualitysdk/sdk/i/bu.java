package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.Moloco;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bu extends bg {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1231 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1232 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1233 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1234 = 4969089938057986733L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1235 = 68;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1236 = {133, 168, 151, 172, 179, 187, 144, 173, 183, 184, 169, 178, 182, 134, 165, 138, 185, 176, 167, 141, 145, 170, 150, 186, 189, 177, 'r', 175, 188, 154, 171};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1237 = true;

    public bu(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1499() {
        f1232 = (f1231 + 49) % 128;
        Moloco moloco = Moloco.INSTANCE;
        f1232 = (f1231 + 7) % 128;
        return moloco;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Object m1500() {
        f1232 = (f1231 + 55) % 128;
        Object objM1499 = m1499();
        f1232 = (f1231 + 97) % 128;
        return objM1499;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1502(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i10 = f1232 + 51;
        f1231 = i10 % 128;
        int i11 = i10 % 2;
        m1505(banner, bannerAdShowListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ BannerAdShowListener m1503(Banner banner) {
        int i10 = f1231 + 101;
        f1232 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1506(banner);
        }
        m1506(banner);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static BannerAdShowListener m1506(Banner banner) {
        int i10 = f1231 + 33;
        f1232 = i10 % 128;
        int i11 = i10 % 2;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        if (i11 == 0) {
            int i12 = 96 / 0;
        }
        return adShowListener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bu.mo1110(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        hy hyVarM2672;
        String strM1501;
        int i10 = f1231 + 63;
        f1232 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                hyVarM2672 = hu.m2670().m2672();
                strM1501 = m1501("˳䞆蠧튓ᜭ妚ꉉ\ue4b1⤾玬됡", 23170 >> View.resolveSize(0, 1));
            } else {
                hyVarM2672 = hu.m2670().m2672();
                strM1501 = m1501("˳䞆蠧튓ᜭ妚ꉉ\ue4b1⤾玬됡", View.resolveSize(0, 0) + 17783);
            }
            return hyVarM2672.m2723(BuildConfig.class, strM1501.intern());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1504((String) null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, (int[]) null, "\u008b\u0093\u008c\u008f\u008a\u0089\u008c\u0094\u009c\u0082\u0083\u0085\u0093\u0085\u0092\u0085\u0095\u008a\u008b\u009f").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bu.m1500();
            }
        });
        map.put(m1501("ˊ\ueda3\udc0f첮뽠꿔鹁褥禇栯壧䭧㯁⪭ᔀ֤\uf474\ue4c5흟옹뚟ꄏ釭", 61291 - View.MeasureSpec.getMode(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bu.m1503((Banner) list.get(0));
            }
        });
        map.put(m1504((String) null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, (int[]) null, "\u008d\u008b\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008d\u008b\u008c\u008c\u008f\u008e\u008a\u008b\u0089").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bu.m1502((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        f1231 = (f1232 + 39) % 128;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1501(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f1234);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1505(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1231 = (f1232 + 31) % 128;
        banner.setAdShowListener(bannerAdShowListener);
        f1231 = (f1232 + 39) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1504(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1236;
                int i11 = f1235;
                if (f1233) {
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
                if (f1237) {
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
}
