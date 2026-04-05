package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q6 extends GeneratedMessageLite.Builder implements t6 {
    public q6 clearImpCounts() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).clearImpCounts();
        return this;
    }

    public q6 clearLastImpTs() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).clearLastImpTs();
        return this;
    }

    public q6 clearSessionId() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).clearSessionId();
        return this;
    }

    public q6 clearSessionStartTs() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).clearSessionStartTs();
        return this;
    }

    @Override // com.moloco.sdk.t6
    public BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts getImpCounts() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).getImpCounts();
    }

    @Override // com.moloco.sdk.t6
    public long getLastImpTs() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).getLastImpTs();
    }

    @Override // com.moloco.sdk.t6
    public String getSessionId() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).getSessionId();
    }

    @Override // com.moloco.sdk.t6
    public ByteString getSessionIdBytes() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).getSessionIdBytes();
    }

    @Override // com.moloco.sdk.t6
    public long getSessionStartTs() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).getSessionStartTs();
    }

    @Override // com.moloco.sdk.t6
    public boolean hasImpCounts() {
        return ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).hasImpCounts();
    }

    public q6 mergeImpCounts(BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).mergeImpCounts(impCounts);
        return this;
    }

    public q6 setImpCounts(BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts impCounts) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).setImpCounts(impCounts);
        return this;
    }

    public q6 setLastImpTs(long j10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).setLastImpTs(j10);
        return this;
    }

    public q6 setSessionId(String str) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).setSessionId(str);
        return this;
    }

    public q6 setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).setSessionIdBytes(byteString);
        return this;
    }

    public q6 setSessionStartTs(long j10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).setSessionStartTs(j10);
        return this;
    }

    public q6 setImpCounts(r6 r6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.ImpLvlRevData) this.instance).setImpCounts((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) r6Var.build());
        return this;
    }
}
