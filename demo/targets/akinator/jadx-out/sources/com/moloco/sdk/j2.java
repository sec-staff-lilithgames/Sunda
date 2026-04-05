package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j2 extends GeneratedMessageLite.ExtendableBuilder implements k2 {
    public j2 clearLen() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Title) this.instance).clearLen();
        return this;
    }

    @Override // com.moloco.sdk.k2
    public int getLen() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Title) this.instance).getLen();
    }

    @Override // com.moloco.sdk.k2
    public boolean hasLen() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Title) this.instance).hasLen();
    }

    public j2 setLen(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Title) this.instance).setLen(i10);
        return this;
    }
}
