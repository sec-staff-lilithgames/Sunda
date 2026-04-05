package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c8 extends GeneratedMessageLite.Builder implements l8 {
    public c8 clearAdFrequency() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).clearAdFrequency();
        return this;
    }

    public c8 clearBidFloor() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).clearBidFloor();
        return this;
    }

    public c8 clearId() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).clearId();
        return this;
    }

    public c8 clearName() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).clearName();
        return this;
    }

    public c8 clearNative() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).clearNative();
        return this;
    }

    public c8 clearType() {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).clearType();
        return this;
    }

    @Override // com.moloco.sdk.l8
    public int getAdFrequency() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getAdFrequency();
    }

    @Override // com.moloco.sdk.l8
    public float getBidFloor() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getBidFloor();
    }

    @Override // com.moloco.sdk.l8
    public String getId() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getId();
    }

    @Override // com.moloco.sdk.l8
    public ByteString getIdBytes() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.l8
    public String getName() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getName();
    }

    @Override // com.moloco.sdk.l8
    public ByteString getNameBytes() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getNameBytes();
    }

    @Override // com.moloco.sdk.l8
    public Init$SDKInitResponse.AdUnit.Native getNative() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getNative();
    }

    @Override // com.moloco.sdk.l8
    public f8 getType() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getType();
    }

    @Override // com.moloco.sdk.l8
    public int getTypeValue() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).getTypeValue();
    }

    @Override // com.moloco.sdk.l8
    public boolean hasNative() {
        return ((Init$SDKInitResponse.AdUnit) this.instance).hasNative();
    }

    public c8 mergeNative(Init$SDKInitResponse.AdUnit.Native r22) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).mergeNative(r22);
        return this;
    }

    public c8 setAdFrequency(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setAdFrequency(i10);
        return this;
    }

    public c8 setBidFloor(float f10) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setBidFloor(f10);
        return this;
    }

    public c8 setId(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setId(str);
        return this;
    }

    public c8 setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setIdBytes(byteString);
        return this;
    }

    public c8 setName(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setName(str);
        return this;
    }

    public c8 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setNameBytes(byteString);
        return this;
    }

    public c8 setNative(Init$SDKInitResponse.AdUnit.Native r22) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setNative(r22);
        return this;
    }

    public c8 setType(f8 f8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setType(f8Var);
        return this;
    }

    public c8 setTypeValue(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setTypeValue(i10);
        return this;
    }

    public c8 setNative(g8 g8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse.AdUnit) this.instance).setNative((Init$SDKInitResponse.AdUnit.Native) g8Var.build());
        return this;
    }
}
