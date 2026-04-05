package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i1 extends GeneratedMessageLite.ExtendableBuilder implements v4 {
    public i1 addAllIframebuster(Iterable<String> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addAllIframebuster(iterable);
        return this;
    }

    public i1 addAllMetric(Iterable<? extends BidRequest$SdkBidRequest.Imp.Metric> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addAllMetric(iterable);
        return this;
    }

    public i1 addIframebuster(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addIframebuster(str);
        return this;
    }

    public i1 addIframebusterBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addIframebusterBytes(byteString);
        return this;
    }

    public i1 addMetric(BidRequest$SdkBidRequest.Imp.Metric metric2) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addMetric(metric2);
        return this;
    }

    public i1 clearAudio() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearAudio();
        return this;
    }

    public i1 clearBanner() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearBanner();
        return this;
    }

    public i1 clearBidfloor() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearBidfloor();
        return this;
    }

    public i1 clearBidfloorcur() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearBidfloorcur();
        return this;
    }

    public i1 clearClickbrowser() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearClickbrowser();
        return this;
    }

    public i1 clearDisplaymanager() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearDisplaymanager();
        return this;
    }

    public i1 clearDisplaymanagerver() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearDisplaymanagerver();
        return this;
    }

    public i1 clearExp() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearExp();
        return this;
    }

    public i1 clearId() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearId();
        return this;
    }

    public i1 clearIframebuster() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearIframebuster();
        return this;
    }

    public i1 clearInstl() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearInstl();
        return this;
    }

    public i1 clearMetric() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearMetric();
        return this;
    }

    public i1 clearNative() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearNative();
        return this;
    }

    public i1 clearPmp() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearPmp();
        return this;
    }

    public i1 clearRwdd() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearRwdd();
        return this;
    }

    public i1 clearSecure() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearSecure();
        return this;
    }

    public i1 clearSsai() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearSsai();
        return this;
    }

    public i1 clearTagid() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearTagid();
        return this;
    }

    public i1 clearVideo() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).clearVideo();
        return this;
    }

    @Override // com.moloco.sdk.v4
    public BidRequest$SdkBidRequest.Imp.Audio getAudio() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getAudio();
    }

    @Override // com.moloco.sdk.v4
    public BidRequest$SdkBidRequest.Imp.Banner getBanner() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getBanner();
    }

    @Override // com.moloco.sdk.v4
    public double getBidfloor() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getBidfloor();
    }

    @Override // com.moloco.sdk.v4
    public String getBidfloorcur() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getBidfloorcur();
    }

    @Override // com.moloco.sdk.v4
    public ByteString getBidfloorcurBytes() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getBidfloorcurBytes();
    }

    @Override // com.moloco.sdk.v4
    public boolean getClickbrowser() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getClickbrowser();
    }

    @Override // com.moloco.sdk.v4
    public String getDisplaymanager() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getDisplaymanager();
    }

    @Override // com.moloco.sdk.v4
    public ByteString getDisplaymanagerBytes() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getDisplaymanagerBytes();
    }

    @Override // com.moloco.sdk.v4
    public String getDisplaymanagerver() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getDisplaymanagerver();
    }

    @Override // com.moloco.sdk.v4
    public ByteString getDisplaymanagerverBytes() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getDisplaymanagerverBytes();
    }

    @Override // com.moloco.sdk.v4
    public int getExp() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getExp();
    }

    @Override // com.moloco.sdk.v4
    public String getId() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getId();
    }

    @Override // com.moloco.sdk.v4
    public ByteString getIdBytes() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getIdBytes();
    }

    @Override // com.moloco.sdk.v4
    public String getIframebuster(int i10) {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getIframebuster(i10);
    }

    @Override // com.moloco.sdk.v4
    public ByteString getIframebusterBytes(int i10) {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getIframebusterBytes(i10);
    }

    @Override // com.moloco.sdk.v4
    public int getIframebusterCount() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getIframebusterCount();
    }

    @Override // com.moloco.sdk.v4
    public List<String> getIframebusterList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp) this.instance).getIframebusterList());
    }

    @Override // com.moloco.sdk.v4
    public boolean getInstl() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getInstl();
    }

    @Override // com.moloco.sdk.v4
    public BidRequest$SdkBidRequest.Imp.Metric getMetric(int i10) {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getMetric(i10);
    }

    @Override // com.moloco.sdk.v4
    public int getMetricCount() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getMetricCount();
    }

    @Override // com.moloco.sdk.v4
    public List<BidRequest$SdkBidRequest.Imp.Metric> getMetricList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Imp) this.instance).getMetricList());
    }

    @Override // com.moloco.sdk.v4
    public BidRequest$SdkBidRequest.Imp.Native getNative() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getNative();
    }

    @Override // com.moloco.sdk.v4
    public BidRequest$SdkBidRequest.Imp.Pmp getPmp() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getPmp();
    }

    @Override // com.moloco.sdk.v4
    public boolean getRwdd() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getRwdd();
    }

    @Override // com.moloco.sdk.v4
    public boolean getSecure() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getSecure();
    }

    @Override // com.moloco.sdk.v4
    public x3 getSsai() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getSsai();
    }

    @Override // com.moloco.sdk.v4
    public String getTagid() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getTagid();
    }

    @Override // com.moloco.sdk.v4
    public ByteString getTagidBytes() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getTagidBytes();
    }

    @Override // com.moloco.sdk.v4
    public BidRequest$SdkBidRequest.Imp.Video getVideo() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).getVideo();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasAudio() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasAudio();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasBanner() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasBanner();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasBidfloor() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasBidfloor();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasBidfloorcur() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasBidfloorcur();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasClickbrowser() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasClickbrowser();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasDisplaymanager() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasDisplaymanager();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasDisplaymanagerver() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasDisplaymanagerver();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasExp() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasExp();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasId() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasId();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasInstl() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasInstl();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasNative() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasNative();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasPmp() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasPmp();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasRwdd() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasRwdd();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasSecure() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasSecure();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasSsai() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasSsai();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasTagid() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasTagid();
    }

    @Override // com.moloco.sdk.v4
    public boolean hasVideo() {
        return ((BidRequest$SdkBidRequest.Imp) this.instance).hasVideo();
    }

    public i1 mergeAudio(BidRequest$SdkBidRequest.Imp.Audio audio) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).mergeAudio(audio);
        return this;
    }

    public i1 mergeBanner(BidRequest$SdkBidRequest.Imp.Banner banner) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).mergeBanner(banner);
        return this;
    }

    public i1 mergeNative(BidRequest$SdkBidRequest.Imp.Native r22) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).mergeNative(r22);
        return this;
    }

    public i1 mergePmp(BidRequest$SdkBidRequest.Imp.Pmp pmp) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).mergePmp(pmp);
        return this;
    }

    public i1 mergeVideo(BidRequest$SdkBidRequest.Imp.Video video) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).mergeVideo(video);
        return this;
    }

    public i1 removeMetric(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).removeMetric(i10);
        return this;
    }

    public i1 setAudio(BidRequest$SdkBidRequest.Imp.Audio audio) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setAudio(audio);
        return this;
    }

    public i1 setBanner(BidRequest$SdkBidRequest.Imp.Banner banner) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setBanner(banner);
        return this;
    }

    public i1 setBidfloor(double d10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setBidfloor(d10);
        return this;
    }

    public i1 setBidfloorcur(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setBidfloorcur(str);
        return this;
    }

    public i1 setBidfloorcurBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setBidfloorcurBytes(byteString);
        return this;
    }

    public i1 setClickbrowser(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setClickbrowser(z10);
        return this;
    }

    public i1 setDisplaymanager(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setDisplaymanager(str);
        return this;
    }

    public i1 setDisplaymanagerBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setDisplaymanagerBytes(byteString);
        return this;
    }

    public i1 setDisplaymanagerver(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setDisplaymanagerver(str);
        return this;
    }

    public i1 setDisplaymanagerverBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setDisplaymanagerverBytes(byteString);
        return this;
    }

    public i1 setExp(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setExp(i10);
        return this;
    }

    public i1 setId(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setId(str);
        return this;
    }

    public i1 setIdBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setIdBytes(byteString);
        return this;
    }

    public i1 setIframebuster(int i10, String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setIframebuster(i10, str);
        return this;
    }

    public i1 setInstl(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setInstl(z10);
        return this;
    }

    public i1 setMetric(int i10, BidRequest$SdkBidRequest.Imp.Metric metric2) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setMetric(i10, metric2);
        return this;
    }

    public i1 setNative(BidRequest$SdkBidRequest.Imp.Native r22) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setNative(r22);
        return this;
    }

    public i1 setPmp(BidRequest$SdkBidRequest.Imp.Pmp pmp) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setPmp(pmp);
        return this;
    }

    public i1 setRwdd(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setRwdd(z10);
        return this;
    }

    public i1 setSecure(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setSecure(z10);
        return this;
    }

    public i1 setSsai(x3 x3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setSsai(x3Var);
        return this;
    }

    public i1 setTagid(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setTagid(str);
        return this;
    }

    public i1 setTagidBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setTagidBytes(byteString);
        return this;
    }

    public i1 setVideo(BidRequest$SdkBidRequest.Imp.Video video) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setVideo(video);
        return this;
    }

    public i1 addMetric(int i10, BidRequest$SdkBidRequest.Imp.Metric metric2) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addMetric(i10, metric2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 setAudio(m0 m0Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setAudio((BidRequest$SdkBidRequest.Imp.Audio) m0Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 setBanner(b1 b1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setBanner((BidRequest$SdkBidRequest.Imp.Banner) b1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 setMetric(int i10, s1 s1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setMetric(i10, (BidRequest$SdkBidRequest.Imp.Metric) s1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 setNative(w1 w1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setNative((BidRequest$SdkBidRequest.Imp.Native) w1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 setPmp(i3 i3Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setPmp((BidRequest$SdkBidRequest.Imp.Pmp) i3Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 setVideo(h4 h4Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).setVideo((BidRequest$SdkBidRequest.Imp.Video) h4Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 addMetric(s1 s1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addMetric((BidRequest$SdkBidRequest.Imp.Metric) s1Var.build());
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 addMetric(int i10, s1 s1Var) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Imp) this.instance).addMetric(i10, (BidRequest$SdkBidRequest.Imp.Metric) s1Var.build());
        return this;
    }
}
