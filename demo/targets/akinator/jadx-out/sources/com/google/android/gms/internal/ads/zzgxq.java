package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgxq {
    private zzgxx zza = null;
    private zzhtb zzb = null;
    private Integer zzc = null;

    private zzgxq() {
    }

    public final zzgxq zza(zzgxx zzgxxVar) {
        this.zza = zzgxxVar;
        return this;
    }

    public final zzgxq zzb(zzhtb zzhtbVar) {
        this.zzb = zzhtbVar;
        return this;
    }

    public final zzgxq zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgxr zzd() throws GeneralSecurityException {
        zzhtb zzhtbVar;
        zzhsz zzhszVarZzb;
        zzgxx zzgxxVar = this.zza;
        if (zzgxxVar == null || (zzhtbVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgxxVar.zzc() != zzhtbVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgxxVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgxw.zzc) {
            zzhszVarZzb = zzhfc.zza;
        } else if (this.zza.zze() == zzgxw.zzb) {
            zzhszVarZzb = zzhfc.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgxw.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhszVarZzb = zzhfc.zzb(this.zzc.intValue());
        }
        return new zzgxr(this.zza, this.zzb, zzhszVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgxq(byte[] bArr) {
    }
}
