package io.ktor.utils.io.bits;

import e3.g;
import io.ktor.http.ContentDisposition;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DefaultAllocator implements Allocator {
    public static final DefaultAllocator INSTANCE = new DefaultAllocator();

    private DefaultAllocator() {
    }

    @Override // io.ktor.utils.io.bits.Allocator
    /* renamed from: alloc-gFv-Zug */
    public ByteBuffer mo4307allocgFvZug(int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        e0.checkNotNullExpressionValue(byteBufferAllocate, "allocate(size)");
        return Memory.m4314constructorimpl(byteBufferAllocate);
    }

    @Override // io.ktor.utils.io.bits.Allocator
    /* renamed from: free-3GNKZMM */
    public void mo4309free3GNKZMM(ByteBuffer instance) {
        e0.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.io.bits.Allocator
    /* renamed from: alloc-gFv-Zug */
    public ByteBuffer mo4308allocgFvZug(long j10) {
        if (j10 < 2147483647L) {
            return mo4307allocgFvZug((int) j10);
        }
        throw g.r(j10, ContentDisposition.Parameters.Size);
    }
}
