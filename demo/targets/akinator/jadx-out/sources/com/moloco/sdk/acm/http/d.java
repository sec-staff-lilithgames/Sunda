package com.moloco.sdk.acm.http;

import a1.k;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientJvmKt;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.UserAgent;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final o f45625a = q.lazy(new k(5));

    public static final HttpClient a() {
        return HttpClientJvmKt.HttpClient(new a1.o(5));
    }

    public static final HttpClient b() {
        return (HttpClient) f45625a.getValue();
    }

    public static final HttpClient c() {
        return b();
    }

    public static final x0 a(HttpClientConfig HttpClient) {
        e0.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClientConfig.install$default(HttpClient, UserAgent.Plugin, null, 2, null);
        HttpClientConfig.install$default(HttpClient, HttpTimeout.Plugin, null, 2, null);
        return x0.f87415a;
    }
}
