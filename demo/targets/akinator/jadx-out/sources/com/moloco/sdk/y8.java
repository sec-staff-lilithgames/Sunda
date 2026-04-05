package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class y8 extends GeneratedMessageLite.Builder implements z8 {
    public y8 addAllSupportedNetworks(Iterable<? extends h9> iterable) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).addAllSupportedNetworks(iterable);
        return this;
    }

    public y8 addAllSupportedNetworksValue(Iterable<Integer> iterable) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).addAllSupportedNetworksValue(iterable);
        return this;
    }

    public y8 addSupportedNetworks(h9 h9Var) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).addSupportedNetworks(h9Var);
        return this;
    }

    public y8 addSupportedNetworksValue(int i10) {
        ((Init$SDKInitResponse.ILRDConfig) this.instance).addSupportedNetworksValue(i10);
        return this;
    }

    public y8 clearEnabled() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearEnabled();
        return this;
    }

    public y8 clearMaxBatchSize() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearMaxBatchSize();
        return this;
    }

    public y8 clearMaxSessionLen() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearMaxSessionLen();
        return this;
    }

    public y8 clearRawImpUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearRawImpUrl();
        return this;
    }

    public y8 clearRetryCount() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearRetryCount();
        return this;
    }

    public y8 clearSessionExp() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearSessionExp();
        return this;
    }

    public y8 clearSupportedNetworks() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearSupportedNetworks();
        return this;
    }

    public y8 clearUploadInterval() {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).clearUploadInterval();
        return this;
    }

    @Override // com.moloco.sdk.z8
    public boolean getEnabled() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getEnabled();
    }

    @Override // com.moloco.sdk.z8
    public int getMaxBatchSize() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getMaxBatchSize();
    }

    @Override // com.moloco.sdk.z8
    public int getMaxSessionLen() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getMaxSessionLen();
    }

    @Override // com.moloco.sdk.z8
    public String getRawImpUrl() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getRawImpUrl();
    }

    @Override // com.moloco.sdk.z8
    public ByteString getRawImpUrlBytes() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getRawImpUrlBytes();
    }

    @Override // com.moloco.sdk.z8
    public int getRetryCount() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getRetryCount();
    }

    @Override // com.moloco.sdk.z8
    public int getSessionExp() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getSessionExp();
    }

    @Override // com.moloco.sdk.z8
    public h9 getSupportedNetworks(int i10) {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworks(i10);
    }

    @Override // com.moloco.sdk.z8
    public int getSupportedNetworksCount() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksCount();
    }

    @Override // com.moloco.sdk.z8
    public List<h9> getSupportedNetworksList() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksList();
    }

    @Override // com.moloco.sdk.z8
    public int getSupportedNetworksValue(int i10) {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksValue(i10);
    }

    @Override // com.moloco.sdk.z8
    public List<Integer> getSupportedNetworksValueList() {
        return Collections.unmodifiableList(((Init$SDKInitResponse.ILRDConfig) this.instance).getSupportedNetworksValueList());
    }

    @Override // com.moloco.sdk.z8
    public int getUploadInterval() {
        return ((Init$SDKInitResponse.ILRDConfig) this.instance).getUploadInterval();
    }

    public y8 setEnabled(boolean z10) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setEnabled(z10);
        return this;
    }

    public y8 setMaxBatchSize(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setMaxBatchSize(i10);
        return this;
    }

    public y8 setMaxSessionLen(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setMaxSessionLen(i10);
        return this;
    }

    public y8 setRawImpUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setRawImpUrl(str);
        return this;
    }

    public y8 setRawImpUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setRawImpUrlBytes(byteString);
        return this;
    }

    public y8 setRetryCount(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setRetryCount(i10);
        return this;
    }

    public y8 setSessionExp(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setSessionExp(i10);
        return this;
    }

    public y8 setSupportedNetworks(int i10, h9 h9Var) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setSupportedNetworks(i10, h9Var);
        return this;
    }

    public y8 setSupportedNetworksValue(int i10, int i11) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setSupportedNetworksValue(i10, i11);
        return this;
    }

    public y8 setUploadInterval(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.ILRDConfig) this.instance).setUploadInterval(i10);
        return this;
    }
}
