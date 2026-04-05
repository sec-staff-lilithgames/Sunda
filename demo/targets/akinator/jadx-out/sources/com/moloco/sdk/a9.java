package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a9 extends GeneratedMessageLite.Builder implements b9 {
    public a9 clearEnabled() {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).clearEnabled();
        return this;
    }

    public a9 clearPollingIntervalSeconds() {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).clearPollingIntervalSeconds();
        return this;
    }

    public a9 clearUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).clearUrl();
        return this;
    }

    @Override // com.moloco.sdk.b9
    public boolean getEnabled() {
        return ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).getEnabled();
    }

    @Override // com.moloco.sdk.b9
    public int getPollingIntervalSeconds() {
        return ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).getPollingIntervalSeconds();
    }

    @Override // com.moloco.sdk.b9
    public String getUrl() {
        return ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).getUrl();
    }

    @Override // com.moloco.sdk.b9
    public ByteString getUrlBytes() {
        return ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).getUrlBytes();
    }

    public a9 setEnabled(boolean z10) {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).setEnabled(z10);
        return this;
    }

    public a9 setPollingIntervalSeconds(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).setPollingIntervalSeconds(i10);
        return this;
    }

    public a9 setUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).setUrl(str);
        return this;
    }

    public a9 setUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.OperationalMetricsConfig) this.instance).setUrlBytes(byteString);
        return this;
    }
}
