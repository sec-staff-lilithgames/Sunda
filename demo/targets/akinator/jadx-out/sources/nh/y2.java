package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y2 extends a3 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final y2 f76781c = new y2(true);

    @Override // nh.a3
    public final Comparable a(Comparable comparable, long j10) {
        jh.i.p(j10);
        return Integer.valueOf(rh.w.checkedCast(((Integer) comparable).longValue() + j10));
    }

    public String toString() {
        return "DiscreteDomain.integers()";
    }

    @Override // nh.a3
    public long distance(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    @Override // nh.a3
    public Integer maxValue() {
        return Integer.MAX_VALUE;
    }

    @Override // nh.a3
    public Integer minValue() {
        return Integer.MIN_VALUE;
    }

    @Override // nh.a3
    public Integer next(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue + 1);
    }

    @Override // nh.a3
    public Integer previous(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue - 1);
    }
}
