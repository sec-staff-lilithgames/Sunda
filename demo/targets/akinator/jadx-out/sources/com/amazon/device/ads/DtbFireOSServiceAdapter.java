package com.amazon.device.ads;

import android.content.ContentResolver;
import android.provider.Settings;
import com.amazon.device.ads.DtbGooglePlayServices;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbFireOSServiceAdapter {
    public static final String LOG_TAG = "DtbFireOSServiceAdapter";

    public static DtbFireOSServiceAdapter newAdapter() {
        return new DtbFireOSServiceAdapter();
    }

    public DtbGooglePlayServices.AdvertisingInfo getAdvertisingIdentifierInfo() {
        boolean z10;
        try {
            ContentResolver contentResolver = AdRegistration.getContext().getContentResolver();
            int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            String str = LOG_TAG;
            DtbLog.debug(str, " FireID retrieved : " + string);
            if (i10 != 0) {
                DtbLog.debug(str, " Fire device does not allow AdTracking,");
                z10 = true;
            } else {
                z10 = false;
            }
            DtbGooglePlayServices.AdvertisingInfo advertisingInfo = new DtbGooglePlayServices.AdvertisingInfo();
            advertisingInfo.setAdvertisingIdentifier(string);
            advertisingInfo.setLimitAdTrackingEnabled(Boolean.valueOf(z10));
            return advertisingInfo;
        } catch (Settings.SettingNotFoundException e10) {
            DtbLog.debug(LOG_TAG, " Advertising setting not found on this device " + e10.getLocalizedMessage());
            return new DtbGooglePlayServices.AdvertisingInfo();
        } catch (Exception e11) {
            DtbLog.debug(LOG_TAG, " Attempt to retrieve fireID failed. Reason : " + e11.getLocalizedMessage());
            return new DtbGooglePlayServices.AdvertisingInfo();
        }
    }
}
