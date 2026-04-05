package com.applovin.shadow.okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: com.applovin.shadow.okhttp3.EventListener$Companion$NONE$1
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void callEnd(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void canceled(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        e0.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        e0.checkNotNullParameter(proxy, "proxy");
        e0.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        e0.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(domainName, "domainName");
        e0.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(Call call, long j10) {
        e0.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(Call call, long j10) {
        e0.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(Call call) {
        e0.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        e0.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(Call call) {
        e0.checkNotNullParameter(call, "call");
    }
}
