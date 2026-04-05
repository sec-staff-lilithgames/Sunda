package io.ktor.client.utils;

import io.ktor.util.InternalAPI;
import io.ktor.utils.io.pool.DefaultPool;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
@f
/* loaded from: classes7.dex */
public final class ByteBufferPool extends DefaultPool<ByteBuffer> {
    public ByteBufferPool() {
        super(1000);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer clearInstance(ByteBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public ByteBuffer produceInstance() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
        e0.checkNotNull(byteBufferAllocate);
        return byteBufferAllocate;
    }
}
