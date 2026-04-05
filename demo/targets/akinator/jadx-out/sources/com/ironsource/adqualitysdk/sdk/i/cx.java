package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.hd;
import com.ironsource.adqualitysdk.sdk.i.he;
import com.ironsource.adqualitysdk.sdk.i.hf;
import com.ironsource.adqualitysdk.sdk.i.hg;
import com.ironsource.adqualitysdk.sdk.i.hj;
import com.ironsource.adqualitysdk.sdk.i.hl;
import com.ironsource.adqualitysdk.sdk.i.kb;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cx extends da {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1727 = 851433484417322958L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1728 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1729 = {1118288015, -1673767315, 983316224, 1366779630, 1032796688, 1376531628, -1041341268, -394628743, -1299228687, 121839276, -890122640, -27708910, 1120250127, 988817531, -1930156042, -481586389, -1683870634, -1283673466};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1730 = 1;

    /* renamed from: 爫, reason: contains not printable characters */
    public static WebChromeClient m2123(List<Object> list) {
        f1728 = (f1730 + 1) % 128;
        WebChromeClient webChromeClientM3237 = kf.m3237((WebView) da.m2180(list, 0, WebView.class));
        int i10 = f1728 + 43;
        f1730 = i10 % 128;
        if (i10 % 2 != 0) {
            return webChromeClientM3237;
        }
        throw null;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public static WebViewClient m2124(List<Object> list) {
        int i10 = f1728 + 87;
        f1730 = i10 % 128;
        return kf.m3234((WebView) da.m2180(list, i10 % 2 == 0 ? 1 : 0, WebView.class));
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static jt m2125(List<Object> list) {
        WebView webView;
        String strM2136;
        int i10 = f1730 + 101;
        f1728 = i10 % 128;
        if (i10 % 2 != 0) {
            webView = (WebView) da.m2180(list, 0, WebView.class);
            strM2136 = m2136(new int[]{-919126917, 1499170816, 1333307641, 113421770, 132193366, -257775839}, (ViewConfiguration.getScrollBarFadeDuration() - 108) * 40);
        } else {
            webView = (WebView) da.m2180(list, 0, WebView.class);
            strM2136 = m2136(new int[]{-919126917, 1499170816, 1333307641, 113421770, 132193366, -257775839}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9);
        }
        return jt.m3050(webView, strM2136.intern());
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static boolean m2126(List<Object> list) {
        int i10 = f1728 + 43;
        f1730 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM3171 = kb.m3171(da.m2180(list, 0, Object.class));
        f1730 = (f1728 + 105) % 128;
        return zM3171;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static Object m2127(List<Object> list) {
        f1728 = (f1730 + 49) % 128;
        ((jt) da.m2180(list, 0, jt.class)).m3055();
        f1728 = (f1730 + 67) % 128;
        return null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static Object m2128(List<Object> list) {
        hc hcVar;
        int i10 = f1730 + 95;
        f1728 = i10 % 128;
        if (i10 % 2 != 0) {
            hcVar = (hc) da.m2180(list, 1, hc.class);
            if (hcVar == null) {
                return null;
            }
        } else {
            hcVar = (hc) da.m2180(list, 0, hc.class);
            if (hcVar == null) {
                return null;
            }
        }
        f1728 = (f1730 + 71) % 128;
        Object objMo1115 = hcVar.mo1115();
        f1728 = (f1730 + 99) % 128;
        return objMo1115;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static Object m2129(List<Object> list) {
        int i10 = f1730 + 61;
        f1728 = i10 % 128;
        int i11 = i10 % 2;
        ((jt) da.m2180(list, 0, jt.class)).m3057();
        return null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static View.OnTouchListener m2130(List<Object> list) {
        int i10 = f1728 + 103;
        f1730 = i10 % 128;
        View.OnTouchListener onTouchListenerM3100 = jy.m3100((View) da.m2180(list, i10 % 2 == 0 ? 1 : 0, View.class));
        f1730 = (f1728 + 111) % 128;
        return onTouchListenerM3100;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m2131(List<Object> list) {
        f1728 = (f1730 + 65) % 128;
        jd.m2957().m2962((in) da.m2180(list, 0, in.class));
        f1728 = (f1730 + 63) % 128;
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m2137(List list, Object[] objArr) {
        int i10 = f1730 + 111;
        f1728 = i10 % 128;
        int i11 = i10 % 2;
        List<Object> listM2132 = m2132(list, objArr);
        if (i11 != 0) {
            int i12 = 13 / 0;
        }
        return listM2132;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final Object m2139(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        final dq dqVar;
        final dq dqVar2;
        final List<Object> listM2182;
        final boolean zM2138;
        try {
            dqVar = (dq) da.m2180(list, 0, dq.class);
            dqVar2 = (dq) da.m2180(list, 1, dq.class);
            listM2182 = da.m2182(list, 2);
            zM2138 = m2138(list, 3);
            cpVar2 = cpVar;
        } catch (Exception e10) {
            e = e10;
            cpVar2 = cpVar;
        }
        try {
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.4

                /* renamed from: ﭖ, reason: contains not printable characters */
                private static int f1790 = 1;

                /* renamed from: ﭴ, reason: contains not printable characters */
                private static byte[] f1791 = {65, -121, -127, 124, -117, -117, -49, 52, -109, 125, -113, 119, -121, -112, -93, 109, -124, AbstractJsonLexerKt.TC_INVALID, -109, AbstractJsonLexerKt.TC_INVALID, -85, 100, 119, -103, 115, -89, 113, -117, -120, 115, -122, -71, 89, -91, -75, 56, -117, -49, 52, -119, -125, -122, -77, 0};

                /* renamed from: ﭸ, reason: contains not printable characters */
                private static int f1792 = 0;

                /* renamed from: ﮌ, reason: contains not printable characters */
                private static short[] f1793 = null;

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static int f1794 = -1147442923;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f1795 = 57;

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static int f1796 = -1256731704;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private void m2164(final dq dqVar3, View view) {
                    f1790 = (f1792 + 39) % 128;
                    try {
                        final List<Object> listM2137 = cx.m2137(listM2182, new Object[]{this, view});
                        if (!zM2138) {
                            p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.4.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    dq dqVar4 = dqVar3;
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    dqVar4.m2365(dsVar, cpVar2, listM2137);
                                }
                            });
                            return;
                        }
                        int i10 = f1792 + 51;
                        f1790 = i10 % 128;
                        if (i10 % 2 != 0) {
                            dqVar3.m2365(dsVar, cpVar2, listM2137);
                        } else {
                            dqVar3.m2365(dsVar, cpVar2, listM2137);
                            int i11 = 3 / 0;
                        }
                    } catch (Throwable th2) {
                        String strM2007 = cpVar2.m2007();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2165(TextUtils.indexOf("", "", 0, 0) - 13, (short) (122 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1256731704 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1147442993 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                        sb2.append(dqVar3.m2366());
                        co.m1955(strM2007, sb2.toString(), th2);
                    }
                }

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static String m2165(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (n.f3160) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f1795;
                            int i14 = i10 + i13;
                            int i15 = i14 == -1 ? 1 : 0;
                            if (i15 != 0) {
                                byte[] bArr = f1791;
                                i14 = bArr != null ? (byte) (bArr[f1796 + i11] + i13) : (short) (f1793[f1796 + i11] + i13);
                            }
                            if (i14 > 0) {
                                n.f3165 = ((i11 + i14) - 2) + f1796 + i15;
                                n.f3163 = b10;
                                char c10 = (char) (i12 + f1794);
                                n.f3162 = c10;
                                sb2.append(c10);
                                n.f3161 = n.f3162;
                                n.f3164 = 1;
                                while (n.f3164 < i14) {
                                    byte[] bArr2 = f1791;
                                    if (bArr2 != null) {
                                        int i16 = n.f3165;
                                        n.f3165 = i16 - 1;
                                        n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                                    } else {
                                        short[] sArr = f1793;
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

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    int i10 = f1792 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f1790 = i10 % 128;
                    if (i10 % 2 == 0) {
                        m2164(dqVar, view);
                        int i11 = 39 / 0;
                    } else {
                        m2164(dqVar, view);
                    }
                    int i12 = f1792 + 107;
                    f1790 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 11 / 0;
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    int i10 = f1792 + 103;
                    f1790 = i10 % 128;
                    if (i10 % 2 != 0) {
                        m2164(dqVar2, view);
                    } else {
                        m2164(dqVar2, view);
                        throw null;
                    }
                }
            };
            f1728 = (f1730 + 39) % 128;
            return onAttachStateChangeListener;
        } catch (Exception e11) {
            e = e11;
            co.m1955(cpVar2.m2007(), m2136(new int[]{-1474037151, 1295562398, 2139029484, 455272523, 1679272426, 1837458458, -596954435, -1849281249, -2003869176, 1413033541, 564003821, 375932223, -276479602, -1648457643, 299343328, -1221302323, 1907789489, 1942109040, 322496536, -1525851160, -709392744, -2088234470}, View.MeasureSpec.getSize(0) + 42).intern(), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jy.m3101(r0, new com.ironsource.adqualitysdk.sdk.i.cx.AnonymousClass9());
        com.ironsource.adqualitysdk.sdk.i.cx.f1728 = (com.ironsource.adqualitysdk.sdk.i.cx.f1730 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (m2138(r7, 4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (m2138(r7, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jy.m3101(r0, r1);
     */
    /* renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2142(java.util.List<java.lang.Object> r7) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cx.f1728
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1730 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hd$d> r2 = com.ironsource.adqualitysdk.sdk.i.hd.d.class
            r3 = 0
            java.lang.Class<android.media.MediaPlayer> r4 = android.media.MediaPlayer.class
            r5 = 1
            if (r0 != 0) goto L26
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r5, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r3, r2)
            com.ironsource.adqualitysdk.sdk.i.hd$d r1 = (com.ironsource.adqualitysdk.sdk.i.hd.d) r1
            r2 = 4
            boolean r7 = m2138(r7, r2)
            if (r7 == 0) goto L3d
            goto L39
        L26:
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r3, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r5, r2)
            com.ironsource.adqualitysdk.sdk.i.hd$d r2 = (com.ironsource.adqualitysdk.sdk.i.hd.d) r2
            boolean r7 = m2138(r7, r1)
            r1 = r2
            if (r7 == 0) goto L3d
        L39:
            com.ironsource.adqualitysdk.sdk.i.jy.m3101(r0, r1)
            goto L4d
        L3d:
            com.ironsource.adqualitysdk.sdk.i.cx$9 r7 = new com.ironsource.adqualitysdk.sdk.i.cx$9
            r7.<init>()
            com.ironsource.adqualitysdk.sdk.i.jy.m3101(r0, r7)
            int r7 = com.ironsource.adqualitysdk.sdk.i.cx.f1730
            int r7 = r7 + 19
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1728 = r7
        L4d:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cx.m2142(java.util.List):java.lang.Object");
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Object m2144(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        final dq dqVar;
        final List<Object> listM2182;
        final boolean zM2138;
        try {
            dqVar = (dq) da.m2180(list, 0, dq.class);
            listM2182 = da.m2182(list, 1);
            zM2138 = m2138(list, 2);
            cpVar2 = cpVar;
        } catch (Exception e10) {
            e = e10;
            cpVar2 = cpVar;
        }
        try {
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.2

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static int f1774 = 0;

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static int f1775 = 1;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static char[] f1776 = {'E', 'r', 'o', ' ', 'i', 'n', 'O', 'L', 'a', 'y', AbstractJsonLexerKt.UNICODE_ESC, 't', 'C', GMTDateParser.HOURS, 'g', 'e', GMTDateParser.SECONDS, GMTDateParser.DAY_OF_MONTH, 'F', 'G', 'H', 'I', 'J', 'K', GMTDateParser.MONTH};

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static char f1777 = 5;

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static String m2163(int i10, byte b10, String str) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (h.f2445) {
                        try {
                            char[] cArr2 = f1776;
                            char c10 = f1777;
                            char[] cArr3 = new char[i10];
                            if (i10 % 2 != 0) {
                                i10--;
                                cArr3[i10] = (char) (cArr[i10] - b10);
                            }
                            if (i10 > 1) {
                                h.f2448 = 0;
                                while (true) {
                                    int i11 = h.f2448;
                                    if (i11 >= i10) {
                                        break;
                                    }
                                    h.f2450 = cArr[i11];
                                    h.f2449 = cArr[h.f2448 + 1];
                                    if (h.f2450 == h.f2449) {
                                        cArr3[h.f2448] = (char) (h.f2450 - b10);
                                        cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                                    } else {
                                        h.f2447 = h.f2450 / c10;
                                        h.f2444 = h.f2450 % c10;
                                        h.f2446 = h.f2449 / c10;
                                        h.f2443 = h.f2449 % c10;
                                        if (h.f2444 == h.f2443) {
                                            h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                            h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                            int i12 = (h.f2447 * c10) + h.f2444;
                                            int i13 = (h.f2446 * c10) + h.f2443;
                                            int i14 = h.f2448;
                                            cArr3[i14] = cArr2[i12];
                                            cArr3[i14 + 1] = cArr2[i13];
                                        } else if (h.f2447 == h.f2446) {
                                            h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                            h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                            int i15 = (h.f2447 * c10) + h.f2444;
                                            int i16 = (h.f2446 * c10) + h.f2443;
                                            int i17 = h.f2448;
                                            cArr3[i17] = cArr2[i15];
                                            cArr3[i17 + 1] = cArr2[i16];
                                        } else {
                                            int i18 = (h.f2447 * c10) + h.f2443;
                                            int i19 = (h.f2446 * c10) + h.f2444;
                                            int i20 = h.f2448;
                                            cArr3[i20] = cArr2[i18];
                                            cArr3[i20 + 1] = cArr2[i19];
                                        }
                                    }
                                    h.f2448 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    f1774 = (f1775 + 29) % 128;
                    try {
                        final List<Object> listM2137 = cx.m2137(listM2182, new Object[]{this, view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)});
                        if (!zM2138) {
                            p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.2.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    dqVar.m2365(dsVar, cpVar2, listM2137);
                                }
                            });
                            int i18 = f1774 + 93;
                            f1775 = i18 % 128;
                            if (i18 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        int i19 = f1775 + 1;
                        f1774 = i19 % 128;
                        if (i19 % 2 == 0) {
                            dqVar.m2365(dsVar, cpVar2, listM2137);
                        } else {
                            dqVar.m2365(dsVar, cpVar2, listM2137);
                            int i20 = 12 / 0;
                        }
                    } catch (Throwable th2) {
                        String strM2007 = cpVar2.m2007();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2163(39 - TextUtils.getOffsetBefore("", 0), (byte) (TextUtils.getTrimmedLength("") + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), "\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0001\b\u0006\b\t\u0005\u0000\f\f\r\u0012\r\t\n\u0011\u0005\u0001\u0013\n\u0010\n\u0014\u0002\u0004\u0000\t\u0013\u0001\u0012\u0010\u009d").intern());
                        sb2.append(dqVar.m2366());
                        co.m1955(strM2007, sb2.toString(), th2);
                    }
                }
            };
            f1728 = (f1730 + 63) % 128;
            return onLayoutChangeListener;
        } catch (Exception e11) {
            e = e11;
            co.m1955(cpVar2.m2007(), m2134("例ગ엪耠嬐ᘹ킯ꮑ曳ℬﰔ띾熤첆螴䈄ᴐ\ud859銩涆⣽\ue33c븈祐㎮躜䧾Р\udf1f驝咭⾈\ueadaꔠ怖㭊\uf5b0", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17707).intern(), e);
            return null;
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Object m2146(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        try {
            final dq dqVar = (dq) da.m2180(list, 0, dq.class);
            final List<Object> listM2182 = da.m2182(list, 1);
            cpVar2 = cpVar;
            try {
                he.b bVar = new he.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.17
                    @Override // com.ironsource.adqualitysdk.sdk.i.he.b
                    /* renamed from: ｋ, reason: contains not printable characters */
                    public final void mo2161(he heVar, MediaPlayer mediaPlayer) {
                        dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, heVar, mediaPlayer}));
                    }
                };
                f1728 = (f1730 + 25) % 128;
                return bVar;
            } catch (Exception e10) {
                e = e10;
                co.m1955(cpVar2.m2007(), m2134("例㛛뵲⎔ꨠჭ韇ṭ蒓ର\uf1bc磊ｴ斒\uec4c劊\ud9db䁽욙䴊㎒뫑ⅵꟶ⸃钳\u1bf7艽ࣉ輊疱ﳇ捂\ue9ec倔횲川쑃䫈ㄖ랥㻅ꕍ⯭鈟ᢧ", 31079 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cpVar2 = cpVar;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final in m2149(final cp cpVar, List<Object> list, final ds dsVar) {
        final dq dqVar = (dq) da.m2180(list, 0, dq.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            int i10 = f1730 + 105;
            f1728 = i10 % 128;
            int i11 = i10 % 2;
            arrayList.addAll((Collection) da.m2180(list, 1, List.class));
        }
        if (dqVar != null) {
            return new in() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.1
                @Override // com.ironsource.adqualitysdk.sdk.i.in
                /* renamed from: ﻛ, reason: contains not printable characters */
                public final void mo2156() {
                    arrayList.add(0, this);
                    dqVar.m2365(dsVar, cpVar, arrayList);
                    arrayList.remove(0);
                }
            };
        }
        f1730 = (f1728 + 11) % 128;
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m2151(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        try {
            final dq dqVar = (dq) da.m2180(list, 0, dq.class);
            final List<Object> listM2182 = da.m2182(list, 1);
            cpVar2 = cpVar;
            try {
                hg.a aVar = new hg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.hg.a
                    /* renamed from: ﾇ, reason: contains not printable characters */
                    public final void mo2157(hg hgVar, View view) {
                        dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, hgVar, view}));
                    }
                };
                f1730 = (f1728 + 29) % 128;
                return aVar;
            } catch (Exception e10) {
                e = e10;
                co.m1955(cpVar2.m2007(), m2134("例蕵\uda2e⿺撘먃輛쓃᧣溾ꑠ滑컌Μ夐깟\ue337㣲ඛ䍪頔\uedf0⋤瞨䵵舄ퟨⲔ扁띿谥쇷ᚋ汕", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51913).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cpVar2 = cpVar;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m2153(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        final dq dqVar;
        final List<Object> listM2182;
        try {
            dqVar = (dq) da.m2180(list, 0, dq.class);
            listM2182 = da.m2182(list, 1);
            cpVar2 = cpVar;
        } catch (Exception e10) {
            e = e10;
            cpVar2 = cpVar;
        }
        try {
            hl.c cVar = new hl.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.11
                @Override // com.ironsource.adqualitysdk.sdk.i.hl.c
                /* renamed from: ﻛ, reason: contains not printable characters */
                public final boolean mo2158(hl hlVar, View view, MotionEvent motionEvent) {
                    return dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, hlVar, view, motionEvent})).m2434();
                }
            };
            int i10 = f1730 + 95;
            f1728 = i10 % 128;
            if (i10 % 2 == 0) {
                return cVar;
            }
            throw null;
        } catch (Exception e11) {
            e = e11;
            co.m1955(cpVar2.m2007(), m2136(new int[]{-1474037151, 1295562398, 2139029484, 455272523, 1679272426, 1837458458, -502840595, 1924565872, -1125259155, 130205991, 970403393, -1490217833, -1134465792, 538067013, 322496536, -1525851160, -709392744, -2088234470}, View.MeasureSpec.getMode(0) + 34).intern(), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2135(List<Object> list) {
        f1728 = (f1730 + 57) % 128;
        jd.m2957().m2961((in) da.m2180(list, 0, in.class));
        f1730 = (f1728 + 99) % 128;
        return null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Object m2143(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        try {
            final dq dqVar = (dq) da.m2180(list, 0, dq.class);
            final List<Object> listM2182 = da.m2182(list, 1);
            cpVar2 = cpVar;
            try {
                hj.e eVar = new hj.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.18
                    @Override // com.ironsource.adqualitysdk.sdk.i.hj.e
                    /* renamed from: ｋ, reason: contains not printable characters */
                    public final void mo2162(hj hjVar, MediaPlayer mediaPlayer) {
                        dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, hjVar, mediaPlayer}));
                    }
                };
                f1730 = (f1728 + 83) % 128;
                return eVar;
            } catch (Exception e10) {
                e = e10;
                co.m1955(cpVar2.m2007(), m2136(new int[]{-1474037151, 1295562398, 2139029484, 455272523, 1679272426, 1837458458, 807782759, 1040963414, 590624635, -968144267, -2054494323, 481852369, -357778542, 68073136, 231828459, 112086463, -366733791, 921154347, 1140713273, -228621096, -1851246817, 32597982, 366795816, -393311979}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 48).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cpVar2 = cpVar;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m2148(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        try {
            final dq dqVar = (dq) da.m2180(list, 0, dq.class);
            final List<Object> listM2182 = da.m2182(list, 1);
            cpVar2 = cpVar;
            try {
                hd.d dVar = new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.13
                    @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                    /* renamed from: ﻛ, reason: contains not printable characters */
                    public final boolean mo2159(hd hdVar, MediaPlayer mediaPlayer, int i10, int i11) {
                        return dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, hdVar, mediaPlayer, Integer.valueOf(i10), Integer.valueOf(i11)})).m2434();
                    }
                };
                f1728 = (f1730 + 91) % 128;
                return dVar;
            } catch (Exception e10) {
                e = e10;
                co.m1955(cpVar2.m2007(), m2136(new int[]{-1474037151, 1295562398, 2139029484, 455272523, 1679272426, 1837458458, 807782759, 1040963414, 590624635, -968144267, -2054494323, 481852369, -357778542, 68073136, -1013425922, -860153078, -1851246817, 32597982, 366795816, -393311979}, 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cpVar2 = cpVar;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View.OnClickListener m2133(List<Object> list) {
        int i10 = f1728 + 61;
        f1730 = i10 % 128;
        int i11 = i10 % 2;
        return jy.m3105((View) da.m2180(list, 0, View.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jy.m3102(r0, new com.ironsource.adqualitysdk.sdk.i.cx.AnonymousClass3());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (m2138(r7, 5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (m2138(r7, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.jy.m3102(r0, r1);
        com.ironsource.adqualitysdk.sdk.i.cx.f1730 = (com.ironsource.adqualitysdk.sdk.i.cx.f1728 + 5) % 128;
     */
    /* renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2147(java.util.List<java.lang.Object> r7) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cx.f1728
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1730 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 5
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hj$e> r3 = com.ironsource.adqualitysdk.sdk.i.hj.e.class
            java.lang.Class<android.media.MediaPlayer> r4 = android.media.MediaPlayer.class
            r5 = 1
            if (r0 != 0) goto L25
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r5, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r5, r3)
            com.ironsource.adqualitysdk.sdk.i.hj$e r1 = (com.ironsource.adqualitysdk.sdk.i.hj.e) r1
            boolean r7 = m2138(r7, r2)
            if (r7 == 0) goto L44
            goto L39
        L25:
            r0 = 0
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r0, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r3 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r5, r3)
            com.ironsource.adqualitysdk.sdk.i.hj$e r3 = (com.ironsource.adqualitysdk.sdk.i.hj.e) r3
            boolean r7 = m2138(r7, r1)
            r1 = r3
            if (r7 == 0) goto L44
        L39:
            com.ironsource.adqualitysdk.sdk.i.jy.m3102(r0, r1)
            int r7 = com.ironsource.adqualitysdk.sdk.i.cx.f1728
            int r7 = r7 + r2
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1730 = r7
            goto L4c
        L44:
            com.ironsource.adqualitysdk.sdk.i.cx$3 r7 = new com.ironsource.adqualitysdk.sdk.i.cx$3
            r7.<init>()
            com.ironsource.adqualitysdk.sdk.i.jy.m3102(r0, r7)
        L4c:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cx.m2147(java.util.List):java.lang.Object");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m2154(List<Object> list) {
        View view = (View) da.m2180(list, 0, View.class);
        final hl.c cVar = (hl.c) da.m2180(list, 1, hl.c.class);
        if (m2138(list, 2)) {
            int i10 = f1728 + 95;
            f1730 = i10 % 128;
            if (i10 % 2 == 0) {
                jy.m3109(view, cVar);
                throw null;
            }
            jy.m3109(view, cVar);
        } else {
            jy.m3109(view, new hl.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.12
                @Override // com.ironsource.adqualitysdk.sdk.i.hl.c
                /* renamed from: ﻛ */
                public final boolean mo2158(final hl hlVar, final View view2, final MotionEvent motionEvent) {
                    p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.12.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            cVar.mo2158(hlVar, view2, motionEvent);
                        }
                    });
                    return false;
                }
            });
        }
        f1730 = (f1728 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m2155(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        try {
            final dq dqVar = (dq) da.m2180(list, 0, dq.class);
            final List<Object> listM2182 = da.m2182(list, 1);
            cpVar2 = cpVar;
            try {
                hf.a aVar = new hf.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.15
                    @Override // com.ironsource.adqualitysdk.sdk.i.hf.a
                    /* renamed from: ｋ, reason: contains not printable characters */
                    public final void mo2160(hf hfVar, MediaPlayer mediaPlayer) {
                        dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, hfVar, mediaPlayer}));
                    }
                };
                f1728 = (f1730 + 95) % 128;
                return aVar;
            } catch (Exception e10) {
                e = e10;
                co.m1955(cpVar2.m2007(), m2134("例將棊璐Őⵉ㧏얡퉳︼諴隮ꍤ俖寔桶琛Áⲁ㥎씂퇵ﶽ詺阣ꋿ使嬙柪玓AⰛ㣏쒧텽ﴻ觎閠ꉿ仇媓杓猅\u1fd5", 5051 - View.getDefaultSize(0, 0)).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cpVar2 = cpVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r0 r2
      0x003c: PHI (r0v9 android.media.MediaPlayer) = (r0v5 android.media.MediaPlayer), (r0v11 android.media.MediaPlayer) binds: [B:8:0x0036, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r2v4 com.ironsource.adqualitysdk.sdk.i.hf$a) = (r2v2 com.ironsource.adqualitysdk.sdk.i.hf$a), (r2v6 com.ironsource.adqualitysdk.sdk.i.hf$a) binds: [B:8:0x0036, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[PHI: r0 r2
      0x0038: PHI (r0v6 android.media.MediaPlayer) = (r0v5 android.media.MediaPlayer), (r0v11 android.media.MediaPlayer) binds: [B:8:0x0036, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0038: PHI (r2v3 com.ironsource.adqualitysdk.sdk.i.hf$a) = (r2v2 com.ironsource.adqualitysdk.sdk.i.hf$a), (r2v6 com.ironsource.adqualitysdk.sdk.i.hf$a) binds: [B:8:0x0036, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﺙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2145(java.util.List<java.lang.Object> r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cx.f1730
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1728 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hf$a> r2 = com.ironsource.adqualitysdk.sdk.i.hf.a.class
            java.lang.Class<android.media.MediaPlayer> r3 = android.media.MediaPlayer.class
            r4 = 1
            if (r0 == 0) goto L25
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r6, r4, r3)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r6, r4, r2)
            com.ironsource.adqualitysdk.sdk.i.hf$a r2 = (com.ironsource.adqualitysdk.sdk.i.hf.a) r2
            r3 = 5
            boolean r6 = m2138(r6, r3)
            if (r6 == 0) goto L3c
            goto L38
        L25:
            r0 = 0
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r6, r0, r3)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r6, r4, r2)
            com.ironsource.adqualitysdk.sdk.i.hf$a r2 = (com.ironsource.adqualitysdk.sdk.i.hf.a) r2
            boolean r6 = m2138(r6, r1)
            if (r6 == 0) goto L3c
        L38:
            com.ironsource.adqualitysdk.sdk.i.jy.m3104(r0, r2)
            goto L44
        L3c:
            com.ironsource.adqualitysdk.sdk.i.cx$5 r6 = new com.ironsource.adqualitysdk.sdk.i.cx$5
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.i.jy.m3104(r0, r6)
        L44:
            int r6 = com.ironsource.adqualitysdk.sdk.i.cx.f1728
            int r6 = r6 + 19
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1730 = r0
            int r6 = r6 % r1
            r0 = 0
            if (r6 == 0) goto L51
            return r0
        L51:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cx.m2145(java.util.List):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r0 r1
      0x003b: PHI (r0v8 android.view.View) = (r0v4 android.view.View), (r0v10 android.view.View) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r1v4 com.ironsource.adqualitysdk.sdk.i.hg$a) = (r1v2 com.ironsource.adqualitysdk.sdk.i.hg$a), (r1v6 com.ironsource.adqualitysdk.sdk.i.hg$a) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r0 r1
      0x0037: PHI (r0v5 android.view.View) = (r0v4 android.view.View), (r0v10 android.view.View) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r1v3 com.ironsource.adqualitysdk.sdk.i.hg$a) = (r1v2 com.ironsource.adqualitysdk.sdk.i.hg$a), (r1v6 com.ironsource.adqualitysdk.sdk.i.hg$a) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2150(java.util.List<java.lang.Object> r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cx.f1728
            r1 = 1
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1730 = r2
            r2 = 2
            int r0 = r0 % r2
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hg$a> r3 = com.ironsource.adqualitysdk.sdk.i.hg.a.class
            r4 = 0
            java.lang.Class<android.view.View> r5 = android.view.View.class
            if (r0 != 0) goto L25
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r1, r5)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r4, r3)
            com.ironsource.adqualitysdk.sdk.i.hg$a r1 = (com.ironsource.adqualitysdk.sdk.i.hg.a) r1
            r3 = 5
            boolean r7 = m2138(r7, r3)
            if (r7 == 0) goto L3b
            goto L37
        L25:
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r4, r5)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r7, r1, r3)
            com.ironsource.adqualitysdk.sdk.i.hg$a r1 = (com.ironsource.adqualitysdk.sdk.i.hg.a) r1
            boolean r7 = m2138(r7, r2)
            if (r7 == 0) goto L3b
        L37:
            com.ironsource.adqualitysdk.sdk.i.jy.m3108(r0, r1)
            goto L4b
        L3b:
            com.ironsource.adqualitysdk.sdk.i.cx$14 r7 = new com.ironsource.adqualitysdk.sdk.i.cx$14
            r7.<init>()
            com.ironsource.adqualitysdk.sdk.i.jy.m3108(r0, r7)
            int r7 = com.ironsource.adqualitysdk.sdk.i.cx.f1728
            int r7 = r7 + 73
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1730 = r7
        L4b:
            int r7 = com.ironsource.adqualitysdk.sdk.i.cx.f1730
            int r7 = r7 + 55
            int r0 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1728 = r0
            int r7 = r7 % r2
            r0 = 0
            if (r7 != 0) goto L58
            return r0
        L58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cx.m2150(java.util.List):java.lang.Object");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2134(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f1727);
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

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final Object m2140(List<Object> list) throws IllegalAccessException, IllegalArgumentException {
        f1728 = (f1730 + 5) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) da.m2180(list, 0, MediaPlayer.class);
        final he.b bVar = (he.b) da.m2180(list, 1, he.b.class);
        if (m2138(list, 2)) {
            f1728 = (f1730 + 75) % 128;
            jy.m3114(mediaPlayer, bVar);
            return null;
        }
        jy.m3114(mediaPlayer, new he.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.8
            @Override // com.ironsource.adqualitysdk.sdk.i.he.b
            /* renamed from: ｋ */
            public final void mo2161(final he heVar, final MediaPlayer mediaPlayer2) {
                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.8.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        bVar.mo2161(heVar, mediaPlayer2);
                    }
                });
            }
        });
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static List<Object> m2132(List<Object> list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            f1730 = (f1728 + 71) % 128;
            arrayList.addAll(list);
            f1730 = (f1728 + 19) % 128;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m2138(java.util.List<java.lang.Object> r3, int r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.cx.f1730
            int r0 = r0 + 111
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1728 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L16
            int r0 = r3.size()
            r2 = 6
            int r2 = r2 / r1
            if (r0 <= r4) goto L39
            goto L1c
        L16:
            int r0 = r3.size()
            if (r0 <= r4) goto L39
        L1c:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.Object r3 = com.ironsource.adqualitysdk.sdk.i.da.m2180(r3, r4, r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L39
            int r3 = com.ironsource.adqualitysdk.sdk.i.cx.f1730
            int r3 = r3 + 111
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.cx.f1728 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L37
            return r1
        L37:
            r3 = 1
            return r3
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cx.m2138(java.util.List, int):boolean");
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Object m2141(cp cpVar, List<Object> list, final ds dsVar) {
        final cp cpVar2;
        final dq dqVar;
        final List<Object> listM2182;
        final boolean zM2138;
        try {
            dqVar = (dq) da.m2180(list, 0, dq.class);
            listM2182 = da.m2182(list, 1);
            zM2138 = m2138(list, 2);
            cpVar2 = cpVar;
        } catch (Exception e10) {
            e = e10;
            cpVar2 = cpVar;
        }
        try {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.6
                /* renamed from: ｋ, reason: contains not printable characters */
                public static /* synthetic */ void m2166(AnonymousClass6 anonymousClass6, dq dqVar2, ds dsVar2, cp cpVar3, List list2, Context context, Intent intent) {
                    dqVar2.m2365(dsVar2, cpVar3, cx.m2137(list2, new Object[]{anonymousClass6, context, intent}));
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(final Context context, final Intent intent) {
                    if (zM2138) {
                        dqVar.m2365(dsVar, cpVar2, cx.m2137(listM2182, new Object[]{this, context, intent}));
                    } else {
                        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.6.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                AnonymousClass6.m2166(anonymousClass6, dqVar, dsVar, cpVar2, listM2182, context, intent);
                            }
                        });
                    }
                }
            };
            int i10 = f1728 + 77;
            f1730 = i10 % 128;
            if (i10 % 2 != 0) {
                return broadcastReceiver;
            }
            throw null;
        } catch (Exception e11) {
            e = e11;
            co.m1955(cpVar2.m2007(), m2136(new int[]{-1474037151, 1295562398, 2139029484, 455272523, 1679272426, 1837458458, 1291975682, -2015985571, -1939559134, 519983309, -217131107, -1434860529, 1678521733, 446051979, 1287045291, -1580179805}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32).intern(), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2136(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1729.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m2152(final cp cpVar, List<Object> list) {
        final String simpleName;
        final boolean zBooleanValue = false;
        Class cls = (Class) da.m2180(list, 0, Class.class);
        Object objM2180 = da.m2180(list, 1, (Class<Object>) Object.class);
        if (list.size() > 2) {
            zBooleanValue = ((Boolean) da.m2180(list, 2, Boolean.class)).booleanValue();
        } else {
            f1728 = (f1730 + 41) % 128;
        }
        if (list.size() > 3) {
            simpleName = (String) da.m2180(list, 3, String.class);
            f1730 = (f1728 + 55) % 128;
        } else {
            simpleName = cls.getSimpleName();
        }
        return kb.m3172(cls, objM2180, new kb.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cx.7

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f1820 = 0;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static char f1821 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f1822 = 1;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f1823 = 0;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static long f1824 = 867508244022987069L;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m2167(String str, char c10, String str2, int i10, String str3) {
                String str4;
                char[] charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = charArray;
                char[] charArray2 = str2;
                if (str2 != null) {
                    charArray2 = str2.toCharArray();
                }
                char[] cArr2 = charArray2;
                char[] charArray3 = str;
                if (str != null) {
                    charArray3 = str.toCharArray();
                }
                char[] cArr3 = charArray3;
                synchronized (f.f2212) {
                    try {
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c10 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i10));
                        int length = cArr2.length;
                        char[] cArr6 = new char[length];
                        f.f2213 = 0;
                        while (true) {
                            int i11 = f.f2213;
                            if (i11 < length) {
                                int i12 = (i11 + 2) % 4;
                                int i13 = (i11 + 3) % 4;
                                int i14 = cArr4[i11 % 4] * 32718;
                                char c11 = cArr5[i12];
                                char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                f.f2211 = c12;
                                cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                cArr4[i13] = c12;
                                int i15 = f.f2213;
                                cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1824) ^ f1823) ^ f1821);
                                f.f2213 = i15 + 1;
                            } else {
                                str4 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.kb.c
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo2168(Object obj, Method method, Object[] objArr) {
                List arrayList;
                f1820 = (f1822 + 107) % 128;
                if (method != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(simpleName);
                        sb2.append(m2167("䞷ﳯ⣅檑", (char) (37159 - TextUtils.lastIndexOf("", '0')), "碖", (-973279417) - KeyEvent.normalizeMetaState(0), "褽풶Ȧఊ").intern());
                        sb2.append(method.getName());
                        String string = sb2.toString();
                        hc hcVar = (hc) obj;
                        if (objArr != null) {
                            int i10 = f1820 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            f1822 = i10 % 128;
                            if (i10 % 2 == 0) {
                                Arrays.asList(objArr);
                                throw null;
                            }
                            arrayList = Arrays.asList(objArr);
                        } else {
                            arrayList = new ArrayList();
                        }
                        List<Object> listM2137 = cx.m2137(arrayList, new Object[]{hcVar});
                        ArrayList arrayList2 = new ArrayList();
                        if (zBooleanValue) {
                            f1822 = (f1820 + 57) % 128;
                            arrayList2.add(listM2137);
                            listM2137 = arrayList2;
                        }
                        cpVar.m2004().mo1875(string, listM2137);
                        f1820 = (f1822 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
                    } catch (Exception e10) {
                        String strM2007 = cpVar.m2007();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m2167("\ud9e9ඏ飈⨃", (char) (Process.getGidForName("") + 921), "嶃粀欋텁췟⌟箮Ꙃ씿꿦㉛㦅ዺ\uf259\uebdb", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 938635303, "褽풶Ȧఊ").intern());
                        sb3.append(method.getName());
                        sb3.append(m2167("\ue54a윔\ue49c잯", (char) (ViewConfiguration.getLongPressTimeout() >> 16), "䠒汻띻ޞ⭰嗃\udae2춣ꡎ⥩ꩉ", KeyEvent.keyCodeFromString("") - 1664674587, "褽풶Ȧఊ").intern());
                        sb3.append(simpleName);
                        sb3.append(m2167("撒됣ㅓč", (char) Color.argb(0, 0, 0, 0), "㨦⋏ꇋ뢭怸矫뤓輦큖", 1404314469 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "褽풶Ȧఊ").intern());
                        co.m1955(strM2007, sb3.toString(), e10);
                    }
                }
            }
        });
    }
}
