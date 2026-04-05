package io.ktor.util.cio;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ChannelWriteException extends ChannelIOException {
    public /* synthetic */ ChannelWriteException(String str, Throwable th2, int i10, u uVar) {
        this((i10 & 1) != 0 ? "Cannot write to a channel" : str, th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelWriteException(String message, Throwable exception) {
        super(message, exception);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(exception, "exception");
    }
}
