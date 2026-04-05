package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgxy {
    private zzgyg zza = null;
    private zzhtb zzb = null;
    private Integer zzc = null;

    private zzgxy() {
    }

    public final zzgxy zza(zzgyg zzgygVar) {
        this.zza = zzgygVar;
        return this;
    }

    public final zzgxy zzb(zzhtb zzhtbVar) {
        this.zzb = zzhtbVar;
        return this;
    }

    public final zzgxy zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgxz zzd() throws GeneralSecurityException {
        zzhtb zzhtbVar;
        zzhsz zzhszVarZzb;
        zzgyg zzgygVar = this.zza;
        if (zzgygVar == null || (zzhtbVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgygVar.zzc() != zzhtbVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgygVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgyf.zzc) {
            zzhszVarZzb = zzhfc.zza;
        } else if (this.zza.zzd() == zzgyf.zzb) {
            zzhszVarZzb = zzhfc.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgyf.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzhszVarZzb = zzhfc.zzb(this.zzc.intValue());
        }
        return new zzgxz(this.zza, this.zzb, zzhszVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgxy(byte[] bArr) {
    }
}
