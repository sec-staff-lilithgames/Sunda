package com.apm.insight;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");

    private String mName;

    CrashType(String str) {
        this.mName = str;
    }

    public final String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return getName();
    }
}
