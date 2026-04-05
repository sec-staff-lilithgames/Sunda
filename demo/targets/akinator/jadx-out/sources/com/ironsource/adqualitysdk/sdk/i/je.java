package com.ironsource.adqualitysdk.sdk.i;

import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class je {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2948 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2949 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2950 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2951 = 3265;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2952;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f2953;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f2954;

    public je(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2966() {
        int i10 = f2949 + 99;
        f2948 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2954;
        }
        int i11 = 79 / 0;
        return this.f2954;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m2967() {
        int i10 = f2949 + 93;
        int i11 = i10 % 128;
        f2948 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        JSONObject jSONObject = this.f2953;
        int i12 = i11 + 43;
        f2949 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 12 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m2968() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m2965("Ⲑ麊ন\uf6cc", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "溮\udfc6㓳\udaa1⢈\udcff࠱꼫", ViewConfiguration.getEdgeSlop() >> 16, "\u0000\u0000\u0000\u0000").intern(), this.f2953);
        jSONObject.put(m2965("\uef2e㝷纁\ue998", (char) (39038 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\ue144㞥䤯ᔾ", KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000").intern(), this.f2954);
        int i10 = f2948 + 91;
        f2949 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 45 / 0;
        }
        return jSONObject;
    }

    public je(JSONObject jSONObject, String str) {
        this.f2953 = jSONObject;
        this.f2954 = str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2965(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2950) ^ f2952) ^ f2951);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
