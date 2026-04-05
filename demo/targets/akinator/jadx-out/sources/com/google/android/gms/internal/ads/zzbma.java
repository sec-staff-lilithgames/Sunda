package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbma {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized void zza(boolean z10) {
        this.zza = z10;
        this.zzd.set(true);
    }

    public final synchronized void zzb(boolean z10, float f10) {
        this.zzb = z10;
        this.zzc = f10;
    }

    public final synchronized boolean zzc(boolean z10) {
        if (!this.zzd.get()) {
            return z10;
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized float zze() {
        return this.zzc;
    }
}
