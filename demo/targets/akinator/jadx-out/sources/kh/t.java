package kh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum t {
    JWT_AUDIENCE(7),
    DISABLE_AUTH(8),
    AUTHENTICATION_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f71077b;

    t(int i10) {
        this.f71077b = i10;
    }

    public static t forNumber(int i10) {
        if (i10 == 0) {
            return AUTHENTICATION_NOT_SET;
        }
        if (i10 == 7) {
            return JWT_AUDIENCE;
        }
        if (i10 != 8) {
            return null;
        }
        return DISABLE_AUTH;
    }

    public int getNumber() {
        return this.f71077b;
    }

    @Deprecated
    public static t valueOf(int i10) {
        return forNumber(i10);
    }
}
