package t6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import kotlin.jvm.internal.e0;
import n6.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f86398a;

    public h(i iVar) {
        this.f86398a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        e0.checkNotNullParameter(network, "network");
        e0.checkNotNullParameter(capabilities, "capabilities");
        c0.get().debug(j.f86401a, "Network capabilities changed: " + capabilities);
        int i10 = Build.VERSION.SDK_INT;
        i iVar = this.f86398a;
        iVar.setState(i10 >= 28 ? j.getActiveNetworkState(capabilities) : j.getActiveNetworkState(iVar.f86399f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        e0.checkNotNullParameter(network, "network");
        c0.get().debug(j.f86401a, "Network connection lost");
        i iVar = this.f86398a;
        iVar.setState(j.getActiveNetworkState(iVar.f86399f));
    }
}
