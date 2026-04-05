package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m3 extends GeneratedMessageLite.ExtendableBuilder implements n3 {
    public m3 addAllWadomain(Iterable<String> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).addAllWadomain(iterable);
        return this;
    }

    public m3 addAllWseat(Iterable<String> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).addAllWseat(iterable);
        return this;
    }

    public m3 addWadomain(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).addWadomain(str);
        return this;
    }

    public m3 addWadomainBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).addWadomainBytes(byteString);
        return this;
    }

    public m3 addWseat(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).addWseat(str);
        return this;
    }

    public m3 addWseatBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).addWseatBytes(byteString);
        return this;
    }

    public m3 clearAt() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).clearAt();
        return this;
    }

    public m3 clearBidfloor() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).clearBidfloor();
        return this;
    }

    public m3 clearBidfloorcur() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).clearBidfloorcur();
        return this;
    }

    public m3 clearId() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).clearId();
        return this;
    }

    public m3 clearWadomain() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).clearWadomain();
        return this;
    }

    public m3 clearWseat() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).clearWseat();
        return this;
    }

    @Override // com.moloco.sdk.n3
    public l3 getAt() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getAt();
    }

    @Override // com.moloco.sdk.n3
    public double getBidfloor() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getBidfloor();
    }

    @Override // com.moloco.sdk.n3
    public String getBidfloorcur() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getBidfloorcur();
    }

    @Override // com.moloco.sdk.n3
    public ByteString getBidfloorcurBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getBidfloorcurBytes();
    }

    @Override // com.moloco.sdk.n3
    public String getId() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getId();
    }

    @Override // com.moloco.sdk.n3
    public ByteString getIdBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.n3
    public String getWadomain(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWadomain(i10);
    }

    @Override // com.moloco.sdk.n3
    public ByteString getWadomainBytes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWadomainBytes(i10);
    }

    @Override // com.moloco.sdk.n3
    public int getWadomainCount() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWadomainCount();
    }

    @Override // com.moloco.sdk.n3
    public List<String> getWadomainList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWadomainList());
    }

    @Override // com.moloco.sdk.n3
    public String getWseat(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWseat(i10);
    }

    @Override // com.moloco.sdk.n3
    public ByteString getWseatBytes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWseatBytes(i10);
    }

    @Override // com.moloco.sdk.n3
    public int getWseatCount() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWseatCount();
    }

    @Override // com.moloco.sdk.n3
    public List<String> getWseatList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).getWseatList());
    }

    @Override // com.moloco.sdk.n3
    public boolean hasAt() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).hasAt();
    }

    @Override // com.moloco.sdk.n3
    public boolean hasBidfloor() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).hasBidfloor();
    }

    @Override // com.moloco.sdk.n3
    public boolean hasBidfloorcur() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).hasBidfloorcur();
    }

    @Override // com.moloco.sdk.n3
    public boolean hasId() {
        return ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).hasId();
    }

    public m3 setAt(l3 l3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setAt(l3Var);
        return this;
    }

    public m3 setBidfloor(double d10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setBidfloor(d10);
        return this;
    }

    public m3 setBidfloorcur(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setBidfloorcur(str);
        return this;
    }

    public m3 setBidfloorcurBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setBidfloorcurBytes(byteString);
        return this;
    }

    public m3 setId(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setId(str);
        return this;
    }

    public m3 setIdBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setIdBytes(byteString);
        return this;
    }

    public m3 setWadomain(int i10, String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setWadomain(i10, str);
        return this;
    }

    public m3 setWseat(int i10, String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Pmp.Deal) this.instance).setWseat(i10, str);
        return this;
    }
}
