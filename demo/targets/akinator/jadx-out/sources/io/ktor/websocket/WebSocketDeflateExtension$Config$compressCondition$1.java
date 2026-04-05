package io.ktor.websocket;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtension$Config$compressCondition$1 extends f0 implements l {
    public static final WebSocketDeflateExtension$Config$compressCondition$1 INSTANCE = new WebSocketDeflateExtension$Config$compressCondition$1();

    public WebSocketDeflateExtension$Config$compressCondition$1() {
        super(1);
    }

    @Override // kv.l
    public final Boolean invoke(Frame it) {
        e0.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
