package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class af extends jr {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f361 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f362 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f365 = 5;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int f366;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int f367;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f368;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f369;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Handler f370;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f364 = {'A', 'n', 'a', 'l', 'y', 't', 'i', 'c', GMTDateParser.SECONDS, 'E', 'v', 'e', 'G', 'r', 'o', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.DAY_OF_MONTH, ' ', 'g', GMTDateParser.MONTH, GMTDateParser.HOURS, 'B', 'C', 'D', 'F'};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f363 = 8785676731998478007L;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void onEventGenerated(JSONObject jSONObject);
    }

    public af(Context context, as asVar, int i10, String str, long j10) {
        super(context, asVar, j10);
        this.f366 = i10;
        this.f367 = 0;
        this.f369 = 1;
        this.f368 = str;
        HandlerThread handlerThread = new HandlerThread(m674(KeyEvent.keyCodeFromString("") + 23, (byte) (79 - View.resolveSize(0, 0)), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0000\u0006\r\f\u0006\u0010\f\u0003\t\nÁ").intern());
        handlerThread.start();
        this.f370 = new Handler(handlerThread.getLooper());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ int m669(af afVar) {
        int i10 = f361;
        int i11 = i10 + 73;
        f362 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = afVar.f369;
        if (i12 == 0) {
            int i14 = 46 / 0;
        }
        int i15 = i10 + 85;
        f362 = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 22 / 0;
        }
        return i13;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m672(af afVar) {
        int i10 = f362 + 97;
        f361 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = afVar.f367;
            afVar.f367 = i11;
            return i11;
        }
        int i12 = afVar.f367;
        afVar.f367 = i12 + 1;
        return i12;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ int m673(af afVar) {
        int i10;
        int i11;
        int i12 = f362 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f361 = i12 % 128;
        if (i12 % 2 != 0) {
            i10 = afVar.f369;
            i11 = i10 % 1;
        } else {
            i10 = afVar.f369;
            i11 = i10 + 1;
        }
        afVar.f369 = i11;
        return i10;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m675(final JSONArray jSONArray, final boolean z10, final d dVar) {
        this.f370.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static boolean f371 = true;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f372 = 1;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f373 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static boolean f374 = true;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f375 = 115;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f376 = {216, 233, 225, 231, 230, 180, 212, 223, 236, 220, 214, 184, 186, 229, 226, 147, 218, 192};

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m678(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f376;
                        int i11 = f375;
                        if (f371) {
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
                        if (f374) {
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

            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v2, types: [int] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v7, types: [org.json.JSONObject] */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws Exception {
                final JSONObject jSONObject;
                String strIntern;
                int i10 = f372 + 103;
                f373 = i10 % 128;
                ?? r02 = i10 % 2;
                try {
                    if (r02 != 0) {
                        JSONObject jSONObjectMo676 = af.this.mo676(null, z10, true, true);
                        strIntern = m678(null, 62 << ExpandableListView.getPackedPositionGroup(0L), null, "\u0085\u0084\u0083\u0081\u0082\u0081").intern();
                        r02 = jSONObjectMo676;
                    } else {
                        JSONObject jSONObjectMo6762 = af.this.mo676(null, z10, false, false);
                        strIntern = m678(null, 127 - ExpandableListView.getPackedPositionGroup(0L), null, "\u0085\u0084\u0083\u0081\u0082\u0081").intern();
                        r02 = jSONObjectMo6762;
                    }
                    r02.put(strIntern, jSONArray);
                    jSONObject = r02;
                } catch (JSONException e10) {
                    k.m3145(m678(null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, "\u008e\u008f\u0084\u0087\u008e\u0081\u0083\u0081\u008d\u0084\u0083\u0081\u0082\u008c\u0085\u008b\u008a\u0084\u0089\u0088\u0087\u0083\u0086").intern(), m678(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0087\u0084\u0081\u0092\u0084\u0083\u0081\u0082\u0081\u0090\u0091\u0083\u008a\u0084\u0087\u0081\u008e\u008b\u0090\u008e\u008f\u008e\u008e\u008c").intern(), (Throwable) e10);
                    jSONObject = r02;
                }
                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        dVar.onEventGenerated(jSONObject);
                    }
                });
            }
        });
        int i10 = f361 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f362 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 32 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m668(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f363);
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m670(JSONObject jSONObject) {
        f362 = (f361 + 7) % 128;
        ik ikVarM3000 = jh.m2995().m3000();
        try {
            jSONObject.put(m668("ớ毑\uf4ca䇖쫿埻ꃨⷥ뛧", 29959 - Color.green(0)).intern(), kc.m3188(ikVarM3000.m2831(), ikVarM3000.m2832(), ikVarM3000.m2834(), ikVarM3000.m2833()));
            f362 = (f361 + 9) % 128;
        } catch (JSONException e10) {
            k.m3145(m674(24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 78), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0000\u0006\r\f\u0006\u0010\f\u0003\t\nÁ").intern(), m674(30 - (Process.myPid() >> 22), (byte) (76 - (Process.myPid() >> 22)), "\f\u000e\u000e\n\f\u0012\u0001\u0011\u0015\u000b\u0003\u0010\u0012\u0002\u0003\u0007\t\n\u0011\u0005\u0016\u000f\t\n\u0010\f\u000b\f\u0000\u0006").intern(), (Throwable) e10);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int m671() {
        int i10 = f361 + 101;
        int i11 = i10 % 128;
        f362 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = this.f367;
        if (i12 == 0) {
            return 1;
        }
        int i13 = i11 + 75;
        f361 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 20 / 0;
        }
        return i12;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m674(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f364;
                char c10 = f365;
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m677(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z10, final d dVar) throws Throwable {
        try {
            try {
                this.f370.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.5

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static int f383 = 0;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static int f384 = 1;

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static long f385 = -7042786689018688106L;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static String m679(String str2, int i10) {
                        String str3;
                        char[] charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
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
                                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f385);
                                        j.f2851++;
                                    } else {
                                        str3 = new String(cArr2);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str3;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() throws Exception {
                        if (str.equals(m679("\u0de2㡿曻괮\udb97ؘ䱳竦ꄭ\uef83ᨍ䁷軎", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13721).intern())) {
                            af.m672(af.this);
                            f384 = (f383 + 15) % 128;
                        }
                        int iM669 = af.m669(af.this);
                        af.m673(af.this);
                        JSONObject jSONObjectM3179 = kc.m3179(jSONObject);
                        jSONObjectM3179.put(m679("\u0df8୪ÁḤ", 1694 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), str);
                        jSONObjectM3179.put(m679("ෳ撻", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 26948).intern(), iM669);
                        String strIntern = m679("\u0de2܁ᠽⵚ♧㮍䲩䆶嫕", (Process.myTid() >> 22) + 2789).intern();
                        JSONObject jSONObject3 = jSONObject2;
                        if (jSONObject3 != null) {
                            strIntern = jSONObject3.optString(ig.f2705);
                            String str2 = ig.f2661;
                            jSONObjectM3179.put(str2, jSONObject2.optString(str2, null));
                        }
                        if (TextUtils.isEmpty(strIntern)) {
                            strIntern = m679("\u0df8Ḭ⩒㚌", 5077 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
                        } else {
                            f384 = (f383 + 91) % 128;
                        }
                        jSONObjectM3179.put(ig.f2707, strIntern);
                        if (!jSONObjectM3179.has(ig.f2708)) {
                            jSONObjectM3179.put(ig.f2708, strIntern);
                        }
                        final JSONObject jSONObjectMo676 = af.this.mo676(jSONObjectM3179, z10, true, str.equals(m679("\u0de2↱啧裺벤큌ߨ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11350).intern()));
                        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.5.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                dVar.onEventGenerated(jSONObjectMo676);
                            }
                        });
                    }
                });
                f361 = (f362 + 23) % 128;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jr
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject mo676(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        long jM3085;
        long jM3089;
        synchronized (this) {
            jM3085 = jv.m3085();
            jM3089 = jv.m3089();
        }
        JSONObject jSONObjectMo676 = super.mo676(jSONObject, z10, z11, z12);
        try {
            long jOptLong = jSONObjectMo676.optLong(ig.f2701);
            jSONObjectMo676.remove(ig.f2701);
            if (jOptLong != 0) {
                long j10 = jM3089 - (jM3085 - jOptLong);
                jSONObjectMo676.put(m674(4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (TextUtils.getTrimmedLength("") + 37), "\t\u0006\u0098").intern(), jM3085);
                jSONObjectMo676.put(m674((ViewConfiguration.getFadingEdgeLength() >> 16) + 3, (byte) (12 - KeyEvent.keyCodeFromString("")), "\u0005\u0012\u0080").intern(), jM3089);
                jM3085 = jOptLong;
                jM3089 = j10;
            }
            jSONObjectMo676.put(m668("ồ䥢놆", 22433 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), jM3085);
            jSONObjectMo676.put(m674((ViewConfiguration.getWindowTouchSlop() >> 8) + 2, (byte) (93 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0014\n").intern(), jM3089);
            jSONObjectMo676.put(m674((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, (byte) (TextUtils.indexOf("", "") + 102), "\u0005\u0012\u000b\u0015").intern(), this.f368);
            jSONObjectMo676.put(m668("Ễ࣭㊵", 5683 - TextUtils.getOffsetBefore(wHkgq.hufANUs, 0)).intern(), this.f366);
            jSONObjectMo676.put(m668("Ễꥈ燸", TextUtils.indexOf("", "", 0, 0) + 46993).intern(), m671());
            if (aq.m814().mo819()) {
                jSONObjectMo676.put(m674(TextUtils.indexOf("", "", 0, 0) + 4, (byte) (58 - ImageFormat.getBitsPerPixel(0)), "\b\t\u0001\u0012").intern(), true);
            }
            ao aoVarMo825 = aq.m814().mo825();
            if (aoVarMo825 != null) {
                String strM808 = aoVarMo825.m808();
                if (!TextUtils.isEmpty(strM808)) {
                    jSONObjectMo676.put(m668("Ồ\uddb2頡", Color.blue(0) + 50033).intern(), strM808);
                }
            }
            if (z11) {
                m670(jSONObjectMo676);
            }
            return jSONObjectMo676;
        } catch (JSONException e10) {
            k.m3145(m674((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, (byte) (79 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0000\u0006\r\f\u0006\u0010\f\u0003\t\nÁ").intern(), m674(24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 82), "\b\u000e\u000e\n\f\u0012\b\f\f\u0001\u0006\u0007\u0003\u0010\u0010\f\u000b\f\u0000\u0006\u0010\u000e\u0007\u0000").intern(), (Throwable) e10);
            return jSONObjectMo676;
        }
    }
}
