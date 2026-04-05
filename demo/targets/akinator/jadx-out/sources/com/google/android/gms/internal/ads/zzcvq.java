package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcvq implements zzdej, zzdac {
    private final Clock zza;
    private final zzcvs zzb;
    private final zzfgn zzc;
    private final String zzd;

    public zzcvq(Clock clock, zzcvs zzcvsVar, zzfgn zzfgnVar, String str) {
        this.zza = clock;
        this.zzb = zzcvsVar;
        this.zzc = zzfgnVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
