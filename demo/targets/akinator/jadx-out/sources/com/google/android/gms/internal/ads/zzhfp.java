package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhfp {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhfp(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhfp zzd(zzhfo zzhfoVar, Class cls, Class cls2) {
        return new zzhfn(cls, cls2, zzhfoVar);
    }

    public abstract Object zza(zzgvt zzgvtVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
