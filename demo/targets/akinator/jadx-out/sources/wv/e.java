package wv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum e {
    USER_METRIC(3),
    CONTENT_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f91302b;

    e(int i10) {
        this.f91302b = i10;
    }

    public static e forNumber(int i10) {
        if (i10 == 0) {
            return CONTENT_NOT_SET;
        }
        if (i10 != 3) {
            return null;
        }
        return USER_METRIC;
    }

    public int getNumber() {
        return this.f91302b;
    }

    @Deprecated
    public static e valueOf(int i10) {
        return forNumber(i10);
    }
}
