package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeg {
    private final Object zza;
    private final Object zzb = new Object();

    private zzeg(Object obj, Object obj2, zzef zzefVar) {
        this.zza = obj;
    }

    public static zzeg zza(Object obj, Object obj2, zzef zzefVar) {
        return new zzeg(obj, obj2, zzefVar);
    }

    public final Object zzb() {
        synchronized (this.zzb) {
        }
        return this.zza;
    }
}
