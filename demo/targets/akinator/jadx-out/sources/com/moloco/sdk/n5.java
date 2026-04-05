package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$BidTokenResponseV3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n5 extends GeneratedMessageLite.Builder implements q5 {
    public n5 clearBidToken() {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).clearBidToken();
        return this;
    }

    public n5 clearClientTokenConfigs() {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).clearClientTokenConfigs();
        return this;
    }

    public n5 clearPk() {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).clearPk();
        return this;
    }

    @Override // com.moloco.sdk.q5
    public String getBidToken() {
        return ((BidToken$BidTokenResponseV3) this.instance).getBidToken();
    }

    @Override // com.moloco.sdk.q5
    public ByteString getBidTokenBytes() {
        return ((BidToken$BidTokenResponseV3) this.instance).getBidTokenBytes();
    }

    @Override // com.moloco.sdk.q5
    public BidToken$BidTokenResponseV3.ClientTokenConfigs getClientTokenConfigs() {
        return ((BidToken$BidTokenResponseV3) this.instance).getClientTokenConfigs();
    }

    @Override // com.moloco.sdk.q5
    public String getPk() {
        return ((BidToken$BidTokenResponseV3) this.instance).getPk();
    }

    @Override // com.moloco.sdk.q5
    public ByteString getPkBytes() {
        return ((BidToken$BidTokenResponseV3) this.instance).getPkBytes();
    }

    @Override // com.moloco.sdk.q5
    public boolean hasClientTokenConfigs() {
        return ((BidToken$BidTokenResponseV3) this.instance).hasClientTokenConfigs();
    }

    public n5 mergeClientTokenConfigs(BidToken$BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).mergeClientTokenConfigs(clientTokenConfigs);
        return this;
    }

    public n5 setBidToken(String str) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).setBidToken(str);
        return this;
    }

    public n5 setBidTokenBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).setBidTokenBytes(byteString);
        return this;
    }

    public n5 setClientTokenConfigs(BidToken$BidTokenResponseV3.ClientTokenConfigs clientTokenConfigs) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).setClientTokenConfigs(clientTokenConfigs);
        return this;
    }

    public n5 setPk(String str) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).setPk(str);
        return this;
    }

    public n5 setPkBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).setPkBytes(byteString);
        return this;
    }

    public n5 setClientTokenConfigs(o5 o5Var) {
        copyOnWrite();
        ((BidToken$BidTokenResponseV3) this.instance).setClientTokenConfigs((BidToken$BidTokenResponseV3.ClientTokenConfigs) o5Var.build());
        return this;
    }
}
