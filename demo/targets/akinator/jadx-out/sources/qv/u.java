package qv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u {
    public static final void checkStepIsPositive(boolean z10, Number step) {
        e0.checkNotNullParameter(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static final <T extends Comparable<? super T>> h rangeTo(T t10, T that) {
        e0.checkNotNullParameter(t10, "<this>");
        e0.checkNotNullParameter(that, "that");
        return new j(t10, that);
    }

    public static final <T extends Comparable<? super T>> t rangeUntil(T t10, T that) {
        e0.checkNotNullParameter(t10, "<this>");
        e0.checkNotNullParameter(that, "that");
        return new i(t10, that);
    }

    public static final f rangeTo(double d10, double d11) {
        return new d(d10, d11);
    }

    public static final t rangeUntil(double d10, double d11) {
        return new q(d10, d11);
    }

    public static f rangeTo(float f10, float f11) {
        return new e(f10, f11);
    }

    public static final t rangeUntil(float f10, float f11) {
        return new r(f10, f11);
    }
}
