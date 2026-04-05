package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfyo {
    public static String zza(byte[] bArr, boolean z10) {
        return zzc(true).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z10) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z10).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgrz zzc(boolean z10) {
        return z10 ? zzgrz.zzm().zzh() : zzgrz.zzl();
    }
}
