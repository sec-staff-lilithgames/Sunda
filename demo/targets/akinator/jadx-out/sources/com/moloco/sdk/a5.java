package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a5 extends GeneratedMessageLite.Builder implements b5 {
    public a5 clearId() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.User) this.instance).clearId();
        return this;
    }

    @Override // com.moloco.sdk.b5
    public String getId() {
        return ((BidRequest$SdkBidRequest.User) this.instance).getId();
    }

    @Override // com.moloco.sdk.b5
    public ByteString getIdBytes() {
        return ((BidRequest$SdkBidRequest.User) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.b5
    public boolean hasId() {
        return ((BidRequest$SdkBidRequest.User) this.instance).hasId();
    }

    public a5 setId(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.User) this.instance).setId(str);
        return this;
    }

    public a5 setIdBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.User) this.instance).setIdBytes(byteString);
        return this;
    }
}
