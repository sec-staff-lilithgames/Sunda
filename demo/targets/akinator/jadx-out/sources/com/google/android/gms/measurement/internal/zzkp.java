package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkp implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzlj zzb;

    public zzkp(zzlj zzljVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzlj zzljVar = this.zzb;
                    atomicReference.set(Long.valueOf(zzljVar.zzu.zzc().zzl(zzljVar.zzu.zzv().zzj(), zzfy.zzac)));
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
