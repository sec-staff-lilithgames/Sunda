package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$BidTokenRequestV2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e5 extends GeneratedMessageLite.Builder implements h5 {
    public e5 clearIdfv() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).clearIdfv();
        return this;
    }

    public e5 clearPrivacy() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).clearPrivacy();
        return this;
    }

    @Override // com.moloco.sdk.h5
    public String getIdfv() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).getIdfv();
    }

    @Override // com.moloco.sdk.h5
    public ByteString getIdfvBytes() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).getIdfvBytes();
    }

    @Override // com.moloco.sdk.h5
    public BidToken$BidTokenRequestV2.BidTokenComponents.Privacy getPrivacy() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).getPrivacy();
    }

    @Override // com.moloco.sdk.h5
    public boolean hasIdfv() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).hasIdfv();
    }

    @Override // com.moloco.sdk.h5
    public boolean hasPrivacy() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).hasPrivacy();
    }

    public e5 mergePrivacy(BidToken$BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).mergePrivacy(privacy);
        return this;
    }

    public e5 setIdfv(String str) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).setIdfv(str);
        return this;
    }

    public e5 setIdfvBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).setIdfvBytes(byteString);
        return this;
    }

    public e5 setPrivacy(BidToken$BidTokenRequestV2.BidTokenComponents.Privacy privacy) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).setPrivacy(privacy);
        return this;
    }

    public e5 setPrivacy(f5 f5Var) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents) this.instance).setPrivacy((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) f5Var.build());
        return this;
    }
}
