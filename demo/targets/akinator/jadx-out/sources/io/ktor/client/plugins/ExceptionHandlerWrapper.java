package io.ktor.client.plugins;

import kotlin.jvm.internal.e0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ExceptionHandlerWrapper implements HandlerWrapper {
    private final p handler;

    public ExceptionHandlerWrapper(p handler) {
        e0.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    public final p getHandler() {
        return this.handler;
    }
}
