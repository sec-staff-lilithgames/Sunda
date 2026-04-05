package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzifg implements zzifq, zzifb {
    private static final Object zza = new Object();
    private volatile zzifq zzb;
    private volatile Object zzc = zza;

    private zzifg(zzifq zzifqVar) {
        this.zzb = zzifqVar;
    }

    public static zzifq zza(zzifq zzifqVar) {
        return zzifqVar instanceof zzifg ? zzifqVar : new zzifg(zzifqVar);
    }

    public static zzifb zzc(zzifq zzifqVar) {
        if (zzifqVar instanceof zzifb) {
            return (zzifb) zzifqVar;
        }
        zzifqVar.getClass();
        return new zzifg(zzifqVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
