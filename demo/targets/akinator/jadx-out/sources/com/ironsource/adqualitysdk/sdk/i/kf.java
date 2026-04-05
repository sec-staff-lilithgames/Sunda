package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class kf {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3143 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f3144;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3145;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f3146;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static b f3147;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static b f3148;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3149;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3150;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3151;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3152;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3153;

    static {
        m3238();
        f3153 = true;
        f3151 = true;
        f3152 = true;
        byte b10 = 0;
        f3149 = false;
        f3150 = false;
        f3147 = new b(b10);
        f3148 = new b(b10);
        f3143 = (f3145 + 109) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized av m3222() {
        av avVarMo829;
        try {
            int i10 = f3143 + 45;
            f3145 = i10 % 128;
            if (i10 % 2 != 0) {
                avVarMo829 = aq.m814().mo829();
                int i11 = 95 / 0;
            } else {
                avVarMo829 = aq.m814().mo829();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return avVarMo829;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m3229(WebView webView) {
        f3145 = (f3143 + 71) % 128;
        boolean z10 = m3234(webView) instanceof hh;
        int i10 = f3143 + 45;
        f3145 = i10 % 128;
        if (i10 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static hs<WebViewClient> m3230(WebView webView) {
        int i10 = f3145 + 83;
        f3143 = i10 % 128;
        if (i10 % 2 != 0) {
            m3233(webView.getContext());
            return m3231(webView, m3227(), f3147);
        }
        m3233(webView.getContext());
        m3231(webView, m3227(), f3147);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static WebViewClient m3234(WebView webView) {
        f3143 = (f3145 + 23) % 128;
        if (Build.VERSION.SDK_INT >= 26 && m3222().m926()) {
            int i10 = f3143 + 7;
            f3145 = i10 % 128;
            if (i10 % 2 != 0) {
                m3225(webView.getContext());
                throw null;
            }
            if (m3225(webView.getContext())) {
                return webView.getWebViewClient();
            }
        }
        hs<WebViewClient> hsVarM3230 = m3230(webView);
        if (hsVarM3230 == null) {
            throw new RuntimeException(m3228((char) ((Process.myPid() >> 22) + 13968), View.combineMeasuredStates(0, 0) + 33, AndroidCharacter.getMirror('0') - 22).intern());
        }
        WebViewClient webViewClientMo2643 = hsVarM3230.mo2643();
        f3145 = (f3143 + 87) % 128;
        return webViewClientMo2643;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3238() {
        f3144 = new char[]{'j', 45038, 24424, 3788, 48719, 28072, 7464, 52352, 31752, 11379, 56236, 35648, 15042, 59938, 39358, 18761, 63633, 43019, 22625, 2047, 46852, 26265, AbstractJsonLexerKt.STRING, 44966, 24375, 3734, 14035, 39280, 27131, 14417, 35016, 23349, 11245, 64013, 19144, 6897, 60783, 48603, 3136, 56563, 44821, 32660, 52738, 40633, 28407, 12648, 33227, 20584, 8374, 62240, 17309, 4617, 57954, 45733, 1362, 54730, 42039, 29869, 50964, 62779, 23192, 43539, 64441, 19232, 39133, 59397, 14821, 35104, 55577, 11911, 32307, 53160, 7963, 27901, 48252, 3562, 23876, 44318, 62103, 16955, 37806, 58199, 12514, 32892, 53734, 8603, 28931, 50856, 5739, 26588, 46912, 1277, 21627, 42466, 'W', 45034, 24444, 3835, 48725, 28078, 7469, 52412, 31756, 11374, 56314, 35670, 60031, 17863, 46422, 58616, 21620, 34769, 63235, 9915, 38439, 50782, 12743, 24950, 53472, 30, 29640, 41789, 4773, 16951, 45588, 60878, 23928, 36079, 64533, 12177, 40818, 52910, 16080, 28230, 55803, 2407, 30860, 43032, 'E', 45053, 24428, 3778, 48718, 28139, 7481, 52353, 31773, 11364, 56317, 35660, 15066, 59940, 39410, 18696, 63638, 43103, 22653, 2044, 46913, 26334, 5738, 50574, 29965, 9365, 54480, 33916, 13249, 58180, 37505, 16957, 61833, 41226, 20624, 249, 'E', 45053, 24428, 3778, 48718, 28139, 7485, 52364, 31756, 11379, 56319, 35659, 15059, 60003, 39345, 18701, 63641, 43034, 22624, 2025, 46860, 26333, 5667, 50620, 29956, 9363};
        f3146 = 6057517208486588303L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static hs<WebChromeClient> m3223(WebView webView) {
        f3145 = (f3143 + 35) % 128;
        m3233(webView.getContext());
        hs<WebChromeClient> hsVarM3231 = m3231(webView, m3232(), f3148);
        f3145 = (f3143 + 73) % 128;
        return hsVarM3231;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hs<T> m3226(WebView webView, ia iaVar, List<String> list, int i10) {
        f3143 = (f3145 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        hs<T> hsVarM3235 = m3235(webView, iaVar, list, i10);
        f3145 = (f3143 + 101) % 128;
        return hsVarM3235;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3239(WebView webView, String str) {
        if (webView != null) {
            f3143 = (f3145 + 89) % 128;
            if (webView.getHandler() == null) {
                int i10 = f3143 + 3;
                f3145 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 90 / 0;
                    if (webView.getRootView() == null) {
                        return;
                    }
                } else if (webView.getRootView() == null) {
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3228((char) Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
            sb2.append(str);
            sb2.append(m3228((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, 22 - View.resolveSizeAndState(0, 0, 0)).intern());
            webView.loadUrl(sb2.toString());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3155;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3156;

        private b() {
            this.f3155 = false;
            this.f3156 = false;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean m3241() {
            return this.f3155;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final void m3242() {
            this.f3156 = true;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final boolean m3243() {
            return m3241() || m3245();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final void m3244() {
            this.f3155 = true;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final boolean m3245() {
            return this.f3156;
        }

        public /* synthetic */ b(byte b10) {
            this();
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ia m3227() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* renamed from: ﾇ */
            public final boolean mo2192(hs hsVar) {
                return WebViewClient.class.equals(hsVar.mo2644().getType());
            }
        };
        f3145 = (f3143 + 21) % 128;
        return iaVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m3228(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f3144[i11 + i12] ^ (i12 * f3146)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m3225(Context context) {
        boolean z10;
        int i10 = f3145 + 93;
        f3143 = i10 % 128;
        if (i10 % 2 != 0) {
            if (f3151) {
                try {
                    f3151 = false;
                    WebView webView = new WebView(context);
                    hh hhVar = new hh(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.2
                    });
                    webView.setWebViewClient(hhVar);
                    if (hhVar == webView.getWebViewClient()) {
                        f3145 = (f3143 + 9) % 128;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3149 = z10;
                } catch (Throwable th2) {
                    kd.m3203(m3228((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 13, 94 - TextUtils.indexOf("", "")).intern(), m3228((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ImageFormat.getBitsPerPixel(0) + 37, 138 - View.MeasureSpec.getSize(0)).intern(), th2, false);
                }
            }
            return f3149;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3233(Context context) {
        f3143 = (f3145 + 63) % 128;
        if (f3153) {
            f3153 = false;
            try {
                WebView webView = new WebView(context);
                hh hhVar = new hh(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.3
                });
                webView.setWebViewClient(hhVar);
                hk hkVar = new hk(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.5
                });
                webView.setWebChromeClient(hkVar);
                f3147 = m3236(webView, hhVar, m3227());
                f3148 = m3236(webView, hkVar, m3232());
                int i10 = f3143 + 53;
                f3145 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                kd.m3203(m3228((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, 94 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), m3228((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 59961), View.resolveSizeAndState(0, 0, 0) + 32, Color.rgb(0, 0, 0) + 16777322).intern(), th2, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebChromeClient m3237(WebView webView) {
        if (Build.VERSION.SDK_INT >= 26 && m3222().m923()) {
            int i10 = f3145 + 113;
            f3143 = i10 % 128;
            if (i10 % 2 != 0) {
                if (m3240(webView.getContext())) {
                    f3145 = (f3143 + 41) % 128;
                    WebChromeClient webChromeClient = webView.getWebChromeClient();
                    f3145 = (f3143 + 53) % 128;
                    return webChromeClient;
                }
            } else {
                m3240(webView.getContext());
                throw null;
            }
        }
        hs<WebChromeClient> hsVarM3223 = m3223(webView);
        if (hsVarM3223 != null) {
            return hsVarM3223.mo2643();
        }
        throw new RuntimeException(m3228((char) (TextUtils.indexOf((CharSequence) "", '0') + 62841), 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[PHI: r4
      0x0044: PHI (r4v11 java.lang.Object) = (r4v7 java.lang.Object), (r4v15 java.lang.Object) binds: [B:10:0x0036, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.ironsource.adqualitysdk.sdk.i.kf.b m3236(android.webkit.WebView r4, T r5, com.ironsource.adqualitysdk.sdk.i.ia r6) {
        /*
            com.ironsource.adqualitysdk.sdk.i.kf$b r0 = new com.ironsource.adqualitysdk.sdk.i.kf$b
            r1 = 0
            r0.<init>(r1)
            com.ironsource.adqualitysdk.sdk.i.av r2 = m3222()
            java.util.List r2 = r2.m927()
            com.ironsource.adqualitysdk.sdk.i.av r3 = m3222()
            int r3 = r3.m924()
            com.ironsource.adqualitysdk.sdk.i.hs r4 = m3226(r4, r6, r2, r3)
            if (r4 == 0) goto L79
            int r2 = com.ironsource.adqualitysdk.sdk.i.kf.f3145
            int r2 = r2 + 53
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.kf.f3143 = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L32
            java.lang.Object r4 = r4.mo2643()
            r2 = 31
            int r2 = r2 / r1
            if (r4 != r5) goto L44
            goto L38
        L32:
            java.lang.Object r4 = r4.mo2643()
            if (r4 != r5) goto L44
        L38:
            r0.m3244()
            int r4 = com.ironsource.adqualitysdk.sdk.i.kf.f3143
            int r4 = r4 + 69
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.kf.f3145 = r4
            goto L79
        L44:
            com.ironsource.adqualitysdk.sdk.i.av r2 = m3222()
            java.util.List r2 = r2.m925()
            com.ironsource.adqualitysdk.sdk.i.av r3 = m3222()
            int r3 = r3.m928()
            com.ironsource.adqualitysdk.sdk.i.hs r4 = m3224(r4, r6, r2, r3)
            if (r4 == 0) goto L79
            int r6 = com.ironsource.adqualitysdk.sdk.i.kf.f3143
            int r6 = r6 + 17
            int r2 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.kf.f3145 = r2
            int r6 = r6 % 2
            if (r6 == 0) goto L70
            java.lang.Object r4 = r4.mo2643()
            r6 = 14
            int r6 = r6 / r1
            if (r4 != r5) goto L79
            goto L76
        L70:
            java.lang.Object r4 = r4.mo2643()
            if (r4 != r5) goto L79
        L76:
            r0.m3242()
        L79:
            int r4 = com.ironsource.adqualitysdk.sdk.i.kf.f3143
            int r4 = r4 + 61
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.kf.f3145 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L88
            r4 = 30
            int r4 = r4 / r1
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kf.m3236(android.webkit.WebView, java.lang.Object, com.ironsource.adqualitysdk.sdk.i.ia):com.ironsource.adqualitysdk.sdk.i.kf$b");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hs<T> m3224(T t10, ia iaVar, List<String> list, int i10) {
        f3145 = (f3143 + 105) % 128;
        hs<T> hsVarM3235 = m3235(t10, iaVar, list, i10);
        int i11 = f3143 + 111;
        f3145 = i11 % 128;
        if (i11 % 2 == 0) {
            return hsVarM3235;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> hs<T> m3231(WebView webView, ia iaVar, b bVar) {
        T tMo2643;
        int i10 = f3145 + 67;
        f3143 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m3228((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.myTid() >> 22) + 12, 93 - TextUtils.lastIndexOf("", '0', 0)).intern(), m3228((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getCapsMode("", 0, 0) + 26, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 175).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            bVar.m3243();
            throw null;
        }
        if (bVar.m3243()) {
            hs<T> hsVarM3226 = m3226(webView, iaVar, m3222().m927(), m3222().m924());
            if (bVar.m3245() && hsVarM3226 != null && (tMo2643 = hsVarM3226.mo2643()) != null) {
                int i11 = f3145 + 41;
                f3143 = i11 % 128;
                if (i11 % 2 != 0) {
                    if (!tMo2643.getClass().equals(hsVarM3226.mo2644().getType())) {
                        hs<T> hsVarM3224 = m3224(tMo2643, iaVar, m3222().m925(), m3222().m928());
                        f3143 = (f3145 + 51) % 128;
                        return hsVarM3224;
                    }
                } else {
                    tMo2643.getClass().equals(hsVarM3226.mo2644().getType());
                    throw null;
                }
            }
            return hsVarM3226;
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m3240(Context context) {
        if (f3152) {
            boolean z10 = false;
            f3152 = false;
            WebView webView = new WebView(context);
            hk hkVar = new hk(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.4
            });
            webView.setWebChromeClient(hkVar);
            if (hkVar == webView.getWebChromeClient()) {
                int i10 = (f3143 + 19) % 128;
                f3145 = i10;
                z10 = true;
                f3143 = (i10 + 1) % 128;
            }
            f3150 = z10;
        }
        return f3150;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hs<T> m3235(Object obj, ia iaVar, final List<String> list, int i10) {
        hs<T> hsVarM2718 = hu.m2670().m2672().m2718(obj, iaVar, new hq() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.hq
            /* renamed from: ﾇ */
            public final Field[] mo2628(Object obj2) {
                hu.m2670().m2673();
                return hn.m2612(obj2.getClass(), true, -1, list);
            }
        }, list, i10);
        f3145 = (f3143 + 63) % 128;
        return hsVarM2718;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static ia m3232() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.kf.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* renamed from: ﾇ */
            public final boolean mo2192(hs hsVar) {
                return WebChromeClient.class.equals(hsVar.mo2644().getType());
            }
        };
        f3145 = (f3143 + 59) % 128;
        return iaVar;
    }
}
