package com.inmobi.media;

import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$MediationConfig;
import java.io.Serializable;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Me implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;
    public static final Ke Companion = new Ke();
    private static final String APPLOVIN_KEY = "c_applovin";
    private static final JSONObject defaultNonABBannerloadTimeout = Ie.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerMuttTimeout = Ie.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABBannerRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntloadTimeout = Ie.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntMuttTimeout = Ie.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABIntRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeloadTimeout = Ie.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeMuttTimeout = Ie.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABNativeRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioloadTimeout = Ie.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioMuttTimeout = Ie.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultNonABAudioRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABBannerloadTimeout = Ie.a(14500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABBannerMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABBannerRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABIntloadTimeout = Ie.a(29500, 29500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABIntMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABIntRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABNativeloadTimeout = Ie.a(14500, 14500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABNativeMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABNativeRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABAudioloadTimeout = Ie.a(14500, 9500, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABAudioMaxRetries = Ie.a(3, 3, "default", APPLOVIN_KEY);
    private static final JSONObject defaultABAudioRetryInterval = Ie.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final JSONObject defaultPreloadBannerPreloadTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadBannerMuttTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadBannerLoadTimeout = He.a("default", 14500);
    private static final JSONObject defaultPreloadBannerMaxRetries = He.a("default", 3);
    private static final JSONObject defaultPreloadBannerRetryInterval = He.a("default", 1000);
    private static final JSONObject defaultPreloadIntPreloadTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadIntMuttTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadIntloadTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadIntMaxRetries = He.a("default", 3);
    private static final JSONObject defaultPreloadIntRetryInterval = He.a("default", 1000);
    private static final JSONObject defaultPreloadNativePreloadTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadNativeMuttTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadNativeloadTimeout = He.a("default", 14500);
    private static final JSONObject defaultPreloadNativeMaxRetries = He.a("default", 3);
    private static final JSONObject defaultPreloadNativeRetryInterval = He.a("default", 1000);
    private static final JSONObject defaultPreloadAudioPreloadTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadAudioMuttTimeout = He.a("default", 29500);
    private static final JSONObject defaultPreloadAudioloadTimeout = He.a("default", 14500);
    private static final JSONObject defaultPreloadAudioMaxRetries = He.a("default", 3);
    private static final JSONObject defaultPreloadAudioRetryInterval = He.a("default", 1000);
    private static final kv.p validator = Je.f31927a;
    private int step4s = 15000;
    private TimeoutConfigurations$MediationConfig mediationConfig = new TimeoutConfigurations$MediationConfig();

    public final TimeoutConfigurations$MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return Y() >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }
}
