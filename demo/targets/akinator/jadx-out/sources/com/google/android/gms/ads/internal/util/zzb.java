package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcbv;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public n1 zzb() {
        return zzcbv.zza.submit(this.zza);
    }

    public final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
