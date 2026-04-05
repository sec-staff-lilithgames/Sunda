package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b7 extends GeneratedMessageLite.Builder implements c7 {
    public b7 clearCcpa() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).clearCcpa();
        return this;
    }

    public b7 clearCoppa() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).clearCoppa();
        return this;
    }

    public b7 clearGdpr() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).clearGdpr();
        return this;
    }

    public b7 clearTcfConsentString() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).clearTcfConsentString();
        return this;
    }

    public b7 clearUsPrivacy() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).clearUsPrivacy();
        return this;
    }

    @Override // com.moloco.sdk.c7
    public boolean getCcpa() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getCcpa();
    }

    @Override // com.moloco.sdk.c7
    public boolean getCoppa() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getCoppa();
    }

    @Override // com.moloco.sdk.c7
    public boolean getGdpr() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getGdpr();
    }

    @Override // com.moloco.sdk.c7
    public String getTcfConsentString() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getTcfConsentString();
    }

    @Override // com.moloco.sdk.c7
    public ByteString getTcfConsentStringBytes() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getTcfConsentStringBytes();
    }

    @Override // com.moloco.sdk.c7
    public String getUsPrivacy() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getUsPrivacy();
    }

    @Override // com.moloco.sdk.c7
    public ByteString getUsPrivacyBytes() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).getUsPrivacyBytes();
    }

    @Override // com.moloco.sdk.c7
    public boolean hasCcpa() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).hasCcpa();
    }

    @Override // com.moloco.sdk.c7
    public boolean hasCoppa() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).hasCoppa();
    }

    @Override // com.moloco.sdk.c7
    public boolean hasGdpr() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).hasGdpr();
    }

    @Override // com.moloco.sdk.c7
    public boolean hasTcfConsentString() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).hasTcfConsentString();
    }

    @Override // com.moloco.sdk.c7
    public boolean hasUsPrivacy() {
        return ((BidToken$ClientBidTokenComponents.Privacy) this.instance).hasUsPrivacy();
    }

    public b7 setCcpa(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setCcpa(z10);
        return this;
    }

    public b7 setCoppa(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setCoppa(z10);
        return this;
    }

    public b7 setGdpr(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setGdpr(z10);
        return this;
    }

    public b7 setTcfConsentString(String str) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setTcfConsentString(str);
        return this;
    }

    public b7 setTcfConsentStringBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setTcfConsentStringBytes(byteString);
        return this;
    }

    public b7 setUsPrivacy(String str) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setUsPrivacy(str);
        return this;
    }

    public b7 setUsPrivacyBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.Privacy) this.instance).setUsPrivacyBytes(byteString);
        return this;
    }
}
