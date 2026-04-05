package io.ktor.utils.io;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {820}, m = "peekTo-lBXzO7A", n = {"bytesCopied"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class ByteChannelSequentialBase$peekTo$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannelSequentialBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialBase$peekTo$1(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super ByteChannelSequentialBase$peekTo$1> dVar) {
        super(dVar);
        this.this$0 = byteChannelSequentialBase;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4303peekTolBXzO7A(null, 0L, 0L, 0L, 0L, this);
    }
}
