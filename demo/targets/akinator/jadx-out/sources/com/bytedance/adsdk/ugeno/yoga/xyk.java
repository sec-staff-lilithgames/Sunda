package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum xyk {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* renamed from: cm, reason: collision with root package name */
    private final int f18058cm;

    xyk(int i10) {
        this.f18058cm = i10;
    }

    public static xyk jpo(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }
}
