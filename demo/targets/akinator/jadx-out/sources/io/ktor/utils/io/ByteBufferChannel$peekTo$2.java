package io.ktor.utils.io;

import io.ktor.utils.io.bits.MemoryJvmKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.z0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteBufferChannel$peekTo$2 extends f0 implements l {
    final /* synthetic */ z0 $bytesCopied;
    final /* synthetic */ ByteBuffer $destination;
    final /* synthetic */ long $destinationOffset;
    final /* synthetic */ long $max;
    final /* synthetic */ long $offset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$peekTo$2(long j10, long j11, ByteBuffer byteBuffer, long j12, z0 z0Var) {
        super(1);
        this.$offset = j10;
        this.$max = j11;
        this.$destination = byteBuffer;
        this.$destinationOffset = j12;
        this.$bytesCopied = z0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ByteBuffer) obj);
        return x0.f87415a;
    }

    public final void invoke(ByteBuffer nioBuffer) {
        e0.checkNotNullParameter(nioBuffer, "nioBuffer");
        if (nioBuffer.remaining() > this.$offset) {
            ByteBuffer byteBufferDuplicate = nioBuffer.duplicate();
            e0.checkNotNull(byteBufferDuplicate);
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) this.$offset));
            int iLimit = byteBufferDuplicate.limit();
            byteBufferDuplicate.limit((int) Math.min(byteBufferDuplicate.limit(), Math.min(this.$max, this.$destination.limit() - this.$destinationOffset) + this.$offset));
            this.$bytesCopied.f71866b = byteBufferDuplicate.remaining();
            MemoryJvmKt.m4335copyToSG11BkQ(byteBufferDuplicate, this.$destination, (int) this.$destinationOffset);
            byteBufferDuplicate.limit(iLimit);
        }
    }
}
