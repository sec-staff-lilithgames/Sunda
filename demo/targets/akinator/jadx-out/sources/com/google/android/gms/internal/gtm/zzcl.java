package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcl implements Callable {
    final /* synthetic */ zzcm zza;

    public zzcl(zzcm zzcmVar) {
        this.zza = zzcmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.zza.zzf();
    }
}
