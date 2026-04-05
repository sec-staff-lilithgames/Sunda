package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbbm implements Runnable {
    final /* synthetic */ zzbbn zza;

    public zzbbm(zzbbn zzbbnVar) {
        Objects.requireNonNull(zzbbnVar);
        this.zza = zzbbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbn zzbbnVar = this.zza;
        synchronized (zzbbnVar.zzf()) {
            if (zzbbnVar.zzg().get() && zzbbnVar.zzh()) {
                zzbbnVar.zzg().set(false);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbbnVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbbo) it.next()).zza(false);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
