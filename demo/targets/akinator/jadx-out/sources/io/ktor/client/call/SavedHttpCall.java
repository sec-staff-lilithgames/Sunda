package io.ktor.client.call;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class SavedHttpCall extends HttpClientCall {
    private final boolean allowDoubleReceive;
    private final byte[] responseBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedHttpCall(HttpClient client, HttpRequest request, HttpResponse response, byte[] responseBody) {
        super(client);
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(responseBody, "responseBody");
        this.responseBody = responseBody;
        setRequest(new SavedHttpRequest(this, request));
        setResponse(new SavedHttpResponse(this, responseBody, response));
        this.allowDoubleReceive = true;
    }

    @Override // io.ktor.client.call.HttpClientCall
    public boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    @Override // io.ktor.client.call.HttpClientCall
    public Object getResponseContent(d<? super ByteReadChannel> dVar) {
        return ByteChannelCtorKt.ByteReadChannel(this.responseBody);
    }
}
