package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.ktor.util.date.GMTDateParser;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jw {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3088 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3089 = 61094;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f3090 = 7370;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3091 = 26522;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3092 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3093 = 48062;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m3092(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3091)) ^ ((c11 >>> 5) + f3093)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3090) ^ ((c12 + i12) ^ ((c12 << 4) + f3089))));
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
    public static String m3093(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(new String(new char[]{'H', GMTDateParser.MINUTES, 'a', 'c', 'S', 'H', 'A', '1'}));
            mac.init(new SecretKeySpec(m3092("▯ꖮ᧱妺㠥뵈ῴ症돟疅웘\uf70d\ue458\ud834\u0ef2淸涝\ue592僡Ꝕ任絰㫉솎ॾ\ue6b1䢊돣澣♉膨ᦠ鳪ﴞ", 33 - ExpandableListView.getPackedPositionChild(0L)).intern().getBytes(m3092("庎錹컻渶勼횰", 6 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()), mac.getAlgorithm()));
            String strM2788 = ic.m2788(mac.doFinal(str.replaceAll(m3092("ᱵ蹲", 1 - TextUtils.indexOf("", "", 0, 0)).intern(), "").replaceAll(m3092("\ue20fɰ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern(), "").getBytes(m3092("庎錹컻渶勼횰", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5).intern())));
            f3088 = (f3092 + 57) % 128;
            return strM2788;
        } catch (Exception e10) {
            String strIntern = m3092("銏矺丛⼇ᮮ톈涀\uf3fc\udbef俚", AndroidCharacter.getMirror('0') - '\'').intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3092("㘃߄\ue99c\uefb0潈뙇ᱵ蹲", 7 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m3147(strIntern, sb2.toString());
            return null;
        }
    }
}
