package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzgyb implements zzheq {
    static final /* synthetic */ zzgyb zza = new zzgyb();

    private /* synthetic */ zzgyb() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ zzgvt zza(zzgwj zzgwjVar, Integer num) throws GeneralSecurityException {
        zzgyg zzgygVar = (zzgyg) zzgwjVar;
        int i10 = zzgyd.zza;
        if (zzgygVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzgxy zzgxyVar = new zzgxy(null);
        zzgxyVar.zza(zzgygVar);
        zzgxyVar.zzc(num);
        zzgxyVar.zzb(zzhtb.zzb(zzgygVar.zzc()));
        return zzgxyVar.zzd();
    }
}
