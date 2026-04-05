package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z2 extends a3 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f76808c = new z2(true);

    @Override // nh.a3
    public final Comparable a(Comparable comparable, long j10) {
        Long l9 = (Long) comparable;
        jh.i.p(j10);
        long jLongValue = l9.longValue() + j10;
        if (jLongValue < 0) {
            mh.p1.checkArgument(l9.longValue() < 0, "overflow");
        }
        return Long.valueOf(jLongValue);
    }

    public String toString() {
        return "DiscreteDomain.longs()";
    }

    @Override // nh.a3
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

    @Override // nh.a3
    public Long maxValue() {
        return Long.MAX_VALUE;
    }

    @Override // nh.a3
    public Long minValue() {
        return Long.MIN_VALUE;
    }

    @Override // nh.a3
    public Long next(Long l9) {
        long jLongValue = l9.longValue();
        if (jLongValue == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(jLongValue + 1);
    }

    @Override // nh.a3
    public Long previous(Long l9) {
        long jLongValue = l9.longValue();
        if (jLongValue == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(jLongValue - 1);
    }
}
