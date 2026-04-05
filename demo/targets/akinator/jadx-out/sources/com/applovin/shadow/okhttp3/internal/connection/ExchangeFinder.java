package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Route;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RouteSelector;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.applovin.shadow.okhttp3.internal.http2.ErrorCode;
import com.applovin.shadow.okhttp3.internal.http2.StreamResetException;
import com.ironsource.C3271ic;
import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        e0.checkNotNullParameter(connectionPool, "connectionPool");
        e0.checkNotNullParameter(address, "address");
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.applovin.shadow.okhttp3.internal.connection.RealConnection findConnection(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):com.applovin.shadow.okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            if (realConnectionFindConnection.isHealthy(z11)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null ? selection.hasNext() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i10 = i17;
            i11 = i16;
            i12 = i15;
            i13 = i14;
            z10 = z12;
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(chain, "chain");
        try {
            try {
                return findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), chain.getWriteTimeoutMillis$okhttp(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !e0.areEqual(chain.getRequest$okhttp().method(), C3271ic.f36943a)).newCodec$okhttp(client, chain);
            } catch (RouteException e10) {
                e = e10;
                RouteException routeException = e;
                trackFailure(routeException.getLastConnectException());
                throw routeException;
            } catch (IOException e11) {
                e = e11;
                IOException iOException = e;
                trackFailure(iOException);
                throw new RouteException(iOException);
            }
        } catch (RouteException e12) {
            e = e12;
        } catch (IOException e13) {
            e = e13;
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.routeSelector) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        e0.checkNotNullParameter(url, "url");
        HttpUrl httpUrlUrl = this.address.url();
        return url.port() == httpUrlUrl.port() && e0.areEqual(url.host(), httpUrlUrl.host());
    }

    public final void trackFailure(IOException e10) {
        e0.checkNotNullParameter(e10, "e");
        this.nextRouteToTry = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
