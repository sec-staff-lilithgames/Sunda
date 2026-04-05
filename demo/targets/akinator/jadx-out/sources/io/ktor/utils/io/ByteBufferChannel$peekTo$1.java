package io.ktor.utils.io;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {2374}, m = "peekTo-lBXzO7A$suspendImpl", n = {"bytesCopied"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class ByteBufferChannel$peekTo$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteBufferChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$peekTo$1(ByteBufferChannel byteBufferChannel, zu.d<? super ByteBufferChannel$peekTo$1> dVar) {
        super(dVar);
        this.this$0 = byteBufferChannel;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteBufferChannel.m4301peekTolBXzO7A$suspendImpl(this.this$0, null, 0L, 0L, 0L, 0L, this);
    }
}
