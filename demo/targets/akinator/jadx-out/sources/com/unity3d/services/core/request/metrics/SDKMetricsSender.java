package com.unity3d.services.core.request.metrics;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface SDKMetricsSender {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static void sendEvent(SDKMetricsSender sDKMetricsSender, String event) {
            e0.checkNotNullParameter(event, "event");
            sendEvent$default(sDKMetricsSender, event, null, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(SDKMetricsSender sDKMetricsSender, String str, String str2, Map map, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                map = p1.emptyMap();
            }
            sDKMetricsSender.sendEvent(str, str2, map);
        }
    }

    String getMetricEndPoint();

    void sendEvent(String str);

    void sendEvent(String str, String str2, Map<String, String> map);

    void sendMetric(Metric metric2);

    void sendMetricWithInitState(Metric metric2);

    void sendMetrics(List<Metric> list);
}
