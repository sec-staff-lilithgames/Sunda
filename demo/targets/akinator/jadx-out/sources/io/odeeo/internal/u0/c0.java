package io.odeeo.internal.u0;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c0<C extends Comparable> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66541a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends c0<BigInteger> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f66542b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final BigInteger f66543c = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: d, reason: collision with root package name */
        public static final BigInteger f66544d = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public b() {
            super(true);
        }

        private Object readResolve() {
            return f66542b;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // io.odeeo.internal.u0.c0
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f66543c).min(f66544d).longValue();
        }

        @Override // io.odeeo.internal.u0.c0
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // io.odeeo.internal.u0.c0
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends c0<Integer> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final c f66545b = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(true);
        }

        private Object readResolve() {
            return f66545b;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // io.odeeo.internal.u0.c0
        public long distance(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // io.odeeo.internal.u0.c0
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // io.odeeo.internal.u0.c0
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // io.odeeo.internal.u0.c0
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // io.odeeo.internal.u0.c0
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends c0<Long> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final d f66546b = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super(true);
        }

        private Object readResolve() {
            return f66546b;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // io.odeeo.internal.u0.c0
        public long distance(Long l9, Long l10) {
            long jLongValue = l10.longValue() - l9.longValue();
            if (l10.longValue() > l9.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l10.longValue() >= l9.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // io.odeeo.internal.u0.c0
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // io.odeeo.internal.u0.c0
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // io.odeeo.internal.u0.c0
        public Long next(Long l9) {
            long jLongValue = l9.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // io.odeeo.internal.u0.c0
        public Long previous(Long l9) {
            long jLongValue = l9.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public static c0<BigInteger> bigIntegers() {
        return b.f66542b;
    }

    public static c0<Integer> integers() {
        return c.f66545b;
    }

    public static c0<Long> longs() {
        return d.f66546b;
    }

    public abstract long distance(C c10, C c11);

    public C maxValue() {
        throw new NoSuchElementException();
    }

    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c10);

    public abstract C previous(C c10);

    public c0() {
        this(false);
    }

    public c0(boolean z10) {
        this.f66541a = z10;
    }
}
