package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v extends GeneratedMessageLite.Builder implements z {
    public v addAllBrowsers(Iterable<? extends BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion> iterable) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).addAllBrowsers(iterable);
        return this;
    }

    public v addBrowsers(BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion brandVersion) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).addBrowsers(brandVersion);
        return this;
    }

    public v clearArchitecture() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearArchitecture();
        return this;
    }

    public v clearBitness() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearBitness();
        return this;
    }

    public v clearBrowsers() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearBrowsers();
        return this;
    }

    public v clearMobile() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearMobile();
        return this;
    }

    public v clearModel() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearModel();
        return this;
    }

    public v clearPlatform() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearPlatform();
        return this;
    }

    public v clearSource() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).clearSource();
        return this;
    }

    @Override // com.moloco.sdk.z
    public String getArchitecture() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getArchitecture();
    }

    @Override // com.moloco.sdk.z
    public ByteString getArchitectureBytes() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getArchitectureBytes();
    }

    @Override // com.moloco.sdk.z
    public String getBitness() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getBitness();
    }

    @Override // com.moloco.sdk.z
    public ByteString getBitnessBytes() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getBitnessBytes();
    }

    @Override // com.moloco.sdk.z
    public BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion getBrowsers(int i10) {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getBrowsers(i10);
    }

    @Override // com.moloco.sdk.z
    public int getBrowsersCount() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getBrowsersCount();
    }

    @Override // com.moloco.sdk.z
    public List<BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion> getBrowsersList() {
        return Collections.unmodifiableList(((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getBrowsersList());
    }

    @Override // com.moloco.sdk.z
    public boolean getMobile() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getMobile();
    }

    @Override // com.moloco.sdk.z
    public String getModel() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getModel();
    }

    @Override // com.moloco.sdk.z
    public ByteString getModelBytes() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getModelBytes();
    }

    @Override // com.moloco.sdk.z
    public BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion getPlatform() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getPlatform();
    }

    @Override // com.moloco.sdk.z
    public y getSource() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).getSource();
    }

    @Override // com.moloco.sdk.z
    public boolean hasArchitecture() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).hasArchitecture();
    }

    @Override // com.moloco.sdk.z
    public boolean hasBitness() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).hasBitness();
    }

    @Override // com.moloco.sdk.z
    public boolean hasMobile() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).hasMobile();
    }

    @Override // com.moloco.sdk.z
    public boolean hasModel() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).hasModel();
    }

    @Override // com.moloco.sdk.z
    public boolean hasPlatform() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).hasPlatform();
    }

    @Override // com.moloco.sdk.z
    public boolean hasSource() {
        return ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).hasSource();
    }

    public v mergePlatform(BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion brandVersion) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).mergePlatform(brandVersion);
        return this;
    }

    public v removeBrowsers(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).removeBrowsers(i10);
        return this;
    }

    public v setArchitecture(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setArchitecture(str);
        return this;
    }

    public v setArchitectureBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setArchitectureBytes(byteString);
        return this;
    }

    public v setBitness(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setBitness(str);
        return this;
    }

    public v setBitnessBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setBitnessBytes(byteString);
        return this;
    }

    public v setBrowsers(int i10, BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion brandVersion) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setBrowsers(i10, brandVersion);
        return this;
    }

    public v setMobile(boolean z10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setMobile(z10);
        return this;
    }

    public v setModel(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setModel(str);
        return this;
    }

    public v setModelBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setModelBytes(byteString);
        return this;
    }

    public v setPlatform(BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion brandVersion) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setPlatform(brandVersion);
        return this;
    }

    public v setSource(y yVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setSource(yVar);
        return this;
    }

    public v addBrowsers(int i10, BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion brandVersion) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).addBrowsers(i10, brandVersion);
        return this;
    }

    public v setBrowsers(int i10, t tVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setBrowsers(i10, (BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) tVar.build());
        return this;
    }

    public v setPlatform(t tVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).setPlatform((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) tVar.build());
        return this;
    }

    public v addBrowsers(t tVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).addBrowsers((BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) tVar.build());
        return this;
    }

    public v addBrowsers(int i10, t tVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.UserAgent) this.instance).addBrowsers(i10, (BidRequest$SdkBidRequest.Device.UserAgent.BrandVersion) tVar.build());
        return this;
    }
}
