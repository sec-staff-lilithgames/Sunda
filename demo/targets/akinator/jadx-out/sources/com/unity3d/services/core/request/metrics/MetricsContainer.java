package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.o1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MetricsContainer {
    public static final Companion Companion = new Companion(null);
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String apiLevel;
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;
    private final String metricSampleRate;
    private final List<Metric> metrics;
    private final String sTkn;
    private final String shSid;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public MetricsContainer(String metricSampleRate, MetricCommonTags commonTags, List<Metric> metrics, String str) {
        e0.checkNotNullParameter(metricSampleRate, "metricSampleRate");
        e0.checkNotNullParameter(commonTags, "commonTags");
        e0.checkNotNullParameter(metrics, "metrics");
        this.metricSampleRate = metricSampleRate;
        this.commonTags = commonTags;
        this.metrics = metrics;
        this.sTkn = str;
        this.shSid = Session.Default.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    public final Map<String, Object> toMap() {
        List<Metric> list = this.metrics;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metric) it.next()).toMap());
        }
        Map mapCreateMapBuilder = o1.createMapBuilder();
        mapCreateMapBuilder.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        mapCreateMapBuilder.put("m", arrayList);
        mapCreateMapBuilder.put("t", this.commonTags.toMap());
        mapCreateMapBuilder.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        mapCreateMapBuilder.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            mapCreateMapBuilder.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String deviceModel = this.deviceModel;
        if (deviceModel != null) {
            e0.checkNotNullExpressionValue(deviceModel, "deviceModel");
            mapCreateMapBuilder.put("deviceModel", deviceModel);
        }
        String deviceName = this.deviceName;
        if (deviceName != null) {
            e0.checkNotNullExpressionValue(deviceName, "deviceName");
            mapCreateMapBuilder.put(METRIC_CONTAINER_DEVICE_NAME, deviceName);
        }
        String deviceManufacturer = this.deviceManufacturer;
        if (deviceManufacturer != null) {
            e0.checkNotNullExpressionValue(deviceManufacturer, "deviceManufacturer");
            mapCreateMapBuilder.put(METRIC_CONTAINER_DEVICE_MAKE, deviceManufacturer);
        }
        String gameId = this.gameId;
        if (gameId != null) {
            e0.checkNotNullExpressionValue(gameId, "gameId");
            mapCreateMapBuilder.put("gameId", gameId);
        }
        return o1.build(mapCreateMapBuilder);
    }
}
