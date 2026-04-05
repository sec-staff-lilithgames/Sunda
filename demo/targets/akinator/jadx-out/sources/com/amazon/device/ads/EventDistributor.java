package com.amazon.device.ads;

import android.view.ViewGroup;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes2.dex */
public class EventDistributor {
    public static final String LOG_TAG = "EventDistributor";

    public boolean distribute(String str, String str2, ViewGroup viewGroup, DTBAdResponse dTBAdResponse, DTBRendererObserver dTBRendererObserver, DTBRenderer dTBRenderer, Map<String, Object> map) {
        try {
            for (AdProvider adProvider : AdRegistration.getAdProviders()) {
                if (adProvider.matches(str, str2, dTBAdResponse)) {
                    adProvider.takeOwnership(viewGroup, dTBAdResponse, dTBRendererObserver, dTBRenderer, map);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute distribute method", e10);
            return false;
        }
    }
}
