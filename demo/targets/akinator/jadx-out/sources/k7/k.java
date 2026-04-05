package k7;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f70660a;

    /* renamed from: b, reason: collision with root package name */
    public final g f70661b;

    /* renamed from: c, reason: collision with root package name */
    public final j f70662c;

    public k(ConnectivityManager connectivityManager, g gVar) {
        this.f70660a = connectivityManager;
        this.f70661b = gVar;
        j jVar = new j(this);
        this.f70662c = jVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), jVar);
    }

    public static final void access$onConnectivityChange(k kVar, Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = kVar.f70660a.getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (e0.areEqual(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = kVar.f70660a.getNetworkCapabilities(network2);
                z11 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z11) {
                z12 = true;
                break;
            }
            i10++;
        }
        kVar.f70661b.onConnectivityChange(z12);
    }

    @Override // k7.h
    public boolean isOnline() {
        ConnectivityManager connectivityManager = this.f70660a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // k7.h
    public void shutdown() {
        this.f70660a.unregisterNetworkCallback(this.f70662c);
    }
}
