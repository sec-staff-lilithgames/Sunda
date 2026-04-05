package io.ktor.serialization;

import io.ktor.websocket.Frame;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebsocketDeserializeException extends WebsocketContentConvertException {
    private final Frame frame;

    public /* synthetic */ WebsocketDeserializeException(String str, Throwable th2, Frame frame, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2, frame);
    }

    public final Frame getFrame() {
        return this.frame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(String message, Throwable th2, Frame frame) {
        super(message, th2);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(frame, "frame");
        this.frame = frame;
    }
}
