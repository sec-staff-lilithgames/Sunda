package io.ktor.serialization;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebsocketConverterNotFoundException extends WebsocketContentConvertException {
    public /* synthetic */ WebsocketConverterNotFoundException(String str, Throwable th2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketConverterNotFoundException(String message, Throwable th2) {
        super(message, th2);
        e0.checkNotNullParameter(message, "message");
    }
}
