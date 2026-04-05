package com.sfbx.appconsent.core.repository;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsent.core.repository.ConsentRepository", f = "ConsentRepository.kt", i = {0, 0, 1, 1}, l = {852, 246}, m = "getHelloReplyFromRemote$appconsent_core_prodXchangeRelease", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
public final class ConsentRepository$getHelloReplyFromRemote$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsentRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentRepository$getHelloReplyFromRemote$1(ConsentRepository consentRepository, zu.d<? super ConsentRepository$getHelloReplyFromRemote$1> dVar) {
        super(dVar);
        this.this$0 = consentRepository;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getHelloReplyFromRemote$appconsent_core_prodXchangeRelease(this);
    }
}
