package com.amazon.aps.shared.metrics.model;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsPerfAdClickEvent extends ApsMetricsPerfEventBase {
    private final long timestamp;

    public ApsMetricsPerfAdClickEvent(long j10) {
        super(null, j10, 0L, 5, null);
        this.timestamp = j10;
    }

    private final long component1() {
        return this.timestamp;
    }

    public static /* synthetic */ ApsMetricsPerfAdClickEvent copy$default(ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = apsMetricsPerfAdClickEvent.timestamp;
        }
        return apsMetricsPerfAdClickEvent.copy(j10);
    }

    public final ApsMetricsPerfAdClickEvent copy(long j10) {
        return new ApsMetricsPerfAdClickEvent(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsPerfAdClickEvent) && this.timestamp == ((ApsMetricsPerfAdClickEvent) obj).timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp);
    }

    public String toString() {
        return o2.n(this.timestamp, "ApsMetricsPerfAdClickEvent(timestamp=", ")");
    }
}
