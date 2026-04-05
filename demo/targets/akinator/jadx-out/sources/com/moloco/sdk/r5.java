package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r5 extends GeneratedMessageLite.Builder implements g7 {
    public r5 clearEs() {
        copyOnWrite();
        ((BidToken$ClientBidToken) this.instance).clearEs();
        return this;
    }

    public r5 clearPayload() {
        copyOnWrite();
        ((BidToken$ClientBidToken) this.instance).clearPayload();
        return this;
    }

    @Override // com.moloco.sdk.g7
    public ByteString getEs() {
        return ((BidToken$ClientBidToken) this.instance).getEs();
    }

    @Override // com.moloco.sdk.g7
    public ByteString getPayload() {
        return ((BidToken$ClientBidToken) this.instance).getPayload();
    }

    public r5 setEs(ByteString byteString) {
        copyOnWrite();
        ((BidToken$ClientBidToken) this.instance).setEs(byteString);
        return this;
    }

    public r5 setPayload(ByteString byteString) {
        copyOnWrite();
        ((BidToken$ClientBidToken) this.instance).setPayload(byteString);
        return this;
    }
}
