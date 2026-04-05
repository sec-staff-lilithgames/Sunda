package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ak {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f520 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f521;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f522;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f523;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f524;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f525;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f527 = m786("\ueccd헶ﹳꐞ\ude96쟝制⤇莇ࣖ┙녕壯뗩苾➓醹泽䎡鯏㘲㉛Ꞧ纪녢␒Ⅷ\uf14e㓼罺䅸彪랹\u0a12扣\uf6d5", 36 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1))).intern();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f526 = m786("\ueccd헶ﹳꐞ\ude96쟝制⤇ᯄ㷎┙녕壯뗩苾➓醹泽䎡鯏㘲㉛Ꞧ纪녢␒Ⅷ\uf14e㓼罺䅸彪랹\u0a12扣\uf6d5", TextUtils.indexOf("", "", 0, 0) + 35).intern();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f528 = m786("\ueccd헶ﹳꐞ\ude96쟝制⤇⊘ﾉ┙녕壯뗩苾➓醹泽䎡鯏㘲㉛Ꞧ纪녢␒Ⅷ\uf14e㓼罺䅸彪랹\u0a12扣\uf6d5", 35 - TextUtils.getOffsetAfter("", 0)).intern();

    static {
        m784();
        m786("\uf1b4鷏儓ꪏꃙ襩ⶂ\u05f8앻힝鳐팿۞\ue064꯴\ud959", TextUtils.lastIndexOf("", '0', 0, 0) + 16).intern();
        int i10 = f523 + 83;
        f520 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public ak() {
        m786("㘈䪫⋗ࢃ⡦䱄⋗ࢃ땱뼡꤄\uf2d8㨪鋂ꏇ叧", View.getDefaultSize(0, 0) + 15).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m784() {
        f522 = (char) 44332;
        f525 = (char) 28673;
        f521 = (char) 59201;
        f524 = (char) 21120;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m785() {
        f520 = (f523 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        String strIntern = m786("㘈䪫⋗ࢃ⡦䱄⋗ࢃ땱뼡꤄\uf2d8㨪鋂ꏇ叧", Color.red(0) + 15).intern();
        int i10 = f520 + 87;
        f523 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
        }
        return strIntern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m789() {
        int i10 = f523;
        String str = this.f527;
        f520 = (i10 + 73) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m791(String str) {
        int i10 = f520 + 75;
        f523 = i10 % 128;
        if (i10 % 2 != 0) {
            m787(this.f526, str);
            throw null;
        }
        String strM787 = m787(this.f526, str);
        int i11 = f520 + 73;
        f523 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 42 / 0;
        }
        return strM787;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m786(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f522)) ^ ((c11 >>> 5) + f521)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f525) ^ ((c12 + i12) ^ ((c12 << 4) + f524))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m787(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(m786("ၺ汞", 1 - Gravity.getAbsoluteGravity(0, 0)).intern());
        if (str2 != null) {
            f520 = (f523 + 11) % 128;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        String string = sb2.toString();
        f520 = (f523 + 91) % 128;
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m788(String str) {
        int i10 = f520 + 51;
        f523 = i10 % 128;
        if (i10 % 2 != 0) {
            m787(this.f527, str);
            throw null;
        }
        String strM787 = m787(this.f527, str);
        f523 = (f520 + 33) % 128;
        return strM787;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m790() {
        int i10 = (f523 + 29) % 128;
        f520 = i10;
        String str = this.f528;
        f523 = (i10 + 25) % 128;
        return str;
    }
}
