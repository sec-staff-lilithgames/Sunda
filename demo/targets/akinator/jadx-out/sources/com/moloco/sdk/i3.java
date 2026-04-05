package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i3 extends GeneratedMessageLite.ExtendableBuilder implements o3 {
    public i3 addAllDeals(Iterable<? extends BidRequest$SdkBidRequest.Imp.Pmp.Deal> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).addAllDeals(iterable);
        return this;
    }

    public i3 addDeals(BidRequest$SdkBidRequest.Imp.Pmp.Deal deal) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).addDeals(deal);
        return this;
    }

    public i3 clearDeals() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).clearDeals();
        return this;
    }

    public i3 clearPrivateAuction() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).clearPrivateAuction();
        return this;
    }

    @Override // com.moloco.sdk.o3
    public BidRequest$SdkBidRequest.Imp.Pmp.Deal getDeals(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).getDeals(i10);
    }

    @Override // com.moloco.sdk.o3
    public int getDealsCount() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).getDealsCount();
    }

    @Override // com.moloco.sdk.o3
    public List<BidRequest$SdkBidRequest.Imp.Pmp.Deal> getDealsList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).getDealsList());
    }

    @Override // com.moloco.sdk.o3
    public boolean getPrivateAuction() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).getPrivateAuction();
    }

    @Override // com.moloco.sdk.o3
    public boolean hasPrivateAuction() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).hasPrivateAuction();
    }

    public i3 removeDeals(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).removeDeals(i10);
        return this;
    }

    public i3 setDeals(int i10, BidRequest$SdkBidRequest.Imp.Pmp.Deal deal) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).setDeals(i10, deal);
        return this;
    }

    public i3 setPrivateAuction(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).setPrivateAuction(z10);
        return this;
    }

    public i3 addDeals(int i10, BidRequest$SdkBidRequest.Imp.Pmp.Deal deal) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).addDeals(i10, deal);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3 setDeals(int i10, m3 m3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).setDeals(i10, (BidRequest$SdkBidRequest.Imp.Pmp.Deal) m3Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3 addDeals(m3 m3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).addDeals((BidRequest$SdkBidRequest.Imp.Pmp.Deal) m3Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3 addDeals(int i10, m3 m3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp) this.instance).addDeals(i10, (BidRequest$SdkBidRequest.Imp.Pmp.Deal) m3Var.build());
        return this;
    }
}
