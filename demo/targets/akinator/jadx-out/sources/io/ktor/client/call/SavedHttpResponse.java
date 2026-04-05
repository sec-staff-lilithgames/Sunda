package io.ktor.client.call;

import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class SavedHttpResponse extends HttpResponse {
    private final SavedHttpCall call;
    private final ByteReadChannel content;
    private final CompletableJob context;
    private final m coroutineContext;
    private final Headers headers;
    private final GMTDate requestTime;
    private final GMTDate responseTime;
    private final HttpStatusCode status;
    private final HttpProtocolVersion version;

    public SavedHttpResponse(SavedHttpCall call, byte[] body, HttpResponse origin) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(origin, "origin");
        this.call = call;
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.context = completableJobJob$default;
        this.status = origin.getStatus();
        this.version = origin.getVersion();
        this.requestTime = origin.getRequestTime();
        this.responseTime = origin.getResponseTime();
        this.headers = origin.getHeaders();
        this.coroutineContext = origin.getCoroutineContext().plus(completableJobJob$default);
        this.content = ByteChannelCtorKt.ByteReadChannel(body);
    }

    @Override // io.ktor.client.statement.HttpResponse
    public ByteReadChannel getContent() {
        return this.content;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.http.HttpMessage
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getRequestTime() {
        return this.requestTime;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getResponseTime() {
        return this.responseTime;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpProtocolVersion getVersion() {
        return this.version;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public SavedHttpCall getCall() {
        return this.call;
    }

    public static /* synthetic */ void getContent$annotations() {
    }
}
