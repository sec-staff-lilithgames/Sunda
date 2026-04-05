package com.moloco.sdk.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Initialization {
    private static final /* synthetic */ cv.a $ENTRIES;
    private static final /* synthetic */ Initialization[] $VALUES;
    public static final Initialization SUCCESS = new Initialization("SUCCESS", 0);
    public static final Initialization FAILURE = new Initialization("FAILURE", 1);

    private static final /* synthetic */ Initialization[] $values() {
        return new Initialization[]{SUCCESS, FAILURE};
    }

    static {
        Initialization[] initializationArr$values = $values();
        $VALUES = initializationArr$values;
        $ENTRIES = cv.b.enumEntries(initializationArr$values);
    }

    private Initialization(String str, int i10) {
    }

    public static cv.a getEntries() {
        return $ENTRIES;
    }

    public static Initialization valueOf(String str) {
        return (Initialization) Enum.valueOf(Initialization.class, str);
    }

    public static Initialization[] values() {
        return (Initialization[]) $VALUES.clone();
    }
}
