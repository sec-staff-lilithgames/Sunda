package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaei extends zzado {
    private final long zza;

    public zzaei(zzadb zzadbVar, long j10) {
        super(zzadbVar);
        zzgmd.zza(zzadbVar.zzn() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzado, com.google.android.gms.internal.ads.zzadb
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzado, com.google.android.gms.internal.ads.zzadb
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzado, com.google.android.gms.internal.ads.zzadb
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
