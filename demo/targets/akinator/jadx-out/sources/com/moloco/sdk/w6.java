package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w6 extends GeneratedMessageLite.Builder implements a7 {
    public w6 clearMcc() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).clearMcc();
        return this;
    }

    public w6 clearMnc() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).clearMnc();
        return this;
    }

    public w6 clearRestricted() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).clearRestricted();
        return this;
    }

    public w6 clearType() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).clearType();
        return this;
    }

    @Override // com.moloco.sdk.a7
    public int getMcc() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).getMcc();
    }

    @Override // com.moloco.sdk.a7
    public int getMnc() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).getMnc();
    }

    @Override // com.moloco.sdk.a7
    public boolean getRestricted() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).getRestricted();
    }

    @Override // com.moloco.sdk.a7
    public z6 getType() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).getType();
    }

    @Override // com.moloco.sdk.a7
    public int getTypeValue() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).getTypeValue();
    }

    @Override // com.moloco.sdk.a7
    public boolean hasMcc() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).hasMcc();
    }

    @Override // com.moloco.sdk.a7
    public boolean hasMnc() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).hasMnc();
    }

    @Override // com.moloco.sdk.a7
    public boolean hasRestricted() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).hasRestricted();
    }

    @Override // com.moloco.sdk.a7
    public boolean hasType() {
        return ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).hasType();
    }

    public w6 setMcc(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).setMcc(i10);
        return this;
    }

    public w6 setMnc(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).setMnc(i10);
        return this;
    }

    public w6 setRestricted(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).setRestricted(z10);
        return this;
    }

    public w6 setType(z6 z6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).setType(z6Var);
        return this;
    }

    public w6 setTypeValue(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.NetworkInfo) this.instance).setTypeValue(i10);
        return this;
    }
}
