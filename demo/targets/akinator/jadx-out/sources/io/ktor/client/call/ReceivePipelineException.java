package io.ktor.client.call;

import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ReceivePipelineException extends IllegalStateException {
    private final Throwable cause;
    private final TypeInfo info;
    private final HttpClientCall request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivePipelineException(HttpClientCall request, TypeInfo info, Throwable cause) {
        super("Fail to run receive pipeline: " + cause);
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(info, "info");
        e0.checkNotNullParameter(cause, "cause");
        this.request = request;
        this.info = info;
        this.cause = cause;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final TypeInfo getInfo() {
        return this.info;
    }

    public final HttpClientCall getRequest() {
        return this.request;
    }
}
