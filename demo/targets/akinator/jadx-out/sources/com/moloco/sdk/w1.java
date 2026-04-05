package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w1 extends GeneratedMessageLite.ExtendableBuilder implements h3 {
    public w1 addAllApi(Iterable<? extends d0> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).addAllApi(iterable);
        return this;
    }

    public w1 addAllBattr(Iterable<? extends r1> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).addAllBattr(iterable);
        return this;
    }

    public w1 addApi(d0 d0Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).addApi(d0Var);
        return this;
    }

    public w1 addBattr(r1 r1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).addBattr(r1Var);
        return this;
    }

    public w1 clearApi() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).clearApi();
        return this;
    }

    public w1 clearBattr() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).clearBattr();
        return this;
    }

    public w1 clearRequest() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).clearRequest();
        return this;
    }

    public w1 clearRequestNative() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).clearRequestNative();
        return this;
    }

    public w1 clearRequestOneof() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).clearRequestOneof();
        return this;
    }

    public w1 clearVer() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).clearVer();
        return this;
    }

    @Override // com.moloco.sdk.h3
    public d0 getApi(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getApi(i10);
    }

    @Override // com.moloco.sdk.h3
    public int getApiCount() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getApiCount();
    }

    @Override // com.moloco.sdk.h3
    public List<d0> getApiList() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getApiList();
    }

    @Override // com.moloco.sdk.h3
    public r1 getBattr(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getBattr(i10);
    }

    @Override // com.moloco.sdk.h3
    public int getBattrCount() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getBattrCount();
    }

    @Override // com.moloco.sdk.h3
    public List<r1> getBattrList() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getBattrList();
    }

    @Override // com.moloco.sdk.h3
    public String getRequest() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getRequest();
    }

    @Override // com.moloco.sdk.h3
    public ByteString getRequestBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getRequestBytes();
    }

    @Override // com.moloco.sdk.h3
    public BidRequest$SdkBidRequest.Imp.Native.NativeRequest getRequestNative() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getRequestNative();
    }

    @Override // com.moloco.sdk.h3
    public g3 getRequestOneofCase() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getRequestOneofCase();
    }

    @Override // com.moloco.sdk.h3
    public String getVer() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getVer();
    }

    @Override // com.moloco.sdk.h3
    public ByteString getVerBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).getVerBytes();
    }

    @Override // com.moloco.sdk.h3
    public boolean hasRequest() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).hasRequest();
    }

    @Override // com.moloco.sdk.h3
    public boolean hasRequestNative() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).hasRequestNative();
    }

    @Override // com.moloco.sdk.h3
    public boolean hasVer() {
        return ((BidRequest$SdkBidRequest.Imp.Native) this.instance).hasVer();
    }

    public w1 mergeRequestNative(BidRequest$SdkBidRequest.Imp.Native.NativeRequest nativeRequest) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).mergeRequestNative(nativeRequest);
        return this;
    }

    public w1 setApi(int i10, d0 d0Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setApi(i10, d0Var);
        return this;
    }

    public w1 setBattr(int i10, r1 r1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setBattr(i10, r1Var);
        return this;
    }

    public w1 setRequest(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setRequest(str);
        return this;
    }

    public w1 setRequestBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setRequestBytes(byteString);
        return this;
    }

    public w1 setRequestNative(BidRequest$SdkBidRequest.Imp.Native.NativeRequest nativeRequest) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setRequestNative(nativeRequest);
        return this;
    }

    public w1 setVer(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setVer(str);
        return this;
    }

    public w1 setVerBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setVerBytes(byteString);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w1 setRequestNative(m2 m2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native) this.instance).setRequestNative((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) m2Var.build());
        return this;
    }
}
