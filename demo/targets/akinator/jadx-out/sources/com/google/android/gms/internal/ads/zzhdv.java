package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhdv {
    public static boolean zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static zzhtg zzb(String str) throws IOException {
        try {
            zzhul zzhulVar = new zzhul(new StringReader(str));
            zzhulVar.zza(zzhtl.LEGACY_STRICT);
            return zzhdt.zzb(zzhulVar);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhdu) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
