package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhty {
    public static BigDecimal zza(String str) throws NumberFormatException {
        zzc(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger zzb(String str) throws NumberFormatException {
        zzc(str);
        return new BigInteger(str);
    }

    private static void zzc(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(a.b.o(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, APSSharedUtil.TRUNCATE_SEPARATOR));
    }
}
