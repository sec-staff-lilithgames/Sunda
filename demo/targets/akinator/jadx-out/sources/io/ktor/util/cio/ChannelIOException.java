package io.ktor.util.cio;

import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ChannelIOException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelIOException(String message, Throwable exception) {
        super(message, exception);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(exception, "exception");
    }
}
