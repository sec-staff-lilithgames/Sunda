package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzud implements zzwm {
    private final zzwm zza;
    private final zzgpe zzb;

    public zzud(zzwm zzwmVar, List list) {
        this.zza = zzwmVar;
        this.zzb = zzgpe.zzq(list);
    }

    public final zzgpe zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzg(long j10) {
        this.zza.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzm(zzkn zzknVar) {
        return this.zza.zzm(zzknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzn() {
        return this.zza.zzn();
    }
}
