package com.amazon.device.ads;

import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.device.ads.DtbGooglePlayServices;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class DtbAdvertisingInfo {
    public static final String LOG_TAG = "DtbAdvertisingInfo";

    public DtbAdvertisingInfo() {
        if (AdRegistration.getContext() != null) {
            initializeAdvertisingInfo();
        } else {
            DtbLog.debugError("unable to initialize advertising info without setting app context");
            throw new IllegalArgumentException("unable to initialize advertising info without setting app context");
        }
    }

    private void initializeAdvertisingInfo() {
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            DtbLog.debug("Initializing advertising info using Google Play Service");
            DtbGooglePlayServices.AdvertisingInfo advertisingIdentifierInfo = new DtbGooglePlayServices().getAdvertisingIdentifierInfo();
            String advertisingIdentifier = advertisingIdentifierInfo.getAdvertisingIdentifier();
            String idfa = DtbSharedPreferences.getInstance().getIdfa();
            if (advertisingIdentifierInfo.hasAdvertisingIdentifier() && !DtbCommonUtils.isNullOrEmpty(advertisingIdentifier)) {
                if (DtbCommonUtils.isNullOrEmpty(idfa)) {
                    setIsAdvertisingIdentifierNew(true);
                    DtbLog.debug("Advertising identifier is new. Idfa=" + advertisingIdentifier);
                } else if (!DtbCommonUtils.isNullOrEmpty(idfa) && !idfa.equals(advertisingIdentifier)) {
                    setIsAdvertisingIdentifierChanged(true);
                    DtbLog.debug("Advertising identifier has changed. CurrentIdfa=" + advertisingIdentifier + " storedIdfa=" + idfa);
                }
            }
            if (!advertisingIdentifierInfo.hasAdvertisingIdentifier() && !DtbCommonUtils.isNullOrEmpty(idfa)) {
                setIsAdvertisingIdentifierNew(true);
            }
            if (!DtbCommonUtils.isNullOrEmpty(advertisingIdentifier)) {
                DtbSharedPreferences.getInstance().saveIdfa(advertisingIdentifier);
            }
            if (advertisingIdentifierInfo.isLimitAdTrackingEnabled() != null) {
                DtbSharedPreferences.getInstance().saveOptOut(advertisingIdentifierInfo.isLimitAdTrackingEnabled());
            }
            DtbLog.info(LOG_TAG, "Advertising identifier intialization process complete");
            DtbLog.debug("Google AdId intialized using Google Play Service. AdvertisingIdentifier=" + advertisingIdentifier + " isLimitAdTrackingEnabled=" + advertisingIdentifierInfo.isLimitAdTrackingEnabled());
        }
    }

    private void setIsAdvertisingIdentifierChanged(boolean z10) {
        DtbSharedPreferences.getInstance().saveIsAdIdChanged(z10);
    }

    private void setIsAdvertisingIdentifierNew(boolean z10) {
        DtbSharedPreferences.getInstance().saveIsAdIdNew(z10);
    }
}
