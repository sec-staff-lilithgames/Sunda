package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.Me;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimeoutConfigurations$ABConfig {
    private TimeoutConfigurations$AdABConfig audio;
    private TimeoutConfigurations$AdABConfig banner;

    /* renamed from: int, reason: not valid java name */
    private TimeoutConfigurations$AdABConfig f173int;

    /* renamed from: native, reason: not valid java name */
    private TimeoutConfigurations$AdABConfig f174native;

    public TimeoutConfigurations$ABConfig() {
        Me.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdABConfig(Me.defaultABBannerloadTimeout, Me.defaultABBannerRetryInterval, Me.defaultABBannerMaxRetries);
        this.f173int = new TimeoutConfigurations$AdABConfig(Me.defaultABIntloadTimeout, Me.defaultABIntRetryInterval, Me.defaultABIntMaxRetries);
        this.f174native = new TimeoutConfigurations$AdABConfig(Me.defaultABNativeloadTimeout, Me.defaultABNativeRetryInterval, Me.defaultABNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdABConfig(Me.defaultABAudioloadTimeout, Me.defaultABAudioRetryInterval, Me.defaultABAudioMaxRetries);
    }

    public final TimeoutConfigurations$AdABConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdABConfig getBanner() {
        return this.banner;
    }

    public final TimeoutConfigurations$AdABConfig getInterstitial() {
        return this.f173int;
    }

    public final TimeoutConfigurations$AdABConfig getNative() {
        return this.f174native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.f173int.isValid() && this.f174native.isValid() && this.audio.isValid();
    }
}
