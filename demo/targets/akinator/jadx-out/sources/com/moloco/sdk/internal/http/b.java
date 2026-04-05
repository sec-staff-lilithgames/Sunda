package com.moloco.sdk.internal.http;

import a1.o;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.c;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientJvmKt;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.DefaultRequestKt;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.UserAgent;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {
    public static final HttpClient a(u appInfo, h0 deviceInfo) {
        e0.checkNotNullParameter(appInfo, "appInfo");
        e0.checkNotNullParameter(deviceInfo, "deviceInfo");
        return HttpClientJvmKt.HttpClient(new a(appInfo, deviceInfo, 1));
    }

    public static final x0 a(u uVar, h0 h0Var, HttpClientConfig HttpClient) {
        e0.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClient.install(UserAgent.Plugin, new o(6));
        HttpClientConfig.install$default(HttpClient, HttpTimeout.Plugin, null, 2, null);
        HttpClientConfig.install$default(HttpClient, HttpRequestRetry.Plugin, null, 2, null);
        DefaultRequestKt.defaultRequest(HttpClient, new a(uVar, h0Var, 0));
        return x0.f87415a;
    }

    public static final x0 a(UserAgent.Config install) {
        e0.checkNotNullParameter(install, "$this$install");
        install.setAgent(c.b().invoke());
        return x0.f87415a;
    }

    public static final x0 a(u uVar, h0 h0Var, DefaultRequest.DefaultRequestBuilder defaultRequest) {
        e0.checkNotNullParameter(defaultRequest, "$this$defaultRequest");
        HttpRequestKt.headers(defaultRequest, new a(uVar, h0Var, 2));
        return x0.f87415a;
    }

    public static final x0 a(u uVar, h0 h0Var, HeadersBuilder headers) {
        e0.checkNotNullParameter(headers, "$this$headers");
        headers.append("X-Moloco-App-Info", "AppBundle/" + uVar.b() + "; AppVersion/" + uVar.c() + "; AppKey/" + Moloco.INSTANCE.getAppKey$moloco_sdk_release() + ';');
        headers.append("X-Moloco-Device-Info", "make/" + h0Var.t() + "; model/" + h0Var.v() + "; hwv/" + h0Var.r() + "; osv/" + h0Var.x() + "; OS/Android;");
        headers.append("X-Moloco-SDK-Info", "SdkVersion/4.0.0");
        return x0.f87415a;
    }
}
