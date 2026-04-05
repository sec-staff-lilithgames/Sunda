package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgj {
    private zzhgr zza = null;
    private zzhtb zzb = null;
    private Integer zzc = null;

    private zzhgj() {
    }

    public final zzhgj zza(zzhgr zzhgrVar) {
        this.zza = zzhgrVar;
        return this;
    }

    public final zzhgj zzb(zzhtb zzhtbVar) throws GeneralSecurityException {
        this.zzb = zzhtbVar;
        return this;
    }

    public final zzhgj zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgk zzd() throws GeneralSecurityException {
        zzhtb zzhtbVar;
        zzhsz zzhszVarZza;
        zzhgr zzhgrVar = this.zza;
        if (zzhgrVar == null || (zzhtbVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgrVar.zzc() != zzhtbVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgrVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhgq.zzd) {
            zzhszVarZza = zzhfc.zza;
        } else if (this.zza.zzf() == zzhgq.zzc || this.zza.zzf() == zzhgq.zzb) {
            zzhszVarZza = zzhfc.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhgq.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhszVarZza = zzhfc.zzb(this.zzc.intValue());
        }
        return new zzhgk(this.zza, this.zzb, zzhszVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhgj(byte[] bArr) {
    }
}
