package io.ktor.client.call;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class DoubleReceiveException extends IllegalStateException {
    private final String message;

    public DoubleReceiveException(HttpClientCall call) {
        e0.checkNotNullParameter(call, "call");
        this.message = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
