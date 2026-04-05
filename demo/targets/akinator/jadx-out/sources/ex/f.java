package ex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum f {
    UPDATEAPPKEYLIST(2),
    PAYLOAD_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f55191b;

    f(int i10) {
        this.f55191b = i10;
    }

    public static f forNumber(int i10) {
        if (i10 == 0) {
            return PAYLOAD_NOT_SET;
        }
        if (i10 != 2) {
            return null;
        }
        return UPDATEAPPKEYLIST;
    }

    public int getNumber() {
        return this.f55191b;
    }

    @Deprecated
    public static f valueOf(int i10) {
        return forNumber(i10);
    }
}
