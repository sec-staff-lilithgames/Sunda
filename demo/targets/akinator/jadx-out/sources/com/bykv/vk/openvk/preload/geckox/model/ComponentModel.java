package com.bykv.vk.openvk.preload.geckox.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ComponentModel {

    @com.bykv.vk.openvk.preload.a.a.b(a = "packages")
    private Map<String, List<UpdatePackage>> packages;

    @com.bykv.vk.openvk.preload.a.a.b(a = "universal_strategies")
    private Map<String, b> universalStrategies;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @com.bykv.vk.openvk.preload.a.a.b(a = ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)
        public String f17177a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @com.bykv.vk.openvk.preload.a.a.b(a = "specified_clean")
        public List<a> f17178a;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
