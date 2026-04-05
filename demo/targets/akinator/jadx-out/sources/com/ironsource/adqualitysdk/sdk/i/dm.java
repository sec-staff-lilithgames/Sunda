package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dm {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1969 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1970 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1971 = 138;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f1972;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ISAdQualityAdType f1973;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1974;

    /* renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f1975;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1976;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f1977;

    public dm(JSONObject jSONObject) {
        this.f1973 = ISAdQualityAdType.UNKNOWN;
        this.f1974 = dy.m2458(jSONObject.optString(m2337(KeyEvent.getDeadChar(0, 0) + 250, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, "\u0004\t\u0000\ufff5", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, false).intern()));
        String strM2458 = dy.m2458(jSONObject.optString(m2337(240 - (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, "\u0013\n\uffff\ufffb\ufffe￮", 3 - View.MeasureSpec.getMode(0), false).intern()));
        if (!TextUtils.isEmpty(strM2458)) {
            this.f1973 = ISAdQualityAdType.fromInt(Integer.parseInt(strM2458));
        }
        this.f1975 = jSONObject.optJSONObject(m2337(245 - Color.blue(0), 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0007\ufff6\u0005\b\u0002\ufff6", TextUtils.indexOf("", "") + 3, true).intern());
        this.f1977 = kc.m3185(jSONObject, m2337(245 - (Process.myTid() >> 22), (Process.myTid() >> 22) + 10, "\b\ufffa\ufffe\t\ufffe\u000b\ufffe\t\ufff8\ufff6", Drawable.resolveOpacity(0, 0) + 10, true).intern(), new ArrayList());
        this.f1976 = dy.m2458(jSONObject.optString(m2337(243 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0003\u000b￼\t\r\u0000￼\u000e\uffdd\u0000", 3 - TextUtils.lastIndexOf("", '0', 0), false).intern()));
        this.f1972 = dy.m2458(jSONObject.optString(m2337((ViewConfiguration.getScrollDefaultDelay() >> 16) + 242, View.resolveSize(0, 0) + 14, "\u000f\u000b\uffdf�\f\f�\n\u000f�\ufffa￮\u0001�", 8 - ExpandableListView.getPackedPositionType(0L), false).intern()));
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m2338() {
        int i10 = f1970;
        String str = this.f1972;
        f1969 = (i10 + 81) % 128;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m2339() {
        int i10 = f1969;
        int i11 = i10 + 95;
        f1970 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        List<String> list = this.f1977;
        f1970 = (i10 + 65) % 128;
        return list;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2340() {
        String str;
        int i10 = f1970;
        int i11 = i10 + 27;
        f1969 = i11 % 128;
        if (i11 % 2 != 0) {
            str = this.f1976;
            int i12 = 20 / 0;
        } else {
            str = this.f1976;
        }
        int i13 = i10 + 49;
        f1969 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ISAdQualityAdType m2341() {
        int i10 = f1970 + 81;
        f1969 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1973;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2342() {
        int i10 = f1969 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i11 = i10 % 128;
        f1970 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1974;
        int i12 = i11 + 5;
        f1969 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 6 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m2343() {
        int i10 = (f1970 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        f1969 = i10;
        JSONObject jSONObject = this.f1975;
        f1970 = (i10 + 99) % 128;
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2337(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1971);
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
