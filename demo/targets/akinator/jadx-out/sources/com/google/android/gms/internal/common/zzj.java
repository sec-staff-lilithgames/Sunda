package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzj {
    private final Class zza;
    private final Object zzb;

    private zzj(Class cls, Object obj) {
        this.zza = cls;
        this.zzb = obj;
    }

    public static zzj zzb(Class cls, Object obj) {
        return new zzj(cls, obj);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Object zzd() {
        return this.zzb;
    }
}
