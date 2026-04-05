package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface HandleGetTokenRequest {
    Object invoke(ByteString byteString, BiddingSignals biddingSignals, d<? super UniversalResponseOuterClass.UniversalResponse> dVar);
}
