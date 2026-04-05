package com.moloco.sdk.common_adapter_internal;

import android.content.Context;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.o;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45692a = new a();

    public static /* synthetic */ Context ApplicationContext$default(a aVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = null;
        }
        return aVar.ApplicationContext(context);
    }

    public static /* synthetic */ d screenData$default(a aVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = ApplicationContext$default(aVar, null, 1, null);
        }
        return aVar.screenData(context);
    }

    public static final c sessionData(String adUnitId) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        Init$SDKInitResponse init$SDKInitResponseA = a.f.f47455a.b().a();
        if (init$SDKInitResponseA != null) {
            return b.a(init$SDKInitResponseA, adUnitId);
        }
        return null;
    }

    public final Context ApplicationContext(Context context) {
        return com.moloco.sdk.internal.android_context.b.a(context);
    }

    public final com.moloco.sdk.internal.scheduling.a DispatcherProvider() {
        return com.moloco.sdk.internal.scheduling.c.a();
    }

    public final HttpClient HttpClient() {
        return a.i.f47469a.a();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.a UserAgentService() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.core.c.b();
    }

    public final void appendMolocoUserAgent(HeadersBuilder headersBuilder, String str, String str2, MediationInfo mediationInfo) {
        e0.checkNotNullParameter(headersBuilder, "<this>");
        o.a(headersBuilder, str, str2, mediationInfo);
    }

    public final void httpRequestTimeoutMillis(HttpRequestBuilder httpRequestBuilder, long j10) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.core.b.a(httpRequestBuilder, j10);
    }

    public final d screenData(Context context) {
        e0.checkNotNullParameter(context, "context");
        return x.a(context).invoke();
    }
}
