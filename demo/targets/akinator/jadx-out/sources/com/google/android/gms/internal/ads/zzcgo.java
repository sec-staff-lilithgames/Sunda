package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcgo {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzcgo(String str) {
    }

    public final boolean zza() {
        return this.zza.get();
    }

    public final void zzb() {
        this.zza.set(true);
    }

    public final void zzc() {
        this.zza.set(false);
    }

    public final void zzd() {
        this.zza.set(false);
    }
}
