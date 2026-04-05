package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgxv {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgxw zzd = zzgxw.zzc;

    private zzgxv() {
    }

    public final zzgxv zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgxv zzb(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgxv zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgxv zzd(zzgxw zzgxwVar) {
        this.zzd = zzgxwVar;
        return this;
    }

    public final zzgxx zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzgxx(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    public /* synthetic */ zzgxv(byte[] bArr) {
    }
}
