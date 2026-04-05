package io.ktor.utils.io.streams;

import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class OutputStreamAdapter extends Output {
    private final OutputStream stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputStreamAdapter(ObjectPool<ChunkBuffer> pool, OutputStream stream) {
        super(pool);
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(stream, "stream");
        this.stream = stream;
    }

    @Override // io.ktor.utils.io.core.Output
    public void closeDestination() throws IOException {
        this.stream.close();
    }

    @Override // io.ktor.utils.io.core.Output
    /* renamed from: flush-62zg_DM */
    public void mo4493flush62zg_DM(ByteBuffer source, int i10, int i11) throws IOException {
        e0.checkNotNullParameter(source, "source");
        if (source.hasArray() && !source.isReadOnly()) {
            this.stream.write(source.array(), source.arrayOffset() + i10, i11);
            return;
        }
        byte[] bArrBorrow = ByteArraysKt.getByteArrayPool().borrow();
        ByteBuffer byteBufferSliceSafe = MemoryJvmKt.sliceSafe(source, i10, i11);
        while (true) {
            try {
                int iMin = Math.min(byteBufferSliceSafe.remaining(), bArrBorrow.length);
                if (iMin == 0) {
                    return;
                }
                byteBufferSliceSafe.get(bArrBorrow, 0, iMin);
                this.stream.write(bArrBorrow, 0, iMin);
            } finally {
                ByteArraysKt.getByteArrayPool().recycle(bArrBorrow);
            }
        }
    }
}
