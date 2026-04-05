package cw;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import xv.n0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {
    void acquireConnectionNoEvents(u uVar);

    void addPlanToCancel(d dVar);

    void callConnectEnd(y0 y0Var, n0 n0Var);

    u candidateConnection();

    void connectFailed(y0 y0Var, n0 n0Var, IOException iOException);

    void connectStart(y0 y0Var);

    void connectionAcquired(xv.p pVar);

    void connectionConnectEnd(xv.p pVar, y0 y0Var);

    void connectionConnectionAcquired(u uVar);

    void connectionConnectionClosed(u uVar);

    void connectionConnectionReleased(u uVar);

    void connectionReleased(xv.p pVar);

    void dnsEnd(String str, List<? extends InetAddress> list);

    void dnsStart(String str);

    boolean doExtensiveHealthChecks();

    boolean isCanceled();

    void noNewExchanges(u uVar);

    void proxySelectEnd(xv.g0 g0Var, List<? extends Proxy> list);

    void proxySelectStart(xv.g0 g0Var);

    Socket releaseConnectionNoEvents();

    void removePlanToCancel(d dVar);

    void secureConnectEnd(xv.e0 e0Var);

    void secureConnectStart();

    void updateRouteDatabaseAfterSuccess(y0 y0Var);
}
