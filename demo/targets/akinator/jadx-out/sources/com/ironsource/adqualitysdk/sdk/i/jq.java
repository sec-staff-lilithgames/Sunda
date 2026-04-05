package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jq {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f3043 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static dn f3044;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3045;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3046 = {AbstractJsonLexerKt.BEGIN_OBJ, 244, 245, 239, 232, 235, 240, 223, 226, 226, 228, 242, 235, 227, 224, 231, 226, 16, 'G', 'q', 'J', 'I', 'n', 'E', 'C', 'j', 'k', 'n', 'k', GMTDateParser.DAY_OF_MONTH, 'g', 'l', 'k', 'D', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, '2', '-', 'X', 'n', 'g', '_', AbstractJsonLexerKt.STRING_ESC, 'c', 'n', 'D', 146, 161, 160, 146, 139, 142, 147, 146, 153, 162, 163, 164, 152, 144, 142, 142, 157, 159, GMTDateParser.SECONDS, 231, 232, 232, 240, 238, 232, 242, 247, 246, 245, 233, 227, '.', AbstractJsonLexerKt.END_LIST, 'X', 'N', 'T', 'P', 'I', 'S', 'V', 'N', 'P', AbstractJsonLexerKt.BEGIN_LIST, '.', AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.BEGIN_LIST, 'O', 'I', 'N', 'N', 'I', 'D', 'K', 'Q', 'P', 'X', 'T', 'N', 'X', AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'C', 'f', 'l', '_', '^', 'c', 'a', AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.BEGIN_LIST, 'l', 'g', GMTDateParser.DAY_OF_MONTH, 'k', 'W', '-'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f3047;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final boolean f3048;

    public jq(String str, boolean z10) {
        this.f3047 = str;
        this.f3048 = z10;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m3040(jq jqVar) {
        int i10 = f3043 + 83;
        f3045 = i10 % 128;
        if (i10 % 2 != 0) {
            jqVar.m3038();
            throw null;
        }
        String strM3038 = jqVar.m3038();
        int i11 = f3043 + 37;
        f3045 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 34 / 0;
        }
        return strM3038;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m3042() {
        String strReplace;
        String strIntern;
        dn dnVar;
        f3045 = (f3043 + 97) % 128;
        String strM2346 = f3044.m2346();
        try {
            String strReplace2 = strM2346.replace(m3041("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001", true, new int[]{48, 19, 71, 11}).intern(), m3039()).replace(m3041("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false, new int[]{67, 13, 154, 9}).intern(), f3044.m2349());
            if (this.f3048) {
                int i10 = f3043 + 111;
                f3045 = i10 % 128;
                if (i10 % 2 != 0) {
                    strIntern = m3041("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", true, new int[]{80, 12, 0, 0}).intern();
                    dnVar = f3044;
                } else {
                    strIntern = m3041("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", true, new int[]{80, 12, 0, 0}).intern();
                    dnVar = f3044;
                }
                strReplace = strReplace2.replace(strIntern, dnVar.m2348());
            } else {
                strReplace = strReplace2.replace(m3041("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", true, new int[]{80, 12, 0, 0}).intern(), "");
                f3045 = (f3043 + 43) % 128;
            }
            return strReplace.replace(m3041("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{92, 16, 0, 1}).intern(), this.f3047);
        } catch (Throwable th2) {
            String strIntern2 = m3041("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{0, 17, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 0}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3041("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{108, 24, 0, 0}).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m3147(strIntern2, sb2.toString());
            return strM2346;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3043(dn dnVar) {
        int i10 = (f3045 + 91) % 128;
        f3043 = i10;
        f3044 = dnVar;
        f3045 = (i10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3044(final WebView webView) {
        try {
            p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    final String strM3040 = jq.m3040(jq.this);
                    p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.4.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            kf.m3239(webView, strM3040);
                        }
                    });
                }
            });
            f3045 = (f3043 + 39) % 128;
        } catch (Exception e10) {
            String strIntern = m3041("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{0, 17, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 0}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3041("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{17, 31, 0, 22}).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m3147(strIntern, sb2.toString());
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m3039() {
        f3045 = (f3043 + 115) % 128;
        String strM813 = aq.m814().mo827().m813();
        int i10 = f3045 + 3;
        f3043 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM813;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m3038() {
        int i10 = f3045 + 111;
        f3043 = i10 % 128;
        if (i10 % 2 != 0) {
            String strM2788 = ic.m2788(m3042().getBytes());
            int i11 = f3043 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f3045 = i11 % 128;
            if (i11 % 2 == 0) {
                return strM2788;
            }
            throw null;
        }
        ic.m2788(m3042().getBytes());
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m3041(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f3046, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
