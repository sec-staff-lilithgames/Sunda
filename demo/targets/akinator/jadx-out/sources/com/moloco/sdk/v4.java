package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface v4 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    BidRequest$SdkBidRequest.Imp.Audio getAudio();

    BidRequest$SdkBidRequest.Imp.Banner getBanner();

    double getBidfloor();

    String getBidfloorcur();

    ByteString getBidfloorcurBytes();

    boolean getClickbrowser();

    String getDisplaymanager();

    ByteString getDisplaymanagerBytes();

    String getDisplaymanagerver();

    ByteString getDisplaymanagerverBytes();

    int getExp();

    String getId();

    ByteString getIdBytes();

    String getIframebuster(int i10);

    ByteString getIframebusterBytes(int i10);

    int getIframebusterCount();

    List<String> getIframebusterList();

    boolean getInstl();

    BidRequest$SdkBidRequest.Imp.Metric getMetric(int i10);

    int getMetricCount();

    List<BidRequest$SdkBidRequest.Imp.Metric> getMetricList();

    BidRequest$SdkBidRequest.Imp.Native getNative();

    BidRequest$SdkBidRequest.Imp.Pmp getPmp();

    boolean getRwdd();

    boolean getSecure();

    x3 getSsai();

    String getTagid();

    ByteString getTagidBytes();

    BidRequest$SdkBidRequest.Imp.Video getVideo();

    boolean hasAudio();

    boolean hasBanner();

    boolean hasBidfloor();

    boolean hasBidfloorcur();

    boolean hasClickbrowser();

    boolean hasDisplaymanager();

    boolean hasDisplaymanagerver();

    boolean hasExp();

    boolean hasId();

    boolean hasInstl();

    boolean hasNative();

    boolean hasPmp();

    boolean hasRwdd();

    boolean hasSecure();

    boolean hasSsai();

    boolean hasTagid();

    boolean hasVideo();
}
