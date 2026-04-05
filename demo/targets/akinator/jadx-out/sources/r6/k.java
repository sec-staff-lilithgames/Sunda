package r6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.lifecycle.x0;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import n6.c0;
import r6.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final k f83826a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f83827b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f83828c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f83829d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f83830e;

    public final NetworkCapabilities getCachedCapabilities() {
        return f83829d;
    }

    public final boolean getCapabilitiesInitialized() {
        return f83830e;
    }

    public final NetworkCapabilities getCurrentNetworkCapabilities(ConnectivityManager connectivityManager) {
        e0.checkNotNullParameter(connectivityManager, "<this>");
        if (f83830e) {
            return f83829d;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        f83829d = networkCapabilities;
        f83830e = true;
        return networkCapabilities;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        e0.checkNotNullParameter(network, "network");
        e0.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        c0.get().debug(o.f83843a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f83827b) {
            try {
                f83829d = networkCapabilities;
                for (Map.Entry entry : f83828c.entrySet()) {
                    ((kv.l) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? b.f83807a : new c.a(7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        e0.checkNotNullParameter(network, "network");
        c0.get().debug(o.f83843a, "NetworkRequestConstraintController onLost callback");
        synchronized (f83827b) {
            f83829d = null;
            Iterator it = f83828c.keySet().iterator();
            while (it.hasNext()) {
                ((kv.l) it.next()).invoke(new c.a(7));
            }
        }
    }

    public final void setCachedCapabilities(NetworkCapabilities networkCapabilities) {
        f83829d = networkCapabilities;
    }

    public final void setCapabilitiesInitialized(boolean z10) {
        f83830e = z10;
    }

    public final kv.a addCallback(ConnectivityManager connManager, NetworkRequest networkRequest, kv.l lVar) {
        e0.checkNotNullParameter(connManager, "connManager");
        e0.checkNotNullParameter(networkRequest, "networkRequest");
        e0.checkNotNullParameter(lVar, yFkbx.XvZuVCZIUG);
        synchronized (f83827b) {
            try {
                LinkedHashMap linkedHashMap = f83828c;
                boolean zIsEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(lVar, networkRequest);
                if (zIsEmpty) {
                    c0.get().debug(o.f83843a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(f83826a);
                }
                c0.get().debug(o.f83843a, "NetworkRequestConstraintController send initial capabilities");
                lVar.invoke(networkRequest.canBeSatisfiedBy(f83826a.getCurrentNetworkCapabilities(connManager)) ? b.f83807a : new c.a(7));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new x0(20, lVar, connManager);
    }
}
