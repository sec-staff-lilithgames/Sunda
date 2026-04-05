package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgjb {
    private final zzfzn zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private long zzc = -1;
    private long zzd = -1;
    private Throwable zze = null;
    private final int zzf;

    public zzgjb(int i10, zzfxa zzfxaVar, zzfzn zzfznVar) {
        this.zzf = i10;
        this.zza = zzfznVar;
    }

    public final void zza() {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzc = SystemClock.uptimeMillis();
    }

    public final void zzb(Throwable th2) {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zze = th2;
    }

    public final void zzc() {
        AtomicBoolean atomicBoolean = this.zzb;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzd = SystemClock.uptimeMillis();
        this.zza.zzb(this.zzf - 1, atomicBoolean.get() ? this.zzd - this.zzc : -1L, this.zze, null);
    }
}
