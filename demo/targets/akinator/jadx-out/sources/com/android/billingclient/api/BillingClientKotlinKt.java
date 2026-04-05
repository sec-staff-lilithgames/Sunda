package com.android.billingclient.api;

import ao.kwoC.zAQQWzBxnS;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class BillingClientKotlinKt {
    public static /* synthetic */ void $r8$lambda$1JhcD_0Y_gWWNKF2aNTk2toOOyY(CompletableDeferred deferred, BillingResult billingResult) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$9SKPFUMhNCJ3v0PMCwGqle8zR10(CompletableDeferred deferred, BillingResult billingResult, List list) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new SkuDetailsResult(billingResult, list));
    }

    /* renamed from: $r8$lambda$BC2cAL2vk_I3dV-pkSAsSywRIek, reason: not valid java name */
    public static /* synthetic */ void m205$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(CompletableDeferred deferred, BillingResult billingResult, String str) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new ConsumeResult(billingResult, str));
    }

    public static /* synthetic */ void $r8$lambda$Bt5YvFTOU7XGqhy1u2vanp4Jc20(CompletableDeferred deferred, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails));
    }

    /* renamed from: $r8$lambda$Iy_vpeZ_JH-NmajeE6ZBdUlqJKA, reason: not valid java name */
    public static /* synthetic */ void m206$r8$lambda$Iy_vpeZ_JHNmajeE6ZBdUlqJKA(CompletableDeferred deferred, BillingResult billingResult, List list) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        e0.checkNotNull(list);
        deferred.complete(new PurchasesResult(billingResult, list));
    }

    /* renamed from: $r8$lambda$Jmx2bDJUe-jQbQfqNR-Rv-qVuz0, reason: not valid java name */
    public static /* synthetic */ void m207$r8$lambda$Jmx2bDJUejQbQfqNRRvqVuz0(CompletableDeferred deferred, BillingResult billingResult, List list) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new PurchaseHistoryResult(billingResult, list));
    }

    /* renamed from: $r8$lambda$NdU5wcJ8m2M9H_puX2oHpjb25-w, reason: not valid java name */
    public static /* synthetic */ void m208$r8$lambda$NdU5wcJ8m2M9H_puX2oHpjb25w(CompletableDeferred deferred, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
    }

    /* renamed from: $r8$lambda$OmYoMPMU8NG-G-TTJRupXijq_ag, reason: not valid java name */
    public static /* synthetic */ void m209$r8$lambda$OmYoMPMU8NGGTTJRupXijq_ag(CompletableDeferred deferred, BillingResult billingResult) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$ZzkEujuP9GqFND2FbZB_kuqycGM(CompletableDeferred deferred, BillingResult billingResult, List list) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new PurchaseHistoryResult(billingResult, list));
    }

    /* renamed from: $r8$lambda$_HjOTKlijnqR-5v_YY-SPcvW1bw, reason: not valid java name */
    public static /* synthetic */ void m210$r8$lambda$_HjOTKlijnqR5v_YYSPcvW1bw(CompletableDeferred deferred, BillingResult billingResult, List list) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        deferred.complete(new ProductDetailsResult(billingResult, list));
    }

    public static /* synthetic */ void $r8$lambda$wzezm1LgRtzooDMmMf2vgdwDzEw(CompletableDeferred deferred, BillingResult billingResult, List list) {
        e0.checkNotNullParameter(deferred, "$deferred");
        e0.checkNotNull(billingResult);
        e0.checkNotNull(list);
        deferred.complete(new PurchasesResult(billingResult, list));
    }

    public static final Object acknowledgePurchase(BillingClient billingClient, AcknowledgePurchaseParams acknowledgePurchaseParams, zu.d<? super BillingResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(completableDeferredCompletableDeferred$default, billingResult);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object consumePurchase(BillingClient billingClient, ConsumeParams consumeParams, zu.d<? super ConsumeResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                BillingClientKotlinKt.m205$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(completableDeferredCompletableDeferred$default, billingResult, str);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object createAlternativeBillingOnlyReportingDetails(BillingClient billingClient, zu.d<? super CreateAlternativeBillingOnlyReportingDetailsResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda9
            @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
            public final void onAlternativeBillingOnlyTokenResponse(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                BillingClientKotlinKt.m208$r8$lambda$NdU5wcJ8m2M9H_puX2oHpjb25w(completableDeferredCompletableDeferred$default, billingResult, alternativeBillingOnlyReportingDetails);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object createExternalOfferReportingDetails(BillingClient billingClient, zu.d<? super CreateExternalOfferReportingDetailsResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.createExternalOfferReportingDetailsAsync(new ExternalOfferReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda5
            @Override // com.android.billingclient.api.ExternalOfferReportingDetailsListener
            public final void onExternalOfferReportingDetailsResponse(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
                BillingClientKotlinKt.$r8$lambda$Bt5YvFTOU7XGqhy1u2vanp4Jc20(completableDeferredCompletableDeferred$default, billingResult, externalOfferReportingDetails);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object isAlternativeBillingOnlyAvailable(BillingClient billingClient, zu.d<? super BillingResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda7
            @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
            public final void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$1JhcD_0Y_gWWNKF2aNTk2toOOyY(completableDeferredCompletableDeferred$default, billingResult);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object isExternalOfferAvailable(BillingClient billingClient, zu.d<? super BillingResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.isExternalOfferAvailableAsync(new ExternalOfferAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.ExternalOfferAvailabilityListener
            public final void onExternalOfferAvailabilityResponse(BillingResult billingResult) {
                BillingClientKotlinKt.m209$r8$lambda$OmYoMPMU8NGGTTJRupXijq_ag(completableDeferredCompletableDeferred$default, billingResult);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object queryProductDetails(BillingClient billingClient, QueryProductDetailsParams queryProductDetailsParams, zu.d<? super ProductDetailsResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.m210$r8$lambda$_HjOTKlijnqR5v_YYSPcvW1bw(completableDeferredCompletableDeferred$default, billingResult, list);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object queryPurchaseHistory(BillingClient billingClient, QueryPurchaseHistoryParams queryPurchaseHistoryParams, zu.d<? super PurchaseHistoryResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParams, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda6
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.m207$r8$lambda$Jmx2bDJUejQbQfqNRRvqVuz0(completableDeferredCompletableDeferred$default, billingResult, list);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static final Object queryPurchasesAsync(BillingClient billingClient, QueryPurchasesParams queryPurchasesParams, zu.d<? super PurchasesResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryPurchasesAsync(queryPurchasesParams, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda10
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.m206$r8$lambda$Iy_vpeZ_JHNmajeE6ZBdUlqJKA(completableDeferredCompletableDeferred$default, billingResult, list);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    @tu.f
    public static final Object querySkuDetails(BillingClient billingClient, SkuDetailsParams skuDetailsParams, zu.d<? super SkuDetailsResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.querySkuDetailsAsync(skuDetailsParams, new SkuDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda11
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$9SKPFUMhNCJ3v0PMCwGqle8zR10(completableDeferredCompletableDeferred$default, billingResult, list);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static /* synthetic */ void $r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(CompletableDeferred completableDeferred, BillingResult billingResult) {
        e0.checkNotNullParameter(completableDeferred, zAQQWzBxnS.ARlxcJnjGMMIzsb);
        e0.checkNotNull(billingResult);
        completableDeferred.complete(billingResult);
    }

    @tu.f
    public static final Object queryPurchaseHistory(BillingClient billingClient, String str, zu.d<? super PurchaseHistoryResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda8
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$ZzkEujuP9GqFND2FbZB_kuqycGM(completableDeferredCompletableDeferred$default, billingResult, list);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    @tu.f
    public static final Object queryPurchasesAsync(BillingClient billingClient, String str, zu.d<? super PurchasesResult> dVar) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        billingClient.queryPurchasesAsync(str, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$wzezm1LgRtzooDMmMf2vgdwDzEw(completableDeferredCompletableDeferred$default, billingResult, list);
            }
        });
        return completableDeferredCompletableDeferred$default.await(dVar);
    }
}
