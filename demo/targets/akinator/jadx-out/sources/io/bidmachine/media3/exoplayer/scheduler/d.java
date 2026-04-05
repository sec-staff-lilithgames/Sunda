package io.bidmachine.media3.exoplayer.scheduler;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f61557a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f61558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequirementsWatcher f61559c;

    public d(RequirementsWatcher requirementsWatcher) {
        this.f61559c = requirementsWatcher;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        this.f61559c.f61550d.post(new c(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        this.f61559c.f61550d.post(new c(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z10 = this.f61557a;
        RequirementsWatcher requirementsWatcher = this.f61559c;
        if (z10 && this.f61558b == zHasCapability) {
            if (zHasCapability) {
                requirementsWatcher.f61550d.post(new c(this, 1));
            }
        } else {
            this.f61557a = true;
            this.f61558b = zHasCapability;
            requirementsWatcher.f61550d.post(new c(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        this.f61559c.f61550d.post(new c(this, 0));
    }
}
