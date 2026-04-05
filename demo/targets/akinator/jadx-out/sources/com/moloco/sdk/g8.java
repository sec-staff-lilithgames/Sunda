package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g8 extends GeneratedMessageLite.Builder implements k8 {
    public g8 clearType() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit.Native) this.instance).clearType();
        return this;
    }

    @Override // com.moloco.sdk.k8
    public j8 getType() {
        return ((Init$SDKInitResponse.AdUnit.Native) this.instance).getType();
    }

    @Override // com.moloco.sdk.k8
    public int getTypeValue() {
        return ((Init$SDKInitResponse.AdUnit.Native) this.instance).getTypeValue();
    }

    public g8 setType(j8 j8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit.Native) this.instance).setType(j8Var);
        return this;
    }

    public g8 setTypeValue(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit.Native) this.instance).setTypeValue(i10);
        return this;
    }
}
