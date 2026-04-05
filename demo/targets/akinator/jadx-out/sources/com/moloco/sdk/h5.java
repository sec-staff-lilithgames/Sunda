package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.BidToken$BidTokenRequestV2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface h5 extends MessageLiteOrBuilder {
    String getIdfv();

    ByteString getIdfvBytes();

    BidToken$BidTokenRequestV2.BidTokenComponents.Privacy getPrivacy();

    boolean hasIdfv();

    boolean hasPrivacy();
}
