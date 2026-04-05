package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d7 extends GeneratedMessageLite.Builder implements e7 {
    public d7 clearInitialized() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.SdkInfo) this.instance).clearInitialized();
        return this;
    }

    @Override // com.moloco.sdk.e7
    public boolean getInitialized() {
        return ((BidToken$ClientBidTokenComponents.SdkInfo) this.instance).getInitialized();
    }

    @Override // com.moloco.sdk.e7
    public boolean hasInitialized() {
        return ((BidToken$ClientBidTokenComponents.SdkInfo) this.instance).hasInitialized();
    }

    public d7 setInitialized(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.SdkInfo) this.instance).setInitialized(z10);
        return this;
    }
}
