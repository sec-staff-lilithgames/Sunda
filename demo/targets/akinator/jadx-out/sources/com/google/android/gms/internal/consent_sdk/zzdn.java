package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdn implements zzdr {
    private static final Object zza = new Object();
    private volatile zzdr zzb;
    private volatile Object zzc = zza;

    private zzdn(zzdr zzdrVar) {
        this.zzb = zzdrVar;
    }

    public static zzdr zzb(zzdr zzdrVar) {
        return zzdrVar instanceof zzdn ? zzdrVar : new zzdn(zzdrVar);
    }

    private final synchronized Object zzc() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZza = this.zzb.zza();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZza) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZza;
            this.zzb = null;
            return objZza;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
