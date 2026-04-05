package com.vungle.ads.internal.platform;

import com.vungle.ads.internal.model.AdvertisingInfo;
import w3.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Platform {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private Companion() {
        }
    }

    AdvertisingInfo getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    long getBuildTime();

    String getCarrierName();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    String getUserAgent();

    void getUserAgentLazy(b bVar);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
