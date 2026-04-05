package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbdo implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcca zza;
    final /* synthetic */ zzbdp zzb;

    public zzbdo(zzbdp zzbdpVar, zzcca zzccaVar) {
        this.zza = zzccaVar;
        Objects.requireNonNull(zzbdpVar);
        this.zzb = zzbdpVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
