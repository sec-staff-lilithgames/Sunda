package com.sfbx.appconsent.core.repository;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentError;
import com.sfbx.appconsent.core.listener.AppConsentNoticeListener;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsent.core.repository.ConsentRepository$getHelloReply$1$1$1$1", f = "ConsentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ConsentRepository$getHelloReply$1$1$1$1 extends n implements p {
    final /* synthetic */ AppConsentNoticeListener $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentRepository$getHelloReply$1$1$1$1(AppConsentNoticeListener appConsentNoticeListener, d<? super ConsentRepository$getHelloReply$1$1$1$1> dVar) {
        super(2, dVar);
        this.$it = appConsentNoticeListener;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new ConsentRepository$getHelloReply$1$1$1$1(this.$it, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        this.$it.onError(new AppConsentError.ReducerError(null, 1, null));
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((ConsentRepository$getHelloReply$1$1$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
