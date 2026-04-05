package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzmd {
    final /* synthetic */ zzme zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzmd(zzme zzmeVar, int i10) {
        Objects.requireNonNull(zzmeVar);
        this.zza = zzmeVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzme zzmeVar = this.zza;
        int iZzi = zzmeVar.zzw().zzi();
        if (!zzmeVar.zzw().zzk() || zzmeVar.zzw().zzh() == 1 || zzmeVar.zzw().zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.zzd) {
                zzmeVar.zzz().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == iZzi) {
            long j10 = jElapsedRealtime - this.zze;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzmeVar.zzx().zzx(new zzmf(4, i10));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = jElapsedRealtime;
        this.zzc = iZzi;
        zzmeVar.zzz().zzk(4);
        zzmeVar.zzz().zzi(4, this.zzb);
    }
}
