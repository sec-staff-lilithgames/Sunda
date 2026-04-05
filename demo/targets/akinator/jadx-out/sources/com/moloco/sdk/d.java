package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d extends GeneratedMessageLite.Builder implements c5 {
    public d clearApp() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).clearApp();
        return this;
    }

    public d clearDevice() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).clearDevice();
        return this;
    }

    public d clearImp() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).clearImp();
        return this;
    }

    public d clearRegs() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).clearRegs();
        return this;
    }

    public d clearTmax() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).clearTmax();
        return this;
    }

    public d clearUser() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).clearUser();
        return this;
    }

    @Override // com.moloco.sdk.c5
    public BidRequest$SdkBidRequest.App getApp() {
        return ((BidRequest$SdkBidRequest) this.instance).getApp();
    }

    @Override // com.moloco.sdk.c5
    public BidRequest$SdkBidRequest.Device getDevice() {
        return ((BidRequest$SdkBidRequest) this.instance).getDevice();
    }

    @Override // com.moloco.sdk.c5
    public BidRequest$SdkBidRequest.Imp getImp() {
        return ((BidRequest$SdkBidRequest) this.instance).getImp();
    }

    @Override // com.moloco.sdk.c5
    public BidRequest$SdkBidRequest.Regs getRegs() {
        return ((BidRequest$SdkBidRequest) this.instance).getRegs();
    }

    @Override // com.moloco.sdk.c5
    public int getTmax() {
        return ((BidRequest$SdkBidRequest) this.instance).getTmax();
    }

    @Override // com.moloco.sdk.c5
    public BidRequest$SdkBidRequest.User getUser() {
        return ((BidRequest$SdkBidRequest) this.instance).getUser();
    }

    @Override // com.moloco.sdk.c5
    public boolean hasApp() {
        return ((BidRequest$SdkBidRequest) this.instance).hasApp();
    }

    @Override // com.moloco.sdk.c5
    public boolean hasDevice() {
        return ((BidRequest$SdkBidRequest) this.instance).hasDevice();
    }

    @Override // com.moloco.sdk.c5
    public boolean hasImp() {
        return ((BidRequest$SdkBidRequest) this.instance).hasImp();
    }

    @Override // com.moloco.sdk.c5
    public boolean hasRegs() {
        return ((BidRequest$SdkBidRequest) this.instance).hasRegs();
    }

    @Override // com.moloco.sdk.c5
    public boolean hasTmax() {
        return ((BidRequest$SdkBidRequest) this.instance).hasTmax();
    }

    @Override // com.moloco.sdk.c5
    public boolean hasUser() {
        return ((BidRequest$SdkBidRequest) this.instance).hasUser();
    }

    public d mergeApp(BidRequest$SdkBidRequest.App app) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).mergeApp(app);
        return this;
    }

    public d mergeDevice(BidRequest$SdkBidRequest.Device device) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).mergeDevice(device);
        return this;
    }

    public d mergeImp(BidRequest$SdkBidRequest.Imp imp) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).mergeImp(imp);
        return this;
    }

    public d mergeRegs(BidRequest$SdkBidRequest.Regs regs) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).mergeRegs(regs);
        return this;
    }

    public d mergeUser(BidRequest$SdkBidRequest.User user) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).mergeUser(user);
        return this;
    }

    public d setApp(BidRequest$SdkBidRequest.App app) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setApp(app);
        return this;
    }

    public d setDevice(BidRequest$SdkBidRequest.Device device) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setDevice(device);
        return this;
    }

    public d setImp(BidRequest$SdkBidRequest.Imp imp) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setImp(imp);
        return this;
    }

    public d setRegs(BidRequest$SdkBidRequest.Regs regs) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setRegs(regs);
        return this;
    }

    public d setTmax(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setTmax(i10);
        return this;
    }

    public d setUser(BidRequest$SdkBidRequest.User user) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setUser(user);
        return this;
    }

    public d setApp(b bVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setApp((BidRequest$SdkBidRequest.App) bVar.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d setDevice(e eVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setDevice((BidRequest$SdkBidRequest.Device) eVar.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d setImp(i1 i1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setImp((BidRequest$SdkBidRequest.Imp) i1Var.build());
        return this;
    }

    public d setRegs(w4 w4Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setRegs((BidRequest$SdkBidRequest.Regs) w4Var.build());
        return this;
    }

    public d setUser(a5 a5Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest) this.instance).setUser((BidRequest$SdkBidRequest.User) a5Var.build());
        return this;
    }
}
