package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzifu implements zzifq {
    private static final Object zza = new Object();
    private volatile zzifq zzb;
    private volatile Object zzc = zza;

    private zzifu(zzifq zzifqVar) {
        this.zzb = zzifqVar;
    }

    public static zzifq zza(zzifq zzifqVar) {
        return ((zzifqVar instanceof zzifu) || (zzifqVar instanceof zzifg)) ? zzifqVar : new zzifu(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzifq zzifqVar = this.zzb;
        if (zzifqVar == null) {
            return this.zzc;
        }
        Object objZzb = zzifqVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
