package com.inmobi.unification.sdk.model.Initialization;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimeoutConfigurations$MediationConfig {

    /* renamed from: ab, reason: collision with root package name */
    private TimeoutConfigurations$ABConfig f33732ab = new TimeoutConfigurations$ABConfig();
    private TimeoutConfigurations$NonABConfig nonAb = new TimeoutConfigurations$NonABConfig();
    private TimeoutConfigurations$PreloadConfig preload = new TimeoutConfigurations$PreloadConfig();

    public final TimeoutConfigurations$ABConfig getABConfig() {
        return this.f33732ab;
    }

    public final TimeoutConfigurations$NonABConfig getNonABConfig() {
        return this.nonAb;
    }

    public final TimeoutConfigurations$PreloadConfig getPreloadConfig() {
        return this.preload;
    }

    public final boolean isValid() {
        return this.f33732ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
    }
}
