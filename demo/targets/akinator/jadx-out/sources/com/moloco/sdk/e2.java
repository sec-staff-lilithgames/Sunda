package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e2 extends GeneratedMessageLite.ExtendableBuilder implements i2 {
    public e2 addAllMimes(Iterable<String> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).addAllMimes(iterable);
        return this;
    }

    public e2 addMimes(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).addMimes(str);
        return this;
    }

    public e2 addMimesBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).addMimesBytes(byteString);
        return this;
    }

    public e2 clearH() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).clearH();
        return this;
    }

    public e2 clearHmin() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).clearHmin();
        return this;
    }

    public e2 clearMimes() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).clearMimes();
        return this;
    }

    public e2 clearType() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).clearType();
        return this;
    }

    public e2 clearW() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).clearW();
        return this;
    }

    public e2 clearWmin() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).clearWmin();
        return this;
    }

    @Override // com.moloco.sdk.i2
    public int getH() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getH();
    }

    @Override // com.moloco.sdk.i2
    public int getHmin() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getHmin();
    }

    @Override // com.moloco.sdk.i2
    public String getMimes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getMimes(i10);
    }

    @Override // com.moloco.sdk.i2
    public ByteString getMimesBytes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getMimesBytes(i10);
    }

    @Override // com.moloco.sdk.i2
    public int getMimesCount() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getMimesCount();
    }

    @Override // com.moloco.sdk.i2
    public List<String> getMimesList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getMimesList());
    }

    @Override // com.moloco.sdk.i2
    public h2 getType() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getType();
    }

    @Override // com.moloco.sdk.i2
    public int getW() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getW();
    }

    @Override // com.moloco.sdk.i2
    public int getWmin() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).getWmin();
    }

    @Override // com.moloco.sdk.i2
    public boolean hasH() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).hasH();
    }

    @Override // com.moloco.sdk.i2
    public boolean hasHmin() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).hasHmin();
    }

    @Override // com.moloco.sdk.i2
    public boolean hasType() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).hasType();
    }

    @Override // com.moloco.sdk.i2
    public boolean hasW() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).hasW();
    }

    @Override // com.moloco.sdk.i2
    public boolean hasWmin() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).hasWmin();
    }

    public e2 setH(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).setH(i10);
        return this;
    }

    public e2 setHmin(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).setHmin(i10);
        return this;
    }

    public e2 setMimes(int i10, String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).setMimes(i10, str);
        return this;
    }

    public e2 setType(h2 h2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).setType(h2Var);
        return this;
    }

    public e2 setW(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).setW(i10);
        return this;
    }

    public e2 setWmin(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset.Image) this.instance).setWmin(i10);
        return this;
    }
}
