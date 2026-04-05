package bj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum c {
    EVENT_TYPE(5),
    DISMISS_TYPE(6),
    RENDER_ERROR_REASON(7),
    FETCH_ERROR_REASON(8),
    EVENT_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f9616b;

    c(int i10) {
        this.f9616b = i10;
    }

    public static c forNumber(int i10) {
        if (i10 == 0) {
            return EVENT_NOT_SET;
        }
        if (i10 == 5) {
            return EVENT_TYPE;
        }
        if (i10 == 6) {
            return DISMISS_TYPE;
        }
        if (i10 == 7) {
            return RENDER_ERROR_REASON;
        }
        if (i10 != 8) {
            return null;
        }
        return FETCH_ERROR_REASON;
    }

    public int getNumber() {
        return this.f9616b;
    }

    @Deprecated
    public static c valueOf(int i10) {
        return forNumber(i10);
    }
}
