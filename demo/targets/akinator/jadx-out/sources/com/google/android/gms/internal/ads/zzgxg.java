package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgxg {
    private zzgxp zza = null;
    private zzhtb zzb = null;
    private zzhtb zzc = null;
    private Integer zzd = null;

    private zzgxg() {
    }

    public final zzgxg zza(zzgxp zzgxpVar) {
        this.zza = zzgxpVar;
        return this;
    }

    public final zzgxg zzb(zzhtb zzhtbVar) {
        this.zzb = zzhtbVar;
        return this;
    }

    public final zzgxg zzc(zzhtb zzhtbVar) {
        this.zzc = zzhtbVar;
        return this;
    }

    public final zzgxg zzd(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgxh zze() throws GeneralSecurityException {
        zzhsz zzhszVarZzb;
        zzgxp zzgxpVar = this.zza;
        if (zzgxpVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzhtb zzhtbVar = this.zzb;
        if (zzhtbVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgxpVar.zzc() != zzhtbVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgxpVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgxo.zzc) {
            zzhszVarZzb = zzhfc.zza;
        } else if (this.zza.zzg() == zzgxo.zzb) {
            zzhszVarZzb = zzhfc.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzgxo.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzhszVarZzb = zzhfc.zzb(this.zzd.intValue());
        }
        return new zzgxh(this.zza, this.zzb, this.zzc, zzhszVarZzb, this.zzd, null);
    }

    public /* synthetic */ zzgxg(byte[] bArr) {
    }
}
