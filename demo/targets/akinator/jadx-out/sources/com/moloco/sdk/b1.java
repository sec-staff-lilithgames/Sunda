package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b1 extends GeneratedMessageLite.ExtendableBuilder implements h1 {
    public b1 addAllApi(Iterable<? extends d0> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addAllApi(iterable);
        return this;
    }

    public b1 addAllBattr(Iterable<? extends r1> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addAllBattr(iterable);
        return this;
    }

    public b1 addAllBtype(Iterable<? extends a1> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addAllBtype(iterable);
        return this;
    }

    public b1 addAllExpdir(Iterable<? extends e1> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addAllExpdir(iterable);
        return this;
    }

    public b1 addAllFormat(Iterable<? extends BidRequest$SdkBidRequest.Imp.Banner.Format> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addAllFormat(iterable);
        return this;
    }

    public b1 addAllMimes(Iterable<String> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addAllMimes(iterable);
        return this;
    }

    public b1 addApi(d0 d0Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addApi(d0Var);
        return this;
    }

    public b1 addBattr(r1 r1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addBattr(r1Var);
        return this;
    }

    public b1 addBtype(a1 a1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addBtype(a1Var);
        return this;
    }

    public b1 addExpdir(e1 e1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addExpdir(e1Var);
        return this;
    }

    public b1 addFormat(BidRequest$SdkBidRequest.Imp.Banner.Format format) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addFormat(format);
        return this;
    }

    public b1 addMimes(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addMimes(str);
        return this;
    }

    public b1 addMimesBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addMimesBytes(byteString);
        return this;
    }

    public b1 clearApi() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearApi();
        return this;
    }

    public b1 clearBattr() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearBattr();
        return this;
    }

    public b1 clearBtype() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearBtype();
        return this;
    }

    public b1 clearExpdir() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearExpdir();
        return this;
    }

    public b1 clearFormat() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearFormat();
        return this;
    }

    public b1 clearH() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearH();
        return this;
    }

    @Deprecated
    public b1 clearHmax() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearHmax();
        return this;
    }

    @Deprecated
    public b1 clearHmin() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearHmin();
        return this;
    }

    public b1 clearId() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearId();
        return this;
    }

    public b1 clearMimes() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearMimes();
        return this;
    }

    public b1 clearPos() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearPos();
        return this;
    }

    public b1 clearTopframe() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearTopframe();
        return this;
    }

    public b1 clearVcm() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearVcm();
        return this;
    }

    public b1 clearW() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearW();
        return this;
    }

    @Deprecated
    public b1 clearWmax() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearWmax();
        return this;
    }

    @Deprecated
    public b1 clearWmin() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).clearWmin();
        return this;
    }

    @Override // com.moloco.sdk.h1
    public d0 getApi(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getApi(i10);
    }

    @Override // com.moloco.sdk.h1
    public int getApiCount() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getApiCount();
    }

    @Override // com.moloco.sdk.h1
    public List<d0> getApiList() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getApiList();
    }

    @Override // com.moloco.sdk.h1
    public r1 getBattr(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getBattr(i10);
    }

    @Override // com.moloco.sdk.h1
    public int getBattrCount() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getBattrCount();
    }

    @Override // com.moloco.sdk.h1
    public List<r1> getBattrList() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getBattrList();
    }

    @Override // com.moloco.sdk.h1
    public a1 getBtype(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getBtype(i10);
    }

    @Override // com.moloco.sdk.h1
    public int getBtypeCount() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getBtypeCount();
    }

    @Override // com.moloco.sdk.h1
    public List<a1> getBtypeList() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getBtypeList();
    }

    @Override // com.moloco.sdk.h1
    public e1 getExpdir(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getExpdir(i10);
    }

    @Override // com.moloco.sdk.h1
    public int getExpdirCount() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getExpdirCount();
    }

    @Override // com.moloco.sdk.h1
    public List<e1> getExpdirList() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getExpdirList();
    }

    @Override // com.moloco.sdk.h1
    public BidRequest$SdkBidRequest.Imp.Banner.Format getFormat(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getFormat(i10);
    }

    @Override // com.moloco.sdk.h1
    public int getFormatCount() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getFormatCount();
    }

    @Override // com.moloco.sdk.h1
    public List<BidRequest$SdkBidRequest.Imp.Banner.Format> getFormatList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getFormatList());
    }

    @Override // com.moloco.sdk.h1
    public int getH() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getH();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public int getHmax() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getHmax();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public int getHmin() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getHmin();
    }

    @Override // com.moloco.sdk.h1
    public String getId() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getId();
    }

    @Override // com.moloco.sdk.h1
    public ByteString getIdBytes() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.h1
    public String getMimes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getMimes(i10);
    }

    @Override // com.moloco.sdk.h1
    public ByteString getMimesBytes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getMimesBytes(i10);
    }

    @Override // com.moloco.sdk.h1
    public int getMimesCount() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getMimesCount();
    }

    @Override // com.moloco.sdk.h1
    public List<String> getMimesList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getMimesList());
    }

    @Override // com.moloco.sdk.h1
    public g0 getPos() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getPos();
    }

    @Override // com.moloco.sdk.h1
    public boolean getTopframe() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getTopframe();
    }

    @Override // com.moloco.sdk.h1
    public boolean getVcm() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getVcm();
    }

    @Override // com.moloco.sdk.h1
    public int getW() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getW();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public int getWmax() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getWmax();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public int getWmin() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).getWmin();
    }

    @Override // com.moloco.sdk.h1
    public boolean hasH() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasH();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public boolean hasHmax() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasHmax();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public boolean hasHmin() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasHmin();
    }

    @Override // com.moloco.sdk.h1
    public boolean hasId() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasId();
    }

    @Override // com.moloco.sdk.h1
    public boolean hasPos() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasPos();
    }

    @Override // com.moloco.sdk.h1
    public boolean hasTopframe() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasTopframe();
    }

    @Override // com.moloco.sdk.h1
    public boolean hasVcm() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasVcm();
    }

    @Override // com.moloco.sdk.h1
    public boolean hasW() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasW();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public boolean hasWmax() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasWmax();
    }

    @Override // com.moloco.sdk.h1
    @Deprecated
    public boolean hasWmin() {
        return ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).hasWmin();
    }

    public b1 removeFormat(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).removeFormat(i10);
        return this;
    }

    public b1 setApi(int i10, d0 d0Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setApi(i10, d0Var);
        return this;
    }

    public b1 setBattr(int i10, r1 r1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setBattr(i10, r1Var);
        return this;
    }

    public b1 setBtype(int i10, a1 a1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setBtype(i10, a1Var);
        return this;
    }

    public b1 setExpdir(int i10, e1 e1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setExpdir(i10, e1Var);
        return this;
    }

    public b1 setFormat(int i10, BidRequest$SdkBidRequest.Imp.Banner.Format format) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setFormat(i10, format);
        return this;
    }

    public b1 setH(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setH(i10);
        return this;
    }

    @Deprecated
    public b1 setHmax(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setHmax(i10);
        return this;
    }

    @Deprecated
    public b1 setHmin(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setHmin(i10);
        return this;
    }

    public b1 setId(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setId(str);
        return this;
    }

    public b1 setIdBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setIdBytes(byteString);
        return this;
    }

    public b1 setMimes(int i10, String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setMimes(i10, str);
        return this;
    }

    public b1 setPos(g0 g0Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setPos(g0Var);
        return this;
    }

    public b1 setTopframe(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setTopframe(z10);
        return this;
    }

    public b1 setVcm(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setVcm(z10);
        return this;
    }

    public b1 setW(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setW(i10);
        return this;
    }

    @Deprecated
    public b1 setWmax(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setWmax(i10);
        return this;
    }

    @Deprecated
    public b1 setWmin(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setWmin(i10);
        return this;
    }

    public b1 addFormat(int i10, BidRequest$SdkBidRequest.Imp.Banner.Format format) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addFormat(i10, format);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1 setFormat(int i10, f1 f1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).setFormat(i10, (BidRequest$SdkBidRequest.Imp.Banner.Format) f1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1 addFormat(f1 f1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addFormat((BidRequest$SdkBidRequest.Imp.Banner.Format) f1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1 addFormat(int i10, f1 f1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp.Banner) this.instance).addFormat(i10, (BidRequest$SdkBidRequest.Imp.Banner.Format) f1Var.build());
        return this;
    }
}
