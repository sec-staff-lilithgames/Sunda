package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r8 extends GeneratedMessageLite.Builder implements s8 {
    public r8 clearAppBackgroundTrackingUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).clearAppBackgroundTrackingUrl();
        return this;
    }

    public r8 clearAppForegroundTrackingUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).clearAppForegroundTrackingUrl();
        return this;
    }

    public r8 clearEventCollectionEnabled() {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).clearEventCollectionEnabled();
        return this;
    }

    public r8 clearMrefCollectionEnabled() {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).clearMrefCollectionEnabled();
        return this;
    }

    @Override // com.moloco.sdk.s8
    public String getAppBackgroundTrackingUrl() {
        return ((Init$SDKInitResponse.EventCollectionConfig) this.instance).getAppBackgroundTrackingUrl();
    }

    @Override // com.moloco.sdk.s8
    public ByteString getAppBackgroundTrackingUrlBytes() {
        return ((Init$SDKInitResponse.EventCollectionConfig) this.instance).getAppBackgroundTrackingUrlBytes();
    }

    @Override // com.moloco.sdk.s8
    public String getAppForegroundTrackingUrl() {
        return ((Init$SDKInitResponse.EventCollectionConfig) this.instance).getAppForegroundTrackingUrl();
    }

    @Override // com.moloco.sdk.s8
    public ByteString getAppForegroundTrackingUrlBytes() {
        return ((Init$SDKInitResponse.EventCollectionConfig) this.instance).getAppForegroundTrackingUrlBytes();
    }

    @Override // com.moloco.sdk.s8
    public boolean getEventCollectionEnabled() {
        return ((Init$SDKInitResponse.EventCollectionConfig) this.instance).getEventCollectionEnabled();
    }

    @Override // com.moloco.sdk.s8
    public boolean getMrefCollectionEnabled() {
        return ((Init$SDKInitResponse.EventCollectionConfig) this.instance).getMrefCollectionEnabled();
    }

    public r8 setAppBackgroundTrackingUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).setAppBackgroundTrackingUrl(str);
        return this;
    }

    public r8 setAppBackgroundTrackingUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).setAppBackgroundTrackingUrlBytes(byteString);
        return this;
    }

    public r8 setAppForegroundTrackingUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).setAppForegroundTrackingUrl(str);
        return this;
    }

    public r8 setAppForegroundTrackingUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).setAppForegroundTrackingUrlBytes(byteString);
        return this;
    }

    public r8 setEventCollectionEnabled(boolean z10) {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).setEventCollectionEnabled(z10);
        return this;
    }

    public r8 setMrefCollectionEnabled(boolean z10) {
        copyOnWrite();
        ((Init$SDKInitResponse.EventCollectionConfig) this.instance).setMrefCollectionEnabled(z10);
        return this;
    }
}
