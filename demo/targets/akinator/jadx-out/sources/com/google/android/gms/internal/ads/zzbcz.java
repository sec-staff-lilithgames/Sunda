package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbcz implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbdb zza;

    public zzbcz(zzbdb zzbdbVar) {
        Objects.requireNonNull(zzbdbVar);
        this.zza = zzbdbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbdb zzbdbVar = this.zza;
        synchronized (zzbdbVar.zzh()) {
            try {
            } catch (DeadObjectException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e10);
                this.zza.zzg();
            }
            if (zzbdbVar.zzi() != null) {
                zzbdbVar.zzk(zzbdbVar.zzi().zzq());
                this.zza.zzh().notifyAll();
            } else {
                this.zza.zzh().notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        zzbdb zzbdbVar = this.zza;
        synchronized (zzbdbVar.zzh()) {
            zzbdbVar.zzk(null);
            zzbdbVar.zzh().notifyAll();
        }
    }
}
