package io.ktor.websocket;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtension$Config$configureProtocols$1 extends f0 implements l {
    final /* synthetic */ l $block;
    final /* synthetic */ l $old;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketDeflateExtension$Config$configureProtocols$1(l lVar, l lVar2) {
        super(1);
        this.$old = lVar;
        this.$block = lVar2;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<WebSocketExtensionHeader>) obj);
        return x0.f87415a;
    }

    public final void invoke(List<WebSocketExtensionHeader> it) {
        e0.checkNotNullParameter(it, "it");
        this.$old.invoke(it);
        this.$block.invoke(it);
    }
}
