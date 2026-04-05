package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhdz {
    private final zzhsz zza;
    private final Class zzb;

    public /* synthetic */ zzhdz(zzhsz zzhszVar, Class cls, byte[] bArr) {
        this.zza = zzhszVar;
        this.zzb = cls;
    }

    public static zzhdz zzd(zzhdy zzhdyVar, zzhsz zzhszVar, Class cls) {
        return new zzhdx(zzhszVar, cls, zzhdyVar);
    }

    public abstract zzgvt zza(zzhgb zzhgbVar, zzgwn zzgwnVar) throws GeneralSecurityException;

    public final zzhsz zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
