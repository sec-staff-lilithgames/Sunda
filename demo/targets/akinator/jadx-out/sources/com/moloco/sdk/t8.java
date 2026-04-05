package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class t8 extends GeneratedMessageLite.Builder implements u8 {
    public t8 clearName() {
        copyOnWrite();
        ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).clearName();
        return this;
    }

    public t8 clearValue() {
        copyOnWrite();
        ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).clearValue();
        return this;
    }

    @Override // com.moloco.sdk.u8
    public String getName() {
        return ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).getName();
    }

    @Override // com.moloco.sdk.u8
    public ByteString getNameBytes() {
        return ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).getNameBytes();
    }

    @Override // com.moloco.sdk.u8
    public String getValue() {
        return ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).getValue();
    }

    @Override // com.moloco.sdk.u8
    public ByteString getValueBytes() {
        return ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).getValueBytes();
    }

    public t8 setName(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).setName(str);
        return this;
    }

    public t8 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).setNameBytes(byteString);
        return this;
    }

    public t8 setValue(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).setValue(str);
        return this;
    }

    public t8 setValueBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.ExperimentalFeatureFlag) this.instance).setValueBytes(byteString);
        return this;
    }
}
