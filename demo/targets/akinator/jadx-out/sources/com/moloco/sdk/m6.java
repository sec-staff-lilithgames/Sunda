package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m6 extends GeneratedMessageLite.Builder implements n6 {
    public m6 clearDsizeBytes() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.DirInfo) this.instance).clearDsizeBytes();
        return this;
    }

    @Override // com.moloco.sdk.n6
    public long getDsizeBytes() {
        return ((BidToken$ClientBidTokenComponents.DirInfo) this.instance).getDsizeBytes();
    }

    @Override // com.moloco.sdk.n6
    public boolean hasDsizeBytes() {
        return ((BidToken$ClientBidTokenComponents.DirInfo) this.instance).hasDsizeBytes();
    }

    public m6 setDsizeBytes(long j10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.DirInfo) this.instance).setDsizeBytes(j10);
        return this;
    }
}
