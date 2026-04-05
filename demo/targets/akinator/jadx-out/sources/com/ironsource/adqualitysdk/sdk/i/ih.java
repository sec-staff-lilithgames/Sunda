package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ih {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2709 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2710 = {194, 207, 197, 211, 208, 202, 192, 170, 180, 172, 166, 183, 162, 129, 176, 195, 212, 196, 214, 198, 201, 177, 199, 164, 205, 136, 213, 175, 165, 179, 143, 182, 200, 204, 215, 206};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2711 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2712 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2713 = 97;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2714 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m2807(String str, String str2) {
        f2711 = (f2709 + 29) % 128;
        k.m3136(str, str2);
        f2709 = (f2711 + 3) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m2809(String str, String str2) {
        f2711 = (f2709 + 91) % 128;
        k.m3147(str, str2);
        int i10 = f2709 + 71;
        f2711 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2810(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f2710;
                int i11 = f2713;
                if (f2712) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2714) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m2806(Context context) {
        f2709 = (f2711 + 19) % 128;
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2810(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u0083\u0086\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        if (string == null) {
            f2709 = (f2711 + 93) % 128;
            m2809(m2810(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0091\u0094\u0092\u0082\u0094\u0084\u0094\u0097\u0094\u0084\u0096\u0083\u0094\u0084\u0081\u0095\u0089\u0083\u0094\u0084\u0093\u0092\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008b\u008a\u0089\u0088").intern(), m2810(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u009f\u0083\u0086\u008e\u0083\u0094\u009b\u0081\u0084\u0094\u0082\u0094¡\u008e¡\u0082\u0086\u0091 \u008e\u009f\u009d\u0088\u0087\u009d\u0088\u008f\u009e\u009d\u009c\u008d\u008e\u0095\u0092\u009b\u0094\u0097\u008e\u009b\u009a\u0082\u0083\u0099\u0093\u0085\u0098").intern());
            string = m2808(context);
            f2711 = (f2709 + 71) % 128;
        }
        f2711 = (f2709 + 93) % 128;
        return string;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2808(Context context) {
        f2709 = (f2711 + 19) % 128;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m2810(null, 127 - View.MeasureSpec.getMode(0), null, "\u0090\u0083\u009f£¢\u009f\u0094\u0084\u0085\u009b\u0091").intern(), 0);
        String string = sharedPreferences.getString(m2810(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u0083\u0086\u0083\u0094\u009b\u0081\u0084\u0094\u0082\u0094¡\u009f\u0081\u0099¤\u0085\u0085\u0091").intern(), null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        sharedPreferences.edit().putString(m2810(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0083\u0086\u0083\u0094\u009b\u0081\u0084\u0094\u0082\u0094¡\u009f\u0081\u0099¤\u0085\u0085\u0091").intern(), string2).commit();
        f2709 = (f2711 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        return string2;
    }
}
