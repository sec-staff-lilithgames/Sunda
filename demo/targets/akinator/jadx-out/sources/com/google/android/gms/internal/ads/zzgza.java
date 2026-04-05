package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzgza implements zzhfo {
    static final /* synthetic */ zzgza zza = new zzgza();

    private /* synthetic */ zzgza() {
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final /* synthetic */ Object zza(zzgvt zzgvtVar) throws GeneralSecurityException {
        zzgzl zzgzlVar = (zzgzl) zzgvtVar;
        int i10 = zzgzc.zza;
        String strZzb = zzgzlVar.zze().zzb();
        zzgxb zzgxbVarZzd = zzgzlVar.zze().zzd();
        zzgvm zzgvmVarZzb = zzgwh.zza(strZzb).zzb();
        int i11 = zzgyz.zza;
        try {
            return zzhce.zzc(new zzgyz(zzhla.zzd(zzgwp.zza(zzgxbVarZzd), zzhvy.zza()), zzgvmVarZzb), zzgzlVar.zzc());
        } catch (zzhxd e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
