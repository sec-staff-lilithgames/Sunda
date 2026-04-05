package com.amazon.device.ads;

import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbGooglePlayServices {
    public static final String LOG_TAG = "DtbGooglePlayServices";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class AdvertisingInfo {
        public String advertisingIdentifier;
        public boolean gpsAvailable = true;
        public Boolean limitAdTrackingEnabled;

        public static AdvertisingInfo createNotAvailable() {
            return new AdvertisingInfo().setGooglePlayServicesAvailable(false);
        }

        private AdvertisingInfo setGooglePlayServicesAvailable(boolean z10) {
            this.gpsAvailable = z10;
            return this;
        }

        public String getAdvertisingIdentifier() {
            if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
                return this.advertisingIdentifier;
            }
            return null;
        }

        public boolean hasAdvertisingIdentifier() {
            return getAdvertisingIdentifier() != null;
        }

        public boolean isGooglePlayServicesAvailable() {
            return this.gpsAvailable;
        }

        public Boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        public AdvertisingInfo setAdvertisingIdentifier(String str) {
            this.advertisingIdentifier = str;
            return this;
        }

        public AdvertisingInfo setLimitAdTrackingEnabled(Boolean bool) {
            this.limitAdTrackingEnabled = bool;
            return this;
        }
    }

    private boolean isAdvertisingClassAvailable() {
        return DtbCommonUtils.isClassAvailable("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    public AdvertisingInfo getAdvertisingIdentifierInfo() {
        if (isAdvertisingClassAvailable()) {
            AdvertisingInfo advertisingIdentifierInfo = DtbGooglePlayServicesAdapter.newAdapter().getAdvertisingIdentifierInfo();
            if (advertisingIdentifierInfo.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo.getAdvertisingIdentifier().isEmpty()) {
                return advertisingIdentifierInfo;
            }
        }
        AdvertisingInfo advertisingIdentifierInfo2 = DtbFireOSServiceAdapter.newAdapter().getAdvertisingIdentifierInfo();
        if (advertisingIdentifierInfo2.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo2.getAdvertisingIdentifier().isEmpty()) {
            return advertisingIdentifierInfo2;
        }
        DtbLog.error(LOG_TAG, "The Google Play Services Advertising Identifier feature is not available. Please include the google dependency / check the proguard rule");
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "The Google Play Services Advertising Identifier feature is not available");
        return AdvertisingInfo.createNotAvailable();
    }
}
