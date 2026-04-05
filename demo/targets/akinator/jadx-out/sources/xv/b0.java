package xv;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f93576a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f93576a = new a0();
    }

    public void cacheConditionalHit(j call, v0 cachedResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(j call, v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void callEnd(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void callFailed(j call, IOException ioe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void canceled(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void connectEnd(j call, InetSocketAddress inetSocketAddress, Proxy proxy, n0 n0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(j call, InetSocketAddress inetSocketAddress, Proxy proxy, n0 n0Var, IOException ioe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxy, "proxy");
        kotlin.jvm.internal.e0.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(j call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(j call, p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(j call, p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(j call, String domainName, List<InetAddress> inetAddressList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(domainName, "domainName");
        kotlin.jvm.internal.e0.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(j call, String domainName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(domainName, "domainName");
    }

    public void followUpDecision(j call, v0 networkResponse, o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkResponse, "networkResponse");
    }

    public void proxySelectEnd(j call, g0 url, List<Proxy> proxies) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(j call, g0 url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(j call, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void requestFailed(j call, IOException ioe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(j call, o0 request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(j call, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void responseFailed(j call, IOException ioe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(j call, v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void retryDecision(j call, IOException exception, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(exception, "exception");
    }

    public void satisfactionFailure(j call, v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(j call, e0 e0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }
}
