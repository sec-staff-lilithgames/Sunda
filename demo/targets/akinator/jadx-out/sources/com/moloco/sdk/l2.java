package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface l2 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    x1 getAssetOneofCase();

    BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data getData();

    int getId();

    BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image getImg();

    boolean getRequired();

    BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Title getTitle();

    BidRequest$SdkBidRequest.Imp.Video getVideo();

    boolean hasData();

    boolean hasId();

    boolean hasImg();

    boolean hasRequired();

    boolean hasTitle();

    boolean hasVideo();
}
