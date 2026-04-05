package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$BidTokenResponseV3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o5 extends GeneratedMessageLite.Builder implements p5 {
    public o5 clearEnableDbt() {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3.ClientTokenConfigs) this.instance).clearEnableDbt();
        return this;
    }

    @Override // com.moloco.sdk.p5
    public boolean getEnableDbt() {
        return ((BidToken$BidTokenResponseV3.ClientTokenConfigs) this.instance).getEnableDbt();
    }

    public o5 setEnableDbt(boolean z10) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3.ClientTokenConfigs) this.instance).setEnableDbt(z10);
        return this;
    }
}
