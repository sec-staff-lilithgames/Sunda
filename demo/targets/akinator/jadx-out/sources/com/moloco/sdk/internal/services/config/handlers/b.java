package com.moloco.sdk.internal.services.config.handlers;

import com.moloco.sdk.Init$SDKInitResponse;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {
    @Override // com.moloco.sdk.internal.services.config.handlers.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.configs.a a(Init$SDKInitResponse sdkInitResponse) {
        e0.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        if (!sdkInitResponse.hasOperationalMetricsConfig()) {
            return com.moloco.sdk.internal.configs.b.c();
        }
        Init$SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig = sdkInitResponse.getOperationalMetricsConfig();
        String url = operationalMetricsConfig.getUrl();
        e0.checkNotNullExpressionValue(url, "getUrl(...)");
        return new com.moloco.sdk.internal.configs.a(url, operationalMetricsConfig.getPollingIntervalSeconds());
    }

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    public Class<com.moloco.sdk.internal.configs.a> a() {
        return com.moloco.sdk.internal.configs.a.class;
    }
}
