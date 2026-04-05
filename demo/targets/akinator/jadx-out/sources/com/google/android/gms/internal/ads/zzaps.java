package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaps implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapu zzc;

    public zzaps(zzapu zzapuVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzapuVar);
        this.zzc = zzapuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapu zzapuVar = this.zzc;
        zzapuVar.zzx().zza(this.zza, this.zzb);
        zzapuVar.zzx().zzb(zzapuVar.toString());
    }
}
