package com.unity3d.services;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.o;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends n implements p {
    final /* synthetic */ o $getHeaderBiddingToken$delegate;
    final /* synthetic */ o $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(o oVar, o oVar2, d<? super UnityAdsSDK$fetchToken$token$1> dVar) {
        super(2, dVar);
        this.$getHeaderBiddingToken$delegate = oVar;
        this.$tokenNumberProvider$delegate = oVar2;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$10 = UnityAdsSDK.fetchToken$lambda$10(this.$getHeaderBiddingToken$delegate);
        int iInvoke = UnityAdsSDK.fetchToken$lambda$9(this.$tokenNumberProvider$delegate).invoke();
        this.label = 1;
        Object objInvoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$10, iInvoke, null, this, 2, null);
        return objInvoke$default == coroutine_suspended ? coroutine_suspended : objInvoke$default;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super String> dVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
