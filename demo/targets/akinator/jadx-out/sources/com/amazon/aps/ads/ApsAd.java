package com.amazon.aps.ads;

import android.os.Bundle;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.SDKUtilities;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAd extends DTBAdResponse {
    private static final String INSTREAM_VIDEO_INVENTORY_TYPE = "MOBILE_VIDEO";
    private static final String INTERSTITIAL_VIDEO_INVENTORY_TYPE = "MOBILE_INTERSTITIAL";
    private static final String REWARDED_INVENTORY_TYPE = "MOBILE_APP_REWARDED";
    private WeakReference<ApsAdViewImpl> adViewWeakReference;
    private ApsAdFormat apsAdFormatFromRequest;
    private ApsAdRequest apsAdRequest;
    int height;
    private String slotUuid;
    int width;

    public ApsAd(DTBAdResponse dTBAdResponse) {
        super(dTBAdResponse);
        this.height = -1;
        this.width = -1;
        setApsAdFormatAndSlotUuid(dTBAdResponse);
        setSlotUuid(dTBAdResponse);
    }

    private void setApsAdFormat(ApsAdFormat apsAdFormat) {
        if (apsAdFormat != null) {
            this.apsAdFormatFromRequest = apsAdFormat;
            this.height = ApsAdFormatUtils.getHeight(apsAdFormat);
            this.width = ApsAdFormatUtils.getWidth(apsAdFormat);
        }
    }

    public ApsAdViewImpl getAdView() {
        WeakReference<ApsAdViewImpl> weakReference = this.adViewWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public ApsAdFormat getApsAdFormat() {
        if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_AD_FORMAT_FROM_AAX)) {
            try {
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in parsing the ad format in ApsAd - getApsAdFormat", e10);
            }
            if (isVideo()) {
                return REWARDED_INVENTORY_TYPE.equalsIgnoreCase(this.videoInventoryType) ? ApsAdFormat.REWARDED_VIDEO : INSTREAM_VIDEO_INVENTORY_TYPE.equalsIgnoreCase(this.videoInventoryType) ? ApsAdFormat.INSTREAM_VIDEO : ApsAdFormat.INTERSTITIAL;
            }
            int widthFromAax = this.width;
            if (widthFromAax == -1) {
                widthFromAax = getWidthFromAax();
            }
            this.width = widthFromAax;
            int heightFromAax = this.height;
            if (heightFromAax == -1) {
                heightFromAax = getHeightFromAax();
            }
            this.height = heightFromAax;
            if (heightFromAax == 50 && this.width == 320) {
                return ApsAdFormat.BANNER;
            }
            if (heightFromAax == 250 && this.width == 300) {
                return ApsAdFormat.MREC;
            }
            if (heightFromAax == 90 && this.width == 728) {
                return ApsAdFormat.LEADERBOARD;
            }
            if (heightFromAax == 9999 && this.width == 9999) {
                return ApsAdFormat.INTERSTITIAL;
            }
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Invalid ad format received from the AAX in ApsAd - getApsAdFormat:" + this.width + ":" + this.height);
        }
        return this.apsAdFormatFromRequest;
    }

    public ApsAdRequest getApsAdRequest() {
        if (this.apsAdRequest == null) {
            DTBAdRequest dTBAdRequest = this.refreshLoader;
            if (dTBAdRequest instanceof ApsAdRequest) {
                this.apsAdRequest = (ApsAdRequest) dTBAdRequest;
            } else if (dTBAdRequest != null) {
                setApsAdRequest(new ApsAdRequest(this.refreshLoader));
            }
        }
        return this.apsAdRequest;
    }

    public String getBidInfo() {
        return SDKUtilities.getBidInfo(this);
    }

    public int getHeightFromAax() {
        try {
            return getDTBAds().get(0).getHeight();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting the height from ApsAd", e10);
            return -1;
        }
    }

    public String getPricePoint() {
        try {
            return SDKUtilities.getPricePoint(this);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting the price point from ApsAd", e10);
            return null;
        }
    }

    public String getSlotUuid() {
        return this.slotUuid;
    }

    public int getWidthFromAax() {
        try {
            return getDTBAds().get(0).getWidth();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting the width from ApsAd", e10);
            return -1;
        }
    }

    public void setAdView(ApsAdViewImpl apsAdViewImpl) {
        this.adViewWeakReference = new WeakReference<>(apsAdViewImpl);
    }

    public void setApsAdFormatAndSlotUuid(DTBAdResponse dTBAdResponse) {
        DTBAdSize dTBAdSize;
        if (dTBAdResponse == null || dTBAdResponse.getDTBAds() == null || dTBAdResponse.getDTBAds().size() <= 0 || (dTBAdSize = dTBAdResponse.getDTBAds().get(0)) == null) {
            return;
        }
        String slotUUID = dTBAdSize.getSlotUUID();
        ApsAdFormat adFormat = ApsAdFormatUtils.getAdFormat(dTBAdSize.getDTBAdType(), dTBAdSize.getHeight(), dTBAdSize.getWidth());
        this.slotUuid = slotUUID;
        setApsAdFormat(adFormat);
    }

    public void setApsAdRequest(ApsAdRequest apsAdRequest) {
        this.apsAdRequest = apsAdRequest;
    }

    public void setSlotUuid(DTBAdResponse dTBAdResponse) {
        try {
            this.slotUuid = dTBAdResponse.getDTBAds().get(0).getSlotUUID();
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in setting up slot id in ApsAd", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdResponse
    public ApsAdRequest getAdLoader() {
        return getApsAdRequest();
    }

    public void setSlotUuid(String str) {
        this.slotUuid = str;
    }

    public ApsAd(DTBAdResponse dTBAdResponse, ApsAdFormat apsAdFormat) {
        super(dTBAdResponse);
        this.height = -1;
        this.width = -1;
        setApsAdFormat(apsAdFormat);
        setSlotUuid(dTBAdResponse);
    }

    public ApsAd(Bundle bundle, ApsAdFormat apsAdFormat) {
        super(bundle);
        this.height = -1;
        this.width = -1;
        setApsAdFormat(apsAdFormat);
    }

    public ApsAd(String str, ApsAdFormat apsAdFormat) {
        super(str);
        this.height = -1;
        this.width = -1;
        setApsAdFormat(apsAdFormat);
    }
}
