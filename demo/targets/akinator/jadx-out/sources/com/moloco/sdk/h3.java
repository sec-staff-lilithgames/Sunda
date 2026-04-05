package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface h3 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    d0 getApi(int i10);

    int getApiCount();

    List<d0> getApiList();

    r1 getBattr(int i10);

    int getBattrCount();

    List<r1> getBattrList();

    String getRequest();

    ByteString getRequestBytes();

    BidRequest$SdkBidRequest.Imp.Native.NativeRequest getRequestNative();

    g3 getRequestOneofCase();

    String getVer();

    ByteString getVerBytes();

    boolean hasRequest();

    boolean hasRequestNative();

    boolean hasVer();
}
