package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgil extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgin zza;

    public zzgil(zzgin zzginVar) {
        Objects.requireNonNull(zzginVar);
        this.zza = zzginVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgin zzginVar = this.zza;
        synchronized (zzginVar) {
            zzginVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgin zzginVar = this.zza;
        synchronized (zzginVar) {
            zzginVar.zzf(null);
        }
    }
}
