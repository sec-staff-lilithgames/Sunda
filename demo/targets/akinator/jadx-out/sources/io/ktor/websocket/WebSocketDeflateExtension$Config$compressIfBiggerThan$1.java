package io.ktor.websocket;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtension$Config$compressIfBiggerThan$1 extends f0 implements l {
    final /* synthetic */ int $bytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketDeflateExtension$Config$compressIfBiggerThan$1(int i10) {
        super(1);
        this.$bytes = i10;
    }

    @Override // kv.l
    public final Boolean invoke(Frame frame) {
        e0.checkNotNullParameter(frame, "frame");
        return Boolean.valueOf(frame.getData().length > this.$bytes);
    }
}
