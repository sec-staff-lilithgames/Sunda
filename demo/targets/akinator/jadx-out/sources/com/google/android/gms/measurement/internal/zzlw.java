package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlw implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzmb zze;

    public zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j10, boolean z10) {
        this.zza = zzluVar;
        this.zzb = zzluVar2;
        this.zzc = j10;
        this.zzd = z10;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze.zzu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
