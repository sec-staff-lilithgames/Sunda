package com.amazon.aps.shared.metrics.model;

import com.inmobi.unification.sdk.InitializationStatus;
import cv.a;
import cv.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ApsMetricsResult[] $VALUES;
    public static final ApsMetricsResult Success = new ApsMetricsResult(InitializationStatus.SUCCESS, 0);
    public static final ApsMetricsResult Failure = new ApsMetricsResult("Failure", 1);

    private static final /* synthetic */ ApsMetricsResult[] $values() {
        return new ApsMetricsResult[]{Success, Failure};
    }

    static {
        ApsMetricsResult[] apsMetricsResultArr$values = $values();
        $VALUES = apsMetricsResultArr$values;
        $ENTRIES = b.enumEntries(apsMetricsResultArr$values);
    }

    private ApsMetricsResult(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ApsMetricsResult valueOf(String str) {
        return (ApsMetricsResult) Enum.valueOf(ApsMetricsResult.class, str);
    }

    public static ApsMetricsResult[] values() {
        return (ApsMetricsResult[]) $VALUES.clone();
    }
}
