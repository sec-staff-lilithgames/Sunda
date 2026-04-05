package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzly implements zzko {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzav zzd = zzav.zza;

    public zzly(zzdc zzdcVar) {
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j10) {
        this.zzb = j10;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zzg() {
        long j10 = this.zzb;
        if (!this.zza) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzav zzavVar = this.zzd;
        return (zzavVar.zzb == 1.0f ? zzep.zzq(jElapsedRealtime) : zzavVar.zza(jElapsedRealtime)) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzi(zzav zzavVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzav zzj() {
        return this.zzd;
    }
}
