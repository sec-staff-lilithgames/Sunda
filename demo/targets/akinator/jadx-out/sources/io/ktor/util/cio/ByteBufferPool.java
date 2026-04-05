package io.ktor.util.cio;

import io.ktor.util.InternalAPI;
import io.ktor.utils.io.pool.DefaultPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
@f
/* loaded from: classes8.dex */
public final class ByteBufferPool extends DefaultPool<ByteBuffer> {
    public ByteBufferPool() {
        super(2048);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer clearInstance(ByteBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        instance.clear();
        return instance;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer produceInstance() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE);
        e0.checkNotNullExpressionValue(byteBufferAllocate, "allocate(DEFAULT_BUFFER_SIZE)");
        return byteBufferAllocate;
    }
}
