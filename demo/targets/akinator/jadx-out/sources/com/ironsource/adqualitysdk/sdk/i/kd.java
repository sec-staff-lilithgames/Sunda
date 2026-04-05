package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class kd {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3138 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3139 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static WeakReference<bb> f3140;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3141 = {56106, 14784, 7820, 29550, 20523, 46837, 35807, 59609, 'T', 58041, 50679, 43010, 35657, 28053, 20643, 13294, 5683, 63769, 26250, ' ', 58083, 50677, 43022, 35656, 28050, 20706, 55269, 'E', 58041, 50660, 43022, 35678, 28119, 20661, 13284, 5676, 63819, 56270, ' ', 58018, 50680, 43029, 35657, 28048, 20656, 13292, 5676, 63818, 56193, 48855, 41386, 320};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f3137 = 2265687379156984523L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3198(String str, String str2, Throwable th2, boolean z10, boolean z11, boolean z12) {
        int i10 = f3138 + 55;
        f3139 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                throw null;
            }
            if (z10) {
                k.m3140(str, str2, z12);
                if (th2 != null) {
                    k.m3157(str, m3196((char) (56174 - Color.green(0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), th2, z12);
                }
            } else {
                k.m3157(str, str2, th2, z12);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3196((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8 - TextUtils.getCapsMode("", 0, 0)).intern());
            sb2.append(str);
            m3207(str, str2, sb2.toString(), th2, null, false, z11, z12);
            f3138 = (f3139 + 53) % 128;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3200(String str, String str2, String str3, Throwable th2) {
        int i10 = f3138 + 27;
        f3139 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m3202(str, str2, str3, th2, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Throwable m3201(Throwable th2) {
        while (th2.getCause() != null) {
            int i10 = f3138 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f3139 = i10 % 128;
            if (i10 % 2 == 0) {
                th2.getCause();
                throw null;
            }
            th2 = th2.getCause();
        }
        return th2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3203(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f3139 + 73;
        f3138 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m3204(str, str2, th2, z10, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3205(bb bbVar) {
        f3140 = new WeakReference<>(bbVar);
        int i10 = f3138 + 59;
        f3139 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3199(String str, String str2, String str3, String str4) {
        int i10 = f3138 + 89;
        f3139 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                m3206(str, str2, str3, str4);
                throw null;
            }
            m3206(str, str2, str3, str4);
            f3139 = (f3138 + 67) % 128;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3204(String str, String str2, Throwable th2, boolean z10, boolean z11) {
        int i10 = f3139 + 113;
        f3138 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m3198(str, str2, th2, z10, z11, false);
            } else {
                m3198(str, str2, th2, z10, z11, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m3207(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10, boolean z11, boolean z12) {
        String str4;
        if (z10) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m3196((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26288), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-16777198) - Color.rgb(0, 0, 0)).intern());
                sb2.append(str);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(m3196((char) (Process.getGidForName("") + 1), 7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19).intern());
                sb3.append(string);
                sb3.append(m3196((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 55244), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26).intern());
                k.m3157(str, sb3.toString(), th2, z12);
                f3139 = (f3138 + 35) % 128;
                str4 = string;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str3;
        }
        bb bbVar = f3140.get();
        if (bbVar != null) {
            int i10 = f3138 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f3139 = i10 % 128;
            if (i10 % 2 != 0) {
                bbVar.m1140(str, str2, str4, Log.getStackTraceString(th2), jSONObject, z11);
            } else {
                bbVar.m1140(str, str2, str4, Log.getStackTraceString(th2), jSONObject, z11);
                throw null;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3202(String str, String str2, String str3, Throwable th2, boolean z10) {
        int i10 = f3139 + 5;
        f3138 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m3207(str, str2, str3, th2, null, true, true, false);
            } else {
                m3207(str, str2, str3, th2, null, false, false, false);
            }
            int i11 = f3138 + 1;
            f3139 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3197(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10) {
        f3138 = (f3139 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        try {
            m3207(str, str2, str3, th2, jSONObject, true, false, z10);
            int i10 = f3138 + 19;
            f3139 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3196(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f3141[i11 + i12] ^ (i12 * f3137)) ^ c10);
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m3206(String str, String str2, String str3, String str4) {
        String string = "";
        int i10 = f3139 + 93;
        f3138 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                int i11 = 44 / 0;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
            } else if (TextUtils.isEmpty(str3)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m3196((char) (26288 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1 - (ViewConfiguration.getEdgeSlop() >> 16), Drawable.resolveOpacity(0, 0) + 18).intern());
            sb2.append(str);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m3196((char) Color.green(0), TextUtils.indexOf((CharSequence) "", '0') + 12, ExpandableListView.getPackedPositionGroup(0L) + 27).intern());
            sb3.append(string2);
            sb3.append(m3196((char) (ViewConfiguration.getTapTimeout() >> 16), 13 - (Process.myPid() >> 22), 38 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            k.m3140(str, sb3.toString(), false);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            if (str4 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m3196((char) (TextUtils.getOffsetBefore("", 0) + 330), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.alpha(0) + 51).intern());
                sb5.append(str4);
                string = sb5.toString();
            }
            sb4.append(string);
            k.m3140(str, sb4.toString(), false);
            bb bbVar = f3140.get();
            if (bbVar != null) {
                f3139 = (f3138 + 57) % 128;
                bbVar.m1135(str, str2, string2, str4);
            }
        } catch (Throwable unused) {
        }
    }
}
