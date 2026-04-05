package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzgxi implements zzheq {
    static final /* synthetic */ zzgxi zza = new zzgxi();

    private /* synthetic */ zzgxi() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        zzgxp zzgxpVar = (zzgxp) zzgwjVar;
        int i10 = zzgxl.zza;
        if (zzgxpVar.zzc() != 16 && zzgxpVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzgxg zzgxgVar = new zzgxg(null);
        zzgxgVar.zza(zzgxpVar);
        zzgxgVar.zzd(num);
        zzgxgVar.zzb(zzhtb.zzb(zzgxpVar.zzc()));
        zzgxgVar.zzc(zzhtb.zzb(zzgxpVar.zzd()));
        return zzgxgVar.zze();
    }
}
