package io.ktor.utils.io.bits;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Allocator {
    /* renamed from: alloc-gFv-Zug, reason: not valid java name */
    ByteBuffer mo4307allocgFvZug(int i10);

    /* renamed from: alloc-gFv-Zug, reason: not valid java name */
    ByteBuffer mo4308allocgFvZug(long j10);

    /* renamed from: free-3GNKZMM, reason: not valid java name */
    void mo4309free3GNKZMM(ByteBuffer byteBuffer);
}
