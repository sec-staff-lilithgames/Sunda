package kotlin.jvm.internal;

import uu.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j {
    public static final uu.m0 iterator(byte[] array) {
        e0.checkNotNullParameter(array, "array");
        return new c(array);
    }

    public static final uu.n0 iterator(char[] array) {
        e0.checkNotNullParameter(array, "array");
        return new d(array);
    }

    public static final e2 iterator(short[] array) {
        e0.checkNotNullParameter(array, "array");
        return new l(array);
    }

    public static final uu.j1 iterator(int[] array) {
        e0.checkNotNullParameter(array, "array");
        return new g(array);
    }

    public static final uu.k1 iterator(long[] array) {
        e0.checkNotNullParameter(array, "array");
        return new k(array);
    }

    public static final uu.e1 iterator(float[] array) {
        e0.checkNotNullParameter(array, "array");
        return new f(array);
    }

    public static final uu.z0 iterator(double[] array) {
        e0.checkNotNullParameter(array, "array");
        return new e(array);
    }

    public static final uu.l0 iterator(boolean[] array) {
        e0.checkNotNullParameter(array, "array");
        return new b(array);
    }
}
