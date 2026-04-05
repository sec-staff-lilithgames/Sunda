package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class t extends GeneratedMessageLite.Builder implements u {
    public t addAllVersion(Iterable<String> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).addAllVersion(iterable);
        return this;
    }

    public t addVersion(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).addVersion(str);
        return this;
    }

    public t addVersionBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).addVersionBytes(byteString);
        return this;
    }

    public t clearBrand() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).clearBrand();
        return this;
    }

    public t clearVersion() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).clearVersion();
        return this;
    }

    @Override // com.moloco.sdk.u
    public String getBrand() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).getBrand();
    }

    @Override // com.moloco.sdk.u
    public ByteString getBrandBytes() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).getBrandBytes();
    }

    @Override // com.moloco.sdk.u
    public String getVersion(int i10) {
        return ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).getVersion(i10);
    }

    @Override // com.moloco.sdk.u
    public ByteString getVersionBytes(int i10) {
        return ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).getVersionBytes(i10);
    }

    @Override // com.moloco.sdk.u
    public int getVersionCount() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).getVersionCount();
    }

    @Override // com.moloco.sdk.u
    public List<String> getVersionList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).getVersionList());
    }

    @Override // com.moloco.sdk.u
    public boolean hasBrand() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).hasBrand();
    }

    public t setBrand(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).setBrand(str);
        return this;
    }

    public t setBrandBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).setBrandBytes(byteString);
        return this;
    }

    public t setVersion(int i10, String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) this.instance).setVersion(i10, str);
        return this;
    }
}
