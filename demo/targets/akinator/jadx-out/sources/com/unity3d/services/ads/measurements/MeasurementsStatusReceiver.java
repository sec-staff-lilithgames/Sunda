package com.unity3d.services.ads.measurements;

import android.os.OutcomeReceiver;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MeasurementsStatusReceiver implements OutcomeReceiver {
    private final IEventSender eventSender;

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(((Number) obj).intValue());
    }

    public MeasurementsStatusReceiver(IEventSender iEventSender) {
        e0.checkNotNullParameter(iEventSender, OIPXcgrVyyxoLF.LMAIPfMHQ);
        this.eventSender = iEventSender;
    }

    public void onError(Exception error) {
        e0.checkNotNullParameter(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(int i10) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.AVAILABLE, Integer.valueOf(i10));
    }
}
