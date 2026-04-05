package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgzl extends zzgxa {
    private final zzgzp zza;
    private final zzhsz zzb;
    private final Integer zzc;

    private zzgzl(zzgzp zzgzpVar, zzhsz zzhszVar, Integer num) {
        this.zza = zzgzpVar;
        this.zzb = zzhszVar;
        this.zzc = num;
    }

    public static zzgzl zzd(zzgzp zzgzpVar, Integer num) throws GeneralSecurityException {
        zzhsz zzhszVarZzb;
        if (zzgzpVar.zzc() == zzgzo.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzhszVarZzb = zzhfc.zza;
        } else {
            if (zzgzpVar.zzc() != zzgzo.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgzpVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzhszVarZzb = zzhfc.zzb(num.intValue());
        }
        return new zzgzl(zzgzpVar, zzhszVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa, com.google.android.gms.internal.ads.zzgvt
    public final /* synthetic */ zzgwj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzhsz zzc() {
        return this.zzb;
    }

    public final zzgzp zze() {
        return this.zza;
    }
}
