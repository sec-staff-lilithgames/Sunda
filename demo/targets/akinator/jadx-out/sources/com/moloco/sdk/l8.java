package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface l8 extends MessageLiteOrBuilder {
    int getAdFrequency();

    float getBidFloor();

    String getId();

    ByteString getIdBytes();

    String getName();

    ByteString getNameBytes();

    Init$SDKInitResponse.AdUnit.Native getNative();

    f8 getType();

    int getTypeValue();

    boolean hasNative();
}
