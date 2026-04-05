package io.ktor.client.network.sockets;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class SocketTimeoutException extends java.net.SocketTimeoutException {
    private final Throwable cause;

    public /* synthetic */ SocketTimeoutException(String str, Throwable th2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketTimeoutException(String message, Throwable th2) {
        super(message);
        e0.checkNotNullParameter(message, "message");
        this.cause = th2;
    }
}
