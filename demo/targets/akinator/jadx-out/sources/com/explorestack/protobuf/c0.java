package com.explorestack.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public final ByteBuffer f21963i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21964j;

    public c0(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.f21963i = byteBuffer;
        this.f21964j = byteBuffer.position();
    }

    @Override // com.explorestack.protobuf.b0, com.explorestack.protobuf.h0
    public void flush() {
        this.f21963i.position(getTotalBytesWritten() + this.f21964j);
    }
}
