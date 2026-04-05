package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdu extends zzcw {
    final /* synthetic */ Runnable zza;

    public zzdu(zzdv zzdvVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    public final void zze() {
        this.zza.run();
    }
}
