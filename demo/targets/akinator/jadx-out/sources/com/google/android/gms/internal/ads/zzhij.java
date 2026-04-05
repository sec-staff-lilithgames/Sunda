package com.google.android.gms.internal.ads;

import b0.e2;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhij extends zzhim {
    private final int zza;

    private zzhij(int i10) {
        this.zza = i10;
    }

    public static zzhij zzb(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 32) {
            return new zzhij(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhij) && ((zzhij) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhij.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i10 = this.zza;
        return e2.n(new StringBuilder(String.valueOf(i10).length() + 34), "AesCmac PRF Parameters (", i10, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
