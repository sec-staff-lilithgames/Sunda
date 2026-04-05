package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbcx implements Runnable {
    final /* synthetic */ zzbdb zza;

    public zzbcx(zzbdb zzbdbVar) {
        Objects.requireNonNull(zzbdbVar);
        this.zza = zzbdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
