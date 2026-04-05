package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.Me;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimeoutConfigurations$PreloadConfig {
    private TimeoutConfigurations$AdPreloadConfig audio;
    private TimeoutConfigurations$AdPreloadConfig banner;

    /* renamed from: int, reason: not valid java name */
    private TimeoutConfigurations$AdPreloadConfig f177int;

    /* renamed from: native, reason: not valid java name */
    private TimeoutConfigurations$AdPreloadConfig f178native;

    public TimeoutConfigurations$PreloadConfig() {
        Me.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdPreloadConfig(Me.defaultPreloadBannerPreloadTimeout, Me.defaultPreloadBannerMuttTimeout, Me.defaultPreloadBannerLoadTimeout, Me.defaultPreloadBannerRetryInterval, Me.defaultPreloadBannerMaxRetries);
        this.f177int = new TimeoutConfigurations$AdPreloadConfig(Me.defaultPreloadIntPreloadTimeout, Me.defaultPreloadIntMuttTimeout, Me.defaultPreloadIntloadTimeout, Me.defaultPreloadIntRetryInterval, Me.defaultPreloadIntMaxRetries);
        this.f178native = new TimeoutConfigurations$AdPreloadConfig(Me.defaultPreloadNativePreloadTimeout, Me.defaultPreloadNativeMuttTimeout, Me.defaultPreloadNativeloadTimeout, Me.defaultPreloadNativeRetryInterval, Me.defaultPreloadNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdPreloadConfig(Me.defaultPreloadAudioPreloadTimeout, Me.defaultPreloadAudioMuttTimeout, Me.defaultPreloadAudioloadTimeout, Me.defaultPreloadAudioRetryInterval, Me.defaultPreloadAudioMaxRetries);
    }

    public final TimeoutConfigurations$AdPreloadConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdPreloadConfig getBanner() {
        return this.banner;
    }

    public final TimeoutConfigurations$AdPreloadConfig getInterstitial() {
        return this.f177int;
    }

    public final TimeoutConfigurations$AdPreloadConfig getNative() {
        return this.f178native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.f177int.isValid() && this.f178native.isValid() && this.audio.isValid();
    }
}
