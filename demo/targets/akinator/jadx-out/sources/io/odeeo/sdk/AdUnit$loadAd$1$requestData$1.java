package io.odeeo.sdk;

import io.odeeo.internal.r1.a;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.data.BidRequestData;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit$loadAd$1$requestData$1", f = "AdUnit.kt", i = {}, l = {975}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$loadAd$1$requestData$1 extends bv.n implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public int f67898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdUnit.RequestType f67900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$loadAd$1$requestData$1(AdUnit adUnit, AdUnit.RequestType requestType, zu.d<? super AdUnit$loadAd$1$requestData$1> dVar) {
        super(2, dVar);
        this.f67899b = adUnit;
        this.f67900c = requestType;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new AdUnit$loadAd$1$requestData$1(this.f67899b, this.f67900c, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f67898a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        io.odeeo.internal.r1.a generateBidRequestDataUseCase$odeeoSdk_release = this.f67899b.getGenerateBidRequestDataUseCase$odeeoSdk_release();
        a.C0642a c0642a = new a.C0642a(this.f67900c, this.f67899b.f67821b, this.f67899b.S, this.f67899b.f67823d, this.f67899b.f67841v, this.f67899b.getRetryAmount$odeeoSdk_release(), null);
        this.f67898a = 1;
        Object objInvoke = generateBidRequestDataUseCase$odeeoSdk_release.invoke(c0642a, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super io.odeeo.internal.a.c<BidRequestData, ? extends Throwable>> dVar) {
        return ((AdUnit$loadAd$1$requestData$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
