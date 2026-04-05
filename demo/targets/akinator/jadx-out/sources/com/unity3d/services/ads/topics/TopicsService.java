package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.ext.SdkExtensions;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ExecutorsKt;
import li.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers dispatchers, IEventSender eventSender) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return a.d(context.getSystemService(a.e()));
        }
        return null;
    }

    public final TopicsStatus checkAvailability() {
        return Device.getApiLevel() < 33 ? TopicsStatus.ERROR_API_BELOW_33 : SdkExtensions.getExtensionVersion(1000000) < 4 ? TopicsStatus.ERROR_EXTENSION_BELOW_4 : this.topicsManager == null ? TopicsStatus.ERROR_TOPICSMANAGER_NULL : !AdServicesState.isAdServicesStateEnabled() ? TopicsStatus.ERROR_AD_SERVICES_DISABLED : TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(String adsSdkName, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(adsSdkName, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(adsSdkName).setShouldRecordObservation(z10).build();
        e0.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(getTopicsRequestBuild, ExecutorsKt.asExecutor(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e10) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e10.toString());
            DeviceLog.debug("Failed to get topics with error: " + e10);
        }
    }
}
