package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$BidTokenRequestV2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i5 extends GeneratedMessageLite.Builder implements j5 {
    public i5 clearBidTokenComponents() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2) this.instance).clearBidTokenComponents();
        return this;
    }

    @Override // com.moloco.sdk.j5
    public BidToken$BidTokenRequestV2.BidTokenComponents getBidTokenComponents() {
        return ((BidToken$BidTokenRequestV2) this.instance).getBidTokenComponents();
    }

    @Override // com.moloco.sdk.j5
    public boolean hasBidTokenComponents() {
        return ((BidToken$BidTokenRequestV2) this.instance).hasBidTokenComponents();
    }

    public i5 mergeBidTokenComponents(BidToken$BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2) this.instance).mergeBidTokenComponents(bidTokenComponents);
        return this;
    }

    public i5 setBidTokenComponents(BidToken$BidTokenRequestV2.BidTokenComponents bidTokenComponents) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2) this.instance).setBidTokenComponents(bidTokenComponents);
        return this;
    }

    public i5 setBidTokenComponents(e5 e5Var) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2) this.instance).setBidTokenComponents((BidToken$BidTokenRequestV2.BidTokenComponents) e5Var.build());
        return this;
    }
}
