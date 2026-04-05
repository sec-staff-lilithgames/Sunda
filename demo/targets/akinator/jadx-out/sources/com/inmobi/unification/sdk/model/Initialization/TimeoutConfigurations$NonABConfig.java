package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.Me;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimeoutConfigurations$NonABConfig {
    private TimeoutConfigurations$AdNonABConfig audio;
    private TimeoutConfigurations$AdNonABConfig banner;

    /* renamed from: int, reason: not valid java name */
    private TimeoutConfigurations$AdNonABConfig f175int;

    /* renamed from: native, reason: not valid java name */
    private TimeoutConfigurations$AdNonABConfig f176native;

    public TimeoutConfigurations$NonABConfig() {
        Me.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdNonABConfig(Me.defaultNonABBannerloadTimeout, Me.defaultNonABBannerMuttTimeout, Me.defaultNonABBannerRetryInterval, Me.defaultNonABBannerMaxRetries);
        this.f175int = new TimeoutConfigurations$AdNonABConfig(Me.defaultNonABIntloadTimeout, Me.defaultNonABIntMuttTimeout, Me.defaultNonABIntRetryInterval, Me.defaultNonABIntMaxRetries);
        this.f176native = new TimeoutConfigurations$AdNonABConfig(Me.defaultNonABNativeloadTimeout, Me.defaultNonABNativeMuttTimeout, Me.defaultNonABNativeRetryInterval, Me.defaultNonABNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdNonABConfig(Me.defaultNonABAudioloadTimeout, Me.defaultNonABAudioMuttTimeout, Me.defaultNonABAudioRetryInterval, Me.defaultNonABAudioMaxRetries);
    }

    public final TimeoutConfigurations$AdNonABConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdNonABConfig getBanner() {
        return this.banner;
    }

    public final TimeoutConfigurations$AdNonABConfig getInterstitial() {
        return this.f175int;
    }

    public final TimeoutConfigurations$AdNonABConfig getNative() {
        return this.f176native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.f175int.isValid() && this.f176native.isValid() && this.audio.isValid();
    }
}
