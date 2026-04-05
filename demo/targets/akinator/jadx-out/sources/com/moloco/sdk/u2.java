package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u2 extends GeneratedMessageLite.ExtendableBuilder implements b3 {
    public u2 addAllMethods(Iterable<? extends x2> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).addAllMethods(iterable);
        return this;
    }

    public u2 addMethods(x2 x2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).addMethods(x2Var);
        return this;
    }

    public u2 clearEvent() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).clearEvent();
        return this;
    }

    public u2 clearMethods() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).clearMethods();
        return this;
    }

    @Override // com.moloco.sdk.b3
    public a3 getEvent() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).getEvent();
    }

    @Override // com.moloco.sdk.b3
    public x2 getMethods(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).getMethods(i10);
    }

    @Override // com.moloco.sdk.b3
    public int getMethodsCount() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).getMethodsCount();
    }

    @Override // com.moloco.sdk.b3
    public List<x2> getMethodsList() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).getMethodsList();
    }

    @Override // com.moloco.sdk.b3
    public boolean hasEvent() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).hasEvent();
    }

    public u2 setEvent(a3 a3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).setEvent(a3Var);
        return this;
    }

    public u2 setMethods(int i10, x2 x2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) this.instance).setMethods(i10, x2Var);
        return this;
    }
}
