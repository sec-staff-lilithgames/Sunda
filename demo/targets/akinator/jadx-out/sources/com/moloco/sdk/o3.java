package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface o3 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    BidRequest$SdkBidRequest.Imp.Pmp.Deal getDeals(int i10);

    int getDealsCount();

    List<BidRequest$SdkBidRequest.Imp.Pmp.Deal> getDealsList();

    boolean getPrivateAuction();

    boolean hasPrivateAuction();
}
