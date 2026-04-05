package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhro {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhro(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzhro zzc() throws GeneralSecurityException {
        byte[] bArrZza = zzhfz.zza(32);
        if (bArrZza.length == 32) {
            return new zzhro(zzhdj.zza(zzhdj.zzb(bArrZza)), bArrZza);
        }
        throw new IllegalArgumentException("Given secret seed length is not 32");
    }

    public final byte[] zza() {
        return Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
