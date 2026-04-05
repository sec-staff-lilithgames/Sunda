package io.odeeo.sdk;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit$executeAdShowingInternal$1", f = "AdUnit.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$executeAdShowingInternal$1 extends bv.n implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public int f67876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.z0.f f67878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$executeAdShowingInternal$1(AdUnit adUnit, io.odeeo.internal.z0.f fVar, zu.d<? super AdUnit$executeAdShowingInternal$1> dVar) {
        super(2, dVar);
        this.f67877b = adUnit;
        this.f67878c = fVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new AdUnit$executeAdShowingInternal$1(this.f67877b, this.f67878c, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f67876a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            AdUnit adUnit = this.f67877b;
            io.odeeo.internal.z0.f fVar = this.f67878c;
            this.f67876a = 1;
            if (adUnit.subscribeToLifecycleState$odeeoSdk_release(fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((AdUnit$executeAdShowingInternal$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
