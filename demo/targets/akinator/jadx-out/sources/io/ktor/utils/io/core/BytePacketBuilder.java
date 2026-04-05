package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BytePacketBuilder extends Output {
    /* JADX WARN: Multi-variable type inference failed */
    public BytePacketBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ByteReadPacket build() {
        int size = getSize();
        ChunkBuffer chunkBufferStealAll$ktor_io = stealAll$ktor_io();
        return chunkBufferStealAll$ktor_io == null ? ByteReadPacket.Companion.getEmpty() : new ByteReadPacket(chunkBufferStealAll$ktor_io, size, getPool());
    }

    @Override // io.ktor.utils.io.core.Output
    /* renamed from: flush-62zg_DM, reason: not valid java name */
    public final void mo4493flush62zg_DM(ByteBuffer source, int i10, int i11) {
        e0.checkNotNullParameter(source, "source");
    }

    public final int getSize() {
        return get_size();
    }

    public final ObjectPool<ChunkBuffer> get_pool() {
        return getPool();
    }

    public final boolean isEmpty() {
        return get_size() == 0;
    }

    public final boolean isNotEmpty() {
        return get_size() > 0;
    }

    public String toString() {
        return "BytePacketBuilder[0x" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }

    public /* synthetic */ BytePacketBuilder(ObjectPool objectPool, int i10, u uVar) {
        this((i10 & 1) != 0 ? ChunkBuffer.Companion.getPool() : objectPool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BytePacketBuilder(ObjectPool<ChunkBuffer> pool) {
        super(pool);
        e0.checkNotNullParameter(pool, "pool");
    }

    @Override // io.ktor.utils.io.core.Output, java.lang.Appendable
    public BytePacketBuilder append(char c10) {
        Output outputAppend = super.append(c10);
        e0.checkNotNull(outputAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) outputAppend;
    }

    @Override // io.ktor.utils.io.core.Output, java.lang.Appendable
    public BytePacketBuilder append(CharSequence charSequence) {
        Output outputAppend = super.append(charSequence);
        e0.checkNotNull(outputAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) outputAppend;
    }

    @Override // io.ktor.utils.io.core.Output, java.lang.Appendable
    public BytePacketBuilder append(CharSequence charSequence, int i10, int i11) {
        Output outputAppend = super.append(charSequence, i10, i11);
        e0.checkNotNull(outputAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) outputAppend;
    }

    public static /* synthetic */ void get_pool$annotations() {
    }

    @Override // io.ktor.utils.io.core.Output
    public final void closeDestination() {
    }
}
