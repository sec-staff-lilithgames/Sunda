package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacg implements zzaed {
    private final zzacj zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzacg(zzacj zzacjVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzacjVar;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzaee zzaeeVar = new zzaee(j10, zzaci.zza(this.zza.zza(j10), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzaeb(zzaeeVar, zzaeeVar);
    }

    public final long zzd(long j10) {
        return this.zza.zza(j10);
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }
}
