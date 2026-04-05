package cw;

import com.ironsource.C3271ic;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import xv.n0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final q f51109a;

    /* renamed from: b, reason: collision with root package name */
    public final g f51110b;

    /* renamed from: c, reason: collision with root package name */
    public final dw.k f51111c;

    public b(q call, g poolConnectionListener, dw.k chain) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(poolConnectionListener, "poolConnectionListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        this.f51109a = call;
        this.f51110b = poolConnectionListener;
        this.f51111c = chain;
    }

    @Override // cw.h
    public void acquireConnectionNoEvents(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        this.f51109a.acquireConnectionNoEvents(connection);
    }

    @Override // cw.h
    public void addPlanToCancel(d connectPlan) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectPlan, "connectPlan");
        this.f51109a.getPlansToCancel$okhttp().add(connectPlan);
    }

    @Override // cw.h
    public void callConnectEnd(y0 route, n0 n0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().connectEnd(qVar, route.socketAddress(), route.proxy(), n0Var);
    }

    @Override // cw.h
    public u candidateConnection() {
        return this.f51109a.getConnection();
    }

    @Override // cw.h
    public void connectFailed(y0 route, n0 n0Var, IOException e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().connectFailed(this.f51109a, route.socketAddress(), route.proxy(), null, e10);
        this.f51110b.connectFailed(route, qVar, e10);
    }

    @Override // cw.h
    public void connectStart(y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().connectStart(qVar, route.socketAddress(), route.proxy());
        this.f51110b.connectStart(route, qVar);
    }

    @Override // cw.h
    public void connectionAcquired(xv.p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().connectionAcquired(qVar, connection);
    }

    @Override // cw.h
    public void connectionConnectEnd(xv.p connection, y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        this.f51110b.connectEnd(connection, route, this.f51109a);
    }

    @Override // cw.h
    public void connectionConnectionAcquired(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        connection.getConnectionListener$okhttp().connectionAcquired(connection, this.f51109a);
    }

    @Override // cw.h
    public void connectionConnectionClosed(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        connection.getConnectionListener$okhttp().connectionClosed(connection);
    }

    @Override // cw.h
    public void connectionConnectionReleased(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        connection.getConnectionListener$okhttp().connectionReleased(connection, this.f51109a);
    }

    @Override // cw.h
    public void connectionReleased(xv.p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().connectionReleased(qVar, connection);
    }

    @Override // cw.h
    public void dnsEnd(String socketHost, List<? extends InetAddress> result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(socketHost, "socketHost");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().dnsEnd(qVar, socketHost, result);
    }

    @Override // cw.h
    public void dnsStart(String socketHost) {
        kotlin.jvm.internal.e0.checkNotNullParameter(socketHost, "socketHost");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().dnsStart(qVar, socketHost);
    }

    @Override // cw.h
    public boolean doExtensiveHealthChecks() {
        return !kotlin.jvm.internal.e0.areEqual(this.f51111c.getRequest$okhttp().method(), C3271ic.f36943a);
    }

    @Override // cw.h
    public boolean isCanceled() {
        return this.f51109a.isCanceled();
    }

    @Override // cw.h
    public void noNewExchanges(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        connection.getConnectionListener$okhttp().noNewExchanges(connection);
    }

    @Override // cw.h
    public void proxySelectEnd(xv.g0 url, List<? extends Proxy> proxies) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxies, "proxies");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().proxySelectEnd(qVar, url, proxies);
    }

    @Override // cw.h
    public void proxySelectStart(xv.g0 url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().proxySelectStart(qVar, url);
    }

    @Override // cw.h
    public Socket releaseConnectionNoEvents() {
        return this.f51109a.releaseConnectionNoEvents$okhttp();
    }

    @Override // cw.h
    public void removePlanToCancel(d connectPlan) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectPlan, "connectPlan");
        this.f51109a.getPlansToCancel$okhttp().remove(connectPlan);
    }

    @Override // cw.h
    public void secureConnectEnd(xv.e0 e0Var) {
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().secureConnectEnd(qVar, e0Var);
    }

    @Override // cw.h
    public void secureConnectStart() {
        q qVar = this.f51109a;
        qVar.getEventListener$okhttp().secureConnectStart(qVar);
    }

    @Override // cw.h
    public void updateRouteDatabaseAfterSuccess(y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        this.f51109a.getClient().getRouteDatabase$okhttp().connected(route);
    }
}
