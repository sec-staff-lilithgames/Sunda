package io.odeeo.internal.k1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements io.odeeo.internal.k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f64506a;

    /* renamed from: b, reason: collision with root package name */
    public kv.a f64507b;

    /* renamed from: c, reason: collision with root package name */
    public final a f64508c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e0.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            io.odeeo.internal.b2.a.d("NetworkCallback: Network available. Retrying to load ad.", new Object[0]);
            c.this.unregisterNetworkCallback();
            kv.a aVar = c.this.f64507b;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }
    }

    public c(ConnectivityManager connectivityManager) {
        e0.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.f64506a = connectivityManager;
        this.f64508c = new a();
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.f64506a;
    }

    @Override // io.odeeo.internal.k1.a
    public void registerNetworkCallback(kv.a availabilityCallback) {
        e0.checkNotNullParameter(availabilityCallback, "availabilityCallback");
        this.f64507b = availabilityCallback;
        this.f64506a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.f64508c);
    }

    @Override // io.odeeo.internal.k1.a
    public void unregisterNetworkCallback() {
        try {
            this.f64506a.unregisterNetworkCallback(this.f64508c);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.w(e0.stringPlus("Failed to unregister network callback: ", e10.getMessage()), new Object[0]);
        }
    }
}
