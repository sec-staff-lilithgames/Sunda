package io.ktor.client.plugins;

import kotlin.jvm.internal.e0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RequestExceptionHandlerWrapper implements HandlerWrapper {
    private final q handler;

    public RequestExceptionHandlerWrapper(q handler) {
        e0.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    public final q getHandler() {
        return this.handler;
    }
}
