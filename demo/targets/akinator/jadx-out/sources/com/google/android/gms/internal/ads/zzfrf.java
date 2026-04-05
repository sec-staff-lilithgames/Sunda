package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfrf {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfre zzd = null;

    public zzfrf() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfre zzfreVar = (zzfre) this.zzc.poll();
        this.zzd = zzfreVar;
        if (zzfreVar != null) {
            zzfreVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfre zzfreVar) {
        zzfreVar.zzb(this);
        this.zzc.add(zzfreVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfre zzfreVar) {
        this.zzd = null;
        zzc();
    }
}
