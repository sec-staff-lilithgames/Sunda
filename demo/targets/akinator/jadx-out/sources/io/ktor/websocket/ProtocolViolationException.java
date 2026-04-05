package io.ktor.websocket;

import io.ktor.util.internal.ExceptionUtilsJvmKt;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CopyableThrowable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ProtocolViolationException extends Exception implements CopyableThrowable<ProtocolViolationException> {
    private final String violation;

    public ProtocolViolationException(String violation) {
        e0.checkNotNullParameter(violation, "violation");
        this.violation = violation;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Received illegal frame: " + this.violation;
    }

    public final String getViolation() {
        return this.violation;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public ProtocolViolationException createCopy() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.violation);
        ExceptionUtilsJvmKt.initCauseBridge(protocolViolationException, this);
        return protocolViolationException;
    }
}
