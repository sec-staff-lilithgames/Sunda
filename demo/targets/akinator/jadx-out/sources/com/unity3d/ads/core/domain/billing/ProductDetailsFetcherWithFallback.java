package com.unity3d.ads.core.domain.billing;

import bv.d;
import bv.f;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", i = {0, 0, 2}, l = {16, 20, 24}, m = "fetchProductDetails", n = {"this", InAppPurchaseMetaData.KEY_PRODUCT_ID, "primaryResult"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher primaryFetcher, ProductDetailsFetcher secondaryFetcher) {
        e0.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        e0.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchProductDetails(java.lang.String r9, zu.d<? super com.unity3d.ads.core.domain.billing.ProductDetailsResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r9 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r9
            tu.a0.throwOnFailure(r10)
            goto L90
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            tu.a0.throwOnFailure(r10)
            return r10
        L3f:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback r2 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback) r2
            tu.a0.throwOnFailure(r10)
            goto L5e
        L4b:
            tu.a0.throwOnFailure(r10)
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r8.primaryFetcher
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.fetchProductDetails(r9, r0)
            if (r10 != r1) goto L5d
            goto L8c
        L5d:
            r2 = r8
        L5e:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r5 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r5 == 0) goto L65
            return r10
        L65:
            boolean r5 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound
            r6 = 0
            if (r5 == 0) goto L7a
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r2.secondaryFetcher
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r9 = r10.fetchProductDetails(r9, r0)
            if (r9 != r1) goto L79
            goto L8c
        L79:
            return r9
        L7a:
            boolean r4 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure
            if (r4 == 0) goto L98
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r2 = r2.secondaryFetcher
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r2.fetchProductDetails(r9, r0)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r7 = r10
            r10 = r9
            r9 = r7
        L90:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r0 == 0) goto L97
            return r10
        L97:
            return r9
        L98:
            tu.t r9 = new tu.t
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, zu.d):java.lang.Object");
    }
}
