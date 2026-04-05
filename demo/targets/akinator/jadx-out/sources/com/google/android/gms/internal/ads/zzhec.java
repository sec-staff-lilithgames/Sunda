package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhec {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhec(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhec zzd(zzheb zzhebVar, Class cls, Class cls2) {
        return new zzhea(cls, cls2, zzhebVar);
    }

    public abstract zzhgb zza(zzgvt zzgvtVar, zzgwn zzgwnVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
