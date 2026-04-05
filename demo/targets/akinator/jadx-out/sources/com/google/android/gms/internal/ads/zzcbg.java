package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcbg extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcbj zza;

    public zzcbg(zzcbj zzcbjVar) {
        Objects.requireNonNull(zzcbjVar);
        this.zza = zzcbjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzB().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzB().set(false);
    }
}
