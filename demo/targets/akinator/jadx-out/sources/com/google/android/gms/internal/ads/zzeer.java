package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeer {
    private final zzeen zza;
    private final zzgus zzb;

    public zzeer(zzeen zzeenVar, zzgus zzgusVar) {
        this.zza = zzeenVar;
        this.zzb = zzgusVar;
    }

    public final void zza(zzfjx zzfjxVar) {
        final zzeen zzeenVar = this.zza;
        Objects.requireNonNull(zzeenVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeenVar.getWritableDatabase();
            }
        };
        zzgus zzgusVar = this.zzb;
        zzgui.zzr(zzgusVar.submit(callable), new zzeep(this, zzfjxVar), zzgusVar);
    }
}
