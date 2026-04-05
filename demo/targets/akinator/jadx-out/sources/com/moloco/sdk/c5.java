package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface c5 extends MessageLiteOrBuilder {
    BidRequest$SdkBidRequest.App getApp();

    BidRequest$SdkBidRequest.Device getDevice();

    BidRequest$SdkBidRequest.Imp getImp();

    BidRequest$SdkBidRequest.Regs getRegs();

    int getTmax();

    BidRequest$SdkBidRequest.User getUser();

    boolean hasApp();

    boolean hasDevice();

    boolean hasImp();

    boolean hasRegs();

    boolean hasTmax();

    boolean hasUser();
}
