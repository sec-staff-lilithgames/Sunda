package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.HashMap;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class jb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2867 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Handler f2868 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2869 = 169;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2870;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ib f2871;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        /* renamed from: ﾇ, reason: contains not printable characters */
        void mo2931(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        /* renamed from: ﾒ, reason: contains not printable characters */
        void mo2932();
    }

    public jb(Context context, String str, String str2) {
        this.f2871 = new ib(context, str, str2);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Handler m2917() {
        Handler handler;
        synchronized (jb.class) {
            try {
                if (f2868 == null) {
                    HandlerThread handlerThread = new HandlerThread(m2916(271 - Color.alpha(0), 14 - TextUtils.indexOf((CharSequence) "", '0'), "\u0013\uffff￥\uffff\u0001\ufffb\f\t\u000e￭\uffff\u000f\u0006\ufffb\ufff0", 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), true).intern());
                    handlerThread.start();
                    f2868 = new Handler(handlerThread.getLooper());
                }
                handler = f2868;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2919(jb jbVar, d dVar) {
        int i10 = f2867 + 29;
        f2870 = i10 % 128;
        int i11 = i10 % 2;
        jbVar.m2918(dVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2920(String str) {
        String strI = com.google.android.gms.internal.play_billing.a.i(m2916(TextUtils.indexOf((CharSequence) "", '0') + 272, Color.alpha(0) + 11, "\n\ufffe\ufffb\u000e\uffff\uffc8\u0006\ufffb\r\u000e\u000f", 5 - (ViewConfiguration.getScrollBarSize() >> 8), false), o2.u(str));
        f2867 = (f2870 + 17) % 128;
        return strI;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap<String, String> m2922(String str, int i10) {
        int i11 = f2867 + 111;
        f2870 = i11 % 128;
        if (i11 % 2 != 0) {
            this.f2871.m2784(str, i10);
            throw null;
        }
        HashMap<String, String> mapM2784 = this.f2871.m2784(str, i10);
        int i12 = f2870 + 39;
        f2867 = i12 % 128;
        if (i12 % 2 != 0) {
            return mapM2784;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2927(final String str, final b bVar) {
        m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                final String strM2921 = jb.this.m2921(str);
                p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.5.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        bVar.mo2931(strM2921);
                    }
                });
            }
        });
        f2867 = (f2870 + 23) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m2921(String str) {
        int i10 = f2870 + 65;
        f2867 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2871.m2786(str);
            throw null;
        }
        String strM2786 = this.f2871.m2786(str);
        int i11 = f2870 + 81;
        f2867 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 2 / 0;
        }
        return strM2786;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2926(String str) {
        f2870 = (f2867 + 1) % 128;
        this.f2871.m2782(str);
        f2870 = (f2867 + 23) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m2928(String str) {
        f2870 = (f2867 + 73) % 128;
        int iM2783 = this.f2871.m2783(str);
        f2867 = (f2870 + 65) % 128;
        return iM2783;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2918(d dVar) {
        f2870 = (f2867 + 25) % 128;
        if (dVar != null) {
            p.m3251(new iu(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                }
            });
        }
        int i10 = f2870 + 1;
        f2867 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m2923(String str, String str2) {
        int i10 = f2870 + 101;
        f2867 = i10 % 128;
        int i11 = i10 % 2;
        m2925(str, str2, null);
        if (i11 == 0) {
            throw null;
        }
        f2867 = (f2870 + 9) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m2929(String str, String str2) {
        f2870 = (f2867 + 49) % 128;
        m2924(str, str2);
        m2924(m2920(str), Long.toString(jv.m3085()));
        f2870 = (f2867 + 13) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2916(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2869);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m2930(final String str, final String str2, final d dVar) {
        m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                jb.this.m2929(str, str2);
                jb.m2919(jb.this, dVar);
            }
        });
        f2867 = (f2870 + 7) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2924(String str, String str2) {
        f2870 = (f2867 + 17) % 128;
        this.f2871.m2785(str, str2);
        int i10 = f2867 + 35;
        f2870 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2925(final String str, final String str2, final d dVar) {
        m2917().post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jb.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                jb.this.m2924(str, str2);
                jb.m2919(jb.this, dVar);
            }
        });
        int i10 = f2870 + 13;
        f2867 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }
}
