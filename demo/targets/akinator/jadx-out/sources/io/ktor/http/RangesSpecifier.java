package io.ktor.http;

import com.ironsource.G5;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import io.ktor.http.ContentRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import p0.o2;
import qv.p;
import qv.v;
import tu.t;
import uu.o0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RangesSpecifier {
    private final List<ContentRange> ranges;
    private final String unit;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.RangesSpecifier$isValid$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final Boolean invoke(String it) {
            e0.checkNotNullParameter(it, "it");
            return Boolean.valueOf(e0.areEqual(it, RangeUnits.Bytes.getUnitToken()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RangesSpecifier(String unit, List<? extends ContentRange> ranges) {
        e0.checkNotNullParameter(unit, "unit");
        e0.checkNotNullParameter(ranges, "ranges");
        this.unit = unit;
        this.ranges = ranges;
        if (ranges.isEmpty()) {
            throw new IllegalArgumentException("It should be at least one range");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RangesSpecifier copy$default(RangesSpecifier rangesSpecifier, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rangesSpecifier.unit;
        }
        if ((i10 & 2) != 0) {
            list = rangesSpecifier.ranges;
        }
        return rangesSpecifier.copy(str, list);
    }

    public static /* synthetic */ boolean isValid$default(RangesSpecifier rangesSpecifier, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return rangesSpecifier.isValid(lVar);
    }

    public static /* synthetic */ List merge$default(RangesSpecifier rangesSpecifier, long j10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 50;
        }
        return rangesSpecifier.merge(j10, i10);
    }

    private final <T> List<T> toList(T t10) {
        return t10 == null ? p0.emptyList() : o0.listOf(t10);
    }

    public final String component1() {
        return this.unit;
    }

    public final List<ContentRange> component2() {
        return this.ranges;
    }

    public final RangesSpecifier copy(String unit, List<? extends ContentRange> ranges) {
        e0.checkNotNullParameter(unit, "unit");
        e0.checkNotNullParameter(ranges, "ranges");
        return new RangesSpecifier(unit, ranges);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangesSpecifier)) {
            return false;
        }
        RangesSpecifier rangesSpecifier = (RangesSpecifier) obj;
        return e0.areEqual(this.unit, rangesSpecifier.unit) && e0.areEqual(this.ranges, rangesSpecifier.ranges);
    }

    public final List<ContentRange> getRanges() {
        return this.ranges;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return this.ranges.hashCode() + (this.unit.hashCode() * 31);
    }

    public final boolean isValid(l rangeUnitPredicate) {
        e0.checkNotNullParameter(rangeUnitPredicate, "rangeUnitPredicate");
        if (!((Boolean) rangeUnitPredicate.invoke(this.unit)).booleanValue()) {
            return false;
        }
        List<ContentRange> list = this.ranges;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ContentRange contentRange : list) {
            if (contentRange instanceof ContentRange.Bounded) {
                ContentRange.Bounded bounded = (ContentRange.Bounded) contentRange;
                if (bounded.getFrom() < 0 || bounded.getTo() < bounded.getFrom()) {
                    return false;
                }
            } else if (contentRange instanceof ContentRange.TailFrom) {
                if (((ContentRange.TailFrom) contentRange).getFrom() < 0) {
                    return false;
                }
            } else {
                if (!(contentRange instanceof ContentRange.Suffix)) {
                    throw new t();
                }
                if (((ContentRange.Suffix) contentRange).getLastCount() < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final List<p> merge(long j10, int i10) {
        return this.ranges.size() > i10 ? toList(mergeToSingle(j10)) : merge(j10);
    }

    public final p mergeToSingle(long j10) {
        Object next;
        List<p> longRanges = RangesKt.toLongRanges(this.ranges, j10);
        Object next2 = null;
        if (longRanges.isEmpty()) {
            return null;
        }
        List<p> list = longRanges;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jLongValue = ((p) next).getStart().longValue();
                do {
                    Object next3 = it.next();
                    long jLongValue2 = ((p) next3).getStart().longValue();
                    if (jLongValue > jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        e0.checkNotNull(next);
        long jLongValue3 = ((p) next).getStart().longValue();
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                long jLongValue4 = ((p) next2).getEndInclusive().longValue();
                do {
                    Object next4 = it2.next();
                    long jLongValue5 = ((p) next4).getEndInclusive().longValue();
                    if (jLongValue4 < jLongValue5) {
                        next2 = next4;
                        jLongValue4 = jLongValue5;
                    }
                } while (it2.hasNext());
            }
        }
        e0.checkNotNull(next2);
        return new p(jLongValue3, v.coerceAtMost(((p) next2).getEndInclusive().longValue(), j10 - 1));
    }

    public String toString() {
        return y0.joinToString$default(this.ranges, ",", o2.q(new StringBuilder(), this.unit, G5.T), null, 0, null, null, 60, null);
    }

    public /* synthetic */ RangesSpecifier(String str, List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? RangeUnits.Bytes.getUnitToken() : str, (List<? extends ContentRange>) list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangesSpecifier(RangeUnits unit, List<? extends ContentRange> list) {
        this(unit.getUnitToken(), list);
        e0.checkNotNullParameter(unit, "unit");
        e0.checkNotNullParameter(list, TJzY.mIJfeobox);
    }

    public final List<p> merge(long j10) {
        return RangesKt.mergeRangesKeepOrder(RangesKt.toLongRanges(this.ranges, j10));
    }
}
