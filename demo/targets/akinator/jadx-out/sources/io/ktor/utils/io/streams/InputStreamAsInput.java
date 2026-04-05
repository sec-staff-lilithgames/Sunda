package io.ktor.utils.io.streams;

import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputStreamAsInput extends Input {
    private final InputStream stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputStreamAsInput(InputStream stream, ObjectPool<ChunkBuffer> pool) {
        super(null, 0L, pool, 3, null);
        e0.checkNotNullParameter(stream, "stream");
        e0.checkNotNullParameter(pool, "pool");
        this.stream = stream;
    }

    @Override // io.ktor.utils.io.core.Input
    public void closeSource() throws IOException {
        this.stream.close();
    }

    @Override // io.ktor.utils.io.core.Input
    /* renamed from: fill-62zg_DM */
    public int mo4494fill62zg_DM(ByteBuffer destination, int i10, int i11) {
        e0.checkNotNullParameter(destination, "destination");
        if (destination.hasArray() && !destination.isReadOnly()) {
            return v.coerceAtLeast(this.stream.read(destination.array(), destination.arrayOffset() + i10, i11), 0);
        }
        byte[] bArrBorrow = ByteArraysKt.getByteArrayPool().borrow();
        try {
            int i12 = this.stream.read(bArrBorrow, 0, Math.min(bArrBorrow.length, i11));
            if (i12 == -1) {
                return 0;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrBorrow, 0, i12).slice().order(ByteOrder.BIG_ENDIAN);
            e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), destination, 0, i12, i10);
            return i12;
        } finally {
            ByteArraysKt.getByteArrayPool().recycle(bArrBorrow);
        }
    }
}
