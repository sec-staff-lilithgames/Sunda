package wk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum i {
    UTC_OFFSET(8),
    TIME_ZONE(9),
    TIMEOFFSET_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f90689b;

    i(int i10) {
        this.f90689b = i10;
    }

    public static i forNumber(int i10) {
        if (i10 == 0) {
            return TIMEOFFSET_NOT_SET;
        }
        if (i10 == 8) {
            return UTC_OFFSET;
        }
        if (i10 != 9) {
            return null;
        }
        return TIME_ZONE;
    }

    public int getNumber() {
        return this.f90689b;
    }

    @Deprecated
    public static i valueOf(int i10) {
        return forNumber(i10);
    }
}
