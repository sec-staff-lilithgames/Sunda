package com.unity3d.ads.core.domain.billing;

import av.b;
import av.e;
import bv.h;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {
    private final BillingClientAdapter billingClientAdapter;
    private final String productType;

    public CommonProductDetailsFetcher(BillingClientAdapter billingClientAdapter, String productType) {
        e0.checkNotNullParameter(productType, "productType");
        this.billingClientAdapter = billingClientAdapter;
        this.productType = productType;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, d<? super ProductDetailsResult> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(BillingResultBridge billingResult, String str2) {
                e0.checkNotNullParameter(billingResult, "billingResult");
                if (str2 != null && billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    CancellableContinuation<ProductDetailsResult> cancellableContinuation = cancellableContinuationImpl;
                    int i10 = z.f87419c;
                    cancellableContinuation.resumeWith(z.m7131constructorimpl(new ProductDetailsResult.Success(str2)));
                } else if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    CancellableContinuation<ProductDetailsResult> cancellableContinuation2 = cancellableContinuationImpl;
                    int i11 = z.f87419c;
                    cancellableContinuation2.resumeWith(z.m7131constructorimpl(ProductDetailsResult.NotFound.INSTANCE));
                } else {
                    CancellableContinuation<ProductDetailsResult> cancellableContinuation3 = cancellableContinuationImpl;
                    int i12 = z.f87419c;
                    cancellableContinuation3.resumeWith(z.m7131constructorimpl(new ProductDetailsResult.Failure(billingResult)));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }
}
