package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbbq implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbbu zzb;

    public zzbbq(zzbbu zzbbuVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbbuVar);
        this.zzb = zzbbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
