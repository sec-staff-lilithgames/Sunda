package bj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum p1 {
    BANNER(1),
    MODAL(2),
    IMAGE_ONLY(3),
    CARD(4),
    MESSAGEDETAILS_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f9655b;

    p1(int i10) {
        this.f9655b = i10;
    }

    public static p1 forNumber(int i10) {
        if (i10 == 0) {
            return MESSAGEDETAILS_NOT_SET;
        }
        if (i10 == 1) {
            return BANNER;
        }
        if (i10 == 2) {
            return MODAL;
        }
        if (i10 == 3) {
            return IMAGE_ONLY;
        }
        if (i10 != 4) {
            return null;
        }
        return CARD;
    }

    public int getNumber() {
        return this.f9655b;
    }

    @Deprecated
    public static p1 valueOf(int i10) {
        return forNumber(i10);
    }
}
