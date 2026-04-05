package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzher implements zzheq {
    static final /* synthetic */ zzher zza = new zzher();

    private /* synthetic */ zzher() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        int i10 = zzhes.zza;
        zzhla zzhlaVarZzc = ((zzhej) zzgwjVar).zzb().zzc();
        zzgvu zzgvuVarZzd = zzhdw.zza().zzd(zzhlaVarZzc.zza());
        if (!zzhdw.zza().zze(zzhlaVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhkx zzhkxVarZzd = zzgvuVarZzd.zzd(zzhlaVarZzc.zzb());
        return new zzhei(zzhfw.zza(zzhkxVarZzd.zza(), zzhkxVarZzd.zzb(), zzhkxVarZzd.zzc(), zzhlaVarZzc.zzc(), num), zzgvr.zza());
    }
}
