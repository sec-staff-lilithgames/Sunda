package bj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum c0 {
    FIAM_TRIGGER(1),
    EVENT(2),
    CONDITION_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f9621b;

    c0(int i10) {
        this.f9621b = i10;
    }

    public static c0 forNumber(int i10) {
        if (i10 == 0) {
            return CONDITION_NOT_SET;
        }
        if (i10 == 1) {
            return FIAM_TRIGGER;
        }
        if (i10 != 2) {
            return null;
        }
        return EVENT;
    }

    public int getNumber() {
        return this.f9621b;
    }

    @Deprecated
    public static c0 valueOf(int i10) {
        return forNumber(i10);
    }
}
