package io.ktor.utils.io.bits;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MemoryFactoryKt {
    @f
    public static final <R> R withMemory(long j10, l block) {
        e0.checkNotNullParameter(block, "block");
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer byteBufferMo4308allocgFvZug = defaultAllocator.mo4308allocgFvZug(j10);
        try {
            return (R) block.invoke(Memory.m4313boximpl(byteBufferMo4308allocgFvZug));
        } finally {
            b0.finallyStart(1);
            defaultAllocator.mo4309free3GNKZMM(byteBufferMo4308allocgFvZug);
            b0.finallyEnd(1);
        }
    }

    @f
    public static final <R> R withMemory(int i10, l block) {
        e0.checkNotNullParameter(block, "block");
        long j10 = i10;
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer byteBufferMo4308allocgFvZug = defaultAllocator.mo4308allocgFvZug(j10);
        try {
            return (R) block.invoke(Memory.m4313boximpl(byteBufferMo4308allocgFvZug));
        } finally {
            b0.finallyStart(1);
            defaultAllocator.mo4309free3GNKZMM(byteBufferMo4308allocgFvZug);
            b0.finallyEnd(1);
        }
    }
}
