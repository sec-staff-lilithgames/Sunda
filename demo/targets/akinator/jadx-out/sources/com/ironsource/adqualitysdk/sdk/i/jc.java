package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jc {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2885 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2886 = 62247;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f2887 = 10229;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2888 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f2889 = 38930;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2890 = 19383;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final int f2891;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f2892;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final String f2893;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final jb f2894;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        /* renamed from: ﻐ */
        void mo759(int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        /* renamed from: ﻛ */
        void mo750(List<je> list);
    }

    public jc(String str, String str2, jb jbVar) {
        this(str, str2, jbVar, (byte) 0);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static je m2933(JSONObject jSONObject) {
        je jeVar = new je(jSONObject);
        f2885 = (f2888 + 55) % 128;
        return jeVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ jb m2935(jc jcVar) {
        int i10 = f2888;
        int i11 = i10 + 39;
        f2885 = i11 % 128;
        int i12 = i11 % 2;
        jb jbVar = jcVar.f2894;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i10 + 57;
        f2885 = i13 % 128;
        if (i13 % 2 == 0) {
            return jbVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m2937(jc jcVar) {
        int i10 = f2885 + 13;
        int i11 = i10 % 128;
        f2888 = i11;
        int i12 = i10 % 2 == 0 ? 29428 : 10000;
        f2885 = (i11 + 21) % 128;
        return i12;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m2941(jc jcVar) {
        int i10 = f2888 + 71;
        f2885 = i10 % 128;
        int i11 = i10 % 2;
        String strM2938 = jcVar.m2938();
        if (i11 != 0) {
            int i12 = 94 / 0;
        }
        return strM2938;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2943(final int i10, final d dVar) {
        jb.m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.4

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static byte[] f2904 = {87, 93, 103, 26, 107, 110, 73, 86, 83, -1, -103, -63, -88, -60, -100, -30, -87, -106, -66, -59, -71, 66, 111, 84, -85, -83, 77, -14, 27, 91, -97, 81, 90, -93, -11, 86, 30, -94, -85, 73, -77, -33, 24, 89, 87, -97, -90, 90, -27, 29, 83, -75, 88, 85, -87, -27, 8, -25, 27, -82, 92, 81, -94, -120, 0, 0, 0, 0, 0};

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f2905 = 950129968;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f2906 = 1;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f2907 = 0;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static short[] f2908 = null;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f2909 = 65;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f2910 = -306024298;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m2948(int i11, short s10, int i12, byte b10, int i13) {
                String string;
                synchronized (n.f3160) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i14 = f2909;
                        int i15 = i11 + i14;
                        int i16 = i15 == -1 ? 1 : 0;
                        if (i16 != 0) {
                            byte[] bArr = f2904;
                            i15 = bArr != null ? (byte) (bArr[f2910 + i12] + i14) : (short) (f2908[f2910 + i12] + i14);
                        }
                        if (i15 > 0) {
                            n.f3165 = ((i12 + i15) - 2) + f2910 + i16;
                            n.f3163 = b10;
                            char c10 = (char) (i13 + f2905);
                            n.f3162 = c10;
                            sb2.append(c10);
                            n.f3161 = n.f3162;
                            n.f3164 = 1;
                            while (n.f3164 < i15) {
                                byte[] bArr2 = f2904;
                                if (bArr2 != null) {
                                    int i17 = n.f3165;
                                    n.f3165 = i17 - 1;
                                    n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i17] + s10)) ^ n.f3163));
                                } else {
                                    short[] sArr = f2908;
                                    int i18 = n.f3165;
                                    n.f3165 = i18 - 1;
                                    n.f3162 = (char) (n.f3161 + (((short) (sArr[i18] + s10)) ^ n.f3163));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws JSONException {
                float f10;
                long j10;
                JSONObject jSONObject;
                final ArrayList arrayList = new ArrayList();
                float f11 = 0.0f;
                f2907 = (f2906 + 15) % 128;
                for (String str : jc.m2935(jc.this).m2922(jc.m2939(jc.this, m2948((-64) - TextUtils.getOffsetAfter("", 0), (short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 85), 306024298 - (ViewConfiguration.getScrollBarSize() >> 8), (byte) ((-127) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.getDeadChar(0, 0) - 950129926).intern()), i10).values()) {
                    try {
                        jSONObject = new JSONObject(str);
                        f10 = f11;
                    } catch (Exception unused) {
                        f10 = f11;
                    }
                    try {
                        j10 = 0;
                    } catch (Exception unused2) {
                        j10 = 0;
                        k.m3151(jc.m2941(jc.this), m2948(View.MeasureSpec.getSize(0) - 53, (short) (83 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1))), 306024308 - TextUtils.indexOf("", ""), (byte) (21 - (KeyEvent.getMaxKeyCode() >> 16)), (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)) - 950129902).intern(), com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2948((-21) - View.resolveSize(0, 0), (short) (1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)) + 306024318, (byte) ((-90) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-950129900) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), str), true);
                        f11 = f10;
                    }
                    try {
                        arrayList.add(new je(jSONObject.getJSONObject(m2948((-57) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (38 - Color.alpha(0)), View.combineMeasuredStates(0, 0) + 306024298, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 112), (Process.myPid() >> 22) - 950129856).intern()), jSONObject.optString(m2948(ExpandableListView.getPackedPositionChild(0L) - 60, (short) ((ViewConfiguration.getTapTimeout() >> 16) - 45), Color.red(0) + 306024305, (byte) ((ViewConfiguration.getScrollFriction() > f10 ? 1 : (ViewConfiguration.getScrollFriction() == f10 ? 0 : -1)) - 47), (-950129851) - Drawable.resolveOpacity(0, 0)).intern())));
                    } catch (Exception unused3) {
                        k.m3151(jc.m2941(jc.this), m2948(View.MeasureSpec.getSize(0) - 53, (short) (83 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1))), 306024308 - TextUtils.indexOf("", ""), (byte) (21 - (KeyEvent.getMaxKeyCode() >> 16)), (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)) - 950129902).intern(), com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2948((-21) - View.resolveSize(0, 0), (short) (1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)) + 306024318, (byte) ((-90) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-950129900) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), str), true);
                        f11 = f10;
                    }
                    f11 = f10;
                }
                p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.4.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        dVar.mo750(arrayList);
                    }
                });
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﾒ */
            public final void mo1003(Throwable th2) {
                super.mo1003(th2);
                p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        dVar.mo750(new ArrayList());
                    }
                });
                f2906 = (f2907 + 45) % 128;
            }
        });
        int i11 = f2888 + 71;
        f2885 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 6 / 0;
        }
    }

    private jc(String str, String str2, jb jbVar, byte b10) {
        this.f2892 = str2;
        this.f2891 = 10000;
        this.f2893 = str;
        this.f2894 = jbVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2936(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2889)) ^ ((c11 >>> 5) + f2887)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2886) ^ ((c12 + i12) ^ ((c12 << 4) + f2890))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2939(jc jcVar, String str) {
        f2885 = (f2888 + 89) % 128;
        String strM2934 = jcVar.m2934(str);
        int i10 = f2885 + 111;
        f2888 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM2934;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m2942(jc jcVar, je jeVar) {
        f2885 = (f2888 + 59) % 128;
        String strM2940 = jcVar.m2940(jeVar);
        f2888 = (f2885 + 47) % 128;
        return strM2940;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2944(final je jeVar, final iu iuVar) {
        jb.m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static char f2917 = 13986;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f2918 = 1;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f2919;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static long f2920;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f2921;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m2949(String str, char c10, String str2, int i10, String str3) {
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
                                cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2920) ^ f2921) ^ f2917);
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                f2918 = (f2919 + 69) % 128;
                if (jc.m2935(jc.this).m2928(jc.m2939(jc.this, m2949("稇㧂犟╿", (char) (View.getDefaultSize(0, 0) + 32626), "˒", (-1623604614) - View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000").intern())) <= jc.m2937(jc.this)) {
                    String strM2942 = jc.m2942(jc.this, jeVar);
                    if (TextUtils.isEmpty(strM2942)) {
                        k.m3151(jc.m2941(jc.this), m2949("轭뻠\ud942祟", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "\uf2b1拠珯彧酥㝡య蹘톹媼螺\ue8b1", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000").intern(), m2949("㌗핍礀ᢙ", (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39289), "渻筱\ud9b5蠙舳\ueb82琬ㆶ⎷탿㼭䱩䡓ꤥ顙즽湝䪱嶺ᾓ읃䘤॰뒃ଔⷱ㎿\u181e쨪ꜚ䭑겇嗊鼺䐝ꅾ씫녎좸⛜\u2458枔麯큅穽", TextUtils.indexOf("", "", 0) + 13978931, "\u0000\u0000\u0000\u0000").intern(), true);
                        return;
                    }
                    try {
                        String string = jeVar.m2968().toString();
                        f2919 = (f2918 + 17) % 128;
                        k.m3150(jc.m2941(jc.this), m2949("轭뻠\ud942祟", (char) (ViewConfiguration.getTapTimeout() >> 16), "\uf2b1拠珯彧酥㝡య蹘톹媼螺\ue8b1", Color.alpha(0), "\u0000\u0000\u0000\u0000").intern(), m2949("㠦塦\u17ebଞ", (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 7703), "땖\udb01엚˯␋褖흄\uefb8㟱\ud87e栮ּ瑉釄㑆", (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 346528200, "\u0000\u0000\u0000\u0000").intern(), string, true);
                        jc.m2935(jc.this).m2924(strM2942, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                iu iuVar2 = iuVar;
                if (iuVar2 != null) {
                    p.m3251(iuVar2);
                }
            }
        });
        int i10 = f2885 + 91;
        f2888 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m2934(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2892);
        sb2.append(str);
        String string = sb2.toString();
        int i10 = f2888 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2885 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m2945(final b bVar) {
        jb.m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.3

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int[] f2897 = {-983644487, 1559506784, -571811020, -804378807, -231782613, -442676875, 1144708367, -622082578, -1425127842, -1562387873, -817292036, -1818619706, 720688820, -734158325, -819377400, 2015691269, -713258691, 1356507939};

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f2898 = 1;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f2899;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m2947(int[] iArr, int i10) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1845) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f2897.clone();
                        com.ironsource.adqualitysdk.sdk.i.d.f1846 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.d.f1846;
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
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = (c10 << 16) + c11;
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = (c12 << 16) + c13;
                                com.ironsource.adqualitysdk.sdk.i.d.m2179(iArr2);
                                for (int i13 = 0; i13 < 16; i13++) {
                                    int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1844 ^ iArr2[i13];
                                    com.ironsource.adqualitysdk.sdk.i.d.f1844 = i14;
                                    int iM2178 = com.ironsource.adqualitysdk.sdk.i.d.m2178(i14) ^ com.ironsource.adqualitysdk.sdk.i.d.f1847;
                                    int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1844;
                                    com.ironsource.adqualitysdk.sdk.i.d.f1844 = iM2178;
                                    com.ironsource.adqualitysdk.sdk.i.d.f1847 = i15;
                                }
                                int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1844;
                                int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1847;
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = i17;
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = i16;
                                int i18 = i16 ^ iArr2[16];
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = i18;
                                int i19 = i17 ^ iArr2[17];
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = i19;
                                cArr[0] = (char) (i19 >>> 16);
                                cArr[1] = (char) i19;
                                cArr[2] = (char) (i18 >>> 16);
                                cArr[3] = (char) i18;
                                com.ironsource.adqualitysdk.sdk.i.d.m2179(iArr2);
                                int i20 = com.ironsource.adqualitysdk.sdk.i.d.f1846;
                                cArr2[i20 << 1] = cArr[0];
                                cArr2[(i20 << 1) + 1] = cArr[1];
                                cArr2[(i20 << 1) + 2] = cArr[2];
                                cArr2[(i20 << 1) + 3] = cArr[3];
                                com.ironsource.adqualitysdk.sdk.i.d.f1846 = i20 + 2;
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                final int iM2928 = jc.m2935(jc.this).m2928(jc.m2939(jc.this, m2947(new int[]{-1635730098, -814473502}, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()));
                p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.3.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        bVar.mo759(iM2928);
                    }
                });
                int i10 = f2898 + 11;
                f2899 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 35 / 0;
                }
            }
        });
        int i10 = f2888 + 49;
        f2885 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m2946(final je jeVar) {
        jb.m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                jc.m2935(jc.this).m2926(jc.m2942(jc.this, jeVar));
            }
        });
        int i10 = f2885 + 105;
        f2888 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m2940(je jeVar) {
        int i10 = f2888 + 93;
        f2885 = i10 % 128;
        int i11 = i10 % 2;
        String strM2934 = m2934(jeVar.m2966());
        if (i11 != 0) {
            int i12 = 61 / 0;
        }
        f2885 = (f2888 + 69) % 128;
        return strM2934;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m2938() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2936("Ί햯⑉导ꛦ\ud9ed꒦ⳅệ铚벊ᶨ蒋툔", TextUtils.lastIndexOf("", '0') + 15).intern());
        sb2.append(this.f2893);
        String strI = com.google.android.gms.internal.play_billing.a.i(m2936("갾̪", 1 - TextUtils.indexOf("", "")), sb2);
        f2885 = (f2888 + 105) % 128;
        return strI;
    }
}
