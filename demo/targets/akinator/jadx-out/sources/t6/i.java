package t6;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.e0;
import n6.c0;
import w6.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f86399f;

    /* renamed from: g, reason: collision with root package name */
    public final h f86400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, x6.b taskExecutor) {
        super(context, taskExecutor);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f86393b.getSystemService("connectivity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f86399f = (ConnectivityManager) systemService;
        this.f86400g = new h(this);
    }

    @Override // t6.f
    public void startTracking() {
        try {
            c0.get().debug(j.f86401a, "Registering network callback");
            n.registerDefaultNetworkCallbackCompat(this.f86399f, this.f86400g);
        } catch (IllegalArgumentException e10) {
            c0.get().error(j.f86401a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            c0.get().error(j.f86401a, "Received exception while registering network callback", e11);
        }
    }

    @Override // t6.f
    public void stopTracking() {
        try {
            c0.get().debug(j.f86401a, "Unregistering network callback");
            this.f86399f.unregisterNetworkCallback(this.f86400g);
        } catch (IllegalArgumentException e10) {
            c0.get().error(j.f86401a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            c0.get().error(j.f86401a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // t6.f
    public r6.i readSystemState() {
        return j.getActiveNetworkState(this.f86399f);
    }
}
