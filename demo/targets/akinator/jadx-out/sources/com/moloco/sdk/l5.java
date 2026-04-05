package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l5 extends GeneratedMessageLite.Builder implements m5 {
    public l5 clearBidToken() {
        copyOnWrite();
        ((BidToken$BidTokenResponseV2) this.instance).clearBidToken();
        return this;
    }

    @Override // com.moloco.sdk.m5
    public String getBidToken() {
        return ((BidToken$BidTokenResponseV2) this.instance).getBidToken();
    }

    @Override // com.moloco.sdk.m5
    public ByteString getBidTokenBytes() {
        return ((BidToken$BidTokenResponseV2) this.instance).getBidTokenBytes();
    }

    public l5 setBidToken(String str) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV2) this.instance).setBidToken(str);
        return this;
    }

    public l5 setBidTokenBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$BidTokenResponseV2) this.instance).setBidTokenBytes(byteString);
        return this;
    }
}
