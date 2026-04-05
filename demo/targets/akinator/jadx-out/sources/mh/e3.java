package mh;

import j$.time.Duration;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e3 {
    public static <F, T> v2 compose(v0 v0Var, v2 v2Var) {
        return new z2(v0Var, v2Var);
    }

    public static <T> v2 memoize(v2 v2Var) {
        return ((v2Var instanceof y2) || (v2Var instanceof x2)) ? v2Var : v2Var instanceof Serializable ? new x2(v2Var) : new y2(v2Var);
    }

    public static <T> v2 memoizeWithExpiration(v2 v2Var, long j10, TimeUnit timeUnit) {
        p1.checkNotNull(v2Var);
        p1.checkArgument(j10 > 0, "duration (%s %s) must be > 0", j10, timeUnit);
        return new w2(v2Var, timeUnit.toNanos(j10));
    }

    public static <T> v2 ofInstance(T t10) {
        return new c3(t10);
    }

    public static <T> v0 supplierFunction() {
        return b3.f74589b;
    }

    public static <T> v2 synchronizedSupplier(v2 v2Var) {
        return new d3(v2Var);
    }

    public static <T> v2 memoizeWithExpiration(v2 v2Var, Duration duration) {
        long nanos;
        p1.checkNotNull(v2Var);
        p1.checkArgument((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be > 0", duration);
        try {
            nanos = duration.toNanos();
        } catch (ArithmeticException unused) {
            nanos = duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return new w2(v2Var, nanos);
    }
}
