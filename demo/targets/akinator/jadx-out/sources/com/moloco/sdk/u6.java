package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u6 extends GeneratedMessageLite.Builder implements v6 {
    public u6 clearLowMem() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).clearLowMem();
        return this;
    }

    public u6 clearLowMemThresholdBytes() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).clearLowMemThresholdBytes();
        return this;
    }

    public u6 clearTotalMemBytes() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).clearTotalMemBytes();
        return this;
    }

    @Override // com.moloco.sdk.v6
    public boolean getLowMem() {
        return ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).getLowMem();
    }

    @Override // com.moloco.sdk.v6
    public long getLowMemThresholdBytes() {
        return ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).getLowMemThresholdBytes();
    }

    @Override // com.moloco.sdk.v6
    public long getTotalMemBytes() {
        return ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).getTotalMemBytes();
    }

    @Override // com.moloco.sdk.v6
    public boolean hasLowMem() {
        return ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).hasLowMem();
    }

    @Override // com.moloco.sdk.v6
    public boolean hasLowMemThresholdBytes() {
        return ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).hasLowMemThresholdBytes();
    }

    @Override // com.moloco.sdk.v6
    public boolean hasTotalMemBytes() {
        return ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).hasTotalMemBytes();
    }

    public u6 setLowMem(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).setLowMem(z10);
        return this;
    }

    public u6 setLowMemThresholdBytes(long j10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).setLowMemThresholdBytes(j10);
        return this;
    }

    public u6 setTotalMemBytes(long j10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.MemoryInfo) this.instance).setTotalMemBytes(j10);
        return this;
    }
}
