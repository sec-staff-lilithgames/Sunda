package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s1 extends GeneratedMessageLite.ExtendableBuilder implements t1 {
    public s1 clearType() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).clearType();
        return this;
    }

    public s1 clearValue() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).clearValue();
        return this;
    }

    public s1 clearVendor() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).clearVendor();
        return this;
    }

    @Override // com.moloco.sdk.t1
    public String getType() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).getType();
    }

    @Override // com.moloco.sdk.t1
    public ByteString getTypeBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).getTypeBytes();
    }

    @Override // com.moloco.sdk.t1
    public double getValue() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).getValue();
    }

    @Override // com.moloco.sdk.t1
    public String getVendor() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).getVendor();
    }

    @Override // com.moloco.sdk.t1
    public ByteString getVendorBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).getVendorBytes();
    }

    @Override // com.moloco.sdk.t1
    public boolean hasType() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).hasType();
    }

    @Override // com.moloco.sdk.t1
    public boolean hasValue() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).hasValue();
    }

    @Override // com.moloco.sdk.t1
    public boolean hasVendor() {
        return ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).hasVendor();
    }

    public s1 setType(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).setType(str);
        return this;
    }

    public s1 setTypeBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).setTypeBytes(byteString);
        return this;
    }

    public s1 setValue(double d10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).setValue(d10);
        return this;
    }

    public s1 setVendor(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).setVendor(str);
        return this;
    }

    public s1 setVendorBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Metric) this.instance).setVendorBytes(byteString);
        return this;
    }
}
