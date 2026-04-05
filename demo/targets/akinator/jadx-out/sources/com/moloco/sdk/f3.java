package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface f3 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset getAssets(int i10);

    int getAssetsCount();

    List<BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset> getAssetsList();

    boolean getAurlsupport();

    s2 getContext();

    p2 getContextsubtype();

    boolean getDurlsupport();

    BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers getEventtrackers(int i10);

    int getEventtrackersCount();

    List<BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers> getEventtrackersList();

    int getPlcmtcnt();

    e3 getPlcmttype();

    boolean getPrivacy();

    int getSeq();

    String getVer();

    ByteString getVerBytes();

    boolean hasAurlsupport();

    boolean hasContext();

    boolean hasContextsubtype();

    boolean hasDurlsupport();

    boolean hasPlcmtcnt();

    boolean hasPlcmttype();

    boolean hasPrivacy();

    boolean hasSeq();

    boolean hasVer();
}
