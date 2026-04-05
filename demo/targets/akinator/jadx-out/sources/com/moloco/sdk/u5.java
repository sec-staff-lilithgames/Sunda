package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u5 extends GeneratedMessageLite.Builder implements v5 {
    public u5 clearDnt() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).clearDnt();
        return this;
    }

    public u5 clearId() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).clearId();
        return this;
    }

    @Override // com.moloco.sdk.v5
    public boolean getDnt() {
        return ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).getDnt();
    }

    @Override // com.moloco.sdk.v5
    public String getId() {
        return ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).getId();
    }

    @Override // com.moloco.sdk.v5
    public ByteString getIdBytes() {
        return ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.v5
    public boolean hasDnt() {
        return ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).hasDnt();
    }

    @Override // com.moloco.sdk.v5
    public boolean hasId() {
        return ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).hasId();
    }

    public u5 setDnt(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).setDnt(z10);
        return this;
    }

    public u5 setId(String str) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).setId(str);
        return this;
    }

    public u5 setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AdvertisingInfo) this.instance).setIdBytes(byteString);
        return this;
    }
}
