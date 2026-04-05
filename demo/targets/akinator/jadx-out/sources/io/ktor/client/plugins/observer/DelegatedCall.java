package io.ktor.client.plugins.observer;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DelegatedCall extends HttpClientCall {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatedCall(HttpClient client, ByteReadChannel content, HttpClientCall originCall) {
        super(client);
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(content, "content");
        e0.checkNotNullParameter(originCall, "originCall");
        setRequest(new DelegatedRequest(this, originCall.getRequest()));
        setResponse(new DelegatedResponse(this, content, originCall.getResponse()));
    }
}
