package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzazp implements Runnable {
    final /* synthetic */ zzazq zza;

    public zzazp(zzazq zzazqVar) {
        Objects.requireNonNull(zzazqVar);
        this.zza = zzazqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
