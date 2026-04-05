package qk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum h {
    VANILLA_PAYLOAD(1),
    EXPERIMENTAL_PAYLOAD(2),
    PAYLOAD_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f83277b;

    h(int i10) {
        this.f83277b = i10;
    }

    public static h forNumber(int i10) {
        if (i10 == 0) {
            return PAYLOAD_NOT_SET;
        }
        if (i10 == 1) {
            return VANILLA_PAYLOAD;
        }
        if (i10 != 2) {
            return null;
        }
        return EXPERIMENTAL_PAYLOAD;
    }

    public int getNumber() {
        return this.f83277b;
    }

    @Deprecated
    public static h valueOf(int i10) {
        return forNumber(i10);
    }
}
