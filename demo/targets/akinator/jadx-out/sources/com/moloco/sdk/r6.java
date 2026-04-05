package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r6 extends GeneratedMessageLite.Builder implements s6 {
    public r6 clearBanner() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearBanner();
        return this;
    }

    public r6 clearInterstitial() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearInterstitial();
        return this;
    }

    public r6 clearMrec() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearMrec();
        return this;
    }

    public r6 clearNative() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearNative();
        return this;
    }

    public r6 clearRewarded() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).clearRewarded();
        return this;
    }

    @Override // com.moloco.sdk.s6
    public int getBanner() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getBanner();
    }

    @Override // com.moloco.sdk.s6
    public int getInterstitial() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getInterstitial();
    }

    @Override // com.moloco.sdk.s6
    public int getMrec() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getMrec();
    }

    @Override // com.moloco.sdk.s6
    public int getNative() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getNative();
    }

    @Override // com.moloco.sdk.s6
    public int getRewarded() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).getRewarded();
    }

    public r6 setBanner(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setBanner(i10);
        return this;
    }

    public r6 setInterstitial(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setInterstitial(i10);
        return this;
    }

    public r6 setMrec(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setMrec(i10);
        return this;
    }

    public r6 setNative(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setNative(i10);
        return this;
    }

    public r6 setRewarded(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) this.instance).setRewarded(i10);
        return this;
    }
}
