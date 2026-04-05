package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x4 extends GeneratedMessageLite.Builder implements y4 {
    public x4 clearCcpa() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).clearCcpa();
        return this;
    }

    public x4 clearGdpr() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).clearGdpr();
        return this;
    }

    public x4 clearUsPrivacy() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).clearUsPrivacy();
        return this;
    }

    @Override // com.moloco.sdk.y4
    public int getCcpa() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).getCcpa();
    }

    @Override // com.moloco.sdk.y4
    public int getGdpr() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).getGdpr();
    }

    @Override // com.moloco.sdk.y4
    public String getUsPrivacy() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).getUsPrivacy();
    }

    @Override // com.moloco.sdk.y4
    public ByteString getUsPrivacyBytes() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).getUsPrivacyBytes();
    }

    @Override // com.moloco.sdk.y4
    public boolean hasCcpa() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).hasCcpa();
    }

    @Override // com.moloco.sdk.y4
    public boolean hasGdpr() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).hasGdpr();
    }

    @Override // com.moloco.sdk.y4
    public boolean hasUsPrivacy() {
        return ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).hasUsPrivacy();
    }

    public x4 setCcpa(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).setCcpa(i10);
        return this;
    }

    public x4 setGdpr(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).setGdpr(i10);
        return this;
    }

    public x4 setUsPrivacy(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).setUsPrivacy(str);
        return this;
    }

    public x4 setUsPrivacyBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs.Ext) this.instance).setUsPrivacyBytes(byteString);
        return this;
    }
}
