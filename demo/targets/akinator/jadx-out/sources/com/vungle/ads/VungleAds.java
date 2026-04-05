package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleAds {
    public static final String TAG = "VungleAds";
    public static final Companion Companion = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void deInit(Context context) {
            e0.checkNotNullParameter(context, "context");
            VungleAds.initializer.deInit$vungle_ads_release();
        }

        public final void getBiddingToken(Context context, BidTokenCallback callback) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(callback, "callback");
            VungleAds.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final void init(Context appContext, String appId, InitializationListener callback) throws Throwable {
            e0.checkNotNullParameter(appContext, "context");
            e0.checkNotNullParameter(appId, "appId");
            e0.checkNotNullParameter(callback, "callback");
            if (!(appContext instanceof Application)) {
                appContext = appContext.getApplicationContext();
            }
            VungleInitializer vungleInitializer = VungleAds.initializer;
            e0.checkNotNullExpressionValue(appContext, "appContext");
            vungleInitializer.init(appId, appContext, callback);
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final boolean isInline(String placementId) {
            e0.checkNotNullParameter(placementId, "placementId");
            Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final void setIntegrationName(VungleWrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
            e0.checkNotNullParameter(wrapperFramework, "wrapperFramework");
            e0.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            VungleAds.initializer.setIntegrationName(wrapperFramework, wrapperFrameworkVersion);
        }

        private Companion() {
        }
    }

    public static final void deInit(Context context) {
        Companion.deInit(context);
    }

    public static final void getBiddingToken(Context context, BidTokenCallback bidTokenCallback) {
        Companion.getBiddingToken(context, bidTokenCallback);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InitializationListener initializationListener) throws Throwable {
        Companion.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isInline(String str) {
        return Companion.isInline(str);
    }

    public static final void setIntegrationName(VungleWrapperFramework vungleWrapperFramework, String str) {
        Companion.setIntegrationName(vungleWrapperFramework, str);
    }
}
