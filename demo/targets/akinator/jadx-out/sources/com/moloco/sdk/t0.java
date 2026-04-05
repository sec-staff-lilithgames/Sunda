package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface t0 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    d0 getApi(int i10);

    int getApiCount();

    List<d0> getApiList();

    r1 getBattr(int i10);

    int getBattrCount();

    List<r1> getBattrList();

    BidRequest$SdkBidRequest.Imp.Banner getCompanionad(int i10);

    int getCompanionadCount();

    List<BidRequest$SdkBidRequest.Imp.Banner> getCompanionadList();

    l1 getCompaniontype(int i10);

    int getCompaniontypeCount();

    List<l1> getCompaniontypeList();

    o1 getDelivery(int i10);

    int getDeliveryCount();

    List<o1> getDeliveryList();

    p0 getFeed();

    int getMaxbitrate();

    int getMaxduration();

    int getMaxextended();

    int getMaxseq();

    String getMimes(int i10);

    ByteString getMimesBytes(int i10);

    int getMimesCount();

    List<String> getMimesList();

    int getMinbitrate();

    double getMincpmpersec();

    int getMinduration();

    s0 getNvol();

    int getPoddur();

    String getPodid();

    ByteString getPodidBytes();

    r3 getPodseq();

    u3 getProtocols(int i10);

    int getProtocolsCount();

    List<u3> getProtocolsList();

    int getRqddurs(int i10);

    int getRqddursCount();

    List<Integer> getRqddursList();

    @Deprecated
    int getSequence();

    a4 getSlotinpod();

    int getStartdelay();

    boolean getStitched();

    boolean hasFeed();

    boolean hasMaxbitrate();

    boolean hasMaxduration();

    boolean hasMaxextended();

    boolean hasMaxseq();

    boolean hasMinbitrate();

    boolean hasMincpmpersec();

    boolean hasMinduration();

    boolean hasNvol();

    boolean hasPoddur();

    boolean hasPodid();

    boolean hasPodseq();

    @Deprecated
    boolean hasSequence();

    boolean hasSlotinpod();

    boolean hasStartdelay();

    boolean hasStitched();
}
