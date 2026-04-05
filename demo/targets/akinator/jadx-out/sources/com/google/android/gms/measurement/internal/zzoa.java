package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzoa {
    protected long zza;
    protected long zzb;
    final /* synthetic */ zzoc zzc;
    private final zzay zzd;

    public zzoa(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zzc = zzocVar;
        this.zzd = new zznz(this, zzocVar.zzu);
        long jElapsedRealtime = zzocVar.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final void zza(long j10) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j10;
        this.zzb = j10;
    }

    public final void zzb(long j10) {
        this.zzd.zzd();
    }

    public final void zzc() {
        this.zzd.zzd();
        long jElapsedRealtime = this.zzc.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final boolean zzd(boolean z10, boolean z11, long j10) {
        zzoc zzocVar = this.zzc;
        zzocVar.zzg();
        zzocVar.zzb();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(zzicVar.zzaZ().currentTimeMillis());
        }
        long j11 = j10 - this.zza;
        if (!z10 && j11 < 1000) {
            zzocVar.zzu.zzaV().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.zzb;
            this.zzb = j10;
        }
        zzic zzicVar2 = zzocVar.zzu;
        zzicVar2.zzaV().zzk().zzb("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !zzicVar2.zzc().zzv();
        zzic zzicVar3 = zzocVar.zzu;
        zzpp.zzav(zzicVar3.zzs().zzh(z12), bundle, true);
        if (!z11) {
            zzicVar3.zzj().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zza = j10;
        zzay zzayVar = this.zzd;
        zzayVar.zzd();
        zzayVar.zzb(((Long) zzfy.zzaq.zzb(null)).longValue());
        return true;
    }
}
