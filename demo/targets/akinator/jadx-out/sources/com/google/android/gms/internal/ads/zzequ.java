package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzequ {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeqt zzb;

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzeqt zzeqtVar) {
        this.zzb = zzeqtVar;
    }

    public final zzeqt zzd() {
        return this.zzb;
    }
}
