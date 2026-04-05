package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.i.hl;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jh {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2972 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f2973 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2974 = 61;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f2975 = {2, -6, -13, 4, 13, 18, -31, 13, -9, 9, -15, 1, 10, 29, -28, 5, -18, 6, 27, -24, 11, -1, -13, 3, 37, -30, 22, -17, 82, -82, 3, 79, -56, -31, 22, -17, 82, -72, 5, -18, 6, -5, 84, -71, -7, 5, -11, 0, 15, -2, 71, -82, 3, -3, 0, 45, -4, 18, -4, 19, -30, -4, 19, 17, 52, -89, 13, -2, -1, 79, -83, 5, 5, 8, -19, 6, -1, 12, 67, -80, -5, 6, -3, 43, -48, 18, -4, 19, 54, -70, -3, 73, -71, -7, 5, -2, 8, -2, -3, 5, 67, -82, 3, -3, 0, 45, 0, 0, 0};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2976 = -191818690;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2977 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static jh f2978 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2979 = -1634707089;

    /* renamed from: ｋ, reason: contains not printable characters */
    private jl f2981;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2980 = new WeakHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ik f2982 = new ik(-1, -1, -1, -1);

    private jh() {
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2984(jh jhVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10 = f2972 + 7;
        f2977 = i10 % 128;
        int i11 = i10 % 2;
        jhVar.m2996(viewGroup, onLayoutChangeListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2985(jh jhVar, MotionEvent motionEvent) {
        f2972 = (f2977 + 53) % 128;
        jhVar.m2982(motionEvent);
        int i10 = f2977 + 87;
        f2972 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m2988(jh jhVar, ViewGroup viewGroup) {
        f2972 = (f2977 + 111) % 128;
        View.OnLayoutChangeListener onLayoutChangeListenerM2987 = jhVar.m2987(viewGroup);
        f2972 = (f2977 + 17) % 128;
        return onLayoutChangeListenerM2987;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2992(View view, hl.c cVar) {
        f2977 = (f2972 + 13) % 128;
        m2990(view, cVar);
        int i10 = f2977 + 57;
        f2972 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ViewGroup m2994(ViewGroup viewGroup, ViewGroup viewGroup2) {
        f2972 = (f2977 + 23) % 128;
        ViewGroup viewGroupM2989 = m2989(viewGroup, viewGroup2);
        int i10 = f2972 + 47;
        f2977 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 68 / 0;
        }
        return viewGroupM2989;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2986(ViewGroup viewGroup) {
        f2977 = (f2972 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        try {
            if (viewGroup.getChildCount() == 0) {
                return false;
            }
            f2977 = (f2972 + 93) % 128;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (!(viewGroup.getChildAt(i10) instanceof TextView)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            k.m3145(m2981((-35) - TextUtils.getOffsetAfter("", 0), (short) Drawable.resolveOpacity(0, 0), 1634707089 - (Process.myTid() >> 22), (byte) Color.red(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 191818761).intern(), m2981((-10) - Gravity.getAbsoluteGravity(0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myPid() >> 22) + 1634707145, (byte) TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 191818759).intern(), th2);
            return false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2997(jh jhVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f2972 = (f2977 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        jhVar.m2991(viewGroup, onLayoutChangeListener);
        f2977 = (f2972 + 79) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2999() {
        try {
            f2972 = (f2977 + 19) % 128;
            if (this.f2981 == null) {
                this.f2981 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.jl
                    /* renamed from: ﾇ */
                    public final void mo548(View view) {
                        if (q.m3297().m3315()) {
                            jh.this.m3001();
                            return;
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroupM2994 = (ViewGroup) view;
                            if (viewGroupM2994.getContext() instanceof Activity) {
                                viewGroupM2994 = jh.m2994(viewGroupM2994, (ViewGroup) ((Activity) viewGroupM2994.getContext()).findViewById(R.id.content));
                            }
                            jh jhVar = jh.this;
                            jh.m2997(jhVar, viewGroupM2994, jh.m2988(jhVar, viewGroupM2994));
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.jl
                    /* renamed from: ﻛ */
                    public final void mo543(View view) {
                    }
                };
                ji.m3008().m3011(this.f2981);
                f2977 = (f2972 + 41) % 128;
            }
            int i10 = f2977 + 73;
            f2972 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ik m3000() {
        ik ikVar;
        int i10 = f2977;
        ikVar = this.f2982;
        f2972 = (i10 + 103) % 128;
        return ikVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m3001() {
        try {
            f2977 = (f2972 + 69) % 128;
            if (this.f2981 != null) {
                for (RelativeLayout relativeLayout : this.f2980.keySet()) {
                    f2977 = (f2972 + 9) % 128;
                    ViewParent parent = relativeLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(relativeLayout);
                    }
                }
                this.f2980.clear();
                ji.m3008().m3012(this.f2981);
                this.f2981 = null;
            }
            f2972 = (f2977 + 29) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static ViewGroup m2989(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i10 = f2977;
        int i11 = i10 + 19;
        int i12 = i11 % 128;
        f2972 = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (viewGroup2 == null) {
            f2972 = (i10 + 35) % 128;
            return viewGroup;
        }
        f2977 = (i12 + 77) % 128;
        ViewGroup viewGroup3 = viewGroup2;
        while (viewGroup2 != null) {
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            } else {
                if (viewGroup3 != viewGroup2) {
                    return viewGroup3;
                }
                f2972 = (f2977 + 61) % 128;
                return viewGroup2;
            }
        }
        return viewGroup2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2998(jh jhVar, ik ikVar) {
        f2972 = (f2977 + 101) % 128;
        jhVar.m2993(ikVar);
        int i10 = f2972 + 97;
        f2977 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x000f, B:18:0x0027, B:25:0x003c, B:17:0x0020, B:12:0x0019, B:15:0x001c, B:8:0x0013, B:21:0x0037), top: B:32:0x0003, inners: #0, #2 }] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.jh m2995() {
        /*
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.jh> r0 = com.ironsource.adqualitysdk.sdk.i.jh.class
            monitor-enter(r0)
            int r1 = com.ironsource.adqualitysdk.sdk.i.jh.f2972     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.jh.f2977 = r2     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 % 2
            if (r1 == 0) goto L1c
            com.ironsource.adqualitysdk.sdk.i.jh r1 = com.ironsource.adqualitysdk.sdk.i.jh.f2978     // Catch: java.lang.Throwable -> L1a
            r2 = 77
            int r2 = r2 / 0
            if (r1 != 0) goto L27
            goto L20
        L18:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r1 = move-exception
            goto L3f
        L1c:
            com.ironsource.adqualitysdk.sdk.i.jh r1 = com.ironsource.adqualitysdk.sdk.i.jh.f2978     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L27
        L20:
            com.ironsource.adqualitysdk.sdk.i.jh r1 = new com.ironsource.adqualitysdk.sdk.i.jh     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            com.ironsource.adqualitysdk.sdk.i.jh.f2978 = r1     // Catch: java.lang.Throwable -> L1a
        L27:
            com.ironsource.adqualitysdk.sdk.i.jh r1 = com.ironsource.adqualitysdk.sdk.i.jh.f2978     // Catch: java.lang.Throwable -> L1a
            int r2 = com.ironsource.adqualitysdk.sdk.i.jh.f2972     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 + 75
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.jh.f2977 = r3     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 % 2
            if (r2 == 0) goto L3d
            r2 = 59
            int r2 = r2 / 0
            monitor-exit(r0)
            return r1
        L3b:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1a
        L3d:
            monitor-exit(r0)
            return r1
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jh.m2995():com.ironsource.adqualitysdk.sdk.i.jh");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2983(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jh.m2985(jh.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f2980.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m2987(final ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.5

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f2989 = 1;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char f2990 = 5;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char[] f2991 = {'G', 'l', 'o', 'b', 'a', 'T', AbstractJsonLexerKt.UNICODE_ESC, 'c', GMTDateParser.HOURS, 'L', 'i', GMTDateParser.SECONDS, 't', 'e', 'n', 'r', 'S', 'v', 'E', ' ', 'y', 'C', 'g', 'H', 'I'};

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f2992;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m3002(int i10, byte b10, String str) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (h.f2445) {
                    try {
                        char[] cArr2 = f2991;
                        char c10 = f2990;
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
                f2992 = (f2989 + 19) % 128;
                if (!q.m3297().m3315()) {
                    int i18 = f2989 + 39;
                    f2992 = i18 % 128;
                    try {
                        if (i18 % 2 == 0) {
                            jh.m2997(jh.this, viewGroup, this);
                            return;
                        } else {
                            jh.m2997(jh.this, viewGroup, this);
                            int i19 = 41 / 0;
                            return;
                        }
                    } catch (Throwable th2) {
                        kd.m3203(m3002(TextUtils.lastIndexOf("", '0') + 27, (byte) (2 - KeyEvent.getDeadChar(0, 0)), "\u0001\u0002\u0003\u0004\u0000\u0002\u0007\u0000\u0007\b\t\u0005\u000b\f\r\u000e\n\u000e\u0010\u0011\n\u0012\u000f\f\b\f").intern(), m3002((ViewConfiguration.getTapTimeout() >> 16) + 23, (byte) (105 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0013\u0010\u0011\u0000\u0010\u000f\u000b\n\u0011\u0004\u0013\u000e\u0000\u0018\u0001\u0007\u000b\u0016\t\u0003\f\u0018Í").intern(), th2, false);
                    }
                }
                f2989 = (f2992 + 3) % 128;
            }
        };
        f2972 = (f2977 + 43) % 128;
        return onLayoutChangeListener;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2991(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10 = f2977;
        f2972 = (i10 + 9) % 128;
        if (viewGroup != null) {
            int i11 = i10 + 91;
            f2972 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 68 / 0;
                if (m2986(viewGroup)) {
                    return;
                }
            } else if (m2986(viewGroup)) {
                return;
            }
            Activity activityM3210 = ke.m3210(viewGroup);
            if (jk.m3017().m3020(activityM3210)) {
                if (viewGroup.findViewById(160766228) == null) {
                    int i13 = f2977 + 109;
                    f2972 = i13 % 128;
                    if (i13 % 2 != 0) {
                        m2983(viewGroup, onLayoutChangeListener);
                        return;
                    } else {
                        m2983(viewGroup, onLayoutChangeListener);
                        throw null;
                    }
                }
                return;
            }
            if (jk.m3017().m3019(activityM3210)) {
                m2996(viewGroup, onLayoutChangeListener);
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2993(ik ikVar) {
        int i10 = f2972 + 75;
        int i11 = i10 % 128;
        f2977 = i11;
        if (i10 % 2 != 0) {
            this.f2982 = ikVar;
            throw null;
        }
        this.f2982 = ikVar;
        f2972 = (i11 + 25) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2996(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final hl.c cVar = new hl.c() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hl.c
            /* renamed from: ﻛ */
            public final boolean mo2158(hl hlVar, View view, MotionEvent motionEvent) {
                jh.m2985(jh.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.9
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                jh.m2992(viewGroup, cVar);
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof ViewGroup) {
                        jh.m2984(jh.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jh.m2992(childAt, cVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        int i10 = f2972 + 99;
        f2977 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2982(MotionEvent motionEvent) {
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.7

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static int f2995 = 1;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f2996 = {'G', 'l', 'o', 'b', 'a', 'T', AbstractJsonLexerKt.UNICODE_ESC, 'c', GMTDateParser.HOURS, 'L', 'i', GMTDateParser.SECONDS, 't', 'e', 'n', 'r', 'S', 'v', ' ', GMTDateParser.DAY_OF_MONTH, 'f', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.END_OBJ, 'E', 'H', 'I', 'J', 'K', GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', 'R'};

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static int f2997 = 0;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static char f2998 = 6;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m3003(int i10, byte b10, String str) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (h.f2445) {
                        try {
                            char[] cArr2 = f2996;
                            char c10 = f2998;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    f2995 = (f2997 + 79) % 128;
                    try {
                        int iRound = Math.round(motionEventObtain.getRawX());
                        int iRound2 = Math.round(motionEventObtain.getRawY());
                        if (ju.m3084(iRound, iRound2)) {
                            jh.m2998(jh.this, new ik(iRound, iRound2, jv.m3085(), jv.m3089()));
                            return;
                        }
                        String strIntern = m3003(26 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (119 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u0003\u0007\b\t\n\u000b\u0006\r\u000e\u000f\u000e\u0010\u0011\u000e\u0010\u0010\u000b\r\u0013").intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m3003(49 - View.MeasureSpec.getSize(0), (byte) (Color.red(0) + 54), "\u0000\u0003\u0007\b\u0006\u0014\u000e\f\u000e\u000f\u0012\u0018\u0010\u000e\r\u0013\u000b\u0010\u0013\u0019\u0014\u0000\f\u0012\u0014\u0000\u0015\u0013\u0004\u0003\b\f\u0017\u0007\u0013\u0006¥¥\r\u0015\b\u0010\u0000\u0010\u0011\u0007\u0016\u0013±").intern());
                        sb2.append(iRound);
                        sb2.append(m3003((ViewConfiguration.getWindowTouchSlop() >> 8) + 2, (byte) (47 - Color.blue(0)), "\u0012\u0013").intern());
                        sb2.append(iRound2);
                        sb2.append(m3003((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (1 - View.resolveSize(0, 0)), "~").intern());
                        k.m3147(strIntern, sb2.toString());
                        f2997 = (f2995 + 1) % 128;
                    } catch (Throwable th2) {
                        kd.m3203(m3003(26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (KeyEvent.getDeadChar(0, 0) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u0003\u0007\b\t\n\u000b\u0006\r\u000e\u000f\u000e\u0010\u0011\u000e\u0010\u0010\u000b\r\u0013").intern(), m3003(TextUtils.getOffsetAfter("", 0) + 16, (byte) (ExpandableListView.getPackedPositionChild(0L) + 99), "\u001b\r\u000e\u0003\f\u0015\b\u0010\u0014\u0000\u0011\u0002\u0000\b\b\t").intern(), th2, false);
                    }
                }
            });
            f2972 = (f2977 + 45) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2981((-36) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 1634707089 - Drawable.resolveOpacity(0, 0), (byte) Color.argb(0, 0, 0, 0), 191818761 - TextUtils.getCapsMode("", 0, 0)).intern(), m2981((-29) - View.MeasureSpec.getSize(0), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 1634707114, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 191818759 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th2, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2981(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2974;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2975;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f2979 + i11] + i13);
                    } else {
                        i14 = (short) (f2973[f2979 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f2979 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f2976);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f2975;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f2973;
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m2990(View view, hl.c cVar) {
        int i10 = f2972 + 79;
        f2977 = i10 % 128;
        int i11 = i10 % 2;
        jy.m3109(view, cVar);
        if (i11 != 0) {
            int i12 = 62 / 0;
        }
    }
}
