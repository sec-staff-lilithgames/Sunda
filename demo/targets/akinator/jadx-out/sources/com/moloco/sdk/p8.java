package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p8 extends GeneratedMessageLite.Builder implements q8 {
    public p8 clearEnabled() {
        copyOnWrite();
        ((Init$SDKInitResponse.CrashReportingConfig) this.instance).clearEnabled();
        return this;
    }

    public p8 clearUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse.CrashReportingConfig) this.instance).clearUrl();
        return this;
    }

    @Override // com.moloco.sdk.q8
    public boolean getEnabled() {
        return ((Init$SDKInitResponse.CrashReportingConfig) this.instance).getEnabled();
    }

    @Override // com.moloco.sdk.q8
    public String getUrl() {
        return ((Init$SDKInitResponse.CrashReportingConfig) this.instance).getUrl();
    }

    @Override // com.moloco.sdk.q8
    public ByteString getUrlBytes() {
        return ((Init$SDKInitResponse.CrashReportingConfig) this.instance).getUrlBytes();
    }

    public p8 setEnabled(boolean z10) {
        copyOnWrite();
        ((Init$SDKInitResponse.CrashReportingConfig) this.instance).setEnabled(z10);
        return this;
    }

    public p8 setUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.CrashReportingConfig) this.instance).setUrl(str);
        return this;
    }

    public p8 setUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.CrashReportingConfig) this.instance).setUrlBytes(byteString);
        return this;
    }
}
