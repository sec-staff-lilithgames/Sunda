package io.odeeo.internal.v0;

import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {
    public static int a(String str, int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " (" + i10 + ") must be >= 0");
    }

    public static int b(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " (" + i10 + ") must be > 0");
    }

    public static long a(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static long b(String str, long j10) {
        if (j10 > 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be > 0");
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void a(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new ArithmeticException(a.b.f(i11, ")", a.b.r(i10, "overflow: ", str, "(", ", ")));
        }
    }

    public static void a(boolean z10, String str, long j10, long j11) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + VPCjETNfjxu.JDim + j10 + ", " + j11 + ")");
    }
}
