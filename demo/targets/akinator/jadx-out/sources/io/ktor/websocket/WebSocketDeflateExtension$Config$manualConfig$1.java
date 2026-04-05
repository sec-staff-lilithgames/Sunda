package io.ktor.websocket;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtension$Config$manualConfig$1 extends f0 implements l {
    public static final WebSocketDeflateExtension$Config$manualConfig$1 INSTANCE = new WebSocketDeflateExtension$Config$manualConfig$1();

    public WebSocketDeflateExtension$Config$manualConfig$1() {
        super(1);
    }

    public final void invoke(List<WebSocketExtensionHeader> it) {
        e0.checkNotNullParameter(it, "it");
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<WebSocketExtensionHeader>) obj);
        return x0.f87415a;
    }
}
