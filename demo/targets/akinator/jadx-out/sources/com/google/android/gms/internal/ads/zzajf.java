package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzajf {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzajg[] zzl;

    public zzajf(int i10, int i11, long j10, long j11, long j12, long j13, zzv zzvVar, int i12, zzajg[] zzajgVarArr, int i13, long[] jArr, long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = zzvVar;
        this.zzh = i12;
        this.zzl = zzajgVarArr;
        this.zzk = i13;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzajg zza(int i10) {
        return this.zzl[i10];
    }

    public final zzajf zzb(zzv zzvVar) {
        return new zzajf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
