package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1 extends f0 implements l {
    final /* synthetic */ byte[] $array;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1(byte[] bArr) {
        super(1);
        this.$array = bArr;
    }

    public final void invoke(ByteBuffer it) {
        e0.checkNotNullParameter(it, "it");
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ByteBuffer) obj);
        return x0.f87415a;
    }
}
