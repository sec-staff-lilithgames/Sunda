package io.odeeo.sdk;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1", f = "AdUnit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1 extends bv.n implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public int f67886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1(AdUnit adUnit, zu.d<? super AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1> dVar) {
        super(2, dVar);
        this.f67887b = adUnit;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1(this.f67887b, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        if (this.f67886a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        return bv.b.boxBoolean(a.f67998a.isShowAllowedFor(this.f67887b.f67822c));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
