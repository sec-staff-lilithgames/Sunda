package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface GetAdPlayerConfigRequest {
    Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, d<? super UniversalRequestOuterClass.UniversalRequest> dVar);
}
