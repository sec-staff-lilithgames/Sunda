package com.amazon.device.ads;

import android.app.Activity;
import android.view.View;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBRenderer {
    public static final String LOG_TAG = "DTBRenderer";
    public Activity activity;
    public String adUnitId;
    public DTBAdResponse dtbAdResponse;
    public boolean showOnLoad = false;

    public DTBRenderer(String str, Activity activity, DTBAdResponse dTBAdResponse) {
        this.adUnitId = str;
        this.dtbAdResponse = dTBAdResponse;
        this.activity = activity;
    }

    public EventDistributor getEventDistributer() {
        return AdRegistration.getEventDistributer();
    }

    public DTBAdSize getSize() {
        try {
            DTBAdResponse dTBAdResponse = this.dtbAdResponse;
            if (dTBAdResponse == null) {
                return null;
            }
            List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
            if (dTBAds.size() > 0) {
                return dTBAds.get(0);
            }
            return null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSize method", e10);
            return null;
        }
    }

    public boolean isShowOnLoad() {
        return this.showOnLoad;
    }

    public void onCustomBannerFailure(View view) {
    }

    public void onCustomBannerSuccess(View view) {
    }
}
