package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhfi {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhfi(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhfi zzd(zzhfh zzhfhVar, Class cls, Class cls2) {
        return new zzhfg(cls, cls2, zzhfhVar);
    }

    public abstract zzhgb zza(zzgwj zzgwjVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
