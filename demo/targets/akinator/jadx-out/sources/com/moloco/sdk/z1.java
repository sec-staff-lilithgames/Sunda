package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z1 extends GeneratedMessageLite.ExtendableBuilder implements d2 {
    public z1 clearLen() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).clearLen();
        return this;
    }

    public z1 clearType() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).clearType();
        return this;
    }

    @Override // com.moloco.sdk.d2
    public int getLen() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).getLen();
    }

    @Override // com.moloco.sdk.d2
    public c2 getType() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).getType();
    }

    @Override // com.moloco.sdk.d2
    public boolean hasLen() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).hasLen();
    }

    @Override // com.moloco.sdk.d2
    public boolean hasType() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).hasType();
    }

    public z1 setLen(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).setLen(i10);
        return this;
    }

    public z1 setType(c2 c2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Data) this.instance).setType(c2Var);
        return this;
    }
}
