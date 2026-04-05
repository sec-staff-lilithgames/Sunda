package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzajm implements zzajs {
    private final zzadn zza;
    private final zzadm zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajm(zzadn zzadnVar, zzadm zzadmVar) {
        this.zza = zzadnVar;
        this.zzb = zzadmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final long zza(zzadb zzadbVar) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zzb(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzep.zzm(jArr, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final zzaed zzc() {
        zzgmd.zzh(this.zzc != -1);
        return new zzadl(this.zza, this.zzc);
    }

    public final void zzd(long j10) {
        this.zzc = j10;
    }
}
