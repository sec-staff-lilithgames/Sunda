package cw;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import xv.n0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final p f51184a = new p();

    @Override // cw.h
    public void acquireConnectionNoEvents(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // cw.h
    public void addPlanToCancel(d connectPlan) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectPlan, "connectPlan");
    }

    @Override // cw.h
    public void callConnectEnd(y0 route, n0 n0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
    }

    @Override // cw.h
    public u candidateConnection() {
        return null;
    }

    @Override // cw.h
    public void connectFailed(y0 route, n0 n0Var, IOException e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
    }

    @Override // cw.h
    public void connectStart(y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
    }

    @Override // cw.h
    public void connectionAcquired(xv.p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // cw.h
    public void connectionConnectEnd(xv.p connection, y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
    }

    @Override // cw.h
    public void connectionConnectionAcquired(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // cw.h
    public void connectionConnectionClosed(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // cw.h
    public void connectionConnectionReleased(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // cw.h
    public void dnsEnd(String socketHost, List<? extends InetAddress> result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(socketHost, "socketHost");
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
    }

    @Override // cw.h
    public void dnsStart(String socketHost) {
        kotlin.jvm.internal.e0.checkNotNullParameter(socketHost, "socketHost");
    }

    @Override // cw.h
    public boolean doExtensiveHealthChecks() {
        return false;
    }

    @Override // cw.h
    public boolean isCanceled() {
        return false;
    }

    @Override // cw.h
    public void noNewExchanges(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    @Override // cw.h
    public void proxySelectEnd(xv.g0 url, List<? extends Proxy> proxies) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxies, "proxies");
    }

    @Override // cw.h
    public void proxySelectStart(xv.g0 url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
    }

    @Override // cw.h
    public Socket releaseConnectionNoEvents() {
        return null;
    }

    @Override // cw.h
    public void removePlanToCancel(d connectPlan) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectPlan, "connectPlan");
    }

    @Override // cw.h
    public void secureConnectEnd(xv.e0 e0Var) {
    }

    @Override // cw.h
    public void secureConnectStart() {
    }

    @Override // cw.h
    public void updateRouteDatabaseAfterSuccess(y0 route) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
    }

    @Override // cw.h
    public void connectionReleased(xv.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, SUvoXnn.MLhvSGfTRsN);
    }
}
