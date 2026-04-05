package com.unity3d.ads.core.domain;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.GetCachedAsset$getCachedAsset$result$1", f = "GetCachedAsset.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class GetCachedAsset$getCachedAsset$result$1 extends n implements p {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, d<? super GetCachedAsset$getCachedAsset$result$1> dVar) {
        super(2, dVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new GetCachedAsset$getCachedAsset$result$1(this.this$0, this.$fileName, dVar);
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
        CacheRepository cacheRepository = this.this$0.cacheRepository;
        String str = this.$fileName;
        this.label = 1;
        Object objRetrieveFile = cacheRepository.retrieveFile(str, this);
        return objRetrieveFile == coroutine_suspended ? coroutine_suspended : objRetrieveFile;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super CacheResult> dVar) {
        return ((GetCachedAsset$getCachedAsset$result$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
