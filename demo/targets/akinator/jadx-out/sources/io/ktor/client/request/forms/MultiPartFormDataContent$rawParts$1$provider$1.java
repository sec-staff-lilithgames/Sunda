package io.ktor.client.request.forms;

import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.OutputKt;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MultiPartFormDataContent$rawParts$1$provider$1 extends f0 implements a {
    final /* synthetic */ byte[] $bytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPartFormDataContent$rawParts$1$provider$1(byte[] bArr) {
        super(0);
        this.$bytes = bArr;
    }

    @Override // kv.a
    public final ByteReadPacket invoke() {
        byte[] bArr = this.$bytes;
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            OutputKt.writeFully$default((Output) bytePacketBuilder, bArr, 0, 0, 6, (Object) null);
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }
}
