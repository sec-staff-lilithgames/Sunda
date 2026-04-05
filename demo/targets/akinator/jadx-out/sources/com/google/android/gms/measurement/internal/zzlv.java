package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlv implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ zzlu zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzmb zze;

    public zzlv(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j10) {
        this.zza = bundle;
        this.zzb = zzluVar;
        this.zzc = zzluVar2;
        this.zzd = j10;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze.zzt(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
