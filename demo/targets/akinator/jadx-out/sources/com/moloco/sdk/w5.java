package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w5 extends GeneratedMessageLite.Builder implements a6 {
    public w5 clearMuteSwitch() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).clearMuteSwitch();
        return this;
    }

    public w5 clearVol() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).clearVol();
        return this;
    }

    @Override // com.moloco.sdk.a6
    public z5 getMuteSwitch() {
        return ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).getMuteSwitch();
    }

    @Override // com.moloco.sdk.a6
    public int getMuteSwitchValue() {
        return ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).getMuteSwitchValue();
    }

    @Override // com.moloco.sdk.a6
    public int getVol() {
        return ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).getVol();
    }

    @Override // com.moloco.sdk.a6
    public boolean hasMuteSwitch() {
        return ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).hasMuteSwitch();
    }

    @Override // com.moloco.sdk.a6
    public boolean hasVol() {
        return ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).hasVol();
    }

    public w5 setMuteSwitch(z5 z5Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).setMuteSwitch(z5Var);
        return this;
    }

    public w5 setMuteSwitchValue(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).setMuteSwitchValue(i10);
        return this;
    }

    public w5 setVol(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AudioInfo) this.instance).setVol(i10);
        return this;
    }
}
