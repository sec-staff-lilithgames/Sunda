package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$BidTokenRequestV2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f5 extends GeneratedMessageLite.Builder implements g5 {
    public f5 clearCcpa() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearCcpa();
        return this;
    }

    public f5 clearCoppa() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearCoppa();
        return this;
    }

    public f5 clearGdpr() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearGdpr();
        return this;
    }

    public f5 clearTcfConsentString() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearTcfConsentString();
        return this;
    }

    public f5 clearUsPrivacy() {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).clearUsPrivacy();
        return this;
    }

    @Override // com.moloco.sdk.g5
    public boolean getCcpa() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getCcpa();
    }

    @Override // com.moloco.sdk.g5
    public boolean getCoppa() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getCoppa();
    }

    @Override // com.moloco.sdk.g5
    public boolean getGdpr() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getGdpr();
    }

    @Override // com.moloco.sdk.g5
    public String getTcfConsentString() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getTcfConsentString();
    }

    @Override // com.moloco.sdk.g5
    public ByteString getTcfConsentStringBytes() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getTcfConsentStringBytes();
    }

    @Override // com.moloco.sdk.g5
    public String getUsPrivacy() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getUsPrivacy();
    }

    @Override // com.moloco.sdk.g5
    public ByteString getUsPrivacyBytes() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).getUsPrivacyBytes();
    }

    @Override // com.moloco.sdk.g5
    public boolean hasCcpa() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasCcpa();
    }

    @Override // com.moloco.sdk.g5
    public boolean hasCoppa() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasCoppa();
    }

    @Override // com.moloco.sdk.g5
    public boolean hasGdpr() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasGdpr();
    }

    @Override // com.moloco.sdk.g5
    public boolean hasTcfConsentString() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasTcfConsentString();
    }

    @Override // com.moloco.sdk.g5
    public boolean hasUsPrivacy() {
        return ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).hasUsPrivacy();
    }

    public f5 setCcpa(boolean z10) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setCcpa(z10);
        return this;
    }

    public f5 setCoppa(boolean z10) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setCoppa(z10);
        return this;
    }

    public f5 setGdpr(boolean z10) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setGdpr(z10);
        return this;
    }

    public f5 setTcfConsentString(String str) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setTcfConsentString(str);
        return this;
    }

    public f5 setTcfConsentStringBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setTcfConsentStringBytes(byteString);
        return this;
    }

    public f5 setUsPrivacy(String str) {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setUsPrivacy(str);
        return this;
    }

    public f5 setUsPrivacyBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$BidTokenRequestV2.BidTokenComponents.Privacy) this.instance).setUsPrivacyBytes(byteString);
        return this;
    }
}
