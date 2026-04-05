package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import com.moloco.sdk.acm.http.g;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {
    public static final void a(HttpRequestBuilder httpRequestBuilder, long j10) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        HttpTimeoutKt.timeout(httpRequestBuilder, new g(j10, 1));
    }

    public static final x0 a(long j10, HttpTimeout.HttpTimeoutCapabilityConfiguration timeout) {
        e0.checkNotNullParameter(timeout, "$this$timeout");
        timeout.setRequestTimeoutMillis(Long.valueOf(j10));
        return x0.f87415a;
    }
}
