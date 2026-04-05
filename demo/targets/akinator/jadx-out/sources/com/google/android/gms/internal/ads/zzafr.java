package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzafr {
    protected final zzaem zza;

    public zzafr(zzaem zzaemVar) {
        this.zza = zzaemVar;
    }

    public abstract boolean zza(zzeg zzegVar) throws zzat;

    public abstract boolean zzb(zzeg zzegVar, long j10) throws zzat;

    public final boolean zzf(zzeg zzegVar, long j10) throws zzat {
        return zza(zzegVar) && zzb(zzegVar, j10);
    }
}
