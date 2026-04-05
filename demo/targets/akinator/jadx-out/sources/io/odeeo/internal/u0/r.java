package io.odeeo.internal.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(j1.o2.j(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(j1.o2.k(obj, "null value in entry: ", "=null"));
        }
    }

    public static void b(int i10, String str) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(j1.o2.g(i10, str, " must be positive but was: "));
        }
    }

    public static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(j1.o2.g(i10, str, " cannot be negative but was: "));
    }

    public static void a(boolean z10) {
        io.odeeo.internal.t0.u.checkState(z10, "no calls to next() since the last call to remove()");
    }
}
