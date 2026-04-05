package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhmw {
    private zzhmz zza = null;
    private zzhmx zzb = null;
    private zzhmy zzc = null;
    private zzhna zzd = zzhna.zzd;

    private zzhmw() {
    }

    public final zzhmw zza(zzhmz zzhmzVar) {
        this.zza = zzhmzVar;
        return this;
    }

    public final zzhmw zzb(zzhmx zzhmxVar) {
        this.zzb = zzhmxVar;
        return this;
    }

    public final zzhmw zzc(zzhmy zzhmyVar) {
        this.zzc = zzhmyVar;
        return this;
    }

    public final zzhmw zzd(zzhna zzhnaVar) {
        this.zzd = zzhnaVar;
        return this;
    }

    public final zzhnb zze() throws GeneralSecurityException {
        zzhmz zzhmzVar = this.zza;
        if (zzhmzVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhmx zzhmxVar = this.zzb;
        if (zzhmxVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhmy zzhmyVar = this.zzc;
        if (zzhmyVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhna zzhnaVar = this.zzd;
        if (zzhnaVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zzhmxVar == zzhmx.zza && zzhmyVar != zzhmy.zza) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhmxVar == zzhmx.zzb && zzhmyVar != zzhmy.zzb && zzhmyVar != zzhmy.zzc) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhmxVar != zzhmx.zzc || zzhmyVar == zzhmy.zzc) {
            return new zzhnb(zzhmzVar, zzhmxVar, zzhmyVar, zzhnaVar, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public /* synthetic */ zzhmw(byte[] bArr) {
    }
}
