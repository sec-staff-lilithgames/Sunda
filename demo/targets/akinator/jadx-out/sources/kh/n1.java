package kh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum n1 {
    GET(2),
    PUT(3),
    POST(4),
    DELETE(5),
    PATCH(6),
    CUSTOM(8),
    PATTERN_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f71038b;

    n1(int i10) {
        this.f71038b = i10;
    }

    public static n1 forNumber(int i10) {
        if (i10 == 0) {
            return PATTERN_NOT_SET;
        }
        if (i10 == 8) {
            return CUSTOM;
        }
        if (i10 == 2) {
            return GET;
        }
        if (i10 == 3) {
            return PUT;
        }
        if (i10 == 4) {
            return POST;
        }
        if (i10 == 5) {
            return DELETE;
        }
        if (i10 != 6) {
            return null;
        }
        return PATCH;
    }

    public int getNumber() {
        return this.f71038b;
    }

    @Deprecated
    public static n1 valueOf(int i10) {
        return forNumber(i10);
    }
}
