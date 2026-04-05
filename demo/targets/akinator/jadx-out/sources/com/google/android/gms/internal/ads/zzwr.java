package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzwr implements zzwk {
    private final zzwk zza;
    private final long zzb;

    public zzwr(zzwk zzwkVar, long j10) {
        this.zza = zzwkVar;
        this.zzb = j10;
    }

    public final zzwk zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zzd(zzkj zzkjVar, zzhh zzhhVar, int i10) {
        int iZzd = this.zza.zzd(zzkjVar, zzhhVar, i10);
        if (iZzd != -4) {
            return iZzd;
        }
        zzhhVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zze(long j10) {
        return this.zza.zze(j10 - this.zzb);
    }
}
