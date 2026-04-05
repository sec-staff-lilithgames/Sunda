package com.amazon.aps.ads.model;

import cv.a;
import cv.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsLogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ApsLogLevel[] $VALUES;
    private final int value;
    public static final ApsLogLevel All = new ApsLogLevel("All", 0, 0);
    public static final ApsLogLevel Trace = new ApsLogLevel("Trace", 1, 1);
    public static final ApsLogLevel Debug = new ApsLogLevel("Debug", 2, 2);
    public static final ApsLogLevel Info = new ApsLogLevel("Info", 3, 3);
    public static final ApsLogLevel Warn = new ApsLogLevel("Warn", 4, 4);
    public static final ApsLogLevel Error = new ApsLogLevel("Error", 5, 5);
    public static final ApsLogLevel Fatal = new ApsLogLevel("Fatal", 6, 6);
    public static final ApsLogLevel Off = new ApsLogLevel("Off", 7, 7);

    private static final /* synthetic */ ApsLogLevel[] $values() {
        return new ApsLogLevel[]{All, Trace, Debug, Info, Warn, Error, Fatal, Off};
    }

    static {
        ApsLogLevel[] apsLogLevelArr$values = $values();
        $VALUES = apsLogLevelArr$values;
        $ENTRIES = b.enumEntries(apsLogLevelArr$values);
    }

    private ApsLogLevel(String str, int i10, int i11) {
        this.value = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ApsLogLevel valueOf(String str) {
        return (ApsLogLevel) Enum.valueOf(ApsLogLevel.class, str);
    }

    public static ApsLogLevel[] values() {
        return (ApsLogLevel[]) $VALUES.clone();
    }

    public final int intValue() {
        return this.value;
    }
}
