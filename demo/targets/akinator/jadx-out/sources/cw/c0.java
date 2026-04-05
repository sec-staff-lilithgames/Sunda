package cw;

import java.util.LinkedHashSet;
import java.util.Set;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f51114a = new LinkedHashSet();

    public final synchronized void connected(y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        this.f51114a.remove(route);
    }

    public final synchronized void failed(y0 failedRoute) {
        kotlin.jvm.internal.e0.checkNotNullParameter(failedRoute, "failedRoute");
        this.f51114a.add(failedRoute);
    }

    public final synchronized Set<y0> getFailedRoutes() {
        return uu.y0.toSet(this.f51114a);
    }

    public final synchronized boolean shouldPostpone(y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        return this.f51114a.contains(route);
    }
}
