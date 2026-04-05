package io.ktor.utils.io;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {88}, m = "awaitAtLeastNBytesAvailableForRead$ktor_io", n = {"this", "count"}, s = {"L$0", "I$0"})
/* loaded from: classes10.dex */
public final class ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 extends d {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannelSequentialBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1(ByteChannelSequentialBase byteChannelSequentialBase, zu.d<? super ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1> dVar) {
        super(dVar);
        this.this$0 = byteChannelSequentialBase;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitAtLeastNBytesAvailableForRead$ktor_io(0, this);
    }
}
