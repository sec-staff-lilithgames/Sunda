package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum au {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);


    /* renamed from: cm, reason: collision with root package name */
    private final int f18010cm;

    au(int i10) {
        this.f18010cm = i10;
    }

    public int jpo() {
        return this.f18010cm;
    }

    public static au jpo(int i10) {
        if (i10 == 0) {
            return STATIC;
        }
        if (i10 == 1) {
            return RELATIVE;
        }
        if (i10 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static au jpo(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
