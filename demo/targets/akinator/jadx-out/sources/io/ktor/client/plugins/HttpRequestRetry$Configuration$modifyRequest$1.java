package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$modifyRequest$1 extends f0 implements p {
    public static final HttpRequestRetry$Configuration$modifyRequest$1 INSTANCE = new HttpRequestRetry$Configuration$modifyRequest$1();

    public HttpRequestRetry$Configuration$modifyRequest$1() {
        super(2);
    }

    public final void invoke(HttpRequestRetry.ModifyRequestContext modifyRequestContext, HttpRequestBuilder it) {
        e0.checkNotNullParameter(modifyRequestContext, "$this$null");
        e0.checkNotNullParameter(it, "it");
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((HttpRequestRetry.ModifyRequestContext) obj, (HttpRequestBuilder) obj2);
        return x0.f87415a;
    }
}
