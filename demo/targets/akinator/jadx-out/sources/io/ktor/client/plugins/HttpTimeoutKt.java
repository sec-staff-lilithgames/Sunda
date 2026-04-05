package io.ktor.client.plugins;

import bx.a;
import e3.g;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.InternalAPI;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kv.l;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpTimeoutKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpTimeout");

    public static final ConnectTimeoutException ConnectTimeoutException(HttpRequestData request, Throwable th2) {
        Object connectTimeoutMillis;
        e0.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
        sb2.append(request.getUrl());
        sb2.append(", connect_timeout=");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.Plugin);
        if (httpTimeoutCapabilityConfiguration == null || (connectTimeoutMillis = httpTimeoutCapabilityConfiguration.getConnectTimeoutMillis()) == null) {
            connectTimeoutMillis = "unknown";
        }
        return new ConnectTimeoutException(i.e(sb2, connectTimeoutMillis, " ms]"), th2);
    }

    public static /* synthetic */ ConnectTimeoutException ConnectTimeoutException$default(HttpRequestData httpRequestData, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return ConnectTimeoutException(httpRequestData, th2);
    }

    public static final SocketTimeoutException SocketTimeoutException(HttpRequestData request, Throwable th2) {
        Object socketTimeoutMillis;
        e0.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(request.getUrl());
        sb2.append(", socket_timeout=");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.Plugin);
        if (httpTimeoutCapabilityConfiguration == null || (socketTimeoutMillis = httpTimeoutCapabilityConfiguration.getSocketTimeoutMillis()) == null) {
            socketTimeoutMillis = "unknown";
        }
        return new SocketTimeoutException(i.e(sb2, socketTimeoutMillis, "] ms"), th2);
    }

    public static /* synthetic */ SocketTimeoutException SocketTimeoutException$default(HttpRequestData httpRequestData, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return SocketTimeoutException(httpRequestData, th2);
    }

    @InternalAPI
    public static final int convertLongTimeoutToIntWithInfiniteAsZero(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @InternalAPI
    public static final long convertLongTimeoutToLongWithInfiniteAsZero(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0L;
        }
        return j10;
    }

    public static final void timeout(HttpRequestBuilder httpRequestBuilder, l block) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        HttpTimeout.Plugin plugin = HttpTimeout.Plugin;
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = new HttpTimeout.HttpTimeoutCapabilityConfiguration(null, null, null, 7, null);
        block.invoke(httpTimeoutCapabilityConfiguration);
        httpRequestBuilder.setCapability(plugin, httpTimeoutCapabilityConfiguration);
    }

    public static final <T> T unwrapRequestTimeoutException(kv.a block) throws Throwable {
        e0.checkNotNullParameter(block, "block");
        try {
            return (T) block.invoke();
        } catch (CancellationException e10) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e10);
        }
    }

    public static /* synthetic */ ConnectTimeoutException ConnectTimeoutException$default(String str, Long l9, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return ConnectTimeoutException(str, l9, th2);
    }

    public static final ConnectTimeoutException ConnectTimeoutException(String url, Long l9, Throwable th2) {
        e0.checkNotNullParameter(url, "url");
        StringBuilder sbO = g.o("Connect timeout has expired [url=", url, ", connect_timeout=");
        Object obj = l9;
        if (l9 == null) {
            obj = "unknown";
        }
        return new ConnectTimeoutException(i.e(sbO, obj, " ms]"), th2);
    }
}
