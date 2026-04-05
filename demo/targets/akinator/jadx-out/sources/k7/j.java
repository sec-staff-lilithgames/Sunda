package k7;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f70659a;

    public j(k kVar) {
        this.f70659a = kVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        k.access$onConnectivityChange(this.f70659a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        k.access$onConnectivityChange(this.f70659a, network, false);
    }
}
