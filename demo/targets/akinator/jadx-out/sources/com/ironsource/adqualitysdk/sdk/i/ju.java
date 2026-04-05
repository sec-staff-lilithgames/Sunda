package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ju {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3078 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3079;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3080;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f3081;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject f3082;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f3083;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject f3084;

    static {
        m3064();
        f3084 = null;
        f3078 = (f3079 + 31) % 128;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static synchronized JSONObject m3061() {
        int i10 = f3078 + 45;
        int i11 = i10 % 128;
        f3079 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        JSONObject jSONObject = f3082;
        int i12 = i11 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f3078 = i12 % 128;
        if (i12 % 2 != 0) {
            return jSONObject;
        }
        int i13 = 64 / 0;
        return jSONObject;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static synchronized JSONObject m3062() {
        try {
            int i10 = f3078 + 57;
            f3079 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (f3084 == null) {
                JSONObject jSONObject = new JSONObject();
                f3084 = jSONObject;
                try {
                    jSONObject.put(m3072(1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23), "\u008e").intern(), -1);
                    f3084.put(m3072(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59), "£").intern(), -1);
                    f3079 = (f3078 + 77) % 128;
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3084;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static JSONObject m3063() {
        JSONObject jSONObjectM3179;
        int i10 = f3079 + 85;
        f3078 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM3179 = kc.m3179(m3061());
            int i11 = 32 / 0;
        } else {
            jSONObjectM3179 = kc.m3179(m3061());
        }
        f3078 = (f3079 + 99) % 128;
        return jSONObjectM3179;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3064() {
        f3080 = (char) 6;
        f3083 = new char[]{GMTDateParser.SECONDS, 'i', GMTDateParser.ZONE, 'e', 'w', GMTDateParser.HOURS, 'E', 'r', 'o', ' ', 'n', 'g', 't', GMTDateParser.DAY_OF_MONTH, GMTDateParser.MONTH, 'c', 'f', GMTDateParser.MINUTES, 'a', 'v', 'y', 'l', AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.COLON, 'p', 'b', 'j', 'x', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', 127, 128, 129, 130};
        f3081 = new int[]{-987621748, -1321654493, 1422958705, -1068593843, 717159566, 742819251, -884975619, 1614354461, 167101010, -981258228, 810494223, -1393062046, -348849334, 93011835, -861775537, -2135240829, 1821754461, 776952998};
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int m3067() {
        f3078 = (f3079 + 59) % 128;
        int iOptInt = m3081().optInt(m3072((ViewConfiguration.getTapTimeout() >> 16) + 1, (byte) (59 - TextUtils.indexOf("", "", 0)), "£").intern());
        f3078 = (f3079 + 15) % 128;
        return iOptInt;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m3071() {
        f3079 = (f3078 + 19) % 128;
        String str = Build.VERSION.RELEASE;
        int i10 = f3078 + 85;
        f3079 = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int m3078() {
        JSONObject jSONObjectM3081;
        String strM3072;
        int i10 = f3079 + 11;
        f3078 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM3081 = m3081();
            strM3072 = m3072(1 >> (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)), (byte) (18 << TextUtils.getOffsetAfter("", 0)), "\u008e");
        } else {
            jSONObjectM3081 = m3081();
            strM3072 = m3072((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, (byte) (TextUtils.getOffsetAfter("", 0) + 23), "\u008e");
        }
        return jSONObjectM3081.optInt(strM3072.intern());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3083(JSONObject jSONObject) throws JSONException {
        int i10 = f3079 + 59;
        f3078 = i10 % 128;
        try {
            jSONObject.put(i10 % 2 == 0 ? m3072(5 >> (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), (byte) (70 >>> (TypedValue.complexToFloat(0) > 1.0f ? 1 : (TypedValue.complexToFloat(0) == 1.0f ? 0 : -1))), "\u0001\u0002\u0003\u0004").intern() : m3072(5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55), "\u0001\u0002\u0003\u0004").intern(), m3081());
            int i11 = f3078 + 39;
            f3079 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 45 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3065(Intent intent) {
        int intExtra;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                int intExtra2 = -1;
                jSONObject.put(m3073(new int[]{-1504877089, 2055656838}, ((Process.getThreadPriority(0) + 20) >> 6) + 4).intern(), intent.hasExtra(m3073(new int[]{-1426175675, -2089755528, -1418580371, 1512229099}, Color.alpha(0) + 7).intern()) ? intent.getIntExtra(m3073(new int[]{-1426175675, -2089755528, -1418580371, 1512229099}, (ViewConfiguration.getTapTimeout() >> 16) + 7).intern(), -1) : -1);
                if (intent.hasExtra(m3073(new int[]{256545144, -652770805, -293945302, -1738118186}, Color.rgb(0, 0, 0) + 16777221).intern())) {
                    int i10 = f3078 + 69;
                    f3079 = i10 % 128;
                    intExtra = intent.getIntExtra((i10 % 2 != 0 ? m3073(new int[]{256545144, -652770805, -293945302, -1738118186}, ExpandableListView.getPackedPositionType(0L) + 5) : m3073(new int[]{256545144, -652770805, -293945302, -1738118186}, ExpandableListView.getPackedPositionType(0L) + 5)).intern(), -1);
                } else {
                    intExtra = -1;
                }
                if (intent.hasExtra(m3073(new int[]{604685346, -50345784, 1095393866, -1119901557}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5).intern())) {
                    int i11 = f3079 + 23;
                    f3078 = i11 % 128;
                    intExtra2 = intent.getIntExtra((i11 % 2 == 0 ? m3073(new int[]{604685346, -50345784, 1095393866, -1119901557}, 5 >> Color.green(0)) : m3073(new int[]{604685346, -50345784, 1095393866, -1119901557}, 5 - Color.green(0))).intern(), -1);
                }
                jSONObject.put(m3072((ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, (byte) (92 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0018\r\u0016\u0014").intern(), Math.round((intExtra * 100.0f) / intExtra2));
            } catch (Throwable th2) {
                String strIntern = m3073(new int[]{-528262895, 1951940106, 1096458556, 2054381121, -371264461, 1464597039}, 11 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m3072(37 - Color.argb(0, 0, 0, 0), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 70), "\u0007\b\b\t\b\n\u0013\f\u0013\u0007\u000b\u0006\u0007\u001b\u0018\u0012\u000f\u0000\b\u0013\u000f\u001b\u0001\u0015\t\u001b\u0003\u0006\u000e\u0006\b\u001b\u0002\u0006\u000b\u0016f").intern());
                sb2.append(th2.getLocalizedMessage());
                k.m3147(strIntern, sb2.toString());
            }
        }
        m3066(jSONObject);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized void m3075(Activity activity) {
        if (activity != null) {
            try {
                int i10 = f3079 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f3078 = i10 % 128;
                if (i10 % 2 == 0) {
                    m3079(activity.getApplicationContext());
                    throw null;
                }
                m3079(activity.getApplicationContext());
                f3078 = (f3079 + 1) % 128;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3074(int i10, int i11) {
        int i12 = f3079 + 101;
        int i13 = i12 % 128;
        f3078 = i13;
        try {
            if (i12 % 2 == 0) {
                throw null;
            }
            if (i10 > 0) {
                f3079 = (i13 + 21) % 128;
                if (i11 > 0) {
                    f3079 = (i13 + 1) % 128;
                    JSONObject jSONObjectM3062 = m3062();
                    jSONObjectM3062.put(m3072((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (byte) (23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u008e").intern(), i11);
                    jSONObjectM3062.put(m3072((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, (byte) (58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "£").intern(), i10);
                }
            }
        } catch (Throwable th2) {
            k.m3145(m3073(new int[]{-528262895, 1951940106, 1096458556, 2054381121, -371264461, 1464597039}, 10 - ImageFormat.getBitsPerPixel(0)).intern(), m3072(25 - View.MeasureSpec.getSize(0), (byte) (View.combineMeasuredStates(0, 0) + 10), "\u0007\b\b\t\b\n\u0001\u0004~~\u0004\u0007\u0006\n\u0003\f\t\u0001\u0004\t\u0006\u0003\u0002\u0003o").intern(), th2);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m3070(DisplayMetrics displayMetrics) {
        int i10 = (f3078 + 21) % 128;
        f3079 = i10;
        if (displayMetrics != null) {
            f3078 = (i10 + 111) % 128;
            m3074(displayMetrics.heightPixels, displayMetrics.widthPixels);
            f3079 = (f3078 + 113) % 128;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m3084(int i10, int i11) {
        if (i10 < 0) {
            return false;
        }
        f3078 = (f3079 + 49) % 128;
        if (i11 < 0 || i10 > m3078() || i11 > m3067()) {
            return false;
        }
        f3079 = (f3078 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m3068(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m3072(TextUtils.indexOf("", "", 0, 0) + 8, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 57), "\u0015\f\r\u0000\u0019\u0007\u000e\u0012").intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m3072((ViewConfiguration.getTapTimeout() >> 16) + 4, (byte) (114 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "àà\u0013\u0014").intern(), memoryInfo.availMem / 1048576);
            jSONObject.put(m3073(new int[]{-1219946967, 216088382}, Drawable.resolveOpacity(0, 0) + 4).intern(), memoryInfo.threshold / 1048576);
            if (memoryInfo.lowMemory) {
                f3079 = (f3078 + 111) % 128;
                jSONObject.put(m3072(5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (85 - View.MeasureSpec.getSize(0)), "ÂÂ\u0016\u0003").intern(), memoryInfo.lowMemory);
            }
            f3079 = (f3078 + 79) % 128;
            jSONObject.put(m3073(new int[]{171668047, 2089572700}, 4 - TextUtils.indexOf("", "", 0)).intern(), memoryInfo.totalMem / 1048576);
            f3078 = (f3079 + 81) % 128;
        } catch (Throwable th2) {
            String strIntern = m3073(new int[]{-528262895, 1951940106, 1096458556, 2054381121, -371264461, 1464597039}, 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3072(28 - Color.argb(0, 0, 0, 0), (byte) (MotionEvent.axisFromString("") + 35), "\u0007\b\b\t\b\n\t\u0005\u0096\u0096\u0004\u0007\u0006\n\u000f\u0005\u000e\u000b\b\u0013\n\u0015\u0006\u0018\t\u0005\u0015\u000b").intern());
            sb2.append(th2.getLocalizedMessage());
            k.m3147(strIntern, sb2.toString());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m3081() {
        f3078 = (f3079 + 3) % 128;
        JSONObject jSONObjectM3179 = kc.m3179(m3062());
        int i10 = f3078 + 67;
        f3079 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM3179;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[Catch: all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0037, B:21:0x005d, B:32:0x0087, B:39:0x00cc, B:7:0x001b, B:11:0x0043, B:34:0x0090, B:16:0x004d, B:35:0x00be, B:37:0x00c4), top: B:46:0x0005, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0037, B:21:0x005d, B:32:0x0087, B:39:0x00cc, B:7:0x001b, B:11:0x0043, B:34:0x0090, B:16:0x004d, B:35:0x00be, B:37:0x00c4), top: B:46:0x0005, inners: #2 }] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void m3079(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ju.m3079(android.content.Context):void");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3082(Application application) {
        if (application != null) {
            f3079 = (f3078 + 113) % 128;
            m3079(application.getApplicationContext());
        }
        int i10 = f3078 + 21;
        f3079 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 59 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m3077(JSONObject jSONObject) {
        f3078 = (f3079 + 89) % 128;
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                f3079 = (f3078 + 67) % 128;
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(m3072(5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (47 - KeyEvent.getDeadChar(0, 0)), "\u0010\n\u0006\u001e").intern(), Math.round((1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis)) * (totalRxBytes2 - totalRxBytes)));
                jSONObject.put(m3073(new int[]{-215172321, 1427044895}, 4 - View.getDefaultSize(0, 0)).intern(), totalRxBytes2);
            }
        } catch (Throwable th2) {
            k.m3145(m3073(new int[]{-528262895, 1951940106, 1096458556, 2054381121, -371264461, 1464597039}, View.MeasureSpec.getSize(0) + 11).intern(), m3073(new int[]{-1705886056, -1826727591, 797589685, -1286166327, 1858797760, -720480958, -17045760, 936675378, -1408998319, -617168103, 1426189348, -903785397, 2069931413, 765069197, 801103822, -1748127208, -186604150, 832934262}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35).intern(), th2);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized void m3066(JSONObject jSONObject) {
        try {
            int i10 = f3079;
            int i11 = i10 + 47;
            f3078 = i11 % 128;
            if (i11 % 2 == 0) {
                f3082 = jSONObject;
                throw null;
            }
            f3082 = jSONObject;
            int i12 = i10 + 67;
            f3078 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x018e A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:3:0x000a, B:8:0x0059, B:15:0x00a5, B:17:0x018e, B:13:0x0081), top: B:22:0x000a }] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3069(android.content.Context r12, org.json.JSONObject r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ju.m3069(android.content.Context, org.json.JSONObject, boolean):void");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m3076(Context context, JSONObject jSONObject) {
        try {
            if (jx.m3099(context, m3073(new int[]{-2094081576, -483160789, 1456718699, -2056085882, 1557831852, 1026620856, 1101397770, -395056499, 543834413, -1747525398, -2057207892, -624301966, -1128406630, 289766243, 1975690035, 1401415066, 238754085, -662664844}, 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                f3078 = (f3079 + 43) % 128;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m3073(new int[]{1127874453, -568621529}, 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())).getConnectionInfo();
                jSONObject.put(m3072((Process.myPid() >> 22) + 4, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 96), "\n\u0016\u0006\u0012").intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    jSONObject.put(m3072((ViewConfiguration.getFadingEdgeLength() >> 16) + 4, (byte) (122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\n\u0016\u0006\u0001").intern(), connectionInfo.getRssi());
                    jSONObject.put(m3072(3 - TextUtils.lastIndexOf("", '0', 0), (byte) (22 - (Process.myPid() >> 22)), "\n\u0016\u0006\u001e").intern(), connectionInfo.getLinkSpeed());
                    f3078 = (f3079 + 51) % 128;
                }
            }
        } catch (Throwable th2) {
            k.m3145(m3073(new int[]{-528262895, 1951940106, 1096458556, 2054381121, -371264461, 1464597039}, 11 - Color.green(0)).intern(), m3072(ExpandableListView.getPackedPositionType(0L) + 31, (byte) (33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\u0007\b\b\t\b\n\u0013\f\u0013\u0007\u000b\u0006\n\u0003\u0004\r\u0003\u0007\u0004\u0007\u000e\n\u0006\u000f\t\n\u0001\u0015\u0004\t\u0094").intern(), th2);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3080(JSONObject jSONObject) {
        f3078 = (f3079 + 47) % 128;
        JSONObject jSONObjectM3063 = m3063();
        if (jSONObjectM3063 != null) {
            f3078 = (f3079 + 113) % 128;
            kc.m3194(jSONObject, jSONObjectM3063);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m3072(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f3083;
                char c10 = f3080;
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m3073(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f3081.clone();
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
}
