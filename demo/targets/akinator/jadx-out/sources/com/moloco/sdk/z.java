package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface z extends MessageLiteOrBuilder {
    String getArchitecture();

    ByteString getArchitectureBytes();

    String getBitness();

    ByteString getBitnessBytes();

    BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion getBrowsers(int i10);

    int getBrowsersCount();

    List<BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion> getBrowsersList();

    boolean getMobile();

    String getModel();

    ByteString getModelBytes();

    BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion getPlatform();

    y getSource();

    boolean hasArchitecture();

    boolean hasBitness();

    boolean hasMobile();

    boolean hasModel();

    boolean hasPlatform();

    boolean hasSource();
}
