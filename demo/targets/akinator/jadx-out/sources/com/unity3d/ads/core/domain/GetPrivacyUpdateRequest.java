package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetPrivacyUpdateRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetPrivacyUpdateRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        e0.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    public final Object invoke(int i10, ByteString byteString, d<? super UniversalRequestOuterClass.UniversalRequest> dVar) {
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builderNewBuilder = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PrivacyUpdateRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setVersion(i10);
        dsl_create.setContent(byteString);
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest_build = dsl_create._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setPrivacyUpdateRequest(privacyUpdateRequest_build);
        return this.getUniversalRequestForPayLoad.invoke(dsl_create2._build(), dVar);
    }
}
