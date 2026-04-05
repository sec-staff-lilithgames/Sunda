package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfg implements Runnable {
    final /* synthetic */ zzfh zza;

    public zzfg(zzfh zzfhVar) {
        Objects.requireNonNull(zzfhVar);
        this.zza = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfi zzfiVar = this.zza.zza;
        if (zzfiVar.zzc() != null) {
            try {
                zzfiVar.zzc().zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
