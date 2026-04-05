package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        e0.checkNotNullParameter(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route failedRoute) {
        e0.checkNotNullParameter(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        e0.checkNotNullParameter(route, "route");
        return this.failedRoutes.contains(route);
    }
}
