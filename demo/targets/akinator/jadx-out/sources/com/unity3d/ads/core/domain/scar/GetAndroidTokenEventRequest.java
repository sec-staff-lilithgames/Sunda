package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    @Override // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, d<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> dVar) {
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builderNewBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setTokenId(byteString);
        String it = biddingSignals.getRvSignal();
        if (it != null) {
            e0.checkNotNullExpressionValue(it, "it");
            dsl_create.setRewarded(ByteStringsKt.toByteStringUtf8(it));
        }
        String it2 = biddingSignals.getInterstitialSignal();
        if (it2 != null) {
            e0.checkNotNullExpressionValue(it2, "it");
            dsl_create.setInterstitial(ByteStringsKt.toByteStringUtf8(it2));
        }
        String it3 = biddingSignals.getBannerSignal();
        if (it3 != null) {
            e0.checkNotNullExpressionValue(it3, "it");
            dsl_create.setBanner(ByteStringsKt.toByteStringUtf8(it3));
        }
        return dsl_create._build();
    }
}
