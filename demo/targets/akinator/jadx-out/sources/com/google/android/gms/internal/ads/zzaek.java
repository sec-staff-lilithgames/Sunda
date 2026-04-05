package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaek implements zzadd {
    private final long zzb;
    private final zzadd zzc;

    public zzaek(long j10, zzadd zzaddVar) {
        this.zzb = j10;
        this.zzc = zzaddVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzaem zzu(int i10, int i11) {
        return this.zzc.zzu(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzw(zzaed zzaedVar) {
        this.zzc.zzw(new zzaej(this, zzaedVar, zzaedVar));
    }
}
