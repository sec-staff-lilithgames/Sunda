package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w4 extends GeneratedMessageLite.Builder implements z4 {
    public w4 clearCoppa() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs) this.instance).clearCoppa();
        return this;
    }

    public w4 clearExt() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs) this.instance).clearExt();
        return this;
    }

    @Override // com.moloco.sdk.z4
    public boolean getCoppa() {
        return ((BidRequest$SdkBidRequest.Regs) this.instance).getCoppa();
    }

    @Override // com.moloco.sdk.z4
    public BidRequest$SdkBidRequest.Regs.Ext getExt() {
        return ((BidRequest$SdkBidRequest.Regs) this.instance).getExt();
    }

    @Override // com.moloco.sdk.z4
    public boolean hasCoppa() {
        return ((BidRequest$SdkBidRequest.Regs) this.instance).hasCoppa();
    }

    @Override // com.moloco.sdk.z4
    public boolean hasExt() {
        return ((BidRequest$SdkBidRequest.Regs) this.instance).hasExt();
    }

    public w4 mergeExt(BidRequest$SdkBidRequest.Regs.Ext ext) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs) this.instance).mergeExt(ext);
        return this;
    }

    public w4 setCoppa(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs) this.instance).setCoppa(z10);
        return this;
    }

    public w4 setExt(BidRequest$SdkBidRequest.Regs.Ext ext) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs) this.instance).setExt(ext);
        return this;
    }

    public w4 setExt(x4 x4Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Regs) this.instance).setExt((BidRequest$SdkBidRequest.Regs.Ext) x4Var.build());
        return this;
    }
}
