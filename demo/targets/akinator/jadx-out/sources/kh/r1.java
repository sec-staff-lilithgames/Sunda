package kh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum r1 {
    HEADER(1),
    QUERY(2),
    IN_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f71059b;

    r1(int i10) {
        this.f71059b = i10;
    }

    public static r1 forNumber(int i10) {
        if (i10 == 0) {
            return IN_NOT_SET;
        }
        if (i10 == 1) {
            return HEADER;
        }
        if (i10 != 2) {
            return null;
        }
        return QUERY;
    }

    public int getNumber() {
        return this.f71059b;
    }

    @Deprecated
    public static r1 valueOf(int i10) {
        return forNumber(i10);
    }
}
