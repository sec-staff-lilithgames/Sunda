package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhnm extends zzhpq {
    private final zzhns zza;
    private final zzhtb zzb;

    private zzhnm(zzhns zzhnsVar, zzhtb zzhtbVar) {
        this.zza = zzhnsVar;
        this.zzb = zzhtbVar;
    }

    public static zzhnm zzc(zzhns zzhnsVar, zzhtb zzhtbVar) throws GeneralSecurityException {
        if (zzhtbVar.zzd() != 32) {
            int iZzd = zzhtbVar.zzd();
            throw new GeneralSecurityException(o2.l(iZzd, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 65)));
        }
        if (Arrays.equals(zzhnsVar.zzd().zzc(), zzhdj.zza(zzhdj.zzb(zzhtbVar.zzc(zzgvr.zza()))))) {
            return new zzhnm(zzhnsVar, zzhtbVar);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhpq, com.google.android.gms.internal.ads.zzgvt
    public final /* synthetic */ zzgwj zza() {
        return this.zza.zzf();
    }

    public final zzhnl zzd() {
        return this.zza.zzf();
    }

    public final zzhns zze() {
        return this.zza;
    }

    public final zzhtb zzf() {
        return this.zzb;
    }
}
