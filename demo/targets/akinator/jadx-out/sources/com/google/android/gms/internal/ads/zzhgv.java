package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgv {
    private zzhhf zza = null;
    private zzhtb zzb = null;
    private Integer zzc = null;

    private zzhgv() {
    }

    public final zzhgv zza(zzhhf zzhhfVar) {
        this.zza = zzhhfVar;
        return this;
    }

    public final zzhgv zzb(zzhtb zzhtbVar) {
        this.zzb = zzhtbVar;
        return this;
    }

    public final zzhgv zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgw zzd() throws GeneralSecurityException {
        zzhtb zzhtbVar;
        zzhsz zzhszVarZza;
        zzhhf zzhhfVar = this.zza;
        if (zzhhfVar == null || (zzhtbVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhhfVar.zzc() != zzhtbVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhhfVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhhe.zzd) {
            zzhszVarZza = zzhfc.zza;
        } else if (this.zza.zzf() == zzhhe.zzc || this.zza.zzf() == zzhhe.zzb) {
            zzhszVarZza = zzhfc.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhhe.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhszVarZza = zzhfc.zzb(this.zzc.intValue());
        }
        return new zzhgw(this.zza, this.zzb, zzhszVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhgv(byte[] bArr) {
    }
}
