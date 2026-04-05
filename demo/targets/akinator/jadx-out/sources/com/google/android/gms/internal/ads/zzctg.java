package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzctg {
    private final zzdbp zza;
    private final zzddu zzb;

    public zzctg(zzdbp zzdbpVar, zzddu zzdduVar) {
        this.zza = zzdbpVar;
        this.zzb = zzdduVar;
    }

    public final zzdbp zza() {
        return this.zza;
    }

    public final zzdgn zzb() {
        zzddu zzdduVar = this.zzb;
        return zzdduVar != null ? new zzdgn(zzdduVar, zzcbv.zzg) : new zzdgn(new zzctf(this), zzcbv.zzg);
    }

    public final zzddu zzc() {
        return this.zzb;
    }
}
