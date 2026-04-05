package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteReadPacket extends Input {
    public static final Companion Companion = new Companion(null);
    private static final ByteReadPacket Empty;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ByteReadPacket getEmpty() {
            return ByteReadPacket.Empty;
        }

        private Companion() {
        }
    }

    static {
        ChunkBuffer.Companion companion = ChunkBuffer.Companion;
        Empty = new ByteReadPacket(companion.getEmpty(), 0L, companion.getEmptyPool());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteReadPacket(ChunkBuffer head, long j10, ObjectPool<ChunkBuffer> pool) {
        super(head, j10, pool);
        e0.checkNotNullParameter(head, "head");
        e0.checkNotNullParameter(pool, "pool");
        markNoMoreChunksAvailable();
    }

    public final ByteReadPacket copy() {
        return new ByteReadPacket(BuffersKt.copyAll(getHead()), getRemaining(), getPool());
    }

    @Override // io.ktor.utils.io.core.Input
    public final ChunkBuffer fill() {
        return null;
    }

    @Override // io.ktor.utils.io.core.Input
    /* renamed from: fill-62zg_DM, reason: not valid java name */
    public final int mo4494fill62zg_DM(ByteBuffer destination, int i10, int i11) {
        e0.checkNotNullParameter(destination, "destination");
        return 0;
    }

    public String toString() {
        return "ByteReadPacket[" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteReadPacket(ChunkBuffer head, ObjectPool<ChunkBuffer> pool) {
        this(head, BuffersKt.remainingAll(head), pool);
        e0.checkNotNullParameter(head, "head");
        e0.checkNotNullParameter(pool, "pool");
    }

    @Override // io.ktor.utils.io.core.Input
    public final void closeSource() {
    }
}
