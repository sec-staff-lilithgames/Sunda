package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface h1 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    d0 getApi(int i10);

    int getApiCount();

    List<d0> getApiList();

    r1 getBattr(int i10);

    int getBattrCount();

    List<r1> getBattrList();

    a1 getBtype(int i10);

    int getBtypeCount();

    List<a1> getBtypeList();

    e1 getExpdir(int i10);

    int getExpdirCount();

    List<e1> getExpdirList();

    BidRequest$SdkBidRequest.Imp.Banner.Format getFormat(int i10);

    int getFormatCount();

    List<BidRequest$SdkBidRequest.Imp.Banner.Format> getFormatList();

    int getH();

    @Deprecated
    int getHmax();

    @Deprecated
    int getHmin();

    String getId();

    ByteString getIdBytes();

    String getMimes(int i10);

    ByteString getMimesBytes(int i10);

    int getMimesCount();

    List<String> getMimesList();

    g0 getPos();

    boolean getTopframe();

    boolean getVcm();

    int getW();

    @Deprecated
    int getWmax();

    @Deprecated
    int getWmin();

    boolean hasH();

    @Deprecated
    boolean hasHmax();

    @Deprecated
    boolean hasHmin();

    boolean hasId();

    boolean hasPos();

    boolean hasTopframe();

    boolean hasVcm();

    boolean hasW();

    @Deprecated
    boolean hasWmax();

    @Deprecated
    boolean hasWmin();
}
