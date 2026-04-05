package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class jr {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f3053 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3054;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f3055;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Context f3061;

    /* renamed from: ｋ, reason: contains not printable characters */
    private as f3062;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private long f3063;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f3059 = {'0', GMTDateParser.HOURS, 'p', AbstractJsonLexerKt.END_LIST, 'X', 'o', 204, 205, 195, 189, 150, 300, 301, 293, 287, AbstractJsonLexerKt.COLON, 'o', 'f', GMTDateParser.SECONDS, 240, G5.T, 'w', '8', 'r', GMTDateParser.SECONDS, 'k', AbstractJsonLexerKt.END_LIST, 140, '6', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, 'i', 'n', '0', 'g', 'i', 'k', 'p', 'l', 'f', '7', 'q', 't', 'D', 147, 154, 154, 'E', 145, 153, 147, 146, 153, 131, '|', 143, 143, 145, 143, 144, 151, 150, 127, 'x', 128, 137, 145, 140, 144, 148, 156, 139};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3060 = 1583583816;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3056 = 61;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3057 = 1556979606;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f3058 = {-57, -46, 60, -38, -58, -16, -2, -49, -107, 107, 101, -103, -119, -102, 99, 105, -97, -107, 108, -53, 126, -122, -116, 119, -106, 112, 121, -48, 124, -116, -123, -116, 100, -124, 116, -118, -123, 97, -126, -116, -57, 120, -104, 111, -25, -50, -63, 39, -39, -115, 121, 51, -100, 122, 55, 52, -63, -126, 119, 37, -37, 53, -116, 119, 37, -57, 48, -123, 113, 49, -51, -51, -56, -53, -119, 102, -53, 53, -56, -27};

    public jr(Context context, as asVar, long j10) {
        this.f3061 = context;
        this.f3062 = asVar;
        this.f3063 = j10;
        new gn(context);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3045(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f3056;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f3058;
                    i14 = bArr != null ? (byte) (bArr[f3060 + i11] + i13) : (short) (f3055[f3060 + i11] + i13);
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f3060 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f3057);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f3058;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f3055;
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

    /* renamed from: ﾇ */
    public JSONObject mo676(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        int i10 = f3054 + 97;
        f3053 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        JSONObject jSONObjectM3179 = kc.m3179(jSONObject == null ? new JSONObject() : jSONObject);
        jSONObjectM3179.put(m3046("\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{0, 6, 0, 0}).intern(), this.f3062.m908());
        String strM906 = this.f3062.m906();
        if (!TextUtils.isEmpty(strM906)) {
            jSONObjectM3179.put(m3046(null, true, new int[]{6, 4, 90, 3}).intern(), strM906);
        }
        if (z11) {
            int i11 = f3054 + 19;
            f3053 = i11 % 128;
            if (i11 % 2 != 0 ? this.f3063 > 0 : this.f3063 > 1) {
                jSONObjectM3179.put(m3045((-61) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) ExpandableListView.getPackedPositionGroup(0L), (-1583583815) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (46 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) - 1556979498).intern(), this.f3063);
                f3054 = (f3053 + 47) % 128;
            }
            jSONObjectM3179.put(m3046("\u0000\u0001\u0000\u0001\u0000", false, new int[]{10, 5, PsExtractor.PRIVATE_STREAM_1, 4}).intern(), this.f3062.m903());
            jSONObjectM3179.put(m3045((-62) - (KeyEvent.getMaxKeyCode() >> 16), (short) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1583583813, (byte) ((-5) - Drawable.resolveOpacity(0, 0)), (-1556979506) - View.combineMeasuredStates(0, 0)).intern(), this.f3062.m897());
            jSONObjectM3179.put(m3046("\u0001\u0000\u0001", false, new int[]{15, 3, 0, 0}).intern(), this.f3062.m904());
            jSONObjectM3179.put(m3046("\u0001\u0000", true, new int[]{18, 2, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 0}).intern(), this.f3062.m912());
            jSONObjectM3179.put(m3046("\u0000\u0000", false, new int[]{20, 2, 0, 1}).intern(), Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            jSONObjectM3179.put(m3046("\u0000\u0000\u0000\u0001\u0001", true, new int[]{22, 5, 0, 2}).intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM3179.put(m3046("\u0001", false, new int[]{27, 1, 165, 0}).intern(), jx.m3097());
            jSONObjectM3179.put(m3046("\u0000\u0001\u0001\u0001\u0000", true, new int[]{28, 5, 0, 0}).intern(), Build.MODEL);
            jSONObjectM3179.put(m3045((-62) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1583583809) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((-104) - (ViewConfiguration.getTouchSlop() >> 8)), (-1556979497) - Color.argb(0, 0, 0, 0)).intern(), Build.MANUFACTURER);
            jSONObjectM3179.put(m3045((-62) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) Color.red(0), (-1583583796) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((-124) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-1556979494) - Color.green(0)).intern(), m3046("\u0001\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{33, 7, 0, 0}).intern());
            jSONObjectM3179.put(m3046("\u0001\u0000\u0001", false, new int[]{40, 3, 0, 0}).intern(), ju.m3071());
            jx.m3096(this.f3061, jSONObjectM3179);
            ju.m3076(this.f3061, jSONObjectM3179);
            ju.m3069(this.f3061, jSONObjectM3179, z12);
            ju.m3080(jSONObjectM3179);
            ju.m3077(jSONObjectM3179);
            jSONObjectM3179.put(m3046("\u0001\u0001\u0000\u0001", false, new int[]{43, 4, 40, 2}).intern(), z10);
            ju.m3068(this.f3061, jSONObjectM3179);
            ju.m3083(jSONObjectM3179);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f3062.m898());
                jSONObject2.remove(m3045(TextUtils.indexOf("", "", 0, 0) - 62, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-1583583789) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-113) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getTouchSlop() >> 8) - 1556979509).intern());
                if (jSONObject2.length() > 0) {
                    f3053 = (f3054 + 55) % 128;
                    jSONObjectM3179.putOpt(m3045((ViewConfiguration.getScrollBarSize() >> 8) - 62, (short) (Color.rgb(0, 0, 0) + 16777216), (-1583583776) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (TextUtils.getOffsetAfter("", 0) + 104), (-1556979497) - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), jSONObject2);
                }
                return jSONObjectM3179;
            } catch (Exception e10) {
                k.m3145(m3046("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false, new int[]{47, 25, 38, 15}).intern(), m3045(TextUtils.indexOf((CharSequence) "", '0', 0) - 61, (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (-1583583772) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) - 55), Color.green(0) - 1556979537).intern(), (Throwable) e10);
            }
        }
        return jSONObjectM3179;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final as m3047() {
        int i10 = f3053;
        as asVar = this.f3062;
        int i11 = i10 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3054 = i11 % 128;
        if (i11 % 2 == 0) {
            return asVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m3046(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f3059, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
