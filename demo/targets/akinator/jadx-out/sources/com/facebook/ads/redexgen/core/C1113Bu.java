package com.facebook.ads.redexgen.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.facebook.ads.redexgen.X.Bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1113Bu extends ConnectivityManager.NetworkCallback {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C1114Bv A02;

    public C1113Bu(C1114Bv c1114Bv) {
        this.A02 = c1114Bv;
    }

    private void A00() {
        this.A02.A04.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Bs
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A02();
            }
        });
    }

    private void A01() {
        this.A02.A04.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Bt
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A03();
            }
        });
    }

    public final /* synthetic */ void A02() {
        if (this.A02.A02 == null) {
            return;
        }
        this.A02.A03();
    }

    public final /* synthetic */ void A03() {
        if (this.A02.A02 == null) {
            return;
        }
        this.A02.A04();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        A00();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (!z10) {
            A01();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean networkValidated = this.A01;
        if (networkValidated) {
            boolean networkValidated2 = this.A00;
            if (networkValidated2 == zHasCapability) {
                if (!zHasCapability) {
                    return;
                }
                A01();
                return;
            }
        }
        this.A01 = true;
        this.A00 = zHasCapability;
        A00();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        A00();
    }
}
