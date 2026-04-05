package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkl implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzlj zze;

    public zzkl(zzlj zzljVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z10;
        Objects.requireNonNull(zzljVar);
        this.zze = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zze.zzu.zzt().zzt(this.zza, null, this.zzb, this.zzc, this.zzd);
    }
}
