package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaxf extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzaxg zza;

    public zzaxf(zzaxg zzaxgVar) {
        Objects.requireNonNull(zzaxgVar);
        this.zza = zzaxgVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaxg.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzaxg.class) {
            this.zza.zzd(null);
        }
    }
}
