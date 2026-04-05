package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zza implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    public zza(zzd zzdVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzdVar);
        this.zzc = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzd(this.zza, this.zzb);
    }
}
