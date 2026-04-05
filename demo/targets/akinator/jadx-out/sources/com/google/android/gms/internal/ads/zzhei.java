package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhei extends zzgvt {
    private final zzhfw zza;

    public zzhei(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        zze(zzhfwVar, zzgwnVar);
        this.zza = zzhfwVar;
    }

    private static void zze(zzhfw zzhfwVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        int i10 = zzheg.zzb[zzhfwVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final zzgwj zza() {
        zzhfw zzhfwVar = this.zza;
        return new zzheh(zzhfwVar.zzg(), zzhfwVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhfw zzc(zzgwn zzgwnVar) throws GeneralSecurityException {
        zzhfw zzhfwVar = this.zza;
        zze(zzhfwVar, zzgwnVar);
        return zzhfwVar;
    }

    public final zzhsz zzd() throws GeneralSecurityException {
        zzhfw zzhfwVar = this.zza;
        if (zzhfwVar.zzd().equals(zzhlt.RAW)) {
            return zzhsz.zza(new byte[0]);
        }
        if (zzhfwVar.zzd().equals(zzhlt.TINK)) {
            return zzhfc.zzb(zzhfwVar.zze().intValue());
        }
        if (zzhfwVar.zzd().equals(zzhlt.LEGACY) || zzhfwVar.zzd().equals(zzhlt.CRUNCHY)) {
            return zzhfc.zza(zzhfwVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
