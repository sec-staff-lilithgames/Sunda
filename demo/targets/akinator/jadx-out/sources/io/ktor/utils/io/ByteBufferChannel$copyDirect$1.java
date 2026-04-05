package io.ktor.utils.io;

import bv.d;
import bv.f;
import com.ironsource.InterfaceC3129ae;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {InterfaceC3129ae.c.f35991d, 1271, 1279}, m = "copyDirect$ktor_io", n = {"this", "src", "joined", "copied", "this_$iv", "current$iv", "capacity$iv", "state", "dstBuffer", "$this$copyDirect_u24lambda_u2475", "limit", "autoFlush", "before$iv", "this", "src", "joined", "copied", "limit", "autoFlush", "this", "src", "joined", "copied", "limit", "autoFlush"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "Z$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0"})
/* loaded from: classes10.dex */
public final class ByteBufferChannel$copyDirect$1 extends d {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteBufferChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$copyDirect$1(ByteBufferChannel byteBufferChannel, zu.d<? super ByteBufferChannel$copyDirect$1> dVar) {
        super(dVar);
        this.this$0 = byteBufferChannel;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copyDirect$ktor_io(null, 0L, null, this);
    }
}
