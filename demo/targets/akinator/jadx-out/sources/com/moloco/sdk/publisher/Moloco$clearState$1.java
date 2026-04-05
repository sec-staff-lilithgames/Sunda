package com.moloco.sdk.publisher;

import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.moloco.sdk.publisher.Moloco", f = "Moloco.kt", i = {0}, l = {451, 454}, m = "clearState$moloco_sdk_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
public final class Moloco$clearState$1 extends bv.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Moloco this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$clearState$1(Moloco moloco, zu.d<? super Moloco$clearState$1> dVar) {
        super(dVar);
        this.this$0 = moloco;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearState$moloco_sdk_release(this);
    }
}
