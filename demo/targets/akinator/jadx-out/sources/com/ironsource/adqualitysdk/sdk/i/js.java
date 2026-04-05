package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class js {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3064 = 6;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3065 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3066 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3067 = {'f', GMTDateParser.SECONDS, 'a', AbstractJsonLexerKt.UNICODE_ESC, 't', 'i', GMTDateParser.DAY_OF_MONTH, 'p', 'A', 'Q', 'l', 'y', 'S', 'D', 'K', 'E', 'v', 'e', 'n', 'G', 'r', 'o', ' ', 'g', '/', GMTDateParser.MINUTES, 'j', GMTDateParser.HOURS, 'k', 'q', 'w', 'x', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m3049(String str, aw awVar, boolean z10, as asVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put(m3048(3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 79), "\u0001\u0002").intern(), true);
            } catch (JSONException e10) {
                k.m3145(m3048(26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 113), "\t\u0007\u000f\t\u0004\b\u0000\u0005\u0006\u0011\u000e\u000f\u0010\u0011\f\u0017\u0001\u0016\f\u0017\u000e\u0017\u0003\u0005\u0016\u0015").intern(), m3048(51 - View.resolveSizeAndState(0, 0, 0), (byte) (View.combineMeasuredStates(0, 0) + 3), "\u000e\u0015\u0015\u0016\u0015\u0017\u0000\b\u000b\u0000\u0013\u0012\u0012\u0004\u0002\u0017\u0002\u0005\u0017\u0004\u0013\u0000\u0005\u0003oo\u001c\u0006\u0003\u0002\n\u001c\u0001\t\b\u0000\u0005\u0010\u001c\n\u0001\u001d\u0010\u0017\u0003\u0016\u0014\u001c\u0003\u0013q").intern(), (Throwable) e10);
            }
        }
        if (asVar.m900()) {
            f3066 = (f3065 + 61) % 128;
            jSONObject.put(m3048(5 - Color.blue(0), (byte) (TextUtils.indexOf("", "") + 104), "\u0003\u0004\u0005\u0000Ì").intern(), true);
        }
        jSONObject.put(m3048((ViewConfiguration.getTapTimeout() >> 16) + 4, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 108), "\t\u0001\u0000\u000b").intern(), str);
        f3066 = (f3065 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        kc.m3194(jSONObject, awVar.m990());
        kc.m3194(jSONObject, awVar.m992());
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3048(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f3067;
                char c10 = f3064;
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
}
