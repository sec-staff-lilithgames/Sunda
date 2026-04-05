package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeow implements zzdbf {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zza.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfdb.zza(this.zza, new zzfda() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }
}
