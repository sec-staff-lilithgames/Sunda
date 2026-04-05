package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzccq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzccv zzc;

    public zzccq(zzccv zzccvVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        Objects.requireNonNull(zzccvVar);
        this.zzc = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccv zzccvVar = this.zzc;
        if (zzccvVar.zzt() != null) {
            zzccvVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
