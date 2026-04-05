package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzea {
    final /* synthetic */ zzee zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzea(zzee zzeeVar, zzdy zzdyVar, Executor executor) {
        Objects.requireNonNull(zzeeVar);
        this.zza = zzeeVar;
        this.zzb = new WeakReference(zzdyVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        zzdy zzdyVar = (zzdy) this.zzb.get();
        if (zzdyVar != null) {
            zzdyVar.zza(this.zza.zzc());
        }
    }
}
