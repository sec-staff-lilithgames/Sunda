package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfj implements Runnable {
    final /* synthetic */ zzfk zza;

    public zzfj(zzfk zzfkVar) {
        Objects.requireNonNull(zzfkVar);
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar = this.zza;
        if (zzfkVar.zzL() != null) {
            try {
                zzfkVar.zzL().zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
