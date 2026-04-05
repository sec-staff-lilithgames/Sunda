package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m8 extends GeneratedMessageLite.Builder implements n8 {
    public m8 clearBidTokenUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse.BidTokenConfig) this.instance).clearBidTokenUrl();
        return this;
    }

    @Override // com.moloco.sdk.n8
    public String getBidTokenUrl() {
        return ((Init$SDKInitResponse.BidTokenConfig) this.instance).getBidTokenUrl();
    }

    @Override // com.moloco.sdk.n8
    public ByteString getBidTokenUrlBytes() {
        return ((Init$SDKInitResponse.BidTokenConfig) this.instance).getBidTokenUrlBytes();
    }

    public m8 setBidTokenUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.BidTokenConfig) this.instance).setBidTokenUrl(str);
        return this;
    }

    public m8 setBidTokenUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.BidTokenConfig) this.instance).setBidTokenUrlBytes(byteString);
        return this;
    }
}
