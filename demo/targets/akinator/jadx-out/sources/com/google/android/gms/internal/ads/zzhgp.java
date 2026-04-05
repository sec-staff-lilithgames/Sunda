package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgp {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhgq zzc = zzhgq.zzd;

    private zzhgp() {
    }

    public final zzhgp zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhgp zzb(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(o2.l(i10, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i10).length() + 40)));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzhgp zzc(zzhgq zzhgqVar) {
        this.zzc = zzhgqVar;
        return this;
    }

    public final zzhgr zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhgr(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhgp(byte[] bArr) {
    }
}
