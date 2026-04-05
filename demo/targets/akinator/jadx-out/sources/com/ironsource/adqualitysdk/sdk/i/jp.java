package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.az;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jp {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f3034 = true;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f3035 = true;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3036 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f3037 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f3038 = {216, 230, 227, 215, 234, 248, 198, 249, 245, 239, 244, 240, 243, 161, 232, 196, 237, 233, 238};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3039 = 129;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private WeakReference<az.e> f3040;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3041;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<WebView> f3042;

    public jp(WebView webView) {
        this.f3042 = new WeakReference<>(webView);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m3031(az.e eVar) {
        this.f3040 = new WeakReference<>(eVar);
        f3036 = (f3037 + 43) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m3032(az.e eVar) {
        new WeakReference(eVar);
        f3037 = (f3036 + 105) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r0 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return r4.f3040.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return r4.f3040.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jp.f3037 = (r2 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f3040 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f3040 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = r0 + 95;
        com.ironsource.adqualitysdk.sdk.i.jp.f3036 = r0 % 128;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.az.e m3033() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.jp.f3037
            int r1 = r0 + 119
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.jp.f3036 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L15
            java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.az$e> r1 = r4.f3040
            r3 = 17
            int r3 = r3 / 0
            if (r1 == 0) goto L38
            goto L19
        L15:
            java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.az$e> r1 = r4.f3040
            if (r1 == 0) goto L38
        L19:
            r1 = 95
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jp.f3036 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L2f
            java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.az$e> r0 = r4.f3040
            java.lang.Object r0 = r0.get()
            com.ironsource.adqualitysdk.sdk.i.az$e r0 = (com.ironsource.adqualitysdk.sdk.i.az.e) r0
            int r1 = r1 / 0
            return r0
        L2f:
            java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.az$e> r0 = r4.f3040
            java.lang.Object r0 = r0.get()
            com.ironsource.adqualitysdk.sdk.i.az$e r0 = (com.ironsource.adqualitysdk.sdk.i.az.e) r0
            return r0
        L38:
            int r2 = r2 + 125
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.jp.f3037 = r2
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jp.m3033():com.ironsource.adqualitysdk.sdk.i.az$e");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final WebView m3036() {
        int i10 = f3036 + 95;
        f3037 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f3042.get();
        }
        int i11 = 0 / 0;
        return this.f3042.get();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3037(WebViewClient webViewClient) {
        int i10 = f3037 + 83;
        f3036 = i10 % 128;
        if (i10 % 2 == 0) {
            m3036();
            throw null;
        }
        WebView webViewM3036 = m3036();
        if (webViewM3036 != null) {
            try {
                hh hhVar = new hh(kf.m3234(webViewM3036), webViewClient);
                m3031(hhVar);
                webViewM3036.setWebViewClient(hhVar);
                this.f3041 = true;
                int i11 = f3036 + 35;
                f3037 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            } catch (Exception e10) {
                kd.m3203(m3030(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "\u008a\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m3030(null, View.MeasureSpec.getSize(0) + 127, null, "\u0089\u008a\u0082\u0085\u0091\u0090\u0086\u0082\u0085\u0084\u0083\u0082\u0081\u008e\u008f\u008a\u0085\u0089\u0089\u0082\u008f\u008e\u008d\u008c\u008d\u008d\u0087").intern(), e10, false);
            }
        }
        this.f3041 = false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3034(WebChromeClient webChromeClient) {
        int i10 = f3036 + 19;
        f3037 = i10 % 128;
        if (i10 % 2 != 0) {
            m3036();
            throw null;
        }
        WebView webViewM3036 = m3036();
        if (webViewM3036 != null) {
            try {
                WebChromeClient webChromeClientM3237 = kf.m3237(webViewM3036);
                if (webChromeClientM3237 != null) {
                    int i11 = f3037 + 91;
                    f3036 = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    if (webChromeClientM3237 == null) {
                        hk hkVar = new hk(webChromeClientM3237, webChromeClient);
                        m3032(hkVar);
                        webViewM3036.setWebChromeClient(hkVar);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e10) {
                kd.m3203(m3030(null, 175 - AndroidCharacter.getMirror('0'), null, "\u008a\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m3030(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u0089\u008a\u0082\u0085\u0091\u0090\u0082\u0093\u008c\u008d\u0092\u0090\u0083\u0082\u0081\u008e\u008f\u008a\u0085\u0089\u0089\u0082\u008f\u008e\u008d\u008c\u008d\u008d\u0087").intern(), e10, false);
            }
        }
        f3036 = (f3037 + 95) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m3035() {
        int i10 = f3037;
        boolean z10 = this.f3041;
        int i11 = i10 + 25;
        f3036 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m3030(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f3038;
                int i11 = f3039;
                if (f3035) {
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
                if (f3034) {
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
