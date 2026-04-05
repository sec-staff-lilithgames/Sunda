package io.ktor.utils.io;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CloseElement {
    private final Throwable cause;

    public CloseElement(Throwable th2) {
        this.cause = th2;
    }

    public final Throwable getCause() {
        return this.cause;
    }
}
