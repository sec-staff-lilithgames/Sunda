package io.ktor.websocket;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtension$Config$compressIf$1 extends f0 implements l {
    final /* synthetic */ l $block;
    final /* synthetic */ l $old;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketDeflateExtension$Config$compressIf$1(l lVar, l lVar2) {
        super(1);
        this.$block = lVar;
        this.$old = lVar2;
    }

    @Override // kv.l
    public final Boolean invoke(Frame it) {
        e0.checkNotNullParameter(it, "it");
        return Boolean.valueOf(((Boolean) this.$block.invoke(it)).booleanValue() && ((Boolean) this.$old.invoke(it)).booleanValue());
    }
}
