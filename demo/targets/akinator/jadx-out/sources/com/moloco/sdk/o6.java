package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o6 extends GeneratedMessageLite.Builder implements p6 {
    public o6 clearUtcoffset() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Geo) this.instance).clearUtcoffset();
        return this;
    }

    @Override // com.moloco.sdk.p6
    public int getUtcoffset() {
        return ((BidToken$ClientBidTokenComponents.Geo) this.instance).getUtcoffset();
    }

    @Override // com.moloco.sdk.p6
    public boolean hasUtcoffset() {
        return ((BidToken$ClientBidTokenComponents.Geo) this.instance).hasUtcoffset();
    }

    public o6 setUtcoffset(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Geo) this.instance).setUtcoffset(i10);
        return this;
    }
}
