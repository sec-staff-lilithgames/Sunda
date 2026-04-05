package r6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w0;
import n6.c0;
import r6.c;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public static final a f83809b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f83810a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final kv.a addCallback(ConnectivityManager connManager, NetworkRequest networkRequest, kv.l onConstraintState) {
            e0.checkNotNullParameter(connManager, "connManager");
            e0.checkNotNullParameter(networkRequest, "networkRequest");
            e0.checkNotNullParameter(onConstraintState, "onConstraintState");
            d dVar = new d(onConstraintState, null);
            w0 w0Var = new w0();
            try {
                c0.get().debug(o.f83843a, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, dVar);
                w0Var.f71863b = true;
            } catch (RuntimeException e10) {
                String name = e10.getClass().getName();
                e0.checkNotNullExpressionValue(name, "getName(...)");
                if (!k0.endsWith$default(name, "TooManyRequestsException", false, 2, null)) {
                    throw e10;
                }
                c0.get().debug(o.f83843a, "NetworkRequestConstraintController couldn't register callback", e10);
                onConstraintState.invoke(new c.a(7));
            }
            return new com.moloco.sdk.internal.ilrd.j(w0Var, 5, connManager, dVar);
        }
    }

    public d(kv.l lVar, u uVar) {
        this.f83810a = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        e0.checkNotNullParameter(network, "network");
        e0.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        c0.get().debug(o.f83843a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.f83810a.invoke(b.f83807a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        e0.checkNotNullParameter(network, "network");
        c0.get().debug(o.f83843a, "NetworkRequestConstraintController onLost callback");
        this.f83810a.invoke(new c.a(7));
    }
}
