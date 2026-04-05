package com.google.android.exoplayer2.scheduler;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28032a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequirementsWatcher f28034c;

    public d(RequirementsWatcher requirementsWatcher) {
        this.f28034c = requirementsWatcher;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        this.f28034c.f28025d.post(new c(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        this.f28034c.f28025d.post(new c(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z10 = this.f28032a;
        RequirementsWatcher requirementsWatcher = this.f28034c;
        if (z10 && this.f28033b == zHasCapability) {
            if (zHasCapability) {
                requirementsWatcher.f28025d.post(new c(this, 1));
            }
        } else {
            this.f28032a = true;
            this.f28033b = zHasCapability;
            requirementsWatcher.f28025d.post(new c(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        this.f28034c.f28025d.post(new c(this, 0));
    }
}
