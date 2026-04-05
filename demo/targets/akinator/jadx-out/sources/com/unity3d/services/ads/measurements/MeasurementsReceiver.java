package com.unity3d.services.ads.measurements;

import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MeasurementsReceiver implements OutcomeReceiver {
    private final MeasurementsEvents errorEvent;
    private final IEventSender eventSender;
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(IEventSender eventSender, MeasurementsEvents successEvent, MeasurementsEvents errorEvent) {
        e0.checkNotNullParameter(eventSender, "eventSender");
        e0.checkNotNullParameter(successEvent, "successEvent");
        e0.checkNotNullParameter(errorEvent, "errorEvent");
        this.eventSender = eventSender;
        this.successEvent = successEvent;
        this.errorEvent = errorEvent;
    }

    public void onResult(Object p02) {
        e0.checkNotNullParameter(p02, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }

    public void onError(Exception error) {
        e0.checkNotNullParameter(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, error.toString());
    }
}
