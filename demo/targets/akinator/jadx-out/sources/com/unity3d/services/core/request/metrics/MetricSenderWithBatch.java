package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.e0;
import uu.o0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender _original, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        e0.checkNotNullParameter(_original, "_original");
        e0.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(event, "event");
        e0.checkNotNullParameter(tags, "tags");
        if (event.length() != 0) {
            sendMetrics(o0.listOf(new Metric(event, str, tags)));
            return;
        }
        DeviceLog.debug("Metric event not sent due to being empty: " + event);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric2) {
        e0.checkNotNullParameter(metric2, "metric");
        sendMetrics(o0.listOf(metric2));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> metrics) {
        e0.checkNotNullParameter(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(p0.emptyList());
    }

    public final void updateOriginal(SDKMetricsSender metrics) {
        e0.checkNotNullParameter(metrics, "metrics");
        this._original = metrics;
    }
}
