package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58237b;

    public w0(int i10, int i11) {
        this.f58236a = i10;
        this.f58237b = i11;
    }

    public int getEncoding() {
        int i10 = this.f58237b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
