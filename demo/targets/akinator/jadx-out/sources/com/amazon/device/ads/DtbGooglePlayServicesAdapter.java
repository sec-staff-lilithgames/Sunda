package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbGooglePlayServicesAdapter {
    public static DtbGooglePlayServicesAdapter newAdapter() {
        return new DtbGooglePlayServicesAdapter();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.device.ads.DtbGooglePlayServices.AdvertisingInfo getAdvertisingIdentifierInfo() {
        /*
            r5 = this;
            android.content.Context r0 = com.amazon.device.ads.AdRegistration.getContext()     // Catch: java.lang.Exception -> L9 java.lang.IllegalArgumentException -> Lb com.google.android.gms.common.GooglePlayServicesRepairableException -> Ld com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Lf java.io.IOException -> L11 java.lang.IllegalStateException -> L13
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch: java.lang.Exception -> L9 java.lang.IllegalArgumentException -> Lb com.google.android.gms.common.GooglePlayServicesRepairableException -> Ld com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Lf java.io.IOException -> L11 java.lang.IllegalStateException -> L13
            goto L55
        L9:
            r0 = move-exception
            goto L15
        Lb:
            r0 = move-exception
            goto L1f
        Ld:
            r0 = move-exception
            goto L29
        Lf:
            r0 = move-exception
            goto L33
        L11:
            r0 = move-exception
            goto L41
        L13:
            r0 = move-exception
            goto L4b
        L15:
            com.amazon.aps.shared.analytics.APSEventSeverity r1 = com.amazon.aps.shared.analytics.APSEventSeverity.FATAL
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            java.lang.String r3 = "Exception Occurred while retrieve Google Play Services Advertising Identifier"
            com.amazon.aps.shared.APSAnalytics.logEvent(r1, r2, r3, r0)
            goto L54
        L1f:
            com.amazon.aps.shared.analytics.APSEventSeverity r1 = com.amazon.aps.shared.analytics.APSEventSeverity.FATAL
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            java.lang.String r3 = "Illegal Argument passed to getAdvertisingIdInfo"
            com.amazon.aps.shared.APSAnalytics.logEvent(r1, r2, r3, r0)
            goto L54
        L29:
            com.amazon.aps.shared.analytics.APSEventSeverity r1 = com.amazon.aps.shared.analytics.APSEventSeverity.FATAL
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            java.lang.String r3 = "Retrieving the Google Play Services Advertising Identifier caused a GooglePlayServicesRepairableException."
            com.amazon.aps.shared.APSAnalytics.logEvent(r1, r2, r3, r0)
            goto L54
        L33:
            com.amazon.aps.shared.analytics.APSEventSeverity r1 = com.amazon.aps.shared.analytics.APSEventSeverity.FATAL
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            java.lang.String r3 = "Retrieving the Google Play Services Advertising Identifier caused a GooglePlayServicesNotAvailableException."
            com.amazon.aps.shared.APSAnalytics.logEvent(r1, r2, r3, r0)
            com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo r0 = com.amazon.device.ads.DtbGooglePlayServices.AdvertisingInfo.createNotAvailable()
            return r0
        L41:
            com.amazon.aps.shared.analytics.APSEventSeverity r1 = com.amazon.aps.shared.analytics.APSEventSeverity.FATAL
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            java.lang.String r3 = "Retrieving the Google Play Services Advertising Identifier caused an IOException."
            com.amazon.aps.shared.APSAnalytics.logEvent(r1, r2, r3, r0)
            goto L54
        L4b:
            com.amazon.aps.shared.analytics.APSEventSeverity r1 = com.amazon.aps.shared.analytics.APSEventSeverity.FATAL
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            java.lang.String r3 = "Retrieving the Google Play Services  caused Illegal State Exception ( be sure the call was made from a non-background thread)."
            com.amazon.aps.shared.APSAnalytics.logEvent(r1, r2, r3, r0)
        L54:
            r0 = 0
        L55:
            if (r0 != 0) goto L62
            java.lang.String r0 = "The Google Play Services Advertising Identifier could not be retrieved."
            com.amazon.device.ads.DtbLog.debug(r0)
            com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo r0 = new com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo
            r0.<init>()
            return r0
        L62:
            java.lang.String r1 = "The Google Play Services Advertising Identifier was successfully retrieved."
            com.amazon.device.ads.DtbLog.debug(r1)
            java.lang.String r1 = r0.getId()
            boolean r2 = r0.isLimitAdTrackingEnabled()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " Retrieved google ad id "
            r3.<init>(r4)
            java.lang.String r4 = r0.getId()
            r3.append(r4)
            java.lang.String r4 = " and tracking enabled : "
            r3.append(r4)
            boolean r0 = r0.isLimitAdTrackingEnabled()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.amazon.device.ads.DtbLog.debug(r0)
            com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo r0 = new com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo
            r0.<init>()
            com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo r0 = r0.setAdvertisingIdentifier(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo r0 = r0.setLimitAdTrackingEnabled(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DtbGooglePlayServicesAdapter.getAdvertisingIdentifierInfo():com.amazon.device.ads.DtbGooglePlayServices$AdvertisingInfo");
    }
}
