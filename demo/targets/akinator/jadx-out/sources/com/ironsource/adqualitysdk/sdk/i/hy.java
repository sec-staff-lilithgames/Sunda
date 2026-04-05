package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hz;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hy {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2596 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2597 = 64881;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2598 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2599 = 17772;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2600 = 155;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2601 = 1193;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2602 = 43667;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<hz.b, hv> f2603;

    public hy() {
        m2698(254 - View.resolveSizeAndState(0, 0, 0), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 9 - TextUtils.indexOf("", ""), false).intern();
        this.f2603 = new HashMap();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static List m2699(Object obj, hz hzVar, int i10) {
        int i11 = f2598 + 51;
        f2596 = i11 % 128;
        if (i11 % 2 == 0) {
            m2700(obj, hzVar.m2729(i10), hzVar.m2738(i10), hzVar.m2736(i10));
            throw null;
        }
        List listM2700 = m2700(obj, hzVar.m2729(i10), hzVar.m2738(i10), hzVar.m2736(i10));
        int i12 = f2596 + 9;
        f2598 = i12 % 128;
        if (i12 % 2 == 0) {
            return listM2700;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List<Object> m2706(Class cls, Object obj, hm hmVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hu.m2670().m2673().m2615(cls, hmVar).iterator();
            while (it.hasNext()) {
                f2598 = (f2596 + 1) % 128;
                arrayList.add(it.next().get(obj));
            }
            f2598 = (f2596 + 51) % 128;
            return arrayList;
        } catch (Throwable unused) {
            String strIntern = m2698(TextUtils.indexOf("", "", 0) + 254, 11 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 9 - (KeyEvent.getMaxKeyCode() >> 16), false).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2705("䟪\ufdd9\ue55d옦蓝銹\uf1f6↝ς᠐䁏\u31ee݄\uabfc", 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(hmVar.m2593());
            sb2.append(m2705("̩覻嘐\uf45d뒤Ĩ\ueead齿\u0380畜됖\udd97", (Process.myPid() >> 22) + 11).intern());
            sb2.append(cls);
            sb2.append(m2698(TextUtils.lastIndexOf("", '0', 0, 0) + 250, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, "ￂ\u0005\u000e\u0003\u0015\u0015", TextUtils.getOffsetBefore("", 0) + 6, false).intern());
            k.m3147(strIntern, sb2.toString());
            return arrayList;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m2715(Class cls, Object obj, hm hmVar, T t10) {
        f2598 = (f2596 + 107) % 128;
        try {
            Field fieldM2613 = hu.m2670().m2673().m2613(cls, hmVar);
            if (fieldM2613 == null) {
                return t10;
            }
            T t11 = (T) fieldM2613.get(obj);
            int i10 = f2598 + 103;
            f2596 = i10 % 128;
            if (i10 % 2 != 0) {
                return t11;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m2698(254 - (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 13, "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2705("䟪\ufdd9\ue55d옦蓝銹\uf1f6↝ς᠐䁏\u31ee݄\uabfc", View.resolveSize(0, 0) + 14).intern());
            sb2.append(hmVar.m2593());
            sb2.append(m2705("̩覻嘐\uf45d뒤Ĩ\ueead齿\u0380畜됖\udd97", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11).intern());
            sb2.append(cls);
            sb2.append(m2698(249 - TextUtils.indexOf("", "", 0), 6 - Color.red(0), "ￂ\u0005\u000e\u0003\u0015\u0015", 6 - View.MeasureSpec.makeMeasureSpec(0, 0), false).intern());
            k.m3147(strIntern, sb2.toString());
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final <T> hs<T> m2718(Object obj, ia iaVar, hq hqVar, List<String> list, int i10) {
        hs<T> hsVarM2722 = m2722(obj, new hz.a().m2752(true).m2753(iaVar, hqVar, list, i10));
        f2596 = (f2598 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return hsVarM2722;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final <T> hs<T> m2722(Object obj, hz hzVar) {
        long j10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        hz.b bVarM2732 = hzVar.m2732(obj.getClass());
        hv hvVar = this.f2603.get(bVarM2732);
        if (hvVar != null) {
            int i10 = f2598 + 41;
            f2596 = i10 % 128;
            if (i10 % 2 == 0) {
                m2703(obj, hvVar);
                throw null;
            }
            hs<T> hsVarM2703 = m2703(obj, hvVar);
            if (hsVarM2703 != null) {
                int i11 = f2596 + 105;
                j10 = 0;
                f2598 = i11 % 128;
                if (i11 % 2 != 0) {
                    m2707(hzVar.m2733(), hsVarM2703);
                    throw null;
                }
                if (m2707(hzVar.m2733(), hsVarM2703)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2698(247 - TextUtils.getTrimmedLength(""), (-16777197) - Color.rgb(0, 0, 0), "\n\u0013\u0019\u0012\bￄ\n\u0016\u0013\u0011ￄ\u0014\u0005\u0018\fￄ\r\u0012ￄ", MotionEvent.axisFromString("") + 20, false).intern());
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    m2712(hsVarM2703, obj, com.google.android.gms.internal.play_billing.a.i(m2705("禨鎄", 1 - TextUtils.lastIndexOf("", '0')), sb2));
                    return hsVarM2703;
                }
            } else {
                j10 = 0;
            }
            String strIntern = m2698(254 - (KeyEvent.getMaxKeyCode() >> 16), (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)) + 11, "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, false).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(m2698(245 - TextUtils.getOffsetBefore("", 0), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0013ￆ\u000e\u001a\u0007\u0016ￆ￠\u0019\u0019\u000f", AndroidCharacter.getMirror('0') - '(', true).intern());
            k.m3147(strIntern, sb3.toString());
            this.f2603.remove(bVarM2732);
        } else {
            j10 = 0;
        }
        hw<T> hwVar = new hw<>(hzVar);
        hs<T> hsVarM2701 = m2701(obj, hwVar, 0, null);
        if (hsVarM2701 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2705("֔丱\uf244릑롚\ue148䁏\u31ee됖\udd97", 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb4.append(m2698((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 230, 3 - ((byte) KeyEvent.getModifierMetaStateMask()), "(\"ￕ￡", 1 - ImageFormat.getBitsPerPixel(0), true).intern());
            sb4.append(hwVar.m2682().size());
            m2712(hsVarM2701, obj, com.google.android.gms.internal.play_billing.a.i(m2698(247 - TextUtils.getTrimmedLength(""), 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0007\t\u000e\u0006\u0013ￄ\u0018\t\u0017ￄ\u0012\rￄ\u0017\u0018", KeyEvent.getDeadChar(0, 0) + 6, true), sb4));
            this.f2603.put(bVarM2732, hwVar.m2681());
            return hsVarM2701;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(m2705("忦뻰\ue492Ȥ֔丱\uf244릑롚\ue148䁏\u31ee됖\udd97", 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
        sb5.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb5.append(m2698(Drawable.resolveOpacity(0, 0) + 230, (ViewConfiguration.getTapTimeout() >> 16) + 4, "(\"ￕ￡", 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), true).intern());
        sb5.append(hwVar.m2682().size());
        m2712((hs) null, obj, com.google.android.gms.internal.play_billing.a.i(m2698(Gravity.getAbsoluteGravity(0, 0) + 247, 15 - (ExpandableListView.getPackedPositionForGroup(0) > j10 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j10 ? 0 : -1)), "\u0007\t\u000e\u0006\u0013ￄ\u0018\t\u0017ￄ\u0012\rￄ\u0017\u0018", (Process.myTid() >> 22) + 6, true), sb5));
        int i12 = f2596 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2598 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 85 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List m2700(java.lang.Object r2, boolean r3, boolean r4, boolean r5) {
        /*
            r0 = 0
            if (r2 == 0) goto L6b
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L19
            int r1 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r1 = r1 + 47
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r1
            if (r3 == 0) goto L19
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
            goto L6b
        L19:
            java.lang.Class r3 = r2.getClass()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L45
            int r3 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r3 = r3 + 33
            int r1 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r1
            int r3 = r3 % 2
            if (r3 != 0) goto L35
            r3 = 4
            int r3 = r3 / 0
            if (r5 == 0) goto L45
            goto L37
        L35:
            if (r5 == 0) goto L45
        L37:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            goto L6b
        L45:
            boolean r3 = r2 instanceof java.util.Map
            if (r3 == 0) goto L6b
            int r3 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r3 = r3 + 81
            int r5 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L6a
            if (r4 == 0) goto L6b
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map r2 = (java.util.Map) r2
            java.util.Collection r3 = r2.values()
            r0.<init>(r3)
            java.util.Set r2 = r2.keySet()
            r0.addAll(r2)
            goto L6b
        L6a:
            throw r0
        L6b:
            int r2 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r2 = r2 + 55
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L7b
            r2 = 57
            int r2 = r2 / 0
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hy.m2700(java.lang.Object, boolean, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[SYNTHETIC] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> com.ironsource.adqualitysdk.sdk.i.hs<T> m2701(java.lang.Object r10, com.ironsource.adqualitysdk.sdk.i.hw<T> r11, int r12, com.ironsource.adqualitysdk.sdk.i.hs r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hy.m2701(java.lang.Object, com.ironsource.adqualitysdk.sdk.i.hw, int, com.ironsource.adqualitysdk.sdk.i.hs):com.ironsource.adqualitysdk.sdk.i.hs");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<hs> m2724(Object obj, hz hzVar) {
        hw hwVar = new hw(hzVar);
        hwVar.m2685();
        m2701(obj, hwVar, 0, null);
        ArrayList arrayList = new ArrayList(hwVar.m2679());
        f2596 = (f2598 + 13) % 128;
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private <T> hs<T> m2703(Object obj, hv hvVar) {
        List<Field> list;
        int i10 = f2598 + 51;
        f2596 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                list = hvVar.m2674().get(0);
            } else {
                list = hvVar.m2674().get(0);
            }
            return m2702(m2714(obj, list, (hs) null), hvVar, 1);
        } catch (Exception e10) {
            k.m3145(m2698(253 - TextUtils.indexOf((CharSequence) "", '0', 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 9 - (ViewConfiguration.getTapTimeout() >> 16), false).intern(), m2705("䟪\ufdd9\ue55d옦蓝銹\uf1f6↝ς᠐䁏\u31ee݄\uabfc\u2fe1䥔ㆀ췗䗹䃘聘ⴈ降\uf3cc롚\ue148\ueead齿\u0380畜꼡Ⓨ\ue22a᪐࣐ꖩ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34).intern(), (Throwable) e10);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> hs<T> m2714(Object obj, List<Field> list, hs hsVar) throws IllegalAccessException, IllegalArgumentException {
        Object obj2;
        int i10 = f2598 + 101;
        f2596 = i10 % 128;
        if (i10 % 2 != 0) {
            for (Field field : list) {
                if (WeakReference.class.isAssignableFrom(field.getType())) {
                    f2598 = (f2596 + 3) % 128;
                    obj2 = ((WeakReference) field.get(obj)).get();
                } else {
                    obj2 = field.get(obj);
                }
                hsVar = m2710(field, obj, hsVar);
                obj = obj2;
            }
            return hsVar;
        }
        list.iterator();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2698(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2600);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r8 = m2698(android.widget.ExpandableListView.getPackedPositionChild(0) + 255, 11 - android.view.MotionEvent.axisFromString(""), "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 9 - android.view.View.MeasureSpec.getMode(0), false).intern();
        r9 = new java.lang.StringBuilder();
        r9.append(m2705("䫈\ue1d4嶠⏠䗹䃘傭뷦韕亵⇙웰䜴蕃䗹䃘濟≞δ䑙鹌配彽쵐ᣊ盭\uef1dꜣ뮸ꗀ鋬룟烊ῷ傭뷦됖\udd97", 37 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern());
        r9.append(r3.getClass());
        com.ironsource.adqualitysdk.sdk.i.k.m3147(r8, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (r4.hasNext() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        r5 = m2714(r5, r0, m2709(r3, r5, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r8 = m2702(r5, r9, r10 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.hy.f2598 = (com.ironsource.adqualitysdk.sdk.i.hy.f2596 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.hy.f2598 = (com.ironsource.adqualitysdk.sdk.i.hy.f2596 + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.hy.f2596 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        if ((r8 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        r8 = 29 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r4 == null) goto L11;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> com.ironsource.adqualitysdk.sdk.i.hs<T> m2702(com.ironsource.adqualitysdk.sdk.i.hs r8, com.ironsource.adqualitysdk.sdk.i.hv r9, int r10) {
        /*
            r7 = this;
            java.util.List r0 = r9.m2674()
            int r0 = r0.size()
            if (r10 >= r0) goto Lcb
            int r0 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L30
            java.util.List r0 = r9.m2674()
            java.lang.Object r0 = r0.get(r10)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r8.mo2643()
            java.util.List r4 = m2711(r3)
            r5 = 49
            int r5 = r5 / r1
            if (r4 != 0) goto L8b
            goto L44
        L30:
            java.util.List r0 = r9.m2674()
            java.lang.Object r0 = r0.get(r10)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r8.mo2643()
            java.util.List r4 = m2711(r3)
            if (r4 != 0) goto L8b
        L44:
            r8 = 0
            int r8 = android.widget.ExpandableListView.getPackedPositionChild(r8)
            int r8 = r8 + 255
            java.lang.String r9 = ""
            int r9 = android.view.MotionEvent.axisFromString(r9)
            int r9 = 11 - r9
            int r10 = android.view.View.MeasureSpec.getMode(r1)
            int r10 = 9 - r10
            java.lang.String r0 = "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007"
            java.lang.String r8 = m2698(r8, r9, r0, r10, r1)
            java.lang.String r8 = r8.intern()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = android.graphics.drawable.Drawable.resolveOpacity(r1, r1)
            int r10 = 37 - r10
            java.lang.String r0 = "䫈\ue1d4嶠⏠䗹䃘傭뷦韕亵⇙웰䜴蕃䗹䃘濟≞δ䑙鹌配彽쵐ᣊ盭\uef1dꜣ뮸ꗀ鋬룟烊ῷ傭뷦됖\udd97"
            java.lang.String r10 = m2705(r0, r10)
            java.lang.String r10 = r10.intern()
            r9.append(r10)
            java.lang.Class r10 = r3.getClass()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.ironsource.adqualitysdk.sdk.i.k.m3147(r8, r9)
            return r2
        L8b:
            java.util.Iterator r4 = r4.iterator()
        L8f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r4.next()
            com.ironsource.adqualitysdk.sdk.i.hs r6 = m2709(r3, r5, r8)     // Catch: java.lang.Exception -> L8f
            com.ironsource.adqualitysdk.sdk.i.hs r5 = m2714(r5, r0, r6)     // Catch: java.lang.Exception -> L8f
            if (r5 == 0) goto Lb2
            int r6 = r10 + 1
            com.ironsource.adqualitysdk.sdk.i.hs r8 = r7.m2702(r5, r9, r6)     // Catch: java.lang.Exception -> L8f
            int r9 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r9 = r9 + 19
            int r9 = r9 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r9
            return r8
        Lb2:
            int r5 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r5 = r5 + 109
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r5
            goto L8f
        Lbb:
            int r8 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r8 = r8 + 121
            int r9 = r8 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r9
            int r8 = r8 % 2
            if (r8 == 0) goto Lca
            r8 = 29
            int r8 = r8 / r1
        Lca:
            return r2
        Lcb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hy.m2702(com.ironsource.adqualitysdk.sdk.i.hs, com.ironsource.adqualitysdk.sdk.i.hv, int):com.ironsource.adqualitysdk.sdk.i.hs");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hs m2713(hs hsVar, hw hwVar, int i10) {
        Iterator it;
        f2596 = (f2598 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        Object objMo2643 = hsVar.mo2643();
        hs hsVarM2713 = null;
        if (!hwVar.m2682().contains(objMo2643) && !hwVar.m2680().contains(objMo2643)) {
            if (hwVar.m2686().m2734(i10) && m2707(hwVar.m2686().m2733(), hsVar)) {
                if (hwVar.m2684()) {
                    hwVar.m2687(hsVar);
                    hwVar.m2683(objMo2643);
                }
                return hsVar;
            }
            if (objMo2643 instanceof WeakReference) {
                int i11 = f2596 + 3;
                f2598 = i11 % 128;
                if (i11 % 2 == 0) {
                    if (((WeakReference) objMo2643).get() != null && hwVar.m2686().m2740(i10)) {
                        WeakReference weakReference = (WeakReference) objMo2643;
                        if (m2716(weakReference.get(), hwVar.m2686().m2739())) {
                            return m2701(weakReference.get(), hwVar, i10 + 1, hsVar);
                        }
                    }
                } else {
                    ((WeakReference) objMo2643).get();
                    throw null;
                }
            }
            if (m2716(objMo2643, hwVar.m2686().m2739())) {
                int i12 = f2598 + 45;
                f2596 = i12 % 128;
                return i12 % 2 == 0 ? m2701(objMo2643, hwVar, i10 / 0, hsVar) : m2701(objMo2643, hwVar, i10 + 1, hsVar);
            }
            if (hwVar.m2686().m2731() && objMo2643 != null) {
                hwVar.m2682().add(objMo2643);
            }
            List listM2699 = m2699(objMo2643, hwVar.m2686(), i10);
            hv hvVarM2681 = hwVar.m2681();
            if (listM2699 != null) {
                int i13 = f2596 + 115;
                f2598 = i13 % 128;
                if (i13 % 2 != 0) {
                    it = listM2699.iterator();
                    int i14 = 52 / 0;
                } else {
                    it = listM2699.iterator();
                }
                while (it.hasNext()) {
                    hs hsVarM2709 = m2709(objMo2643, it.next(), hsVar);
                    hvVarM2681.m2678();
                    hsVarM2713 = m2713(hsVarM2709, hwVar, i10);
                    if (hsVarM2713 != null) {
                        int i15 = f2596 + 79;
                        f2598 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 87 / 0;
                            if (!hwVar.m2684()) {
                                return hsVarM2713;
                            }
                        } else if (!hwVar.m2684()) {
                            return hsVarM2713;
                        }
                    }
                    hvVarM2681.m2676();
                }
            }
        }
        return hsVarM2713;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m2721(Object obj, List<String> list, int i10) {
        hw hwVar = new hw(new hz.a().m2745(true).m2747(true).m2755(true).m2744(-1).m2756(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.hy.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* renamed from: ﾇ */
            public final boolean mo2192(hs hsVar) {
                return hsVar.mo2643() instanceof String;
            }
        }, list, i10));
        hwVar.m2685();
        m2701(obj, hwVar, 0, null);
        ArrayList arrayList = new ArrayList(hwVar.m2680());
        int i11 = f2598 + 5;
        f2596 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 93 / 0;
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2707(ia iaVar, hs hsVar) {
        int i10 = f2598 + 85;
        f2596 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                boolean zMo2192 = iaVar.mo2192(hsVar);
                int i11 = f2596 + 1;
                f2598 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 20 / 0;
                }
                return zMo2192;
            }
            iaVar.mo2192(hsVar);
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[SYNTHETIC] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m2704(java.lang.Object r8, java.lang.Class r9, java.lang.String r10) throws java.lang.SecurityException {
        /*
            r7 = this;
        L0:
            if (r9 == 0) goto L72
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L72
            java.lang.reflect.Field[] r0 = m2708(r9)
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r1) goto L6d
            int r4 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r4 = r4 + 31
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r4
            r4 = r0[r3]
            r5 = 1
            r4.setAccessible(r5)
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L6a
            if (r4 == 0) goto L6a
            int r5 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r5 = r5 + 105
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L49
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r10)     // Catch: java.lang.Exception -> L6a
            java.util.regex.Matcher r5 = r5.matcher(r4)     // Catch: java.lang.Exception -> L6a
            boolean r5 = r5.matches()     // Catch: java.lang.Exception -> L6a
            r6 = 13
            int r6 = r6 / r2
            if (r5 == 0) goto L6a
            goto L57
        L47:
            r8 = move-exception
            throw r8
        L49:
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r10)     // Catch: java.lang.Exception -> L6a
            java.util.regex.Matcher r5 = r5.matcher(r4)     // Catch: java.lang.Exception -> L6a
            boolean r5 = r5.matches()     // Catch: java.lang.Exception -> L6a
            if (r5 == 0) goto L6a
        L57:
            int r5 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r5 = r5 + 121
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L69
            r5 = 33
            int r5 = r5 / r2
            goto L69
        L67:
            r8 = move-exception
            throw r8
        L69:
            return r4
        L6a:
            int r3 = r3 + 1
            goto L11
        L6d:
            java.lang.Class r9 = r9.getSuperclass()
            goto L0
        L72:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hy.m2704(java.lang.Object, java.lang.Class, java.lang.String):java.lang.String");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static List m2711(Object obj) {
        int i10 = f2598 + 61;
        f2596 = i10 % 128;
        return i10 % 2 == 0 ? m2700(obj, false, true, true) : m2700(obj, true, true, true);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hs<T> m2710(Field field, Object obj, hs hsVar) {
        hx hxVar = new hx(field, obj, hsVar);
        int i10 = f2596 + 105;
        f2598 = i10 % 128;
        if (i10 % 2 == 0) {
            return hxVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hs<T> m2709(Object obj, Object obj2, hs hsVar) {
        if (obj == null) {
            return null;
        }
        f2596 = (f2598 + 75) % 128;
        if (obj instanceof Collection) {
            return new hx((Collection) obj, obj2, hsVar);
        }
        if (obj instanceof Map) {
            hx hxVar = new hx((Map) obj, obj2, hsVar);
            int i10 = f2596 + 55;
            f2598 = i10 % 128;
            if (i10 % 2 == 0) {
                return hxVar;
            }
            throw null;
        }
        if (obj.getClass().isArray()) {
            return new hx(new ArrayList(Arrays.asList(obj)), obj2, hsVar);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2719(Object obj, String str) throws SecurityException {
        f2598 = (f2596 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        String strM2704 = m2704(obj, obj.getClass(), str);
        f2596 = (f2598 + 33) % 128;
        return strM2704;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2720(Object obj, JSONArray jSONArray) throws SecurityException {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                f2598 = (f2596 + 63) % 128;
                String strM2719 = m2719(obj, jSONArray.optString(i10));
                if (strM2719 != null) {
                    f2598 = (f2596 + 107) % 128;
                    return strM2719;
                }
            }
        }
        f2596 = (f2598 + 27) % 128;
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2723(Class cls, String str) throws SecurityException {
        f2596 = (f2598 + 101) % 128;
        String strM2704 = m2704((Object) null, cls, str);
        f2596 = (f2598 + 21) % 128;
        return strM2704;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m2712(hs hsVar, Object obj, String str) {
        f2596 = (f2598 + 7) % 128;
        if (hsVar != null) {
            String strIntern = m2698(Color.rgb(0, 0, 0) + 16777470, 12 - TextUtils.indexOf("", "", 0, 0), "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 9 - View.combineMeasuredStates(0, 0), false).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m2698(201 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 2, "\r\ufff3", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true).intern());
            sb2.append(str);
            sb2.append(m2705("\uef1dꜣ\udc60☧秐뗾뒤Ĩ", Drawable.resolveOpacity(0, 0) + 8).intern());
            sb2.append(hsVar.mo2643());
            k.m3136(strIntern, sb2.toString());
            return;
        }
        String strIntern2 = m2698(View.combineMeasuredStates(0, 0) + 254, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, "\u0002\u0000\u0011￣\u0006\u000b\u0001\u0002\u000f￬\uffff\u0007", 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false).intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(m2698(200 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, "\r\ufff3", 1 - (ViewConfiguration.getTapTimeout() >> 16), true).intern());
        sb3.append(str);
        k.m3136(strIntern2, sb3.toString());
        f2598 = (f2596 + 91) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2716(Object obj, List<String> list) {
        if (obj != null) {
            int i10 = f2596 + 115;
            f2598 = i10 % 128;
            if (i10 % 2 == 0) {
                return jz.m3132(obj.getClass(), list);
            }
            boolean zM3132 = jz.m3132(obj.getClass(), list);
            int i11 = 60 / 0;
            return zM3132;
        }
        int i12 = f2596 + 91;
        f2598 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 41 / 0;
        }
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Field[] m2708(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                f2598 = (f2596 + 13) % 128;
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        int i10 = f2596 + 71;
        f2598 = i10 % 128;
        if (i10 % 2 == 0) {
            return fieldArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[PHI: r5
      0x0036: PHI (r5v9 java.lang.Class) = (r5v7 java.lang.Class), (r5v10 java.lang.Class) binds: [B:12:0x0034, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Field[] m2717(java.lang.Class r5, int r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r1
            int r0 = r0 % 2
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            r1 = 0
            r2 = r1
        L10:
            if (r5 == 0) goto L41
            int r3 = com.ironsource.adqualitysdk.sdk.i.hy.f2598
            int r3 = r3 + 47
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2596 = r3
            if (r2 == r6) goto L41
            int r3 = r3 + 15
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L30
            java.lang.Class r5 = r5.getSuperclass()
            r3 = 26
            int r3 = r3 / r1
            if (r5 == 0) goto L3e
            goto L36
        L30:
            java.lang.Class r5 = r5.getSuperclass()
            if (r5 == 0) goto L3e
        L36:
            java.lang.reflect.Field[] r3 = r5.getDeclaredFields()
            java.lang.reflect.Field[] r0 = com.ironsource.adqualitysdk.sdk.i.jz.m3133(r0, r3)
        L3e:
            int r2 = r2 + 1
            goto L10
        L41:
            int r5 = com.ironsource.adqualitysdk.sdk.i.hy.f2596
            int r5 = r5 + 77
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.hy.f2598 = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L50
            r5 = 38
            int r5 = r5 / r1
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hy.m2717(java.lang.Class, int):java.lang.reflect.Field[]");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2705(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2601)) ^ ((c11 >>> 5) + f2597)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2602) ^ ((c12 + i12) ^ ((c12 << 4) + f2599))));
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
}
