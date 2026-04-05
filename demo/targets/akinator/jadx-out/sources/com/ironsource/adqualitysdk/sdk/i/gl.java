package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gl extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2365 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2366 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2367 = 6202;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2368 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2369 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        char cKeyCodeFromString;
        int i10;
        int i11 = f2369 + 41;
        f2365 = i11 % 128;
        if (i11 % 2 != 0) {
            cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            i10 = 1373290478 % (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1));
        } else {
            cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            i10 = 1373290478 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        }
        String strIntern = m2547("\ued49\udabf끑㜣", cKeyCodeFromString, "䙱场웾⇏\ue479㢮ḝ㏎┄後뽴", i10, "\u0000\u0000\u0000\u0000").intern();
        int i12 = f2365 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2369 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 7 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2365 + 89;
        f2369 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 2 / 0;
        }
        return InneractiveAdManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bt btVar = new bt(mo2524());
        f2365 = (f2369 + 99) % 128;
        return btVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2369 + 5;
        f2365 = i10 % 128;
        return (i10 % 2 != 0 ? m2547("\uf0ce臂塘䛮", (char) (TextUtils.lastIndexOf("", AbstractJsonLexerKt.END_LIST) + 61017), "산ᐛ\ue278힛퍟鑀箎ꏴ첧ི摢鴣켧ﻣꕙു뵃䓬䛵槱㥻ᵖꡔ\ude9dⳕ髙ச⠞耰\udfc3Ｑ锷月\u1259铳䲘쳹颟Ǜ뻳\udb50捻魊춥鱞ᑞ왅꾍胪傜\ue2d9琠텠䇢눿", 1484899057 << MotionEvent.axisFromString(""), "\u0000\u0000\u0000\u0000") : m2547("\uf0ce臂塘䛮", (char) (TextUtils.lastIndexOf("", '0') + 61017), "산ᐛ\ue278힛퍟鑀箎ꏴ첧ི摢鴣켧ﻣꕙു뵃䓬䛵槱㥻ᵖꡔ\ude9dⳕ髙ச⠞耰\udfc3Ｑ锷月\u1259铳䲘쳹颟Ǜ뻳\udb50捻魊춥鱞ᑞ왅꾍胪傜\ue2d9琠텠䇢눿", MotionEvent.axisFromString("") + 1484899057, "\u0000\u0000\u0000\u0000")).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2547(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2368) ^ f2366) ^ f2367);
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
