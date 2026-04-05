package io.ktor.client.engine;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ClientEngineClosedException extends IllegalStateException {
    private final Throwable cause;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientEngineClosedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public /* synthetic */ ClientEngineClosedException(Throwable th2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : th2);
    }

    public ClientEngineClosedException(Throwable th2) {
        super("Client already closed");
        this.cause = th2;
    }
}
