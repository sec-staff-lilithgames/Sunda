package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzaec implements zzaed {
    private final long zza;
    private final zzaeb zzb;

    public zzaec(long j10, long j11) {
        this.zza = j10;
        zzaee zzaeeVar = j11 == 0 ? zzaee.zza : new zzaee(0L, j11);
        this.zzb = new zzaeb(zzaeeVar, zzaeeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        return this.zzb;
    }
}
