package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dn {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1978 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f1979 = 5;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1980 = {'w', 'r', 'a', 'p', 'e', 'c', 'o', GMTDateParser.MINUTES, 'n', 'x', 't', 'b', 'v', 'i', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.SECONDS, 'E', 'J', 'y', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', 127};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1981;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1982;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1983;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1984;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1985;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1986;

    public dn(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1985 = jSONObject.optString(m2344(7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (37 - ImageFormat.getBitsPerPixel(0)), "\u0001\u0002\u0003\u0004\u0004\u0000\u0098").intern());
            this.f1983 = jSONObject.optString(m2344((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, (byte) (AndroidCharacter.getMirror('0') - 19), "\u0006\u0007\u008a\u008a\u0007\t").intern());
            this.f1984 = jSONObject.optString(m2344(5 - Color.green(0), (byte) (57 - MotionEvent.axisFromString("")), "\t\u000e\u000b\u0000\u009b").intern());
            this.f1982 = jSONObject.optString(m2344(7 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (KeyEvent.keyCodeFromString("") + 53), "\u0001\u0000\f\r\u000e\u0003¬").intern());
            this.f1986 = jSONObject.optBoolean(m2344((ViewConfiguration.getPressedStateDuration() >> 16) + 10, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 95), "\n\u0013\u0001\u0013\u0005\u000e\u0002\u0003\u0012\u0010").intern());
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2345() {
        int i10 = f1978 + 35;
        f1981 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1986;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2346() {
        int i10 = f1978;
        String str = this.f1985;
        int i11 = i10 + 45;
        f1981 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m2347() {
        int i10 = f1981;
        int i11 = i10 + 17;
        f1978 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1982;
        int i12 = i10 + 9;
        f1978 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2348() {
        int i10 = f1978;
        int i11 = i10 + 5;
        f1981 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f1984;
        int i12 = i10 + 91;
        f1981 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2349() {
        int i10 = (f1981 + 75) % 128;
        f1978 = i10;
        String str = this.f1983;
        int i11 = i10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1981 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2344(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f1980;
                char c10 = f1979;
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
