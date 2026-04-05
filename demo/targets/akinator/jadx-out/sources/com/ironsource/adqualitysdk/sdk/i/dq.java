package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class dq {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2007 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2008 = 94;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2009;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private fr f2010;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f2011;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String[] f2012;

    public dq(String str, String str2, JSONObject jSONObject) {
        this.f2011 = dy.m2458(str2);
        List listM3192 = kc.m3192(jSONObject.optJSONArray(m2364((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 200, View.resolveSizeAndState(0, 0, 0) + 4, "\ufff6\b￼\u0007", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), true).intern()), new kc.c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* renamed from: ｋ */
            public final /* synthetic */ String mo883(JSONArray jSONArray, int i10) {
                return dy.m2458(jSONArray.optString(i10));
            }
        });
        String[] strArr = new String[listM3192.size()];
        this.f2012 = strArr;
        listM3192.toArray(strArr);
        try {
            this.f2010 = new dr(str, str2).m2409(dt.m2424(str, str2, jSONObject.optString(m2364(201 - (ViewConfiguration.getPressedStateDuration() >> 16), 4 - Color.green(0), "\ufff7\u000e\ufff9\u0004", -TextUtils.lastIndexOf("", '0'), true).intern())));
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2364(189 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') + 22, "\u0013\u0002\u0011\uffc1\u0013\u0010\u0013\u0013￦\uffc1\u0005\u0010\t\u0015\u0006\u000e\uffc1\b\u000f\n\u0014", 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), true).intern());
            sb2.append(this.f2011);
            co.m1955(str, sb2.toString(), th2);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private Map<String, Object> m2363(cp cpVar, List<Object> list, List<String> list2) {
        f2009 = (f2007 + 41) % 128;
        if (list.size() == list2.size()) {
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < list.size(); i10++) {
                f2009 = (f2007 + 19) % 128;
                map.put(list2.get(i10), list.get(i10));
            }
            return map;
        }
        String strM2007 = cpVar.m2007();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2011);
        sb2.append(m2364((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 187, 17 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0010ￃￃ\u0007\b\u0017\u0006\b\u0013\u001b\bￃ\u0007\u0012\u000b\u0017\b", TextUtils.indexOf((CharSequence) "", '0') + 3, true).intern());
        sb2.append(list2.size());
        sb2.append(m2364(189 - Color.alpha(0), TextUtils.getCapsMode("", 0, 0) + 24, "\u0016\u0003\uffc1\u0014\u0015\u000f\u0006\u000e\u0016\b\u0013\u0002\uffc1\uffc1\u0005\u0006\u0017\n\u0006\u0004\u0006\u0013\uffc1\u0015", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, true).intern());
        sb2.append(list.size());
        co.m1955(strM2007, sb2.toString(), null);
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final du m2365(ds dsVar, cp cpVar, List<Object> list) {
        ds dsVar2 = new ds(m2363(cpVar, list, Arrays.asList(this.f2012)), dsVar.m2418());
        fr frVar = this.f2010;
        if (frVar != null) {
            int i10 = f2007 + 49;
            f2009 = i10 % 128;
            if (i10 % 2 == 0) {
                return frVar.mo2509(dsVar2, cpVar);
            }
            frVar.mo2509(dsVar2, cpVar);
            throw null;
        }
        String strM2007 = cpVar.m2007();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2364(Color.red(0) + 185, 7 - Drawable.resolveOpacity(0, 0), "\r\u0019\n\ufff2ￅ\t\u0014", 4 - ExpandableListView.getPackedPositionGroup(0L), true).intern());
        sb2.append(this.f2011);
        sb2.append(m2364(TextUtils.lastIndexOf("", '0', 0) + 186, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13, "\u001e\t\u0014\u0007ￅ\u0011\u0011\u001a\u0013ￅ\u0018\u0006\rￅ", 14 - TextUtils.indexOf("", "", 0), true).intern());
        co.m1955(strM2007, sb2.toString(), null);
        f2009 = (f2007 + 107) % 128;
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2366() {
        int i10 = f2009;
        String str = this.f2011;
        f2007 = (i10 + 47) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2364(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2008);
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
}
