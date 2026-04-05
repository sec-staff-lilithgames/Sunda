package tk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum r {
    ERROR(4),
    RESPONSE(5),
    RESULT_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f86966b;

    r(int i10) {
        this.f86966b = i10;
    }

    public static r forNumber(int i10) {
        if (i10 == 0) {
            return RESULT_NOT_SET;
        }
        if (i10 == 4) {
            return ERROR;
        }
        if (i10 != 5) {
            return null;
        }
        return RESPONSE;
    }

    public int getNumber() {
        return this.f86966b;
    }

    @Deprecated
    public static r valueOf(int i10) {
        return forNumber(i10);
    }
}
