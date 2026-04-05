package io.ktor.client.plugins.observer;

import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DelegatedCallKt {
    @f
    public static final HttpClientCall wrapWithContent(HttpClientCall httpClientCall, ByteReadChannel content, boolean z10) {
        e0.checkNotNullParameter(httpClientCall, "<this>");
        e0.checkNotNullParameter(content, "content");
        return wrapWithContent(httpClientCall, content);
    }

    public static final HttpClientCall wrapWithContent(HttpClientCall httpClientCall, ByteReadChannel content) {
        e0.checkNotNullParameter(httpClientCall, "<this>");
        e0.checkNotNullParameter(content, "content");
        return new DelegatedCall(httpClientCall.getClient(), content, httpClientCall);
    }
}
