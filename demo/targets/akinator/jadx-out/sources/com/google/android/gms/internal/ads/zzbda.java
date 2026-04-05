package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbda implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbdb zza;

    public zzbda(zzbdb zzbdbVar) {
        Objects.requireNonNull(zzbdbVar);
        this.zza = zzbdbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbdb zzbdbVar = this.zza;
        synchronized (zzbdbVar.zzh()) {
            try {
                zzbdbVar.zzk(null);
                if (zzbdbVar.zzi() != null) {
                    zzbdbVar.zzj(null);
                }
                zzbdbVar.zzh().notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
