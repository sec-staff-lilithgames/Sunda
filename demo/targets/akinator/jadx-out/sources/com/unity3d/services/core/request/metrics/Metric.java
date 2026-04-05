package com.unity3d.services.core.request.metrics;

import j1.o2;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Metric {
    public static final Companion Companion = new Companion(null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public Metric(String str) {
        this(str, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric2, String str, Object obj, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = metric2.name;
        }
        if ((i10 & 2) != 0) {
            obj = metric2.value;
        }
        if ((i10 & 4) != 0) {
            map = metric2.tags;
        }
        return metric2.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map<String, String> tags) {
        e0.checkNotNullParameter(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric2 = (Metric) obj;
        return e0.areEqual(this.name, metric2.name) && e0.areEqual(this.value, metric2.value) && e0.areEqual(this.tags, metric2.tags);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        return this.tags.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final Map<String, Object> toMap() {
        Map mapCreateMapBuilder = o1.createMapBuilder();
        String str = this.name;
        if (str != null) {
            mapCreateMapBuilder.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            mapCreateMapBuilder.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            mapCreateMapBuilder.put("t", this.tags);
        }
        return o1.build(mapCreateMapBuilder);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metric(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", tags=");
        return o2.q(sb2, this.tags, ')');
    }

    public Metric(String str, Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(String str, Object obj, Map<String, String> tags) {
        e0.checkNotNullParameter(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? p1.emptyMap() : map);
    }
}
