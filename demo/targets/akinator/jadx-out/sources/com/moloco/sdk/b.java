package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearBundle() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.App) this.instance).clearBundle();
        return this;
    }

    public b clearVer() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.App) this.instance).clearVer();
        return this;
    }

    @Override // com.moloco.sdk.c
    public String getBundle() {
        return ((BidRequest$SdkBidRequest.App) this.instance).getBundle();
    }

    @Override // com.moloco.sdk.c
    public ByteString getBundleBytes() {
        return ((BidRequest$SdkBidRequest.App) this.instance).getBundleBytes();
    }

    @Override // com.moloco.sdk.c
    public String getVer() {
        return ((BidRequest$SdkBidRequest.App) this.instance).getVer();
    }

    @Override // com.moloco.sdk.c
    public ByteString getVerBytes() {
        return ((BidRequest$SdkBidRequest.App) this.instance).getVerBytes();
    }

    @Override // com.moloco.sdk.c
    public boolean hasBundle() {
        return ((BidRequest$SdkBidRequest.App) this.instance).hasBundle();
    }

    @Override // com.moloco.sdk.c
    public boolean hasVer() {
        return ((BidRequest$SdkBidRequest.App) this.instance).hasVer();
    }

    public b setBundle(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.App) this.instance).setBundle(str);
        return this;
    }

    public b setBundleBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.App) this.instance).setBundleBytes(byteString);
        return this;
    }

    public b setVer(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.App) this.instance).setVer(str);
        return this;
    }

    public b setVerBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.App) this.instance).setVerBytes(byteString);
        return this;
    }
}
