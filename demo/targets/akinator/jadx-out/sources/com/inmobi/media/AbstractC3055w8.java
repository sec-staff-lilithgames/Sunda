package com.inmobi.media;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3055w8 {
    public static byte a(String referencedCreativeString) {
        kotlin.jvm.internal.e0.checkNotNullParameter(referencedCreativeString, "referencedCreativeString");
        Locale locale = Locale.US;
        String strP = b0.e2.p(locale, "US", referencedCreativeString, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) strP.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, strP, i10);
        int iHashCode = strA.hashCode();
        if (iHashCode != -1412832500) {
            return iHashCode != 0 ? (byte) 1 : (byte) 1;
        }
        if (strA.equals("companion")) {
            return (byte) 2;
        }
        return (byte) 0;
    }
}
