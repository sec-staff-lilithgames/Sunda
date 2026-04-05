package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3266 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3267 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3268 = 15;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, w> f3269 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, aa> f3271 = new HashMap();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, ad> f3270 = new HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m3326(JSONObject jSONObject) {
        int i10 = f3267 + 39;
        f3266 = i10 % 128;
        int i11 = i10 % 2;
        String strM3330 = m3330(jSONObject);
        if (i11 == 0) {
            int i12 = 24 / 0;
        }
        return strM3330;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m3328(u uVar) {
        int i10 = f3267;
        f3266 = (i10 + 81) % 128;
        Map<String, aa> map = uVar.f3271;
        int i11 = i10 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3266 = i11 % 128;
        if (i11 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m3329(u uVar) {
        int i10 = f3266;
        f3267 = (i10 + 51) % 128;
        Map<String, w> map = uVar.f3269;
        int i11 = i10 + 3;
        f3267 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 60 / 0;
        }
        return map;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3335(final JSONObject jSONObject, final l lVar, final jj jjVar, final it itVar) {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.u.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                String strM3326 = u.m3326(jSONObject);
                w wVar = (w) u.m3329(u.this).get(strM3326);
                if (wVar == null) {
                    wVar = new w(jSONObject, itVar);
                    u.m3329(u.this).put(strM3326, wVar);
                } else {
                    wVar.m3346(itVar);
                    wVar.m3397(jSONObject);
                }
                wVar.m3417((s) lVar);
                wVar.m3395((jg) jjVar);
            }
        });
        f3266 = (f3267 + 21) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3337() {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.u.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                ArrayList arrayList = new ArrayList(u.m3328(u.this).values());
                u.m3328(u.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((aa) it.next()).m549();
                }
            }
        });
        int i10 = f3266 + 19;
        f3267 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m3327(u uVar) {
        int i10 = f3267 + 91;
        int i11 = i10 % 128;
        f3266 = i11;
        int i12 = i10 % 2;
        Map<String, ad> map = uVar.f3270;
        if (i12 == 0) {
            throw null;
        }
        f3267 = (i11 + 65) % 128;
        return map;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3334() {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                ArrayList arrayList = new ArrayList(u.m3329(u.this).values());
                u.m3329(u.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((w) it.next()).m3393();
                }
            }
        });
        f3267 = (f3266 + 115) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3336(JSONObject jSONObject, t tVar) {
        f3267 = (f3266 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        m3338(jSONObject, tVar, null);
        int i10 = f3266 + 71;
        f3267 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 9 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3338(final JSONObject jSONObject, final t tVar, final is isVar) {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                String strM3326 = u.m3326(jSONObject);
                ad adVar = (ad) u.m3327(u.this).get(strM3326);
                if (adVar == null) {
                    adVar = new ad(jSONObject, isVar);
                    u.m3327(u.this).put(strM3326, adVar);
                } else {
                    adVar.m611(jSONObject, isVar);
                }
                adVar.m3417(tVar);
            }
        });
        f3267 = (f3266 + 101) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3330(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject.optString(m3331("\uffff\u0004\n\ufffb�\b\ufff7\n\uffff\u0005\u0004￡\ufffb\u000f", 13 - MotionEvent.axisFromString(""), 121 - (ViewConfiguration.getWindowTouchSlop() >> 8), false, 14 - TextUtils.indexOf("", "", 0)).intern()));
        sb2.append(m3331("\u0000", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), 61 - KeyEvent.getDeadChar(0, 0), false, 1 - ExpandableListView.getPackedPositionType(0L)).intern());
        sb2.append(jSONObject.optString(m3331("\uffff￼\u0000\b￼￩\u0014\u000f\u0004\u0011\u0004\u000f\ufffeￜ", 2 - KeyEvent.getDeadChar(0, 0), 115 - TextUtils.indexOf((CharSequence) "", '0', 0), true, 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()));
        sb2.append(jSONObject.optString(m3331("\uffdd\u0011\uffff\u0003\u0010\uffff\u0007\ufffb￨\r\r\ufffb\u0006", Color.blue(0) + 5, 116 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern()));
        sb2.append(jSONObject.optString(m3331("\u0006\u0002\u0014￠\t\ufffe\u0010\u0010￫\ufffe\n\u0002\ufffe\u0001\ufff3", 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 113, false, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()));
        String string = sb2.toString();
        int i10 = f3266 + 7;
        f3267 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3331(String str, int i10, int i11, boolean z10, int i12) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i12];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i12) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i11);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f3268);
                    e.f2107 = i14 + 1;
                }
                if (i10 > 0) {
                    e.f2109 = i10;
                    char[] cArr3 = new char[i12];
                    System.arraycopy(cArr2, 0, cArr3, 0, i12);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i12 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i12 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i12];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i12) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i12 - i17) - 1];
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3333(final JSONObject jSONObject, final x xVar) {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                String strM3326 = u.m3326(jSONObject);
                aa aaVar = (aa) u.m3328(u.this).get(strM3326);
                if (aaVar == null) {
                    aaVar = new aa(jSONObject);
                    u.m3328(u.this).put(strM3326, aaVar);
                } else {
                    aaVar.m544(jSONObject);
                }
                aaVar.m3417((s) xVar);
            }
        });
        int i10 = f3266 + 105;
        f3267 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3332() {
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.u.6
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                ArrayList arrayList = new ArrayList(u.m3327(u.this).values());
                u.m3327(u.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ad) it.next()).m609();
                }
            }
        });
        int i10 = f3266 + 9;
        f3267 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
    }
}
