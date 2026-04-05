package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzajl implements zzajs {
    private final zzajr zza;
    private final long zzb;
    private final long zzc;
    private final zzajw zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajl(zzajw zzajwVar, long j10, long j11, long j12, long j13, boolean z10) {
        zzgmd.zza(j10 >= 0 && j11 > j10);
        this.zzd = zzajwVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 == j11 - j10 || z10) {
            this.zzf = j13;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajr();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzajs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzadb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajl.zza(com.google.android.gms.internal.ads.zzadb):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zzb(long j10) {
        long j11 = this.zzf - 1;
        String str = zzep.zza;
        this.zzh = Math.max(0L, Math.min(j10, j11));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final /* bridge */ /* synthetic */ zzaed zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzajk(this, bArr);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzajw zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
