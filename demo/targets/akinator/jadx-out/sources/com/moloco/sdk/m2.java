package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m2 extends GeneratedMessageLite.ExtendableBuilder implements f3 {
    public m2 addAllAssets(Iterable<? extends BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addAllAssets(iterable);
        return this;
    }

    public m2 addAllEventtrackers(Iterable<? extends BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addAllEventtrackers(iterable);
        return this;
    }

    public m2 addAssets(BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset asset) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addAssets(asset);
        return this;
    }

    public m2 addEventtrackers(BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers eventTrackers) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addEventtrackers(eventTrackers);
        return this;
    }

    public m2 clearAssets() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearAssets();
        return this;
    }

    public m2 clearAurlsupport() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearAurlsupport();
        return this;
    }

    public m2 clearContext() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearContext();
        return this;
    }

    public m2 clearContextsubtype() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearContextsubtype();
        return this;
    }

    public m2 clearDurlsupport() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearDurlsupport();
        return this;
    }

    public m2 clearEventtrackers() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearEventtrackers();
        return this;
    }

    public m2 clearPlcmtcnt() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearPlcmtcnt();
        return this;
    }

    public m2 clearPlcmttype() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearPlcmttype();
        return this;
    }

    public m2 clearPrivacy() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearPrivacy();
        return this;
    }

    public m2 clearSeq() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearSeq();
        return this;
    }

    public m2 clearVer() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).clearVer();
        return this;
    }

    @Override // com.moloco.sdk.f3
    public BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset getAssets(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getAssets(i10);
    }

    @Override // com.moloco.sdk.f3
    public int getAssetsCount() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getAssetsCount();
    }

    @Override // com.moloco.sdk.f3
    public List<BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset> getAssetsList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getAssetsList());
    }

    @Override // com.moloco.sdk.f3
    public boolean getAurlsupport() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getAurlsupport();
    }

    @Override // com.moloco.sdk.f3
    public s2 getContext() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getContext();
    }

    @Override // com.moloco.sdk.f3
    public p2 getContextsubtype() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getContextsubtype();
    }

    @Override // com.moloco.sdk.f3
    public boolean getDurlsupport() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getDurlsupport();
    }

    @Override // com.moloco.sdk.f3
    public BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers getEventtrackers(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getEventtrackers(i10);
    }

    @Override // com.moloco.sdk.f3
    public int getEventtrackersCount() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getEventtrackersCount();
    }

    @Override // com.moloco.sdk.f3
    public List<BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers> getEventtrackersList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getEventtrackersList());
    }

    @Override // com.moloco.sdk.f3
    public int getPlcmtcnt() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getPlcmtcnt();
    }

    @Override // com.moloco.sdk.f3
    public e3 getPlcmttype() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getPlcmttype();
    }

    @Override // com.moloco.sdk.f3
    public boolean getPrivacy() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getPrivacy();
    }

    @Override // com.moloco.sdk.f3
    public int getSeq() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getSeq();
    }

    @Override // com.moloco.sdk.f3
    public String getVer() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getVer();
    }

    @Override // com.moloco.sdk.f3
    public ByteString getVerBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).getVerBytes();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasAurlsupport() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasAurlsupport();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasContext() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasContext();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasContextsubtype() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasContextsubtype();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasDurlsupport() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasDurlsupport();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasPlcmtcnt() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasPlcmtcnt();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasPlcmttype() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasPlcmttype();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasPrivacy() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasPrivacy();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasSeq() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasSeq();
    }

    @Override // com.moloco.sdk.f3
    public boolean hasVer() {
        return ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).hasVer();
    }

    public m2 removeAssets(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).removeAssets(i10);
        return this;
    }

    public m2 removeEventtrackers(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).removeEventtrackers(i10);
        return this;
    }

    public m2 setAssets(int i10, BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset asset) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setAssets(i10, asset);
        return this;
    }

    public m2 setAurlsupport(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setAurlsupport(z10);
        return this;
    }

    public m2 setContext(s2 s2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setContext(s2Var);
        return this;
    }

    public m2 setContextsubtype(p2 p2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setContextsubtype(p2Var);
        return this;
    }

    public m2 setDurlsupport(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setDurlsupport(z10);
        return this;
    }

    public m2 setEventtrackers(int i10, BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers eventTrackers) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setEventtrackers(i10, eventTrackers);
        return this;
    }

    public m2 setPlcmtcnt(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setPlcmtcnt(i10);
        return this;
    }

    public m2 setPlcmttype(e3 e3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setPlcmttype(e3Var);
        return this;
    }

    public m2 setPrivacy(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setPrivacy(z10);
        return this;
    }

    public m2 setSeq(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setSeq(i10);
        return this;
    }

    public m2 setVer(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setVer(str);
        return this;
    }

    public m2 setVerBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setVerBytes(byteString);
        return this;
    }

    public m2 addAssets(int i10, BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset asset) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addAssets(i10, asset);
        return this;
    }

    public m2 addEventtrackers(int i10, BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers eventTrackers) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addEventtrackers(i10, eventTrackers);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2 setAssets(int i10, y1 y1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setAssets(i10, (BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset) y1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2 setEventtrackers(int i10, u2 u2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).setEventtrackers(i10, (BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) u2Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2 addAssets(y1 y1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addAssets((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset) y1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2 addEventtrackers(u2 u2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addEventtrackers((BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) u2Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2 addAssets(int i10, y1 y1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addAssets(i10, (BidRequest$SdkBidRequest.Imp.Native.NativeRequest.Asset) y1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2 addEventtrackers(int i10, u2 u2Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Native.NativeRequest) this.instance).addEventtrackers(i10, (BidRequest$SdkBidRequest.Imp.Native.NativeRequest.EventTrackers) u2Var.build());
        return this;
    }
}
