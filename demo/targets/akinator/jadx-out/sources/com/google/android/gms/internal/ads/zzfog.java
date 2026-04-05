package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfog implements Runnable {
    final /* synthetic */ zzfom zza;

    public zzfog(zzfom zzfomVar) {
        Objects.requireNonNull(zzfomVar);
        this.zza = zzfomVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzq();
    }
}
