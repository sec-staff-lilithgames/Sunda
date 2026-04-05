package io.bidmachine.media3.common.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f60777c = new p0(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f60778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60779b;

    static {
        new p0(0, 0);
    }

    public p0(int i10, int i11) {
        a.checkArgument((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f60778a = i10;
        this.f60779b = i11;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (this.f60778a == p0Var.f60778a && this.f60779b == p0Var.f60779b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f60779b;
    }

    public int getWidth() {
        return this.f60778a;
    }

    public int hashCode() {
        int i10 = this.f60778a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f60779b;
    }

    public String toString() {
        return this.f60778a + "x" + this.f60779b;
    }
}
