package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzgxt implements zzheq {
    static final /* synthetic */ zzgxt zza = new zzgxt();

    private /* synthetic */ zzgxt() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        zzgxx zzgxxVar = (zzgxx) zzgwjVar;
        int i10 = zzgxu.zza;
        if (zzgxxVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzgxq zzgxqVar = new zzgxq(null);
        zzgxqVar.zza(zzgxxVar);
        zzgxqVar.zzc(num);
        zzgxqVar.zzb(zzhtb.zzb(zzgxxVar.zzc()));
        return zzgxqVar.zzd();
    }
}
